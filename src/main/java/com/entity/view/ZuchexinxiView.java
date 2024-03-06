package com.entity.view;

import com.entity.ZuchexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 租车信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-02 01:38:50
 */
@TableName("zuchexinxi")
public class ZuchexinxiView  extends ZuchexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuchexinxiView(){
	}
 
 	public ZuchexinxiView(ZuchexinxiEntity zuchexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zuchexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
