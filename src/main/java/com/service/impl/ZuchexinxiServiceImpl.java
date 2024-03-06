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


import com.dao.ZuchexinxiDao;
import com.entity.ZuchexinxiEntity;
import com.service.ZuchexinxiService;
import com.entity.vo.ZuchexinxiVO;
import com.entity.view.ZuchexinxiView;

@Service("zuchexinxiService")
public class ZuchexinxiServiceImpl extends ServiceImpl<ZuchexinxiDao, ZuchexinxiEntity> implements ZuchexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuchexinxiEntity> page = this.selectPage(
                new Query<ZuchexinxiEntity>(params).getPage(),
                new EntityWrapper<ZuchexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuchexinxiEntity> wrapper) {
		  Page<ZuchexinxiView> page =new Query<ZuchexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuchexinxiVO> selectListVO(Wrapper<ZuchexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuchexinxiVO selectVO(Wrapper<ZuchexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuchexinxiView> selectListView(Wrapper<ZuchexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuchexinxiView selectView(Wrapper<ZuchexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
