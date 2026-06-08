
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>The state of the <span>Transaction</span> and the related errors in case of a failed Transaction.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionStatusImpl implements TransactionStatus, ModelBase {

    private com.commercetools.checkout.models.transaction.TransactionState state;

    private java.util.List<com.commercetools.checkout.models.transaction.TransactionError> errors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionStatusImpl(
            @JsonProperty("state") final com.commercetools.checkout.models.transaction.TransactionState state,
            @JsonProperty("errors") final java.util.List<com.commercetools.checkout.models.transaction.TransactionError> errors) {
        this.state = state;
        this.errors = errors;
    }

    /**
     * create empty instance
     */
    public TransactionStatusImpl() {
    }

    /**
     *  <p>State of the Transaction.</p>
     */

    public com.commercetools.checkout.models.transaction.TransactionState getState() {
        return this.state;
    }

    /**
     *  <p>Errors returned if the Transaction is in the <code>Failed</code> state.</p>
     */

    public java.util.List<com.commercetools.checkout.models.transaction.TransactionError> getErrors() {
        return this.errors;
    }

    public void setState(final com.commercetools.checkout.models.transaction.TransactionState state) {
        this.state = state;
    }

    public void setErrors(final com.commercetools.checkout.models.transaction.TransactionError... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
    }

    public void setErrors(final java.util.List<com.commercetools.checkout.models.transaction.TransactionError> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TransactionStatusImpl that = (TransactionStatusImpl) o;

        return new EqualsBuilder().append(state, that.state)
                .append(errors, that.errors)
                .append(state, that.state)
                .append(errors, that.errors)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(state).append(errors).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("state", state)
                .append("errors", errors)
                .build();
    }

    @Override
    public TransactionStatus copyDeep() {
        return TransactionStatus.deepCopy(this);
    }
}
