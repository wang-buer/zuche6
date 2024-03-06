package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GuzhangshangbaoDao;
import com.entity.GuzhangshangbaoEntity;
import com.service.GuzhangshangbaoService;
import com.entity.vo.GuzhangshangbaoVO;
import com.entity.view.GuzhangshangbaoView;

@Service("guzhangshangbaoService")
public class GuzhangshangbaoServiceImpl extends ServiceImpl<GuzhangshangbaoDao, GuzhangshangbaoEntity> implements GuzhangshangbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuzhangshangbaoEntity> page = this.selectPage(
                new Query<GuzhangshangbaoEntity>(params).getPage(),
                new EntityWrapper<GuzhangshangbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuzhangshangbaoEntity> wrapper) {
		  Page<GuzhangshangbaoView> page =new Query<GuzhangshangbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuzhangshangbaoVO> selectListVO(Wrapper<GuzhangshangbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuzhangshangbaoVO selectVO(Wrapper<GuzhangshangbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuzhangshangbaoView> selectListView(Wrapper<GuzhangshangbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuzhangshangbaoView selectView(Wrapper<GuzhangshangbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
