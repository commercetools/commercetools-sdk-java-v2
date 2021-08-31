
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class NumberFieldBuilder implements Builder<NumberField> {

    private Double value;

    public NumberFieldBuilder value(final Double value) {
        this.value = value;
        return this;
    }

    public Double getValue() {
        return this.value;
    }

    public NumberField build() {
        Objects.requireNonNull(value, NumberField.class + ": value is missing");
        return new NumberFieldImpl(value);
    }

    /**
     * builds NumberField without checking for non null required values
     */
    public NumberField buildUnchecked() {
        return new NumberFieldImpl(value);
    }

    public static NumberFieldBuilder of() {
        return new NumberFieldBuilder();
    }

    public static NumberFieldBuilder of(final NumberField template) {
        NumberFieldBuilder builder = new NumberFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
