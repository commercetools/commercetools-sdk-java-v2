
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountValueRelativeImpl.class)
public interface ProductDiscountValueRelative extends ProductDiscountValue {

    String RELATIVE = "relative";

    @NotNull
    @JsonProperty("permyriad")
    public Long getPermyriad();

    public void setPermyriad(final Long permyriad);

    public static ProductDiscountValueRelative of() {
        return new ProductDiscountValueRelativeImpl();
    }

    public static ProductDiscountValueRelative of(final ProductDiscountValueRelative template) {
        ProductDiscountValueRelativeImpl instance = new ProductDiscountValueRelativeImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    public static ProductDiscountValueRelativeBuilder builder() {
        return ProductDiscountValueRelativeBuilder.of();
    }

    public static ProductDiscountValueRelativeBuilder builder(final ProductDiscountValueRelative template) {
        return ProductDiscountValueRelativeBuilder.of(template);
    }

    default <T> T withProductDiscountValueRelative(Function<ProductDiscountValueRelative, T> helper) {
        return helper.apply(this);
    }
}
