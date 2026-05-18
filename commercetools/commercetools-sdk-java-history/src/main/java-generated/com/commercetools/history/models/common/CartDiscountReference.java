
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountReference cartDiscountReference = CartDiscountReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("cart-discount")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountReferenceImpl.class)
public interface CartDiscountReference extends Reference {

    /**
     * discriminator value for CartDiscountReference
     */
    String CART_DISCOUNT = "cart-discount";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of CartDiscountReference
     */
    public static CartDiscountReference of() {
        return new CartDiscountReferenceImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountReference of(final CartDiscountReference template) {
        CartDiscountReferenceImpl instance = new CartDiscountReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public CartDiscountReference copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountReference deepCopy(@Nullable final CartDiscountReference template) {
        if (template == null) {
            return null;
        }
        CartDiscountReferenceImpl instance = new CartDiscountReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for CartDiscountReference
     * @return builder
     */
    public static CartDiscountReferenceBuilder builder() {
        return CartDiscountReferenceBuilder.of();
    }

    /**
     * create builder for CartDiscountReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountReferenceBuilder builder(final CartDiscountReference template) {
        return CartDiscountReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountReference(Function<CartDiscountReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountReference>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountReference>";
            }
        };
    }
}
