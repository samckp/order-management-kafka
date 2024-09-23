package com.sam.order.dto.response;

import com.sam.order.dto.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {
    private String orderId;
    private OrderStatus status;
}