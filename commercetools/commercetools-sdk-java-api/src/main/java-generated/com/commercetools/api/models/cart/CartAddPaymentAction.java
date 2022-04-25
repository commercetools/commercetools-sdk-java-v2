
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartAddPaymentActionImpl.class)
public interface CartAddPaymentAction extends CartUpdateAction {

    String ADD_PAYMENT = "addPayment";

    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    public void setPayment(final PaymentResourceIdentifier payment);

    public static CartAddPaymentAction of() {
        return new CartAddPaymentActionImpl();
    }

    public static CartAddPaymentAction of(final CartAddPaymentAction template) {
        CartAddPaymentActionImpl instance = new CartAddPaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static CartAddPaymentActionBuilder builder() {
        return CartAddPaymentActionBuilder.of();
    }

    public static CartAddPaymentActionBuilder builder(final CartAddPaymentAction template) {
        return CartAddPaymentActionBuilder.of(template);
    }

    default <T> T withCartAddPaymentAction(Function<CartAddPaymentAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartAddPaymentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddPaymentAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddPaymentAction>";
            }
        };
    }
}
