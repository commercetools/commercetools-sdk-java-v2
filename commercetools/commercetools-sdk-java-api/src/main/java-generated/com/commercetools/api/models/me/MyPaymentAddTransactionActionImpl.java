
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Adding a Transaction to a Payment generates the PaymentTransactionAdded Message. Once a Transaction is added to the Payment, it can no longer be updated or deleted using the My Payments API.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentAddTransactionActionImpl implements MyPaymentAddTransactionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.payment.TransactionDraft transaction;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyPaymentAddTransactionActionImpl(
            @JsonProperty("transaction") final com.commercetools.api.models.payment.TransactionDraft transaction) {
        this.transaction = transaction;
        this.action = ADD_TRANSACTION;
    }

    /**
     * create empty instance
     */
    public MyPaymentAddTransactionActionImpl() {
        this.action = ADD_TRANSACTION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Transaction to add to the Payment.</p>
     */

    public com.commercetools.api.models.payment.TransactionDraft getTransaction() {
        return this.transaction;
    }

    public void setTransaction(final com.commercetools.api.models.payment.TransactionDraft transaction) {
        this.transaction = transaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyPaymentAddTransactionActionImpl that = (MyPaymentAddTransactionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(transaction, that.transaction)
                .append(action, that.action)
                .append(transaction, that.transaction)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(transaction).toHashCode();
    }

}
