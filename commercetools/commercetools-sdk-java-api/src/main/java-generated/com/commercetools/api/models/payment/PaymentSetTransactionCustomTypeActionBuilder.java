
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentSetTransactionCustomTypeActionBuilder implements Builder<PaymentSetTransactionCustomTypeAction> {

    private String transactionId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public PaymentSetTransactionCustomTypeActionBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public PaymentSetTransactionCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public PaymentSetTransactionCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public PaymentSetTransactionCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public PaymentSetTransactionCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public PaymentSetTransactionCustomTypeAction build() {
        Objects.requireNonNull(transactionId,
            PaymentSetTransactionCustomTypeAction.class + ": transactionId is missing");
        return new PaymentSetTransactionCustomTypeActionImpl(transactionId, type, fields);
    }

    /**
     * builds PaymentSetTransactionCustomTypeAction without checking for non null required values
     */
    public PaymentSetTransactionCustomTypeAction buildUnchecked() {
        return new PaymentSetTransactionCustomTypeActionImpl(transactionId, type, fields);
    }

    public static PaymentSetTransactionCustomTypeActionBuilder of() {
        return new PaymentSetTransactionCustomTypeActionBuilder();
    }

    public static PaymentSetTransactionCustomTypeActionBuilder of(
            final PaymentSetTransactionCustomTypeAction template) {
        PaymentSetTransactionCustomTypeActionBuilder builder = new PaymentSetTransactionCustomTypeActionBuilder();
        builder.transactionId = template.getTransactionId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
