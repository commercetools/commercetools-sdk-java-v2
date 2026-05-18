
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
 *  <p>Setting the transaction interface ID produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentTransactionInterfaceIdSetMessage" rel="nofollow">PaymentTransactionInterfaceIdSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetTransactionInterfaceIdActionImpl implements PaymentSetTransactionInterfaceIdAction, ModelBase {

    private String action;

    private String transactionId;

    private String interfaceId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentSetTransactionInterfaceIdActionImpl(@JsonProperty("transactionId") final String transactionId,
            @JsonProperty("interfaceId") final String interfaceId) {
        this.transactionId = transactionId;
        this.interfaceId = interfaceId;
        this.action = SET_TRANSACTION_INTERFACE_ID;
    }

    /**
     * create empty instance
     */
    public PaymentSetTransactionInterfaceIdActionImpl() {
        this.action = SET_TRANSACTION_INTERFACE_ID;
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
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) in the current transaction. It must be unique across all transactions. If <code>interfaceId</code> is absent, this field will be removed from the specified Transaction, if it exists.</p>
     */

    public String getInterfaceId() {
        return this.interfaceId;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setInterfaceId(final String interfaceId) {
        this.interfaceId = interfaceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetTransactionInterfaceIdActionImpl that = (PaymentSetTransactionInterfaceIdActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(transactionId, that.transactionId)
                .append(interfaceId, that.interfaceId)
                .append(action, that.action)
                .append(transactionId, that.transactionId)
                .append(interfaceId, that.interfaceId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(transactionId).append(interfaceId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("transactionId", transactionId)
                .append("interfaceId", interfaceId)
                .build();
    }

    @Override
    public PaymentSetTransactionInterfaceIdAction copyDeep() {
        return PaymentSetTransactionInterfaceIdAction.deepCopy(this);
    }
}
