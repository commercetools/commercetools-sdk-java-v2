package com.commercetools.api.models.payment;

import com.commercetools.api.models.state.StateReference;
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
 * PaymentStatus
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentStatusImpl implements PaymentStatus, ModelBase {

    
    private String interfaceCode;
    
    
    private String interfaceText;
    
    
    private com.commercetools.api.models.state.StateReference state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentStatusImpl(@JsonProperty("interfaceCode") final String interfaceCode, @JsonProperty("interfaceText") final String interfaceText, @JsonProperty("state") final com.commercetools.api.models.state.StateReference state) {
        this.interfaceCode = interfaceCode;
        this.interfaceText = interfaceText;
        this.state = state;
    }
    /**
     * create empty instance
     */
    public PaymentStatusImpl() {
    }

    /**
     *  <p>External reference that identifies the current status of the Payment.</p>
     */
    
    public String getInterfaceCode(){
        return this.interfaceCode;
    }
    
    /**
     *  <p>Text describing the current status of the Payment.</p>
     */
    
    public String getInterfaceText(){
        return this.interfaceText;
    }
    
    /**
     *  <p>Reference to a State.</p>
     */
    
    public com.commercetools.api.models.state.StateReference getState(){
        return this.state;
    }

    
    public void setInterfaceCode(final String interfaceCode){
        this.interfaceCode = interfaceCode;
    }
    
    
    public void setInterfaceText(final String interfaceText){
        this.interfaceText = interfaceText;
    }
    
    
    public void setState(final com.commercetools.api.models.state.StateReference state){
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PaymentStatusImpl that = (PaymentStatusImpl) o;
    
        return new EqualsBuilder()
                .append(interfaceCode, that.interfaceCode)
                .append(interfaceText, that.interfaceText)
                .append(state, that.state)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(interfaceCode)
            .append(interfaceText)
            .append(state)
            .toHashCode();
    }

}
