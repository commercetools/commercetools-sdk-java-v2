
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
@JsonDeserialize(as = CartDiscountChangeValueActionImpl.class)
public interface CartDiscountChangeValueAction extends CartDiscountUpdateAction {

    String CHANGE_VALUE = "changeValue";

    @NotNull
    @Valid
    @JsonProperty("value")
    public CartDiscountValueDraft getValue();

    public void setValue(final CartDiscountValueDraft value);

    public static CartDiscountChangeValueAction of() {
        return new CartDiscountChangeValueActionImpl();
    }

    public static CartDiscountChangeValueAction of(final CartDiscountChangeValueAction template) {
        CartDiscountChangeValueActionImpl instance = new CartDiscountChangeValueActionImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartDiscountChangeValueActionBuilder builder() {
        return CartDiscountChangeValueActionBuilder.of();
    }

    public static CartDiscountChangeValueActionBuilder builder(final CartDiscountChangeValueAction template) {
        return CartDiscountChangeValueActionBuilder.of(template);
    }

    default <T> T withCartDiscountChangeValueAction(Function<CartDiscountChangeValueAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeValueAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeValueAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountChangeValueAction>";
            }
        };
    }
}
