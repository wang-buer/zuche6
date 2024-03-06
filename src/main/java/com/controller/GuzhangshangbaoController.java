package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GuzhangshangbaoEntity;
import com.entity.view.GuzhangshangbaoView;

import com.service.GuzhangshangbaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 故障上报
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-02 01:38:50
 */
@RestController
@RequestMapping("/guzhangshangbao")
public class GuzhangshangbaoController {
    @Autowired
    private GuzhangshangbaoService guzhangshangbaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuzhangshangbaoEntity guzhangshangbao, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			guzhangshangbao.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GuzhangshangbaoEntity> ew = new EntityWrapper<GuzhangshangbaoEntity>();
		PageUtils page = guzhangshangbaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guzhangshangbao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuzhangshangbaoEntity guzhangshangbao, HttpServletRequest request){
        EntityWrapper<GuzhangshangbaoEntity> ew = new EntityWrapper<GuzhangshangbaoEntity>();
		PageUtils page = guzhangshangbaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guzhangshangbao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuzhangshangbaoEntity guzhangshangbao){
       	EntityWrapper<GuzhangshangbaoEntity> ew = new EntityWrapper<GuzhangshangbaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guzhangshangbao, "guzhangshangbao")); 
        return R.ok().put("data", guzhangshangbaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuzhangshangbaoEntity guzhangshangbao){
        EntityWrapper< GuzhangshangbaoEntity> ew = new EntityWrapper< GuzhangshangbaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guzhangshangbao, "guzhangshangbao")); 
		GuzhangshangbaoView guzhangshangbaoView =  guzhangshangbaoService.selectView(ew);
		return R.ok("查询故障上报成功").put("data", guzhangshangbaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        GuzhangshangbaoEntity guzhangshangbao = guzhangshangbaoService.selectById(id);
        return R.ok().put("data", guzhangshangbao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        GuzhangshangbaoEntity guzhangshangbao = guzhangshangbaoService.selectById(id);
        return R.ok().put("data", guzhangshangbao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuzhangshangbaoEntity guzhangshangbao, HttpServletRequest request){
    	guzhangshangbao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guzhangshangbao);

        guzhangshangbaoService.insert(guzhangshangbao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GuzhangshangbaoEntity guzhangshangbao, HttpServletRequest request){
    	guzhangshangbao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guzhangshangbao);

        guzhangshangbaoService.insert(guzhangshangbao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GuzhangshangbaoEntity guzhangshangbao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guzhangshangbao);
        guzhangshangbaoService.updateById(guzhangshangbao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guzhangshangbaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GuzhangshangbaoEntity> wrapper = new EntityWrapper<GuzhangshangbaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = guzhangshangbaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
