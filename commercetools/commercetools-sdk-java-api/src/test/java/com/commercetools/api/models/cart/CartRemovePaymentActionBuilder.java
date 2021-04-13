package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.cart.CartRemovePaymentAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartRemovePaymentActionBuilder {

    
    
    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    
    public CartRemovePaymentActionBuilder payment( final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    
    
    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment(){
        return this.payment;
    }

    public CartRemovePaymentAction build() {
        return new CartRemovePaymentActionImpl(payment);
    }

    public static CartRemovePaymentActionBuilder of() {
        return new CartRemovePaymentActionBuilder();
    }

    public static CartRemovePaymentActionBuilder of(final CartRemovePaymentAction template) {
        CartRemovePaymentActionBuilder builder = new CartRemovePaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
