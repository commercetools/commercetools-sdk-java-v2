
package com.commercetools.importapi.models.customfields;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class LocalizedStringSetFieldBuilder implements Builder<LocalizedStringSetField> {

    private java.util.List<com.commercetools.importapi.models.common.LocalizedString> value;

    public LocalizedStringSetFieldBuilder value(
            final com.commercetools.importapi.models.common.LocalizedString... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public LocalizedStringSetFieldBuilder value(
            final java.util.List<com.commercetools.importapi.models.common.LocalizedString> value) {
        this.value = value;
        return this;
    }

    public LocalizedStringSetFieldBuilder plusValue(
            final com.commercetools.importapi.models.common.LocalizedString... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    public LocalizedStringSetFieldBuilder plusValue(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    public LocalizedStringSetFieldBuilder withValue(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.common.LocalizedString> getValue() {
        return this.value;
    }

    public LocalizedStringSetField build() {
        Objects.requireNonNull(value, LocalizedStringSetField.class + ": value is missing");
        return new LocalizedStringSetFieldImpl(value);
    }

    /**
     * builds LocalizedStringSetField without checking for non null required values
     */
    public LocalizedStringSetField buildUnchecked() {
        return new LocalizedStringSetFieldImpl(value);
    }

    public static LocalizedStringSetFieldBuilder of() {
        return new LocalizedStringSetFieldBuilder();
    }

    public static LocalizedStringSetFieldBuilder of(final LocalizedStringSetField template) {
        LocalizedStringSetFieldBuilder builder = new LocalizedStringSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
