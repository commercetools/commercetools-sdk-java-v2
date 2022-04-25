
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeTargetActionImpl.class)
public interface CartDiscountChangeTargetAction extends CartDiscountUpdateAction {

    String CHANGE_TARGET = "changeTarget";

    @NotNull
    @Valid
    @JsonProperty("target")
    public CartDiscountTarget getTarget();

    public void setTarget(final CartDiscountTarget target);

    public static CartDiscountChangeTargetAction of() {
        return new CartDiscountChangeTargetActionImpl();
    }

    public static CartDiscountChangeTargetAction of(final CartDiscountChangeTargetAction template) {
        CartDiscountChangeTargetActionImpl instance = new CartDiscountChangeTargetActionImpl();
        instance.setTarget(template.getTarget());
        return instance;
    }

    public static CartDiscountChangeTargetActionBuilder builder() {
        return CartDiscountChangeTargetActionBuilder.of();
    }

    public static CartDiscountChangeTargetActionBuilder builder(final CartDiscountChangeTargetAction template) {
        return CartDiscountChangeTargetActionBuilder.of(template);
    }

    default <T> T withCartDiscountChangeTargetAction(Function<CartDiscountChangeTargetAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeTargetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeTargetAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountChangeTargetAction>";
            }
        };
    }
}
