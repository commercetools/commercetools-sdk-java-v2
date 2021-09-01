
package com.commercetools.importapi.models.customfields;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocalizedStringFieldBuilder implements Builder<LocalizedStringField> {

    private com.commercetools.importapi.models.common.LocalizedString value;

    public LocalizedStringFieldBuilder value(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public LocalizedStringFieldBuilder value(final com.commercetools.importapi.models.common.LocalizedString value) {
        this.value = value;
        return this;
    }

    public com.commercetools.importapi.models.common.LocalizedString getValue() {
        return this.value;
    }

    public LocalizedStringField build() {
        Objects.requireNonNull(value, LocalizedStringField.class + ": value is missing");
        return new LocalizedStringFieldImpl(value);
    }

    /**
     * builds LocalizedStringField without checking for non null required values
     */
    public LocalizedStringField buildUnchecked() {
        return new LocalizedStringFieldImpl(value);
    }

    public static LocalizedStringFieldBuilder of() {
        return new LocalizedStringFieldBuilder();
    }

    public static LocalizedStringFieldBuilder of(final LocalizedStringField template) {
        LocalizedStringFieldBuilder builder = new LocalizedStringFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
