
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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CartDiscountTarget {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

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
        return instance;
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
