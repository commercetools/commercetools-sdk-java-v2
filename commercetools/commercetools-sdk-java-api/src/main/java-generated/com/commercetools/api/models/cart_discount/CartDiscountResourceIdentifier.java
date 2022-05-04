
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:CartDiscount">CartDiscount</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountResourceIdentifierImpl.class)
public interface CartDiscountResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<CartDiscount> {

    String CART_DISCOUNT = "cart-discount";

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:CartDiscount">CartDiscount</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-defined unique identifier of the referenced <a href="ctp:api:type:CartDiscount">CartDiscount</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static CartDiscountResourceIdentifier of() {
        return new CartDiscountResourceIdentifierImpl();
    }

    public static CartDiscountResourceIdentifier of(final CartDiscountResourceIdentifier template) {
        CartDiscountResourceIdentifierImpl instance = new CartDiscountResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static CartDiscountResourceIdentifierBuilder builder() {
        return CartDiscountResourceIdentifierBuilder.of();
    }

    public static CartDiscountResourceIdentifierBuilder builder(final CartDiscountResourceIdentifier template) {
        return CartDiscountResourceIdentifierBuilder.of(template);
    }

    default <T> T withCartDiscountResourceIdentifier(Function<CartDiscountResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountResourceIdentifier>";
            }
        };
    }
}
