
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a Product Discount could not be found that could be applied to the Price of a Product Variant.</p>
 *  <p>The error is returned as a failed response to the Get Matching ProductDiscount request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NoMatchingProductDiscountFoundError noMatchingProductDiscountFoundError = NoMatchingProductDiscountFoundError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NoMatchingProductDiscountFoundErrorImpl.class)
public interface NoMatchingProductDiscountFoundError extends ErrorObject {

    /**
     * discriminator value for NoMatchingProductDiscountFoundError
     */
    String NO_MATCHING_PRODUCT_DISCOUNT_FOUND = "NoMatchingProductDiscountFound";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Couldn't find a matching product discount for: productId=$productId, variantId=$variantId, price=$price."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Couldn't find a matching product discount for: productId=$productId, variantId=$variantId, price=$price."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of NoMatchingProductDiscountFoundError
     */
    public static NoMatchingProductDiscountFoundError of() {
        return new NoMatchingProductDiscountFoundErrorImpl();
    }

    /**
     * factory method to create a shallow copy NoMatchingProductDiscountFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static NoMatchingProductDiscountFoundError of(final NoMatchingProductDiscountFoundError template) {
        NoMatchingProductDiscountFoundErrorImpl instance = new NoMatchingProductDiscountFoundErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of NoMatchingProductDiscountFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static NoMatchingProductDiscountFoundError deepCopy(
            @Nullable final NoMatchingProductDiscountFoundError template) {
        if (template == null) {
            return null;
        }
        NoMatchingProductDiscountFoundErrorImpl instance = new NoMatchingProductDiscountFoundErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for NoMatchingProductDiscountFoundError
     * @return builder
     */
    public static NoMatchingProductDiscountFoundErrorBuilder builder() {
        return NoMatchingProductDiscountFoundErrorBuilder.of();
    }

    /**
     * create builder for NoMatchingProductDiscountFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NoMatchingProductDiscountFoundErrorBuilder builder(
            final NoMatchingProductDiscountFoundError template) {
        return NoMatchingProductDiscountFoundErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withNoMatchingProductDiscountFoundError(Function<NoMatchingProductDiscountFoundError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<NoMatchingProductDiscountFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NoMatchingProductDiscountFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<NoMatchingProductDiscountFoundError>";
            }
        };
    }
}
