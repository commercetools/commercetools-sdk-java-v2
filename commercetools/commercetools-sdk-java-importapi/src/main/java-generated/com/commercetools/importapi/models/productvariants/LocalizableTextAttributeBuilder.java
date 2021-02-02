
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocalizableTextAttributeBuilder {

    @Nullable
    private String name;

    private com.commercetools.importapi.models.common.LocalizedString value;

    public LocalizableTextAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public LocalizableTextAttributeBuilder value(
            final com.commercetools.importapi.models.common.LocalizedString value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public com.commercetools.importapi.models.common.LocalizedString getValue() {
        return this.value;
    }

    public LocalizableTextAttribute build() {
        return new LocalizableTextAttributeImpl(name, value);
    }

    public static LocalizableTextAttributeBuilder of() {
        return new LocalizableTextAttributeBuilder();
    }

    public static LocalizableTextAttributeBuilder of(final LocalizableTextAttribute template) {
        LocalizableTextAttributeBuilder builder = new LocalizableTextAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
