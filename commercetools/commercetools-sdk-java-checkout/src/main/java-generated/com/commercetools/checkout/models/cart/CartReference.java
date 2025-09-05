
package com.commercetools.checkout.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reference to a <span>Cart</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartReference cartReference = CartReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("cart")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartReferenceImpl.class)
public interface CartReference extends Reference {

    /**
     * discriminator value for CartReference
     */
    String CART = "cart";

    /**
     *  <p>Unique identifier of the referenced <span>Cart</span>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <span>Cart</span>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of CartReference
     */
    public static CartReference of() {
        return new CartReferenceImpl();
    }

    /**
     * factory method to create a shallow copy CartReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartReference of(final CartReference template) {
        CartReferenceImpl instance = new CartReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public CartReference copyDeep();

    /**
     * factory method to create a deep copy of CartReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartReference deepCopy(@Nullable final CartReference template) {
        if (template == null) {
            return null;
        }
        CartReferenceImpl instance = new CartReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for CartReference
     * @return builder
     */
    public static CartReferenceBuilder builder() {
        return CartReferenceBuilder.of();
    }

    /**
     * create builder for CartReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartReferenceBuilder builder(final CartReference template) {
        return CartReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartReference(Function<CartReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartReference>() {
            @Override
            public String toString() {
                return "TypeReference<CartReference>";
            }
        };
    }
}
