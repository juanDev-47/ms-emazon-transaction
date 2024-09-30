package com.emazon.transaction.adapters.driving.rest.dto.request;

import com.emazon.transaction.adapters.driving.rest.utils.RestConstants;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddSuppliesRequestDTO {
    @NotNull(message = RestConstants.FIELD_ID_NULL_MESSAGE)
    private Long productId;

    @NotNull(message = RestConstants.FIELD_AMOUNT_PRODUCT_NULL_MESSAGE)
    @Min(value = 0L, message = RestConstants.FIELD_NO_NEGATIVE_NULL_MESSAGE)
    private Long amountProduct;

    @NotNull(message = RestConstants.FIELD_AMOUNT_PRODUCT_NULL_MESSAGE)
    private String name;
}

