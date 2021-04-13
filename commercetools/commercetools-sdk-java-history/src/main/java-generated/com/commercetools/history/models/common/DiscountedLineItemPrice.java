
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountedLineItemPriceImpl.class)
public interface DiscountedLineItemPrice {

    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    @NotNull
    @Valid
    @JsonProperty("includedDiscounts")
    public List<DiscountedLineItemPortion> getIncludedDiscounts();

    public void setValue(final Money value);

    @JsonIgnore
    public void setIncludedDiscounts(final DiscountedLineItemPortion... includedDiscounts);

    public void setIncludedDiscounts(final List<DiscountedLineItemPortion> includedDiscounts);

    public static DiscountedLineItemPrice of() {
        return new DiscountedLineItemPriceImpl();
    }

    public static DiscountedLineItemPrice of(final DiscountedLineItemPrice template) {
        DiscountedLineItemPriceImpl instance = new DiscountedLineItemPriceImpl();
        instance.setValue(template.getValue());
        instance.setIncludedDiscounts(template.getIncludedDiscounts());
        return instance;
    }

    public static DiscountedLineItemPriceBuilder builder() {
        return DiscountedLineItemPriceBuilder.of();
    }

    public static DiscountedLineItemPriceBuilder builder(final DiscountedLineItemPrice template) {
        return DiscountedLineItemPriceBuilder.of(template);
    }

    default <T> T withDiscountedLineItemPrice(Function<DiscountedLineItemPrice, T> helper) {
        return helper.apply(this);
    }
}
