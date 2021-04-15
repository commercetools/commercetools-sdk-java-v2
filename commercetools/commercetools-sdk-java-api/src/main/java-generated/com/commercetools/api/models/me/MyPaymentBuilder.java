
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyPaymentBuilder {

    private String id;

    private Long version;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private String anonymousId;

    private com.commercetools.api.models.common.TypedMoney amountPlanned;

    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;

    private java.util.List<com.commercetools.api.models.payment.Transaction> transactions;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    public MyPaymentBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public MyPaymentBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public MyPaymentBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    public MyPaymentBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    public MyPaymentBuilder amountPlanned(final com.commercetools.api.models.common.TypedMoney amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }

    public MyPaymentBuilder paymentMethodInfo(
            final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
        return this;
    }

    public MyPaymentBuilder transactions(final com.commercetools.api.models.payment.Transaction... transactions) {
        this.transactions = new ArrayList<>(Arrays.asList(transactions));
        return this;
    }

    public MyPaymentBuilder transactions(
            final java.util.List<com.commercetools.api.models.payment.Transaction> transactions) {
        this.transactions = transactions;
        return this;
    }

    public MyPaymentBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public com.commercetools.api.models.common.TypedMoney getAmountPlanned() {
        return this.amountPlanned;
    }

    public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    public java.util.List<com.commercetools.api.models.payment.Transaction> getTransactions() {
        return this.transactions;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public MyPayment build() {
        return new MyPaymentImpl(id, version, customer, anonymousId, amountPlanned, paymentMethodInfo, transactions,
            custom);
    }

    public static MyPaymentBuilder of() {
        return new MyPaymentBuilder();
    }

    public static MyPaymentBuilder of(final MyPayment template) {
        MyPaymentBuilder builder = new MyPaymentBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        builder.amountPlanned = template.getAmountPlanned();
        builder.paymentMethodInfo = template.getPaymentMethodInfo();
        builder.transactions = template.getTransactions();
        builder.custom = template.getCustom();
        return builder;
    }

}
