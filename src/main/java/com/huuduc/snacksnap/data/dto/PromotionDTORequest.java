package com.huuduc.snacksnap.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PromotionDTORequest {

    private int discount;
    private boolean status;

}
