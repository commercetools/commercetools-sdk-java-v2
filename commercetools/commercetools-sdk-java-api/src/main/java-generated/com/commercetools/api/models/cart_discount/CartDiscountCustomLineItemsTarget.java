
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountCustomLineItemsTargetImpl.class)
public interface CartDiscountCustomLineItemsTarget extends CartDiscountTarget {

    String CUSTOM_LINE_ITEMS = "customLineItems";

    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    public void setPredicate(final String predicate);

    public static CartDiscountCustomLineItemsTarget of() {
        return new CartDiscountCustomLineItemsTargetImpl();
    }

    public static CartDiscountCustomLineItemsTarget of(final CartDiscountCustomLineItemsTarget template) {
        CartDiscountCustomLineItemsTargetImpl instance = new CartDiscountCustomLineItemsTargetImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    public static CartDiscountCustomLineItemsTargetBuilder builder() {
        return CartDiscountCustomLineItemsTargetBuilder.of();
    }

    public static CartDiscountCustomLineItemsTargetBuilder builder(final CartDiscountCustomLineItemsTarget template) {
        return CartDiscountCustomLineItemsTargetBuilder.of(template);
    }

    default <T> T withCartDiscountCustomLineItemsTarget(Function<CartDiscountCustomLineItemsTarget, T> helper) {
        return helper.apply(this);
    }
}
