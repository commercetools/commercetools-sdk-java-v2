
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
@JsonDeserialize(as = DiscountedLineItemPortionImpl.class)
public interface DiscountedLineItemPortion {

    @NotNull
    @Valid
    @JsonProperty("discount")
    public Reference getDiscount();

    @NotNull
    @Valid
    @JsonProperty("discountedAmount")
    public Money getDiscountedAmount();

    public void setDiscount(final Reference discount);

    public void setDiscountedAmount(final Money discountedAmount);

    public static DiscountedLineItemPortion of() {
        return new DiscountedLineItemPortionImpl();
    }

    public static DiscountedLineItemPortion of(final DiscountedLineItemPortion template) {
        DiscountedLineItemPortionImpl instance = new DiscountedLineItemPortionImpl();
        instance.setDiscount(template.getDiscount());
        instance.setDiscountedAmount(template.getDiscountedAmount());
        return instance;
    }

    public static DiscountedLineItemPortionBuilder builder() {
        return DiscountedLineItemPortionBuilder.of();
    }

    public static DiscountedLineItemPortionBuilder builder(final DiscountedLineItemPortion template) {
        return DiscountedLineItemPortionBuilder.of(template);
    }

    default <T> T withDiscountedLineItemPortion(Function<DiscountedLineItemPortion, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPortion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPortion>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedLineItemPortion>";
            }
        };
    }
}
