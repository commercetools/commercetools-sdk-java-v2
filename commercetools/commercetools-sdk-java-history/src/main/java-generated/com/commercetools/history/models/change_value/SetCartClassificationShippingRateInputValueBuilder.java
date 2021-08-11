
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCartClassificationShippingRateInputValueBuilder
        implements Builder<SetCartClassificationShippingRateInputValue> {

    private String type;

    private String key;

    private com.commercetools.history.models.common.LocalizedString label;

    public SetCartClassificationShippingRateInputValueBuilder type(final String type) {
        this.type = type;
        return this;
    }

    public SetCartClassificationShippingRateInputValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public SetCartClassificationShippingRateInputValueBuilder label(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetCartClassificationShippingRateInputValueBuilder label(
            final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public SetCartClassificationShippingRateInputValue build() {
        Objects.requireNonNull(type, SetCartClassificationShippingRateInputValue.class + ": type is missing");
        Objects.requireNonNull(key, SetCartClassificationShippingRateInputValue.class + ": key is missing");
        Objects.requireNonNull(label, SetCartClassificationShippingRateInputValue.class + ": label is missing");
        return new SetCartClassificationShippingRateInputValueImpl(type, key, label);
    }

    /**
     * builds SetCartClassificationShippingRateInputValue without checking for non null required values
     */
    public SetCartClassificationShippingRateInputValue buildUnchecked() {
        return new SetCartClassificationShippingRateInputValueImpl(type, key, label);
    }

    public static SetCartClassificationShippingRateInputValueBuilder of() {
        return new SetCartClassificationShippingRateInputValueBuilder();
    }

    public static SetCartClassificationShippingRateInputValueBuilder of(
            final SetCartClassificationShippingRateInputValue template) {
        SetCartClassificationShippingRateInputValueBuilder builder = new SetCartClassificationShippingRateInputValueBuilder();
        builder.type = template.getType();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
