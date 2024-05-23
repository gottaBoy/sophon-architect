package com.zeron.sophon.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 查询（CQRS）
 *
 * Query request from Client.
 *
 */
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Data
public abstract class Query extends Command {

    private static final long serialVersionUID = 1L;

}
