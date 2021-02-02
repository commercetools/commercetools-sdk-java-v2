
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountedPriceImpl.class)
public interface DiscountedPrice {

    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
    *  <p>Reference to a ProductDiscount.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("discount")
    public ProductDiscountKeyReference getDiscount();

    public void setValue(final TypedMoney value);

    public void setDiscount(final ProductDiscountKeyReference discount);

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
