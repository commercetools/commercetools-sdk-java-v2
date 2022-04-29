
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StringSetFieldBuilder implements Builder<StringSetField> {

    private java.util.List<String> value;

    public StringSetFieldBuilder value(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public StringSetFieldBuilder value(final java.util.List<String> value) {
        this.value = value;
        return this;
    }

    public StringSetFieldBuilder plusValue(final String... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    public java.util.List<String> getValue() {
        return this.value;
    }

    public StringSetField build() {
        Objects.requireNonNull(value, StringSetField.class + ": value is missing");
        return new StringSetFieldImpl(value);
    }

    /**
     * builds StringSetField without checking for non null required values
     */
    public StringSetField buildUnchecked() {
        return new StringSetFieldImpl(value);
    }

    public static StringSetFieldBuilder of() {
        return new StringSetFieldBuilder();
    }

    public static StringSetFieldBuilder of(final StringSetField template) {
        StringSetFieldBuilder builder = new StringSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
