
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocalizedEnumValueBuilder {

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString label;

    public LocalizedEnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public LocalizedEnumValueBuilder label(final com.commercetools.importapi.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.importapi.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public LocalizedEnumValue build() {
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
