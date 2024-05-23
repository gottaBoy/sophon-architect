package com.zeron.sophon.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 命令（CQRS）
 *
 * Command request from Client.
 *
 */
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Data
public abstract class Command extends DTO {

    private static final long serialVersionUID = 1L;

}
