
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ClassificationShippingRateInputBuilder {

    private String key;

    private com.commercetools.api.models.common.LocalizedString label;

    public ClassificationShippingRateInputBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public ClassificationShippingRateInputBuilder label(
            final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public ClassificationShippingRateInput build() {
        return new ClassificationShippingRateInputImpl(key, label);
    }

    public static ClassificationShippingRateInputBuilder of() {
        return new ClassificationShippingRateInputBuilder();
    }

    public static ClassificationShippingRateInputBuilder of(final ClassificationShippingRateInput template) {
        ClassificationShippingRateInputBuilder builder = new ClassificationShippingRateInputBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
