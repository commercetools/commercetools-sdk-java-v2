
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
 *  <p>Returned when a Store cannot be added to a Cart Discount as the limit for Stores configured for a Cart Discount has been reached.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create CartDiscount and Create CartDiscount in Store requests</li>
 *   <li>Add Store and Set Store update actions</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MaxStoreReferencesReachedError maxStoreReferencesReachedError = MaxStoreReferencesReachedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MaxStoreReferencesReachedErrorImpl.class)
public interface MaxStoreReferencesReachedError extends ErrorObject {

    /**
     * discriminator value for MaxStoreReferencesReachedError
     */
    String MAX_STORE_REFERENCES_REACHED = "MaxStoreReferencesReached";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Maximum number of store discounts on a single cart discount reached $max".</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Maximum number of store discounts on a single cart discount reached $max".</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of MaxStoreReferencesReachedError
     */
    public static MaxStoreReferencesReachedError of() {
        return new MaxStoreReferencesReachedErrorImpl();
    }

    /**
     * factory method to create a shallow copy MaxStoreReferencesReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static MaxStoreReferencesReachedError of(final MaxStoreReferencesReachedError template) {
        MaxStoreReferencesReachedErrorImpl instance = new MaxStoreReferencesReachedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of MaxStoreReferencesReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MaxStoreReferencesReachedError deepCopy(@Nullable final MaxStoreReferencesReachedError template) {
        if (template == null) {
            return null;
        }
        MaxStoreReferencesReachedErrorImpl instance = new MaxStoreReferencesReachedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for MaxStoreReferencesReachedError
     * @return builder
     */
    public static MaxStoreReferencesReachedErrorBuilder builder() {
        return MaxStoreReferencesReachedErrorBuilder.of();
    }

    /**
     * create builder for MaxStoreReferencesReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MaxStoreReferencesReachedErrorBuilder builder(final MaxStoreReferencesReachedError template) {
        return MaxStoreReferencesReachedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMaxStoreReferencesReachedError(Function<MaxStoreReferencesReachedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MaxStoreReferencesReachedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MaxStoreReferencesReachedError>() {
            @Override
            public String toString() {
                return "TypeReference<MaxStoreReferencesReachedError>";
            }
        };
    }
}
