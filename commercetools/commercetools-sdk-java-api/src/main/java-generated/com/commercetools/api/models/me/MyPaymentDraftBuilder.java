
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyPaymentDraftBuilder implements Builder<MyPaymentDraft> {

    private com.commercetools.api.models.common.Money amountPlanned;

    @Nullable
    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.me.MyTransactionDraft transaction;

    public MyPaymentDraftBuilder amountPlanned(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amountPlanned = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public MyPaymentDraftBuilder amountPlanned(final com.commercetools.api.models.common.Money amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }

    public MyPaymentDraftBuilder paymentMethodInfo(
            Function<com.commercetools.api.models.payment.PaymentMethodInfoBuilder, com.commercetools.api.models.payment.PaymentMethodInfoBuilder> builder) {
        this.paymentMethodInfo = builder.apply(com.commercetools.api.models.payment.PaymentMethodInfoBuilder.of())
                .build();
        return this;
    }

    public MyPaymentDraftBuilder paymentMethodInfo(
            @Nullable final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
        return this;
    }

    public MyPaymentDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public MyPaymentDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public MyPaymentDraftBuilder transaction(
            Function<com.commercetools.api.models.me.MyTransactionDraftBuilder, com.commercetools.api.models.me.MyTransactionDraftBuilder> builder) {
        this.transaction = builder.apply(com.commercetools.api.models.me.MyTransactionDraftBuilder.of()).build();
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
        Objects.requireNonNull(amountPlanned, MyPaymentDraft.class + ": amountPlanned is missing");
        return new MyPaymentDraftImpl(amountPlanned, paymentMethodInfo, custom, transaction);
    }

    /**
     * builds MyPaymentDraft without checking for non null required values
     */
    public MyPaymentDraft buildUnchecked() {
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
