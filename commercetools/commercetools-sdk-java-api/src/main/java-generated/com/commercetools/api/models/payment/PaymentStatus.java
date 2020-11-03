package com.commercetools.api.models.payment;

import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.payment.PaymentStatusImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentStatusImpl.class)
public interface PaymentStatus  {

    /**
    *  <p>A code describing the current status returned by the interface that processes the payment.</p>
    */
    
    @JsonProperty("interfaceCode")
    public String getInterfaceCode();
    /**
    *  <p>A text describing the current status returned by the interface that processes the payment.</p>
    */
    
    @JsonProperty("interfaceText")
    public String getInterfaceText();
    
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    public void setInterfaceCode(final String interfaceCode);
    
    public void setInterfaceText(final String interfaceText);
    
    public void setState(final StateReference state);

    public static PaymentStatusImpl of(){
        return new PaymentStatusImpl();
    }
    

    public static PaymentStatusImpl of(final PaymentStatus template) {
        PaymentStatusImpl instance = new PaymentStatusImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        instance.setInterfaceText(template.getInterfaceText());
        instance.setState(template.getState());
        return instance;
    }

    default <T> T withPaymentStatus(Function<PaymentStatus, T> helper) {
        return helper.apply(this);
    }
}
