
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocalizableTextAttributeBuilder implements Builder<LocalizableTextAttribute> {

    @Nullable
    private String name;

    private com.commercetools.importapi.models.common.LocalizedString value;

    public LocalizableTextAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public LocalizableTextAttributeBuilder value(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
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
        Objects.requireNonNull(value, LocalizableTextAttribute.class + ": value is missing");
        return new LocalizableTextAttributeImpl(name, value);
    }

    /**
     * builds LocalizableTextAttribute without checking for non null required values
     */
    public LocalizableTextAttribute buildUnchecked() {
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
