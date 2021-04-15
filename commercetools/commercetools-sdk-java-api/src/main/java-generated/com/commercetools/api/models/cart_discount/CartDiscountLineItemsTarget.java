
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountLineItemsTargetImpl.class)
public interface CartDiscountLineItemsTarget extends CartDiscountTarget {

    String LINE_ITEMS = "lineItems";

    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    public void setPredicate(final String predicate);

    public static CartDiscountLineItemsTarget of() {
        return new CartDiscountLineItemsTargetImpl();
    }

    public static CartDiscountLineItemsTarget of(final CartDiscountLineItemsTarget template) {
        CartDiscountLineItemsTargetImpl instance = new CartDiscountLineItemsTargetImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    public static CartDiscountLineItemsTargetBuilder builder() {
        return CartDiscountLineItemsTargetBuilder.of();
    }

    public static CartDiscountLineItemsTargetBuilder builder(final CartDiscountLineItemsTarget template) {
        return CartDiscountLineItemsTargetBuilder.of(template);
    }

    default <T> T withCartDiscountLineItemsTarget(Function<CartDiscountLineItemsTarget, T> helper) {
        return helper.apply(this);
    }
}
