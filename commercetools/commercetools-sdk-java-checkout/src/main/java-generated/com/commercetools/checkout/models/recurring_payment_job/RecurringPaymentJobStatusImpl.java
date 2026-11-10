
package com.commercetools.checkout.models.recurring_payment_job;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>The state of the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPaymentJob" rel="nofollow">RecurringPaymentJob</a>, the number of processing attempts, and the related errors in case of a failed Recurring Payment Job.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentJobStatusImpl implements RecurringPaymentJobStatus, ModelBase {

    private com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobState state;

    private Integer attempts;

    private java.util.List<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobError> errors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringPaymentJobStatusImpl(
            @JsonProperty("state") final com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobState state,
            @JsonProperty("attempts") final Integer attempts,
            @JsonProperty("errors") final java.util.List<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobError> errors) {
        this.state = state;
        this.attempts = attempts;
        this.errors = errors;
    }

    /**
     * create empty instance
     */
    public RecurringPaymentJobStatusImpl() {
    }

    /**
     *  <p>State of the Recurring Payment Job.</p>
     */

    public com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobState getState() {
        return this.state;
    }

    /**
     *  <p>Number of times Checkout has attempted to process the Recurring Payment Job.</p>
     */

    public Integer getAttempts() {
        return this.attempts;
    }

    /**
     *  <p>Errors returned if the Recurring Payment Job is in the <code>Failed</code> state.</p>
     */

    public java.util.List<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobError> getErrors() {
        return this.errors;
    }

    public void setState(final com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobState state) {
        this.state = state;
    }

    public void setAttempts(final Integer attempts) {
        this.attempts = attempts;
    }

    public void setErrors(
            final com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobError... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
    }

    public void setErrors(
            final java.util.List<com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobError> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringPaymentJobStatusImpl that = (RecurringPaymentJobStatusImpl) o;

        return new EqualsBuilder().append(state, that.state)
                .append(attempts, that.attempts)
                .append(errors, that.errors)
                .append(state, that.state)
                .append(attempts, that.attempts)
                .append(errors, that.errors)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(state).append(attempts).append(errors).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("state", state)
                .append("attempts", attempts)
                .append("errors", errors)
                .build();
    }

    @Override
    public RecurringPaymentJobStatus copyDeep() {
        return RecurringPaymentJobStatus.deepCopy(this);
    }
}
