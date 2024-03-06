package com.dao;

import com.entity.GuzhangshangbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuzhangshangbaoVO;
import com.entity.view.GuzhangshangbaoView;


/**
 * 故障上报
 * 
 * @author 
 * @email 
 * @date 2020-12-02 01:38:50
 */
public interface GuzhangshangbaoDao extends BaseMapper<GuzhangshangbaoEntity> {
	
	List<GuzhangshangbaoVO> selectListVO(@Param("ew") Wrapper<GuzhangshangbaoEntity> wrapper);
	
	GuzhangshangbaoVO selectVO(@Param("ew") Wrapper<GuzhangshangbaoEntity> wrapper);
	
	List<GuzhangshangbaoView> selectListView(@Param("ew") Wrapper<GuzhangshangbaoEntity> wrapper);

	List<GuzhangshangbaoView> selectListView(Pagination page,@Param("ew") Wrapper<GuzhangshangbaoEntity> wrapper);
	
	GuzhangshangbaoView selectView(@Param("ew") Wrapper<GuzhangshangbaoEntity> wrapper);
	
}
