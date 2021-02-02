
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountValueExternalImpl.class)
public interface ProductDiscountValueExternal extends ProductDiscountValue {

    String EXTERNAL = "external";

    public static ProductDiscountValueExternal of() {
        return new ProductDiscountValueExternalImpl();
    }

    public static ProductDiscountValueExternal of(final ProductDiscountValueExternal template) {
        ProductDiscountValueExternalImpl instance = new ProductDiscountValueExternalImpl();
        return instance;
    }

    public static ProductDiscountValueExternalBuilder builder() {
        return ProductDiscountValueExternalBuilder.of();
    }

    public static ProductDiscountValueExternalBuilder builder(final ProductDiscountValueExternal template) {
        return ProductDiscountValueExternalBuilder.of(template);
    }

    default <T> T withProductDiscountValueExternal(Function<ProductDiscountValueExternal, T> helper) {
        return helper.apply(this);
    }
}
