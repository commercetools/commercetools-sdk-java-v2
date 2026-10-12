
package com.commercetools.checkout.models.recurring_payment_job;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringPaymentJobStatusBuilder
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
public class RecurringPaymentJobStatusBuilder implements Builder<RecurringPaymentJobStatus> {

    private com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobState state;

    @Nullable
    private Integer attempts;

    @Nullable
    private java.util.List<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobError> errors;

    /**
     *  <p>State of the Recurring Payment Job.</p>
     * @param state value to be set
     * @return Builder
     */

    public RecurringPaymentJobStatusBuilder state(
            final com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobState state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Number of times Checkout has attempted to process the Recurring Payment Job.</p>
     * @param attempts value to be set
     * @return Builder
     */

    public RecurringPaymentJobStatusBuilder attempts(@Nullable final Integer attempts) {
        this.attempts = attempts;
        return this;
    }

    /**
     *  <p>Errors returned if the Recurring Payment Job is in the <code>Failed</code> state.</p>
     * @param errors value to be set
     * @return Builder
     */

    public RecurringPaymentJobStatusBuilder errors(
            @Nullable final com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobError... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors returned if the Recurring Payment Job is in the <code>Failed</code> state.</p>
     * @param errors value to be set
     * @return Builder
     */

    public RecurringPaymentJobStatusBuilder errors(
            @Nullable final java.util.List<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>Errors returned if the Recurring Payment Job is in the <code>Failed</code> state.</p>
     * @param errors value to be set
     * @return Builder
     */

    public RecurringPaymentJobStatusBuilder plusErrors(
            @Nullable final com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobError... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors returned if the Recurring Payment Job is in the <code>Failed</code> state.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public RecurringPaymentJobStatusBuilder plusErrors(
            Function<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobErrorBuilder, com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobErrorBuilder> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(
            builder.apply(com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobErrorBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Errors returned if the Recurring Payment Job is in the <code>Failed</code> state.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public RecurringPaymentJobStatusBuilder withErrors(
            Function<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobErrorBuilder, com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobErrorBuilder> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(
            builder.apply(com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobErrorBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Errors returned if the Recurring Payment Job is in the <code>Failed</code> state.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public RecurringPaymentJobStatusBuilder addErrors(
            Function<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobErrorBuilder, com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobError> builder) {
        return plusErrors(builder
                .apply(com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobErrorBuilder.of()));
    }

    /**
     *  <p>Errors returned if the Recurring Payment Job is in the <code>Failed</code> state.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public RecurringPaymentJobStatusBuilder setErrors(
            Function<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobErrorBuilder, com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobError> builder) {
        return errors(builder
                .apply(com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobErrorBuilder.of()));
    }

    /**
     *  <p>State of the Recurring Payment Job.</p>
     * @return state
     */

    public com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobState getState() {
        return this.state;
    }

    /**
     *  <p>Number of times Checkout has attempted to process the Recurring Payment Job.</p>
     * @return attempts
     */

    @Nullable
    public Integer getAttempts() {
        return this.attempts;
    }

    /**
     *  <p>Errors returned if the Recurring Payment Job is in the <code>Failed</code> state.</p>
     * @return errors
     */

    @Nullable
    public java.util.List<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobError> getErrors() {
        return this.errors;
    }

    /**
     * builds RecurringPaymentJobStatus with checking for non-null required values
     * @return RecurringPaymentJobStatus
     */
    public RecurringPaymentJobStatus build() {
        Objects.requireNonNull(state, RecurringPaymentJobStatus.class + ": state is missing");
        return new RecurringPaymentJobStatusImpl(state, attempts, errors);
    }

    /**
     * builds RecurringPaymentJobStatus without checking for non-null required values
     * @return RecurringPaymentJobStatus
     */
    public RecurringPaymentJobStatus buildUnchecked() {
        return new RecurringPaymentJobStatusImpl(state, attempts, errors);
    }

    /**
     * factory method for an instance of RecurringPaymentJobStatusBuilder
     * @return builder
     */
    public static RecurringPaymentJobStatusBuilder of() {
        return new RecurringPaymentJobStatusBuilder();
    }

    /**
     * create builder for RecurringPaymentJobStatus instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentJobStatusBuilder of(final RecurringPaymentJobStatus template) {
        RecurringPaymentJobStatusBuilder builder = new RecurringPaymentJobStatusBuilder();
        builder.state = template.getState();
        builder.attempts = template.getAttempts();
        builder.errors = template.getErrors();
        return builder;
    }

}
