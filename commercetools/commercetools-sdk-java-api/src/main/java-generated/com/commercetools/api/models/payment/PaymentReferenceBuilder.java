
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentReferenceBuilder implements Builder<PaymentReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.payment.Payment obj;

    public PaymentReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public PaymentReferenceBuilder obj(
            Function<com.commercetools.api.models.payment.PaymentBuilder, com.commercetools.api.models.payment.PaymentBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.payment.PaymentBuilder.of()).build();
        return this;
    }

    public PaymentReferenceBuilder obj(@Nullable final com.commercetools.api.models.payment.Payment obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.payment.Payment getObj() {
        return this.obj;
    }

    public PaymentReference build() {
        Objects.requireNonNull(id, PaymentReference.class + ": id is missing");
        return new PaymentReferenceImpl(id, obj);
    }

    /**
     * builds PaymentReference without checking for non null required values
     */
    public PaymentReference buildUnchecked() {
        return new PaymentReferenceImpl(id, obj);
    }

    public static PaymentReferenceBuilder of() {
        return new PaymentReferenceBuilder();
    }

    public static PaymentReferenceBuilder of(final PaymentReference template) {
        PaymentReferenceBuilder builder = new PaymentReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
