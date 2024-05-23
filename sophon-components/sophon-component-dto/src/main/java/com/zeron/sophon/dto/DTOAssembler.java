package com.zeron.sophon.dto;

/**
 * 数据传输对象组装器(数据传输对象 <-> 领域对象)
 *
 * @param <DTO>
 * @param <Entity>
 */
public interface DTOAssembler<DTO, Entity> {

    /**
     * DTO 转 Entity
     *
     * @param dto 数据传输对象
     * @return 实体
     */
    Entity toEntity(DTO dto);

    /**
     * Entity 转 DTO
     *
     * @param entity 实体
     * @return 数据传输对象
     */
    DTO toDTO(Entity entity);
}
