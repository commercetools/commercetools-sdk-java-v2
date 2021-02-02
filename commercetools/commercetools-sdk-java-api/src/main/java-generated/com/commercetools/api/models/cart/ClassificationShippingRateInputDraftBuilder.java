
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ClassificationShippingRateInputDraftBuilder {

    private String key;

    public ClassificationShippingRateInputDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ClassificationShippingRateInputDraft build() {
        return new ClassificationShippingRateInputDraftImpl(key);
    }

    public static ClassificationShippingRateInputDraftBuilder of() {
        return new ClassificationShippingRateInputDraftBuilder();
    }

    public static ClassificationShippingRateInputDraftBuilder of(final ClassificationShippingRateInputDraft template) {
        ClassificationShippingRateInputDraftBuilder builder = new ClassificationShippingRateInputDraftBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
