package com.entity.view;

import com.entity.HaichexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 还车信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-02 01:38:50
 */
@TableName("haichexinxi")
public class HaichexinxiView  extends HaichexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HaichexinxiView(){
	}
 
 	public HaichexinxiView(HaichexinxiEntity haichexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, haichexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
