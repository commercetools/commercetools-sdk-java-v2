
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class EnumSetFieldBuilder implements Builder<EnumSetField> {

    private java.util.List<String> value;

    public EnumSetFieldBuilder value(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public EnumSetFieldBuilder value(final java.util.List<String> value) {
        this.value = value;
        return this;
    }

    public EnumSetFieldBuilder plusValue(final String... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    public java.util.List<String> getValue() {
        return this.value;
    }

    public EnumSetField build() {
        Objects.requireNonNull(value, EnumSetField.class + ": value is missing");
        return new EnumSetFieldImpl(value);
    }

    /**
     * builds EnumSetField without checking for non null required values
     */
    public EnumSetField buildUnchecked() {
        return new EnumSetFieldImpl(value);
    }

    public static EnumSetFieldBuilder of() {
        return new EnumSetFieldBuilder();
    }

    public static EnumSetFieldBuilder of(final EnumSetField template) {
        EnumSetFieldBuilder builder = new EnumSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
