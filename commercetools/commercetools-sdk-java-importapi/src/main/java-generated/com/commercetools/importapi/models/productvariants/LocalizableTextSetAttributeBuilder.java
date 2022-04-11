
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class LocalizableTextSetAttributeBuilder implements Builder<LocalizableTextSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<com.commercetools.importapi.models.common.LocalizedString> value;

    public LocalizableTextSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public LocalizableTextSetAttributeBuilder value(
            final com.commercetools.importapi.models.common.LocalizedString... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public LocalizableTextSetAttributeBuilder value(
            final java.util.List<com.commercetools.importapi.models.common.LocalizedString> value) {
        this.value = value;
        return this;
    }

    public LocalizableTextSetAttributeBuilder plusValue(
            final com.commercetools.importapi.models.common.LocalizedString... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    public LocalizableTextSetAttributeBuilder plusValue(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    public LocalizableTextSetAttributeBuilder withValue(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.util.List<com.commercetools.importapi.models.common.LocalizedString> getValue() {
        return this.value;
    }

    public LocalizableTextSetAttribute build() {
        Objects.requireNonNull(value, LocalizableTextSetAttribute.class + ": value is missing");
        return new LocalizableTextSetAttributeImpl(name, value);
    }

    /**
     * builds LocalizableTextSetAttribute without checking for non null required values
     */
    public LocalizableTextSetAttribute buildUnchecked() {
        return new LocalizableTextSetAttributeImpl(name, value);
    }

    public static LocalizableTextSetAttributeBuilder of() {
        return new LocalizableTextSetAttributeBuilder();
    }

    public static LocalizableTextSetAttributeBuilder of(final LocalizableTextSetAttribute template) {
        LocalizableTextSetAttributeBuilder builder = new LocalizableTextSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
