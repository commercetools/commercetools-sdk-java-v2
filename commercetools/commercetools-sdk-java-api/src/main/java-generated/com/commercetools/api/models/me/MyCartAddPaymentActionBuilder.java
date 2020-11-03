package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.me.MyCartAddPaymentAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartAddPaymentActionBuilder {

    
    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    public MyCartAddPaymentActionBuilder payment( final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    
    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment(){
        return this.payment;
    }

    public MyCartAddPaymentAction build() {
        return new MyCartAddPaymentActionImpl(payment);
    }

    public static MyCartAddPaymentActionBuilder of() {
        return new MyCartAddPaymentActionBuilder();
    }

    public static MyCartAddPaymentActionBuilder of(final MyCartAddPaymentAction template) {
        MyCartAddPaymentActionBuilder builder = new MyCartAddPaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
