
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocalizableEnumAttributeBuilder implements Builder<LocalizableEnumAttribute> {

    @Nullable
    private String name;

    private String value;

    public LocalizableEnumAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public LocalizableEnumAttributeBuilder value(final String value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public LocalizableEnumAttribute build() {
        Objects.requireNonNull(value, LocalizableEnumAttribute.class + ": value is missing");
        return new LocalizableEnumAttributeImpl(name, value);
    }

    /**
     * builds LocalizableEnumAttribute without checking for non null required values
     */
    public LocalizableEnumAttribute buildUnchecked() {
        return new LocalizableEnumAttributeImpl(name, value);
    }

    public static LocalizableEnumAttributeBuilder of() {
        return new LocalizableEnumAttributeBuilder();
    }

    public static LocalizableEnumAttributeBuilder of(final LocalizableEnumAttribute template) {
        LocalizableEnumAttributeBuilder builder = new LocalizableEnumAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
