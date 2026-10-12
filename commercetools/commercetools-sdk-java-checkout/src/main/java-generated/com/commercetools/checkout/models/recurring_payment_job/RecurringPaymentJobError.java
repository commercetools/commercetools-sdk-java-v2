
package com.commercetools.checkout.models.recurring_payment_job;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>A single error on the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPaymentJob" rel="nofollow">RecurringPaymentJob</a>. Multiple errors may be included in the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPaymentJobStatus" rel="nofollow">RecurringPaymentJobStatus</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentJobError recurringPaymentJobError = RecurringPaymentJobError.builder()
 *             .code("{code}")
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringPaymentJobErrorImpl.class)
public interface RecurringPaymentJobError {

    /**
     *  <p>Error identifier.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the cause of the error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Error identifier.</p>
     * @param code value to be set
     */

    public void setCode(final String code);

    /**
     *  <p>Plain text description of the cause of the error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of RecurringPaymentJobError
     */
    public static RecurringPaymentJobError of() {
        return new RecurringPaymentJobErrorImpl();
    }

    /**
     * factory method to create a shallow copy RecurringPaymentJobError
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringPaymentJobError of(final RecurringPaymentJobError template) {
        RecurringPaymentJobErrorImpl instance = new RecurringPaymentJobErrorImpl();
        instance.setCode(template.getCode());
        instance.setMessage(template.getMessage());
        return instance;
    }

    public RecurringPaymentJobError copyDeep();

    /**
     * factory method to create a deep copy of RecurringPaymentJobError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringPaymentJobError deepCopy(@Nullable final RecurringPaymentJobError template) {
        if (template == null) {
            return null;
        }
        RecurringPaymentJobErrorImpl instance = new RecurringPaymentJobErrorImpl();
        instance.setCode(template.getCode());
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for RecurringPaymentJobError
     * @return builder
     */
    public static RecurringPaymentJobErrorBuilder builder() {
        return RecurringPaymentJobErrorBuilder.of();
    }

    /**
     * create builder for RecurringPaymentJobError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentJobErrorBuilder builder(final RecurringPaymentJobError template) {
        return RecurringPaymentJobErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringPaymentJobError(Function<RecurringPaymentJobError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringPaymentJobError> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringPaymentJobError>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringPaymentJobError>";
            }
        };
    }
}
