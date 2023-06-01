package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
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
 * PaymentSetStatusInterfaceTextAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentSetStatusInterfaceTextActionImpl implements PaymentSetStatusInterfaceTextAction, ModelBase {

    
    private String action;
    
    
    private String interfaceText;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentSetStatusInterfaceTextActionImpl(@JsonProperty("interfaceText") final String interfaceText) {
        this.interfaceText = interfaceText;
        this.action =  SET_STATUS_INTERFACE_TEXT;
    }
    /**
     * create empty instance
     */
    public PaymentSetStatusInterfaceTextActionImpl() {
        this.action =  SET_STATUS_INTERFACE_TEXT;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    
    public String getInterfaceText(){
        return this.interfaceText;
    }

    
    public void setInterfaceText(final String interfaceText){
        this.interfaceText = interfaceText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PaymentSetStatusInterfaceTextActionImpl that = (PaymentSetStatusInterfaceTextActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(interfaceText, that.interfaceText)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(interfaceText)
            .toHashCode();
    }

}
