
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyPaymentDraftBuilder {

    private com.commercetools.api.models.common.Money amountPlanned;

    @Nullable
    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.me.MyTransactionDraft transaction;

    public MyPaymentDraftBuilder amountPlanned(final com.commercetools.api.models.common.Money amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }

    public MyPaymentDraftBuilder paymentMethodInfo(
            @Nullable final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
        return this;
    }

    public MyPaymentDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public MyPaymentDraftBuilder transaction(
            @Nullable final com.commercetools.api.models.me.MyTransactionDraft transaction) {
        this.transaction = transaction;
        return this;
    }

    public com.commercetools.api.models.common.Money getAmountPlanned() {
        return this.amountPlanned;
    }

    @Nullable
    public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.me.MyTransactionDraft getTransaction() {
        return this.transaction;
    }

    public MyPaymentDraft build() {
        return new MyPaymentDraftImpl(amountPlanned, paymentMethodInfo, custom, transaction);
    }

    public static MyPaymentDraftBuilder of() {
        return new MyPaymentDraftBuilder();
    }

    public static MyPaymentDraftBuilder of(final MyPaymentDraft template) {
        MyPaymentDraftBuilder builder = new MyPaymentDraftBuilder();
        builder.amountPlanned = template.getAmountPlanned();
        builder.paymentMethodInfo = template.getPaymentMethodInfo();
        builder.custom = template.getCustom();
        builder.transaction = template.getTransaction();
        return builder;
    }

}
