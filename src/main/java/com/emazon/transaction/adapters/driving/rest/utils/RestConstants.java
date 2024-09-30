package com.emazon.transaction.adapters.driving.rest.utils;

public class RestConstants {

    private RestConstants() {
        throw new IllegalStateException("Utility class");
    }


    // NULL Messages
    public static final String FIELD_ID_NULL_MESSAGE = "Field 'id' cannot be null";
    public static final String FIELD_AMOUNT_PRODUCT_NULL_MESSAGE = "Field 'amount products' cannot be null";
    public static final String FIELD_NO_NEGATIVE_NULL_MESSAGE = "The value must be positive";

}
