
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
 * CartDiscountTarget
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountTarget cartDiscountTarget = CartDiscountTarget.builder()
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountTargetImpl.class)
public interface CartDiscountTarget {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * set type
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     * factory method
     * @return instance of CartDiscountTarget
     */
    public static CartDiscountTarget of() {
        return new CartDiscountTargetImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountTarget
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountTarget of(final CartDiscountTarget template) {
        CartDiscountTargetImpl instance = new CartDiscountTargetImpl();
        instance.setType(template.getType());
        return instance;
    }

    public CartDiscountTarget copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountTarget
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountTarget deepCopy(@Nullable final CartDiscountTarget template) {
        if (template == null) {
            return null;
        }
        CartDiscountTargetImpl instance = new CartDiscountTargetImpl();
        instance.setType(template.getType());
        return instance;
    }

    /**
     * builder factory method for CartDiscountTarget
     * @return builder
     */
    public static CartDiscountTargetBuilder builder() {
        return CartDiscountTargetBuilder.of();
    }

    /**
     * create builder for CartDiscountTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountTargetBuilder builder(final CartDiscountTarget template) {
        return CartDiscountTargetBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountTarget(Function<CartDiscountTarget, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountTarget>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountTarget>";
            }
        };
    }
}
