package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.payment.PaymentTransitionStateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentTransitionStateActionImpl.class)
public interface PaymentTransitionStateAction extends PaymentUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();
    
    
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateResourceIdentifier state);
    
    public void setForce(final Boolean force);

    public static PaymentTransitionStateActionImpl of(){
        return new PaymentTransitionStateActionImpl();
    }
    

    public static PaymentTransitionStateActionImpl of(final PaymentTransitionStateAction template) {
        PaymentTransitionStateActionImpl instance = new PaymentTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    default <T extends Accessor<PaymentTransitionStateAction>> T withPaymentTransitionStateAction(Function<PaymentTransitionStateAction, T> helper) {
        return helper.apply(this);
    }
}
