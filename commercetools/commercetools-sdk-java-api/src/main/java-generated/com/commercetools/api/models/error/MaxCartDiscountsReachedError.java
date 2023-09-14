
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a Cart Discount cannot be created or activated as the limit for active Cart Discounts has been reached.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create CartDiscount and Create CartDiscount in Store requests</li>
 *   <li>Change IsActive update action</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MaxCartDiscountsReachedError maxCartDiscountsReachedError = MaxCartDiscountsReachedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MaxCartDiscountsReachedErrorImpl.class)
public interface MaxCartDiscountsReachedError extends ErrorObject {

    /**
     * discriminator value for MaxCartDiscountsReachedError
     */
    String MAX_CART_DISCOUNTS_REACHED = "MaxCartDiscountsReached";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Maximum number of active cart discounts reached ($max)."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Maximum number of active cart discounts reached ($max)."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of MaxCartDiscountsReachedError
     */
    public static MaxCartDiscountsReachedError of() {
        return new MaxCartDiscountsReachedErrorImpl();
    }

    /**
     * factory method to create a shallow copy MaxCartDiscountsReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static MaxCartDiscountsReachedError of(final MaxCartDiscountsReachedError template) {
        MaxCartDiscountsReachedErrorImpl instance = new MaxCartDiscountsReachedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of MaxCartDiscountsReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MaxCartDiscountsReachedError deepCopy(@Nullable final MaxCartDiscountsReachedError template) {
        if (template == null) {
            return null;
        }
        MaxCartDiscountsReachedErrorImpl instance = new MaxCartDiscountsReachedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for MaxCartDiscountsReachedError
     * @return builder
     */
    public static MaxCartDiscountsReachedErrorBuilder builder() {
        return MaxCartDiscountsReachedErrorBuilder.of();
    }

    /**
     * create builder for MaxCartDiscountsReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MaxCartDiscountsReachedErrorBuilder builder(final MaxCartDiscountsReachedError template) {
        return MaxCartDiscountsReachedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMaxCartDiscountsReachedError(Function<MaxCartDiscountsReachedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MaxCartDiscountsReachedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MaxCartDiscountsReachedError>() {
            @Override
            public String toString() {
                return "TypeReference<MaxCartDiscountsReachedError>";
            }
        };
    }
}
