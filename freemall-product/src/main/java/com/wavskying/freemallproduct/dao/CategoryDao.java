package com.wavskying.freemallproduct.dao;

import com.wavskying.freemallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hbw
 * @email 2817253626hbw@gmail.com
 * @date 2022-10-08 21:31:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
