package com.zeron.sophon.domain;

import org.mapstruct.MappingTarget;

/**
 * 实体转换器(领域对象 <-> 数据库对象)
 *
 * @author yi.min
 * @version 2024/05/22
 **/
public interface EntityConvertor<Entity, DO> {

    Entity toEntity(DO dataObject);

    DO toDataObject(Entity entity);

    void updateDOFromEntity(Entity entity, @MappingTarget DO dataObject);
}
