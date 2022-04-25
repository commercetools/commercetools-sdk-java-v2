
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartAddDiscountCodeActionImpl.class)
public interface CartAddDiscountCodeAction extends CartUpdateAction {

    String ADD_DISCOUNT_CODE = "addDiscountCode";

    @NotNull
    @JsonProperty("code")
    public String getCode();

    public void setCode(final String code);

    public static CartAddDiscountCodeAction of() {
        return new CartAddDiscountCodeActionImpl();
    }

    public static CartAddDiscountCodeAction of(final CartAddDiscountCodeAction template) {
        CartAddDiscountCodeActionImpl instance = new CartAddDiscountCodeActionImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    public static CartAddDiscountCodeActionBuilder builder() {
        return CartAddDiscountCodeActionBuilder.of();
    }

    public static CartAddDiscountCodeActionBuilder builder(final CartAddDiscountCodeAction template) {
        return CartAddDiscountCodeActionBuilder.of(template);
    }

    default <T> T withCartAddDiscountCodeAction(Function<CartAddDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartAddDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddDiscountCodeAction>";
            }
        };
    }
}
