
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRate" rel="nofollow">ShippingRate</a> maps to the value of the Cart and is used to select a tier. The value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> is the sum of all Line Item totals and Custom Line Item totals (via the <code>totalPrice</code> field) after any Product Discounts and Cart Discounts have been applied. If chosen, it is not possible to set a value for the <code>shippingRateInput</code> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartValueType cartValueType = CartValueType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CartValue")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartValueTypeImpl.class)
public interface CartValueType extends ShippingRateInputType {

    /**
     * discriminator value for CartValueType
     */
    String CART_VALUE = "CartValue";

    /**
     * factory method
     * @return instance of CartValueType
     */
    public static CartValueType of() {
        return new CartValueTypeImpl();
    }

    /**
     * factory method to create a shallow copy CartValueType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartValueType of(final CartValueType template) {
        CartValueTypeImpl instance = new CartValueTypeImpl();
        return instance;
    }

    public CartValueType copyDeep();

    /**
     * factory method to create a deep copy of CartValueType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartValueType deepCopy(@Nullable final CartValueType template) {
        if (template == null) {
            return null;
        }
        CartValueTypeImpl instance = new CartValueTypeImpl();
        return instance;
    }

    /**
     * builder factory method for CartValueType
     * @return builder
     */
    public static CartValueTypeBuilder builder() {
        return CartValueTypeBuilder.of();
    }

    /**
     * create builder for CartValueType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartValueTypeBuilder builder(final CartValueType template) {
        return CartValueTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartValueType(Function<CartValueType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartValueType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartValueType>() {
            @Override
            public String toString() {
                return "TypeReference<CartValueType>";
            }
        };
    }
}
