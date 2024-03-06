package com.dao;

import com.entity.ZuchexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuchexinxiVO;
import com.entity.view.ZuchexinxiView;


/**
 * 租车信息
 * 
 * @author 
 * @email 
 * @date 2020-12-02 01:38:50
 */
public interface ZuchexinxiDao extends BaseMapper<ZuchexinxiEntity> {
	
	List<ZuchexinxiVO> selectListVO(@Param("ew") Wrapper<ZuchexinxiEntity> wrapper);
	
	ZuchexinxiVO selectVO(@Param("ew") Wrapper<ZuchexinxiEntity> wrapper);
	
	List<ZuchexinxiView> selectListView(@Param("ew") Wrapper<ZuchexinxiEntity> wrapper);

	List<ZuchexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuchexinxiEntity> wrapper);
	
	ZuchexinxiView selectView(@Param("ew") Wrapper<ZuchexinxiEntity> wrapper);
	
}
