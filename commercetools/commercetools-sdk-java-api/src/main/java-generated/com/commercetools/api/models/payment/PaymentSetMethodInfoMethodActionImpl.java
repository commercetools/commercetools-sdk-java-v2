package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentSetMethodInfoMethodActionImpl implements PaymentSetMethodInfoMethodAction {

    private String action;
    
    private String method;

    @JsonCreator
    PaymentSetMethodInfoMethodActionImpl(@JsonProperty("method") final String method) {
        this.method = method;
        this.action = "setMethodInfoMethod";
    }
    public PaymentSetMethodInfoMethodActionImpl() {
        this.action = "setMethodInfoMethod";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If not provided, the method is unset.</p>
    */
    public String getMethod(){
        return this.method;
    }

    public void setMethod(final String method){
        this.method = method;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PaymentSetMethodInfoMethodActionImpl that = (PaymentSetMethodInfoMethodActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(method, that.method)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(method)
            .toHashCode();
    }

}
