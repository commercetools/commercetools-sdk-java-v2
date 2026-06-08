
package com.commercetools.api.models.payment;

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
 *  <p>Changing the <a href="https://docs.commercetools.com/apis/ctp:api:type:TransactionState" rel="nofollow">TransactionState</a> generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentTransactionStateChangedMessage" rel="nofollow">PaymentTransactionStateChanged</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentChangeTransactionStateActionImpl implements PaymentChangeTransactionStateAction, ModelBase {

    private String action;

    private String transactionId;

    private com.commercetools.api.models.payment.TransactionState state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentChangeTransactionStateActionImpl(@JsonProperty("transactionId") final String transactionId,
            @JsonProperty("state") final com.commercetools.api.models.payment.TransactionState state) {
        this.transactionId = transactionId;
        this.state = state;
        this.action = CHANGE_TRANSACTION_STATE;
    }

    /**
     * create empty instance
     */
    public PaymentChangeTransactionStateActionImpl() {
        this.action = CHANGE_TRANSACTION_STATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a>.</p>
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p>New TransactionState.</p>
     */

    public com.commercetools.api.models.payment.TransactionState getState() {
        return this.state;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setState(final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentChangeTransactionStateActionImpl that = (PaymentChangeTransactionStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(transactionId, that.transactionId)
                .append(state, that.state)
                .append(action, that.action)
                .append(transactionId, that.transactionId)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(transactionId).append(state).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("transactionId", transactionId)
                .append("state", state)
                .build();
    }

    @Override
    public PaymentChangeTransactionStateAction copyDeep() {
        return PaymentChangeTransactionStateAction.deepCopy(this);
    }
}
