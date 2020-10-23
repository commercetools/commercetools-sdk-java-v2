package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetAnonymousIdActionImpl;

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
@JsonDeserialize(as = PaymentSetAnonymousIdActionImpl.class)
public interface PaymentSetAnonymousIdAction extends PaymentUpdateAction {

    /**
    *  <p>Anonymous ID of the anonymous customer that this payment belongs to.
    *  If this field is not set any existing <code>anonymousId</code> is removed.</p>
    */
    
    @JsonProperty("anonymousId")
    public String getAnonymousId();

    public void setAnonymousId(final String anonymousId);

    public static PaymentSetAnonymousIdActionImpl of(){
        return new PaymentSetAnonymousIdActionImpl();
    }
    

    public static PaymentSetAnonymousIdActionImpl of(final PaymentSetAnonymousIdAction template) {
        PaymentSetAnonymousIdActionImpl instance = new PaymentSetAnonymousIdActionImpl();
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    default <T> T withPaymentSetAnonymousIdAction(Function<PaymentSetAnonymousIdAction, T> helper) {
        return helper.apply(this);
    }
}
