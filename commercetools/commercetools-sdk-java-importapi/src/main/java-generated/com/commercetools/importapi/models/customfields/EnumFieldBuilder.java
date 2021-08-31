
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class EnumFieldBuilder implements Builder<EnumField> {

    private String value;

    public EnumFieldBuilder value(final String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public EnumField build() {
        Objects.requireNonNull(value, EnumField.class + ": value is missing");
        return new EnumFieldImpl(value);
    }

    /**
     * builds EnumField without checking for non null required values
     */
    public EnumField buildUnchecked() {
        return new EnumFieldImpl(value);
    }

    public static EnumFieldBuilder of() {
        return new EnumFieldBuilder();
    }

    public static EnumFieldBuilder of(final EnumField template) {
        EnumFieldBuilder builder = new EnumFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
