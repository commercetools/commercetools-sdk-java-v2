
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueFixedImpl.class)
public interface CartDiscountValueFixed extends CartDiscountValue {

    String FIXED = "fixed";

    @NotNull
    @Valid
    @JsonProperty("money")
    public List<TypedMoney> getMoney();

    @JsonIgnore
    public void setMoney(final TypedMoney... money);

    public void setMoney(final List<TypedMoney> money);

    public static CartDiscountValueFixed of() {
        return new CartDiscountValueFixedImpl();
    }

    public static CartDiscountValueFixed of(final CartDiscountValueFixed template) {
        CartDiscountValueFixedImpl instance = new CartDiscountValueFixedImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    public static CartDiscountValueFixedBuilder builder() {
        return CartDiscountValueFixedBuilder.of();
    }

    public static CartDiscountValueFixedBuilder builder(final CartDiscountValueFixed template) {
        return CartDiscountValueFixedBuilder.of(template);
    }

    default <T> T withCartDiscountValueFixed(Function<CartDiscountValueFixed, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueFixed> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueFixed>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueFixed>";
            }
        };
    }
}
