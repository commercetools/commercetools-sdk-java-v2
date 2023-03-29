
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a cart discount by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountKeyReference cartDiscountKeyReference = CartDiscountKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountKeyReferenceImpl.class)
public interface CartDiscountKeyReference extends KeyReference {

    /**
     * discriminator value for CartDiscountKeyReference
     */
    String CART_DISCOUNT = "cart-discount";

    /**
     * factory method
     * @return instance of CartDiscountKeyReference
     */
    public static CartDiscountKeyReference of() {
        return new CartDiscountKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountKeyReference of(final CartDiscountKeyReference template) {
        CartDiscountKeyReferenceImpl instance = new CartDiscountKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountKeyReference deepCopy(@Nullable final CartDiscountKeyReference template) {
        if (template == null) {
            return null;
        }
        CartDiscountKeyReferenceImpl instance = new CartDiscountKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CartDiscountKeyReference
     * @return builder
     */
    public static CartDiscountKeyReferenceBuilder builder() {
        return CartDiscountKeyReferenceBuilder.of();
    }

    /**
     * create builder for CartDiscountKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountKeyReferenceBuilder builder(final CartDiscountKeyReference template) {
        return CartDiscountKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountKeyReference(Function<CartDiscountKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountKeyReference>";
            }
        };
    }
}
