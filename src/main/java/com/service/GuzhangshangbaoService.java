package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuzhangshangbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuzhangshangbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuzhangshangbaoView;


/**
 * 故障上报
 *
 * @author 
 * @email 
 * @date 2020-12-02 01:38:50
 */
public interface GuzhangshangbaoService extends IService<GuzhangshangbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuzhangshangbaoVO> selectListVO(Wrapper<GuzhangshangbaoEntity> wrapper);
   	
   	GuzhangshangbaoVO selectVO(@Param("ew") Wrapper<GuzhangshangbaoEntity> wrapper);
   	
   	List<GuzhangshangbaoView> selectListView(Wrapper<GuzhangshangbaoEntity> wrapper);
   	
   	GuzhangshangbaoView selectView(@Param("ew") Wrapper<GuzhangshangbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuzhangshangbaoEntity> wrapper);
   	
}

