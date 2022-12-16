package com.wavskying.freemallproduct.service.impl;

import com.wavskying.common.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wavskying.common.utils.Query;

import com.wavskying.freemallproduct.dao.CategoryDao;
import com.wavskying.freemallproduct.entity.CategoryEntity;
import com.wavskying.freemallproduct.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> getListWithTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        List<CategoryEntity> result = new ArrayList<>();
        for (CategoryEntity categoryEntity : categoryEntities) {
            if (categoryEntity.getParentCid() == 0) {
                result.add(categoryEntity);
                categoryEntity.setChildren(getChildren(categoryEntity.getCatId(), categoryEntities));
            }
        }
        return result;
    }

    public List<CategoryEntity> getChildren(long parentId, List<CategoryEntity> categoryEntityList) {
        List<CategoryEntity> result = new ArrayList<>();
        for (CategoryEntity categoryEntity : categoryEntityList) {
            if (categoryEntity.getParentCid() == parentId) {
                result.add(categoryEntity);
                categoryEntity.setChildren(getChildren(categoryEntity.getCatId(), categoryEntityList));
            }
        }
        return result;
    }

}
