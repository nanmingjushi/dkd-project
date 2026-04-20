package com.dkd.manage.domain.dto;

import lombok.Data;

/**
 * @author nan chao
 * @since 2026/4/20 20:53
 */



@Data
public class TaskDetailsDto {

    private String channelCode;
    private Long expectCapacity;
    private Long skuId;
    private String skuName;
    private String skuImage;

}
