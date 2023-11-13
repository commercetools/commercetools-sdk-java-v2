
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
 * PaymentChangeTransactionInteractionIdAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentChangeTransactionInteractionIdActionImpl
        implements PaymentChangeTransactionInteractionIdAction, ModelBase {

    private String action;

    private String transactionId;

    private String interactionId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentChangeTransactionInteractionIdActionImpl(@JsonProperty("transactionId") final String transactionId,
            @JsonProperty("interactionId") final String interactionId) {
        this.transactionId = transactionId;
        this.interactionId = interactionId;
        this.action = CHANGE_TRANSACTION_INTERACTION_ID;
    }

    /**
     * create empty instance
     */
    public PaymentChangeTransactionInteractionIdActionImpl() {
        this.action = CHANGE_TRANSACTION_INTERACTION_ID;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Unique identifier of the Transaction.</p>
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p>New value to set.</p>
     */

    public String getInteractionId() {
        return this.interactionId;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setInteractionId(final String interactionId) {
        this.interactionId = interactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentChangeTransactionInteractionIdActionImpl that = (PaymentChangeTransactionInteractionIdActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(transactionId, that.transactionId)
                .append(interactionId, that.interactionId)
                .append(action, that.action)
                .append(transactionId, that.transactionId)
                .append(interactionId, that.interactionId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(transactionId).append(interactionId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("transactionId", transactionId)
                .append("interactionId", interactionId)
                .build();
    }

}
