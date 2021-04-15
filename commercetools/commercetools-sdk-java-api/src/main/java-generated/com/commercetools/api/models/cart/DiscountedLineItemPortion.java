
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountedLineItemPortionImpl.class)
public interface DiscountedLineItemPortion {

    @NotNull
    @Valid
    @JsonProperty("discount")
    public CartDiscountReference getDiscount();

    @NotNull
    @Valid
    @JsonProperty("discountedAmount")
    public TypedMoney getDiscountedAmount();

    public void setDiscount(final CartDiscountReference discount);

    public void setDiscountedAmount(final TypedMoney discountedAmount);

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
}
