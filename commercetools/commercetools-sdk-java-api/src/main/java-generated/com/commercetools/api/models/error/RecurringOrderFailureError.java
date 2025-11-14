
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
 *  <p>Returned when a subsequent Order for a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a> could not be processed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderFailureError recurringOrderFailureError = RecurringOrderFailureError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderFailure")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderFailureErrorImpl.class)
public interface RecurringOrderFailureError extends ErrorObject {

    /**
     * discriminator value for RecurringOrderFailureError
     */
    String RECURRING_ORDER_FAILURE = "RecurringOrderFailure";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Details about the error's cause and the entities involved.</p>
     * @return details
     */
    @NotNull
    @JsonProperty("details")
    public Object getDetails();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Details about the error's cause and the entities involved.</p>
     * @param details value to be set
     */

    public void setDetails(final Object details);

    /**
     * factory method
     * @return instance of RecurringOrderFailureError
     */
    public static RecurringOrderFailureError of() {
        return new RecurringOrderFailureErrorImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderFailureError
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderFailureError of(final RecurringOrderFailureError template) {
        RecurringOrderFailureErrorImpl instance = new RecurringOrderFailureErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setDetails(template.getDetails());
        return instance;
    }

    public RecurringOrderFailureError copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderFailureError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderFailureError deepCopy(@Nullable final RecurringOrderFailureError template) {
        if (template == null) {
            return null;
        }
        RecurringOrderFailureErrorImpl instance = new RecurringOrderFailureErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setDetails(template.getDetails());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderFailureError
     * @return builder
     */
    public static RecurringOrderFailureErrorBuilder builder() {
        return RecurringOrderFailureErrorBuilder.of();
    }

    /**
     * create builder for RecurringOrderFailureError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderFailureErrorBuilder builder(final RecurringOrderFailureError template) {
        return RecurringOrderFailureErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderFailureError(Function<RecurringOrderFailureError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderFailureError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderFailureError>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderFailureError>";
            }
        };
    }
}
