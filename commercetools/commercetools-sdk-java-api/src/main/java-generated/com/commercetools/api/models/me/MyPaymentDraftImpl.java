
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
 * MyPaymentDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentDraftImpl implements MyPaymentDraft, ModelBase {

    private com.commercetools.api.models.common.Money amountPlanned;

    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private com.commercetools.api.models.me.MyTransactionDraft transaction;

    @JsonCreator
    MyPaymentDraftImpl(@JsonProperty("amountPlanned") final com.commercetools.api.models.common.Money amountPlanned,
            @JsonProperty("paymentMethodInfo") final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("transaction") final com.commercetools.api.models.me.MyTransactionDraft transaction) {
        this.amountPlanned = amountPlanned;
        this.paymentMethodInfo = paymentMethodInfo;
        this.custom = custom;
        this.transaction = transaction;
    }

    public MyPaymentDraftImpl() {
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value usually matches the Cart or Order gross total.</p>
     */

    public com.commercetools.api.models.common.Money getAmountPlanned() {
        return this.amountPlanned;
    }

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     */

    public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    /**
     *  <p>Custom Fields for the Payment.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Financial transactions of the TransactionTypes <code>Authorization</code> or <code>Charge</code>.</p>
     */

    public com.commercetools.api.models.me.MyTransactionDraft getTransaction() {
        return this.transaction;
    }

    public void setAmountPlanned(final com.commercetools.api.models.common.Money amountPlanned) {
        this.amountPlanned = amountPlanned;
    }

    public void setPaymentMethodInfo(final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setTransaction(final com.commercetools.api.models.me.MyTransactionDraft transaction) {
        this.transaction = transaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyPaymentDraftImpl that = (MyPaymentDraftImpl) o;

        return new EqualsBuilder().append(amountPlanned, that.amountPlanned)
                .append(paymentMethodInfo, that.paymentMethodInfo)
                .append(custom, that.custom)
                .append(transaction, that.transaction)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(amountPlanned)
                .append(paymentMethodInfo)
                .append(custom)
                .append(transaction)
                .toHashCode();
    }

}
