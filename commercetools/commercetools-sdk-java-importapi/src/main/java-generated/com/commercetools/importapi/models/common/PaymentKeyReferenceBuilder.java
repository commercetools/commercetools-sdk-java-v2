
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentKeyReferenceBuilder implements Builder<PaymentKeyReference> {

    private String key;

    public PaymentKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public PaymentKeyReference build() {
        Objects.requireNonNull(key, PaymentKeyReference.class + ": key is missing");
        return new PaymentKeyReferenceImpl(key);
    }

    /**
     * builds PaymentKeyReference without checking for non null required values
     */
    public PaymentKeyReference buildUnchecked() {
        return new PaymentKeyReferenceImpl(key);
    }

    public static PaymentKeyReferenceBuilder of() {
        return new PaymentKeyReferenceBuilder();
    }

    public static PaymentKeyReferenceBuilder of(final PaymentKeyReference template) {
        PaymentKeyReferenceBuilder builder = new PaymentKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
