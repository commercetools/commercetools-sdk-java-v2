
package com.commercetools.api.models.me;

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
@JsonDeserialize(as = MyCartRemovePaymentActionImpl.class)
public interface MyCartRemovePaymentAction extends MyCartUpdateAction {

    String REMOVE_PAYMENT = "removePayment";

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Payment">Payment</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    public void setPayment(final PaymentResourceIdentifier payment);

    public static MyCartRemovePaymentAction of() {
        return new MyCartRemovePaymentActionImpl();
    }

    public static MyCartRemovePaymentAction of(final MyCartRemovePaymentAction template) {
        MyCartRemovePaymentActionImpl instance = new MyCartRemovePaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static MyCartRemovePaymentActionBuilder builder() {
        return MyCartRemovePaymentActionBuilder.of();
    }

    public static MyCartRemovePaymentActionBuilder builder(final MyCartRemovePaymentAction template) {
        return MyCartRemovePaymentActionBuilder.of(template);
    }

    default <T> T withMyCartRemovePaymentAction(Function<MyCartRemovePaymentAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartRemovePaymentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartRemovePaymentAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartRemovePaymentAction>";
            }
        };
    }
}
