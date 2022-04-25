
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeChangeCartDiscountsActionImpl.class)
public interface DiscountCodeChangeCartDiscountsAction extends DiscountCodeUpdateAction {

    String CHANGE_CART_DISCOUNTS = "changeCartDiscounts";

    @NotNull
    @Valid
    @JsonProperty("cartDiscounts")
    public List<CartDiscountResourceIdentifier> getCartDiscounts();

    @JsonIgnore
    public void setCartDiscounts(final CartDiscountResourceIdentifier... cartDiscounts);

    public void setCartDiscounts(final List<CartDiscountResourceIdentifier> cartDiscounts);

    public static DiscountCodeChangeCartDiscountsAction of() {
        return new DiscountCodeChangeCartDiscountsActionImpl();
    }

    public static DiscountCodeChangeCartDiscountsAction of(final DiscountCodeChangeCartDiscountsAction template) {
        DiscountCodeChangeCartDiscountsActionImpl instance = new DiscountCodeChangeCartDiscountsActionImpl();
        instance.setCartDiscounts(template.getCartDiscounts());
        return instance;
    }

    public static DiscountCodeChangeCartDiscountsActionBuilder builder() {
        return DiscountCodeChangeCartDiscountsActionBuilder.of();
    }

    public static DiscountCodeChangeCartDiscountsActionBuilder builder(
            final DiscountCodeChangeCartDiscountsAction template) {
        return DiscountCodeChangeCartDiscountsActionBuilder.of(template);
    }

    default <T> T withDiscountCodeChangeCartDiscountsAction(Function<DiscountCodeChangeCartDiscountsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeChangeCartDiscountsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeChangeCartDiscountsAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeChangeCartDiscountsAction>";
            }
        };
    }
}
