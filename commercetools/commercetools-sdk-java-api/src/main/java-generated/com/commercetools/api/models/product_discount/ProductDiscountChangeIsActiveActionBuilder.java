
package com.commercetools.api.models.product_discount;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.product_discount.ProductDiscountChangeIsActiveAction;
import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountChangeIsActiveActionBuilder {

    private Boolean isActive;

    public ProductDiscountChangeIsActiveActionBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public ProductDiscountChangeIsActiveAction build() {
        return new ProductDiscountChangeIsActiveActionImpl(isActive);
    }

    public static ProductDiscountChangeIsActiveActionBuilder of() {
        return new ProductDiscountChangeIsActiveActionBuilder();
    }

    public static ProductDiscountChangeIsActiveActionBuilder of(final ProductDiscountChangeIsActiveAction template) {
        ProductDiscountChangeIsActiveActionBuilder builder = new ProductDiscountChangeIsActiveActionBuilder();
        builder.isActive = template.getIsActive();
        return builder;
    }

}
