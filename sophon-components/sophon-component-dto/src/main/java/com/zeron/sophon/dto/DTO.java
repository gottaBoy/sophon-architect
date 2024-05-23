package com.zeron.sophon.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;

/**
 * 数据传输对象
 *
 * Data Transfer object, including Command, Query and Response,
 *
 * Command and Query is CQRS concept.
 *
 */
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Data
public abstract class DTO implements Serializable {

    private static final long serialVersionUID = 1L;

}
