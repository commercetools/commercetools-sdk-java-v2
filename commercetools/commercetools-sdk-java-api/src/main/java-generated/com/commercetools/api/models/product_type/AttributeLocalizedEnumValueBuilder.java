
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeLocalizedEnumValueBuilder implements Builder<AttributeLocalizedEnumValue> {

    private String key;

    private com.commercetools.api.models.common.LocalizedString label;

    public AttributeLocalizedEnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public AttributeLocalizedEnumValueBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AttributeLocalizedEnumValueBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public AttributeLocalizedEnumValue build() {
        Objects.requireNonNull(key, AttributeLocalizedEnumValue.class + ": key is missing");
        Objects.requireNonNull(label, AttributeLocalizedEnumValue.class + ": label is missing");
        return new AttributeLocalizedEnumValueImpl(key, label);
    }

    /**
     * builds AttributeLocalizedEnumValue without checking for non null required values
     */
    public AttributeLocalizedEnumValue buildUnchecked() {
        return new AttributeLocalizedEnumValueImpl(key, label);
    }

    public static AttributeLocalizedEnumValueBuilder of() {
        return new AttributeLocalizedEnumValueBuilder();
    }

    public static AttributeLocalizedEnumValueBuilder of(final AttributeLocalizedEnumValue template) {
        AttributeLocalizedEnumValueBuilder builder = new AttributeLocalizedEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
