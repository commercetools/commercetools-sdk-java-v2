package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetKeyActionImpl;

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
@JsonDeserialize(as = PaymentSetKeyActionImpl.class)
public interface PaymentSetKeyAction extends PaymentUpdateAction {

    /**
    *  <p>User-specific unique identifier for the payment (max.
    *  256 characters).
    *  If not provided an existing key will be removed.</p>
    */
    
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static PaymentSetKeyActionImpl of(){
        return new PaymentSetKeyActionImpl();
    }
    

    public static PaymentSetKeyActionImpl of(final PaymentSetKeyAction template) {
        PaymentSetKeyActionImpl instance = new PaymentSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withPaymentSetKeyAction(Function<PaymentSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
