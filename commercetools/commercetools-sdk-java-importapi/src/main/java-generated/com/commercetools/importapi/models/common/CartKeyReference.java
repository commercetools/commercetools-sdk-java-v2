
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a cart by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartKeyReference cartKeyReference = CartKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("cart")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartKeyReferenceImpl.class)
public interface CartKeyReference extends KeyReference {

    /**
     * discriminator value for CartKeyReference
     */
    String CART = "cart";

    /**
     * factory method
     * @return instance of CartKeyReference
     */
    public static CartKeyReference of() {
        return new CartKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy CartKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartKeyReference of(final CartKeyReference template) {
        CartKeyReferenceImpl instance = new CartKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public CartKeyReference copyDeep();

    /**
     * factory method to create a deep copy of CartKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartKeyReference deepCopy(@Nullable final CartKeyReference template) {
        if (template == null) {
            return null;
        }
        CartKeyReferenceImpl instance = new CartKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CartKeyReference
     * @return builder
     */
    public static CartKeyReferenceBuilder builder() {
        return CartKeyReferenceBuilder.of();
    }

    /**
     * create builder for CartKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartKeyReferenceBuilder builder(final CartKeyReference template) {
        return CartKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartKeyReference(Function<CartKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<CartKeyReference>";
            }
        };
    }
}
