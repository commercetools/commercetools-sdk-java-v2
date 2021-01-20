
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentChangeTransactionInteractionIdActionImpl
        implements PaymentChangeTransactionInteractionIdAction {

    private String action;

    private String transactionId;

    private String interactionId;

    @JsonCreator
    PaymentChangeTransactionInteractionIdActionImpl(@JsonProperty("transactionId") final String transactionId,
            @JsonProperty("interactionId") final String interactionId) {
        this.transactionId = transactionId;
        this.interactionId = interactionId;
        this.action = "changeTransactionInteractionId";
    }

    public PaymentChangeTransactionInteractionIdActionImpl() {
        this.action = "changeTransactionInteractionId";
    }

    public String getAction() {
        return this.action;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

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

        return new EqualsBuilder().append(action, that.action).append(transactionId, that.transactionId).append(
            interactionId, that.interactionId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(transactionId).append(interactionId).toHashCode();
    }

}
