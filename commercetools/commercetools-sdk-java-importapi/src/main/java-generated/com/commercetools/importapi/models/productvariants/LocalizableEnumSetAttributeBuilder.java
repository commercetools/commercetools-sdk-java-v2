
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocalizableEnumSetAttributeBuilder implements Builder<LocalizableEnumSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<String> value;

    public LocalizableEnumSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public LocalizableEnumSetAttributeBuilder value(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public LocalizableEnumSetAttributeBuilder value(final java.util.List<String> value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.util.List<String> getValue() {
        return this.value;
    }

    public LocalizableEnumSetAttribute build() {
        Objects.requireNonNull(value, LocalizableEnumSetAttribute.class + ": value is missing");
        return new LocalizableEnumSetAttributeImpl(name, value);
    }

    /**
     * builds LocalizableEnumSetAttribute without checking for non null required values
     */
    public LocalizableEnumSetAttribute buildUnchecked() {
        return new LocalizableEnumSetAttributeImpl(name, value);
    }

    public static LocalizableEnumSetAttributeBuilder of() {
        return new LocalizableEnumSetAttributeBuilder();
    }

    public static LocalizableEnumSetAttributeBuilder of(final LocalizableEnumSetAttribute template) {
        LocalizableEnumSetAttributeBuilder builder = new LocalizableEnumSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
