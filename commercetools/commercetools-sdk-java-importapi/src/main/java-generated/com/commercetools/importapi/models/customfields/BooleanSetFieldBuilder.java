
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class BooleanSetFieldBuilder implements Builder<BooleanSetField> {

    private java.util.List<Boolean> value;

    public BooleanSetFieldBuilder value(final Boolean... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public BooleanSetFieldBuilder value(final java.util.List<Boolean> value) {
        this.value = value;
        return this;
    }

    public BooleanSetFieldBuilder plusValue(final Boolean... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    public java.util.List<Boolean> getValue() {
        return this.value;
    }

    public BooleanSetField build() {
        Objects.requireNonNull(value, BooleanSetField.class + ": value is missing");
        return new BooleanSetFieldImpl(value);
    }

    /**
     * builds BooleanSetField without checking for non null required values
     */
    public BooleanSetField buildUnchecked() {
        return new BooleanSetFieldImpl(value);
    }

    public static BooleanSetFieldBuilder of() {
        return new BooleanSetFieldBuilder();
    }

    public static BooleanSetFieldBuilder of(final BooleanSetField template) {
        BooleanSetFieldBuilder builder = new BooleanSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
