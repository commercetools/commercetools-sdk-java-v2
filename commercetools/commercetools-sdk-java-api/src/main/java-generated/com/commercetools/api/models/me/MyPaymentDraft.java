
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.payment.PaymentMethodInfo;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyPaymentDraftImpl.class)
public interface MyPaymentDraft extends com.commercetools.api.models.CustomizableDraft<MyPaymentDraft> {

    /**
    *  <p>How much money this payment intends to receive from the customer.
    *  The value usually matches the cart or order gross total.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("amountPlanned")
    public Money getAmountPlanned();

    @Valid
    @JsonProperty("paymentMethodInfo")
    public PaymentMethodInfo getPaymentMethodInfo();

    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
    *  <p>A list of financial transactions of the <code>Authorization</code> or <code>Charge</code>
    *  TransactionTypes.</p>
    */
    @Valid
    @JsonProperty("transaction")
    public MyTransactionDraft getTransaction();

    public void setAmountPlanned(final Money amountPlanned);

    public void setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo);

    public void setCustom(final CustomFieldsDraft custom);

    public void setTransaction(final MyTransactionDraft transaction);

    public static MyPaymentDraft of() {
        return new MyPaymentDraftImpl();
    }

    public static MyPaymentDraft of(final MyPaymentDraft template) {
        MyPaymentDraftImpl instance = new MyPaymentDraftImpl();
        instance.setAmountPlanned(template.getAmountPlanned());
        instance.setPaymentMethodInfo(template.getPaymentMethodInfo());
        instance.setCustom(template.getCustom());
        instance.setTransaction(template.getTransaction());
        return instance;
    }

    public static MyPaymentDraftBuilder builder() {
        return MyPaymentDraftBuilder.of();
    }

    public static MyPaymentDraftBuilder builder(final MyPaymentDraft template) {
        return MyPaymentDraftBuilder.of(template);
    }

    default <T> T withMyPaymentDraft(Function<MyPaymentDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentDraft>";
            }
        };
    }
}
