package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuchexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuchexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuchexinxiView;


/**
 * 租车信息
 *
 * @author 
 * @email 
 * @date 2020-12-02 01:38:50
 */
public interface ZuchexinxiService extends IService<ZuchexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuchexinxiVO> selectListVO(Wrapper<ZuchexinxiEntity> wrapper);
   	
   	ZuchexinxiVO selectVO(@Param("ew") Wrapper<ZuchexinxiEntity> wrapper);
   	
   	List<ZuchexinxiView> selectListView(Wrapper<ZuchexinxiEntity> wrapper);
   	
   	ZuchexinxiView selectView(@Param("ew") Wrapper<ZuchexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuchexinxiEntity> wrapper);
   	
}

