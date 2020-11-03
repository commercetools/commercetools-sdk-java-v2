package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.order.OrderRemovePaymentAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderRemovePaymentActionBuilder {

    
    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    public OrderRemovePaymentActionBuilder payment( final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    
    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment(){
        return this.payment;
    }

    public OrderRemovePaymentAction build() {
        return new OrderRemovePaymentActionImpl(payment);
    }

    public static OrderRemovePaymentActionBuilder of() {
        return new OrderRemovePaymentActionBuilder();
    }

    public static OrderRemovePaymentActionBuilder of(final OrderRemovePaymentAction template) {
        OrderRemovePaymentActionBuilder builder = new OrderRemovePaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
