
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocalizedEnumValueBuilder implements Builder<LocalizedEnumValue> {

    private String key;

    private com.commercetools.history.models.common.LocalizedString label;

    public LocalizedEnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public LocalizedEnumValueBuilder label(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public LocalizedEnumValueBuilder label(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public LocalizedEnumValue build() {
        Objects.requireNonNull(key, LocalizedEnumValue.class + ": key is missing");
        Objects.requireNonNull(label, LocalizedEnumValue.class + ": label is missing");
        return new LocalizedEnumValueImpl(key, label);
    }

    /**
     * builds LocalizedEnumValue without checking for non null required values
     */
    public LocalizedEnumValue buildUnchecked() {
        return new LocalizedEnumValueImpl(key, label);
    }

    public static LocalizedEnumValueBuilder of() {
        return new LocalizedEnumValueBuilder();
    }

    public static LocalizedEnumValueBuilder of(final LocalizedEnumValue template) {
        LocalizedEnumValueBuilder builder = new LocalizedEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
