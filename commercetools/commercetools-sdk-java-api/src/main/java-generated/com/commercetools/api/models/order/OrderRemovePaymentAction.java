
package com.commercetools.api.models.order;

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
@JsonDeserialize(as = OrderRemovePaymentActionImpl.class)
public interface OrderRemovePaymentAction extends OrderUpdateAction {

    String REMOVE_PAYMENT = "removePayment";

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Payment">Payment</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    public void setPayment(final PaymentResourceIdentifier payment);

    public static OrderRemovePaymentAction of() {
        return new OrderRemovePaymentActionImpl();
    }

    public static OrderRemovePaymentAction of(final OrderRemovePaymentAction template) {
        OrderRemovePaymentActionImpl instance = new OrderRemovePaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static OrderRemovePaymentActionBuilder builder() {
        return OrderRemovePaymentActionBuilder.of();
    }

    public static OrderRemovePaymentActionBuilder builder(final OrderRemovePaymentAction template) {
        return OrderRemovePaymentActionBuilder.of(template);
    }

    default <T> T withOrderRemovePaymentAction(Function<OrderRemovePaymentAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderRemovePaymentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderRemovePaymentAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderRemovePaymentAction>";
            }
        };
    }
}
