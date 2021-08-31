
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TimeFieldBuilder implements Builder<TimeField> {

    private java.time.LocalTime value;

    public TimeFieldBuilder value(final java.time.LocalTime value) {
        this.value = value;
        return this;
    }

    public java.time.LocalTime getValue() {
        return this.value;
    }

    public TimeField build() {
        Objects.requireNonNull(value, TimeField.class + ": value is missing");
        return new TimeFieldImpl(value);
    }

    /**
     * builds TimeField without checking for non null required values
     */
    public TimeField buildUnchecked() {
        return new TimeFieldImpl(value);
    }

    public static TimeFieldBuilder of() {
        return new TimeFieldBuilder();
    }

    public static TimeFieldBuilder of(final TimeField template) {
        TimeFieldBuilder builder = new TimeFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
