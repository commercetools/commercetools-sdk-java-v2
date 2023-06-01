package com.commercetools.history.models.label;

import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.label.Label;
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
 * PaymentLabel
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentLabelImpl implements PaymentLabel, ModelBase {

    
    private String type;
    
    
    private String key;
    
    
    private com.commercetools.history.models.common.Money amountPlanned;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentLabelImpl(@JsonProperty("key") final String key, @JsonProperty("amountPlanned") final com.commercetools.history.models.common.Money amountPlanned) {
        this.key = key;
        this.amountPlanned = amountPlanned;
        this.type =  PAYMENT_LABEL;
    }
    /**
     * create empty instance
     */
    public PaymentLabelImpl() {
        this.type =  PAYMENT_LABEL;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.Money getAmountPlanned(){
        return this.amountPlanned;
    }

    
    public void setKey(final String key){
        this.key = key;
    }
    
    
    public void setAmountPlanned(final com.commercetools.history.models.common.Money amountPlanned){
        this.amountPlanned = amountPlanned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PaymentLabelImpl that = (PaymentLabelImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(key, that.key)
                .append(amountPlanned, that.amountPlanned)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(key)
            .append(amountPlanned)
            .toHashCode();
    }

}
