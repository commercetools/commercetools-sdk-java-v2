package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.payment.Transaction;
import com.commercetools.api.models.message.PaymentTransactionAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentTransactionAddedMessagePayloadBuilder {

    
    private com.commercetools.api.models.payment.Transaction transaction;

    public PaymentTransactionAddedMessagePayloadBuilder transaction( final com.commercetools.api.models.payment.Transaction transaction) {
        this.transaction = transaction;
        return this;
    }

    
    public com.commercetools.api.models.payment.Transaction getTransaction(){
        return this.transaction;
    }

    public PaymentTransactionAddedMessagePayload build() {
        return new PaymentTransactionAddedMessagePayloadImpl(transaction);
    }

    public static PaymentTransactionAddedMessagePayloadBuilder of() {
        return new PaymentTransactionAddedMessagePayloadBuilder();
    }

    public static PaymentTransactionAddedMessagePayloadBuilder of(final PaymentTransactionAddedMessagePayload template) {
        PaymentTransactionAddedMessagePayloadBuilder builder = new PaymentTransactionAddedMessagePayloadBuilder();
        builder.transaction = template.getTransaction();
        return builder;
    }

}
