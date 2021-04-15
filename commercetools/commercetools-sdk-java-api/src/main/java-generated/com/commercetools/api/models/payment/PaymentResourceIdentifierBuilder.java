
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentResourceIdentifierBuilder {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public PaymentResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public PaymentResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public PaymentResourceIdentifier build() {
        return new PaymentResourceIdentifierImpl(id, key);
    }

    public static PaymentResourceIdentifierBuilder of() {
        return new PaymentResourceIdentifierBuilder();
    }

    public static PaymentResourceIdentifierBuilder of(final PaymentResourceIdentifier template) {
        PaymentResourceIdentifierBuilder builder = new PaymentResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
