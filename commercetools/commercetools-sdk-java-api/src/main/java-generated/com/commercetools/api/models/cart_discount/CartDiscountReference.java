
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountReferenceImpl.class)
public interface CartDiscountReference extends Reference, com.commercetools.api.models.Identifiable<CartDiscount> {

    String CART_DISCOUNT = "cart-discount";

    @Valid
    @JsonProperty("obj")
    public CartDiscount getObj();

    public void setObj(final CartDiscount obj);

    public static CartDiscountReference of() {
        return new CartDiscountReferenceImpl();
    }

    public static CartDiscountReference of(final CartDiscountReference template) {
        CartDiscountReferenceImpl instance = new CartDiscountReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static CartDiscountReferenceBuilder builder() {
        return CartDiscountReferenceBuilder.of();
    }

    public static CartDiscountReferenceBuilder builder(final CartDiscountReference template) {
        return CartDiscountReferenceBuilder.of(template);
    }

    default <T> T withCartDiscountReference(Function<CartDiscountReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountReference>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountReference>";
            }
        };
    }
}
