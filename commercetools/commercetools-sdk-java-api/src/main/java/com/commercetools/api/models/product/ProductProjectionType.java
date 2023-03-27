
package com.commercetools.api.models.product;

public enum ProductProjectionType {
    CURRENT, STAGED;

    public Boolean isStaged() {
        return this == STAGED;
    }
}
