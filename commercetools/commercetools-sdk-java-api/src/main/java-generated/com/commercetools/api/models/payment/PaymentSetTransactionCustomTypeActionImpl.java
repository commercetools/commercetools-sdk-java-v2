package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
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
 * PaymentSetTransactionCustomTypeAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentSetTransactionCustomTypeActionImpl implements PaymentSetTransactionCustomTypeAction, ModelBase {

    
    private String action;
    
    
    private String transactionId;
    
    
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentSetTransactionCustomTypeActionImpl(@JsonProperty("transactionId") final String transactionId, @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type, @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.transactionId = transactionId;
        this.type = type;
        this.fields = fields;
        this.action =  SET_TRANSACTION_CUSTOM_TYPE;
    }
    /**
     * create empty instance
     */
    public PaymentSetTransactionCustomTypeActionImpl() {
        this.action =  SET_TRANSACTION_CUSTOM_TYPE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Unique identifier of the Transaction. If the specified <code>transactionId</code> does not exist, the request will fail with an InvalidOperation error.</p>
     */
    
    public String getTransactionId(){
        return this.transactionId;
    }
    
    /**
     *  <p>Defines the Type that extends the Transaction with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Transaction.</p>
     */
    
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the Transaction.</p>
     */
    
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    
    public void setTransactionId(final String transactionId){
        this.transactionId = transactionId;
    }
    
    
    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type){
        this.type = type;
    }
    
    
    public void setFields(final com.commercetools.api.models.type.FieldContainer fields){
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PaymentSetTransactionCustomTypeActionImpl that = (PaymentSetTransactionCustomTypeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(transactionId, that.transactionId)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(transactionId)
            .append(type)
            .append(fields)
            .toHashCode();
    }

}
