
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_discount.ProductDiscountReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountedPriceImpl.class)
public interface DiscountedPrice {

    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    @NotNull
    @Valid
    @JsonProperty("discount")
    public ProductDiscountReference getDiscount();

    public void setValue(final Money value);

    public void setDiscount(final ProductDiscountReference discount);

    public static DiscountedPrice of() {
        return new DiscountedPriceImpl();
    }

    public static DiscountedPrice of(final DiscountedPrice template) {
        DiscountedPriceImpl instance = new DiscountedPriceImpl();
        instance.setValue(template.getValue());
        instance.setDiscount(template.getDiscount());
        return instance;
    }

    public static DiscountedPriceBuilder builder() {
        return DiscountedPriceBuilder.of();
    }

    public static DiscountedPriceBuilder builder(final DiscountedPrice template) {
        return DiscountedPriceBuilder.of(template);
    }

    default <T> T withDiscountedPrice(Function<DiscountedPrice, T> helper) {
        return helper.apply(this);
    }
}
