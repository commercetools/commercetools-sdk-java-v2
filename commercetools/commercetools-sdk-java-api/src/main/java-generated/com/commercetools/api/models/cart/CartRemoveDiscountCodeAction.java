
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartRemoveDiscountCodeActionImpl.class)
public interface CartRemoveDiscountCodeAction extends CartUpdateAction {

    String REMOVE_DISCOUNT_CODE = "removeDiscountCode";

    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    public void setDiscountCode(final DiscountCodeReference discountCode);

    public static CartRemoveDiscountCodeAction of() {
        return new CartRemoveDiscountCodeActionImpl();
    }

    public static CartRemoveDiscountCodeAction of(final CartRemoveDiscountCodeAction template) {
        CartRemoveDiscountCodeActionImpl instance = new CartRemoveDiscountCodeActionImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    public static CartRemoveDiscountCodeActionBuilder builder() {
        return CartRemoveDiscountCodeActionBuilder.of();
    }

    public static CartRemoveDiscountCodeActionBuilder builder(final CartRemoveDiscountCodeAction template) {
        return CartRemoveDiscountCodeActionBuilder.of(template);
    }

    default <T> T withCartRemoveDiscountCodeAction(Function<CartRemoveDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartRemoveDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartRemoveDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRemoveDiscountCodeAction>";
            }
        };
    }
}
