package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * PaymentChangeTransactionTimestampAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentChangeTransactionTimestampActionImpl implements PaymentChangeTransactionTimestampAction, ModelBase {

    
    private String action;
    
    
    private String transactionId;
    
    
    private java.time.ZonedDateTime timestamp;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentChangeTransactionTimestampActionImpl(@JsonProperty("transactionId") final String transactionId, @JsonProperty("timestamp") final java.time.ZonedDateTime timestamp) {
        this.transactionId = transactionId;
        this.timestamp = timestamp;
        this.action =  CHANGE_TRANSACTION_TIMESTAMP;
    }
    /**
     * create empty instance
     */
    public PaymentChangeTransactionTimestampActionImpl() {
        this.action =  CHANGE_TRANSACTION_TIMESTAMP;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Unique identifier of the Transaction.</p>
     */
    
    public String getTransactionId(){
        return this.transactionId;
    }
    
    /**
     *  <p>Timestamp of the Transaction as reported by the payment service.</p>
     */
    
    public java.time.ZonedDateTime getTimestamp(){
        return this.timestamp;
    }

    
    public void setTransactionId(final String transactionId){
        this.transactionId = transactionId;
    }
    
    
    public void setTimestamp(final java.time.ZonedDateTime timestamp){
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PaymentChangeTransactionTimestampActionImpl that = (PaymentChangeTransactionTimestampActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(transactionId, that.transactionId)
                .append(timestamp, that.timestamp)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(transactionId)
            .append(timestamp)
            .toHashCode();
    }

}
