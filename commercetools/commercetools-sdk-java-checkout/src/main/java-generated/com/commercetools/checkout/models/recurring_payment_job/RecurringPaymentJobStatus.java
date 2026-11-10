
package com.commercetools.checkout.models.recurring_payment_job;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>The state of the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPaymentJob" rel="nofollow">RecurringPaymentJob</a>, the number of processing attempts, and the related errors in case of a failed Recurring Payment Job.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentJobStatus recurringPaymentJobStatus = RecurringPaymentJobStatus.builder()
 *             .state(RecurringPaymentJobState.INITIAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringPaymentJobStatusImpl.class)
public interface RecurringPaymentJobStatus {

    /**
     *  <p>State of the Recurring Payment Job.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public RecurringPaymentJobState getState();

    /**
     *  <p>Number of times Checkout has attempted to process the Recurring Payment Job.</p>
     * @return attempts
     */

    @JsonProperty("attempts")
    public Integer getAttempts();

    /**
     *  <p>Errors returned if the Recurring Payment Job is in the <code>Failed</code> state.</p>
     * @return errors
     */
    @Valid
    @JsonProperty("errors")
    public List<RecurringPaymentJobError> getErrors();

    /**
     *  <p>State of the Recurring Payment Job.</p>
     * @param state value to be set
     */

    public void setState(final RecurringPaymentJobState state);

    /**
     *  <p>Number of times Checkout has attempted to process the Recurring Payment Job.</p>
     * @param attempts value to be set
     */

    public void setAttempts(final Integer attempts);

    /**
     *  <p>Errors returned if the Recurring Payment Job is in the <code>Failed</code> state.</p>
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final RecurringPaymentJobError... errors);

    /**
     *  <p>Errors returned if the Recurring Payment Job is in the <code>Failed</code> state.</p>
     * @param errors values to be set
     */

    public void setErrors(final List<RecurringPaymentJobError> errors);

    /**
     * factory method
     * @return instance of RecurringPaymentJobStatus
     */
    public static RecurringPaymentJobStatus of() {
        return new RecurringPaymentJobStatusImpl();
    }

    /**
     * factory method to create a shallow copy RecurringPaymentJobStatus
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringPaymentJobStatus of(final RecurringPaymentJobStatus template) {
        RecurringPaymentJobStatusImpl instance = new RecurringPaymentJobStatusImpl();
        instance.setState(template.getState());
        instance.setAttempts(template.getAttempts());
        instance.setErrors(template.getErrors());
        return instance;
    }

    public RecurringPaymentJobStatus copyDeep();

    /**
     * factory method to create a deep copy of RecurringPaymentJobStatus
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringPaymentJobStatus deepCopy(@Nullable final RecurringPaymentJobStatus template) {
        if (template == null) {
            return null;
        }
        RecurringPaymentJobStatusImpl instance = new RecurringPaymentJobStatusImpl();
        instance.setState(template.getState());
        instance.setAttempts(template.getAttempts());
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobError::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for RecurringPaymentJobStatus
     * @return builder
     */
    public static RecurringPaymentJobStatusBuilder builder() {
        return RecurringPaymentJobStatusBuilder.of();
    }

    /**
     * create builder for RecurringPaymentJobStatus instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentJobStatusBuilder builder(final RecurringPaymentJobStatus template) {
        return RecurringPaymentJobStatusBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringPaymentJobStatus(Function<RecurringPaymentJobStatus, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringPaymentJobStatus> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringPaymentJobStatus>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringPaymentJobStatus>";
            }
        };
    }
}
