package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.cart.CartRemovePaymentActionImpl;

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
@JsonDeserialize(as = CartRemovePaymentActionImpl.class)
public interface CartRemovePaymentAction extends CartUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    public void setPayment(final PaymentResourceIdentifier payment);

    public static CartRemovePaymentActionImpl of(){
        return new CartRemovePaymentActionImpl();
    }
    

    public static CartRemovePaymentActionImpl of(final CartRemovePaymentAction template) {
        CartRemovePaymentActionImpl instance = new CartRemovePaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    default <T> T withCartRemovePaymentAction(Function<CartRemovePaymentAction, T> helper) {
        return helper.apply(this);
    }
}
