
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentTransactionInterfaceIdSetMessagePayloadImpl
        implements PaymentTransactionInterfaceIdSetMessagePayload, ModelBase {

    private String type;

    private String transactionId;

    private String newInterfaceId;

    private String oldInterfaceId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentTransactionInterfaceIdSetMessagePayloadImpl(@JsonProperty("transactionId") final String transactionId,
            @JsonProperty("newInterfaceId") final String newInterfaceId,
            @JsonProperty("oldInterfaceId") final String oldInterfaceId) {
        this.transactionId = transactionId;
        this.newInterfaceId = newInterfaceId;
        this.oldInterfaceId = oldInterfaceId;
        this.type = PAYMENT_TRANSACTION_INTERFACE_ID_SET;
    }

    /**
     * create empty instance
     */
    public PaymentTransactionInterfaceIdSetMessagePayloadImpl() {
        this.type = PAYMENT_TRANSACTION_INTERFACE_ID_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a>.</p>
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) after <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     */

    public String getNewInterfaceId() {
        return this.newInterfaceId;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     */

    public String getOldInterfaceId() {
        return this.oldInterfaceId;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setNewInterfaceId(final String newInterfaceId) {
        this.newInterfaceId = newInterfaceId;
    }

    public void setOldInterfaceId(final String oldInterfaceId) {
        this.oldInterfaceId = oldInterfaceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentTransactionInterfaceIdSetMessagePayloadImpl that = (PaymentTransactionInterfaceIdSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(transactionId, that.transactionId)
                .append(newInterfaceId, that.newInterfaceId)
                .append(oldInterfaceId, that.oldInterfaceId)
                .append(type, that.type)
                .append(transactionId, that.transactionId)
                .append(newInterfaceId, that.newInterfaceId)
                .append(oldInterfaceId, that.oldInterfaceId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(transactionId)
                .append(newInterfaceId)
                .append(oldInterfaceId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("transactionId", transactionId)
                .append("newInterfaceId", newInterfaceId)
                .append("oldInterfaceId", oldInterfaceId)
                .build();
    }

    @Override
    public PaymentTransactionInterfaceIdSetMessagePayload copyDeep() {
        return PaymentTransactionInterfaceIdSetMessagePayload.deepCopy(this);
    }
}
