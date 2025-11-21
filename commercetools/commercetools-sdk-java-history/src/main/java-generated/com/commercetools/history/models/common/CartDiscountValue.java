
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
 * CartDiscountValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValue cartDiscountValue = CartDiscountValue.builder()
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueImpl.class)
public interface CartDiscountValue {

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
     * @return instance of CartDiscountValue
     */
    public static CartDiscountValue of() {
        return new CartDiscountValueImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountValue of(final CartDiscountValue template) {
        CartDiscountValueImpl instance = new CartDiscountValueImpl();
        instance.setType(template.getType());
        return instance;
    }

    public CartDiscountValue copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountValue deepCopy(@Nullable final CartDiscountValue template) {
        if (template == null) {
            return null;
        }
        CartDiscountValueImpl instance = new CartDiscountValueImpl();
        instance.setType(template.getType());
        return instance;
    }

    /**
     * builder factory method for CartDiscountValue
     * @return builder
     */
    public static CartDiscountValueBuilder builder() {
        return CartDiscountValueBuilder.of();
    }

    /**
     * create builder for CartDiscountValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueBuilder builder(final CartDiscountValue template) {
        return CartDiscountValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountValue(Function<CartDiscountValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValue>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValue>";
            }
        };
    }
}
