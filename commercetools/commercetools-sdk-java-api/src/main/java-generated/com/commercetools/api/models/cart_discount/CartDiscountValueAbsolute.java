
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
@JsonDeserialize(as = CartDiscountValueAbsoluteImpl.class)
public interface CartDiscountValueAbsolute extends CartDiscountValue {

    String ABSOLUTE = "absolute";

    @NotNull
    @Valid
    @JsonProperty("money")
    public List<TypedMoney> getMoney();

    @JsonIgnore
    public void setMoney(final TypedMoney... money);

    public void setMoney(final List<TypedMoney> money);

    public static CartDiscountValueAbsolute of() {
        return new CartDiscountValueAbsoluteImpl();
    }

    public static CartDiscountValueAbsolute of(final CartDiscountValueAbsolute template) {
        CartDiscountValueAbsoluteImpl instance = new CartDiscountValueAbsoluteImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    public static CartDiscountValueAbsoluteBuilder builder() {
        return CartDiscountValueAbsoluteBuilder.of();
    }

    public static CartDiscountValueAbsoluteBuilder builder(final CartDiscountValueAbsolute template) {
        return CartDiscountValueAbsoluteBuilder.of(template);
    }

    default <T> T withCartDiscountValueAbsolute(Function<CartDiscountValueAbsolute, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueAbsolute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueAbsolute>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueAbsolute>";
            }
        };
    }
}
