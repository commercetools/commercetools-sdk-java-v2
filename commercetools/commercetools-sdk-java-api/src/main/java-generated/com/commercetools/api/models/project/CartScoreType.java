
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The ShippingRate maps to an abstract Cart categorization expressed by integers (such as shipping scores or weight ranges).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartScoreType cartScoreType = CartScoreType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartScoreTypeImpl.class)
public interface CartScoreType extends ShippingRateInputType {

    /**
     * discriminator value for CartScoreType
     */
    String CART_SCORE = "CartScore";

    /**
     * factory method
     * @return instance of CartScoreType
     */
    public static CartScoreType of() {
        return new CartScoreTypeImpl();
    }

    /**
     * factory method to create a shallow copy CartScoreType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartScoreType of(final CartScoreType template) {
        CartScoreTypeImpl instance = new CartScoreTypeImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of CartScoreType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartScoreType deepCopy(@Nullable final CartScoreType template) {
        if (template == null) {
            return null;
        }
        CartScoreTypeImpl instance = new CartScoreTypeImpl();
        return instance;
    }

    /**
     * builder factory method for CartScoreType
     * @return builder
     */
    public static CartScoreTypeBuilder builder() {
        return CartScoreTypeBuilder.of();
    }

    /**
     * create builder for CartScoreType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartScoreTypeBuilder builder(final CartScoreType template) {
        return CartScoreTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartScoreType(Function<CartScoreType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartScoreType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartScoreType>() {
            @Override
            public String toString() {
                return "TypeReference<CartScoreType>";
            }
        };
    }
}
