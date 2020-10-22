package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetExternalIdActionImpl;

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
@JsonDeserialize(as = PaymentSetExternalIdActionImpl.class)
public interface PaymentSetExternalIdAction extends PaymentUpdateAction {

    
    
    @JsonProperty("externalId")
    public String getExternalId();

    public void setExternalId(final String externalId);

    public static PaymentSetExternalIdActionImpl of(){
        return new PaymentSetExternalIdActionImpl();
    }
    

    public static PaymentSetExternalIdActionImpl of(final PaymentSetExternalIdAction template) {
        PaymentSetExternalIdActionImpl instance = new PaymentSetExternalIdActionImpl();
        instance.setExternalId(template.getExternalId());
        return instance;
    }

    default <T extends Accessor<PaymentSetExternalIdAction>> T withPaymentSetExternalIdAction(Function<PaymentSetExternalIdAction, T> helper) {
        return helper.apply(this);
    }
}
