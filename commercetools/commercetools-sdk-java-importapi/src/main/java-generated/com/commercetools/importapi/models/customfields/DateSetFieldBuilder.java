
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DateSetFieldBuilder implements Builder<DateSetField> {

    private java.util.List<java.time.LocalDate> value;

    public DateSetFieldBuilder value(final java.time.LocalDate... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public DateSetFieldBuilder value(final java.util.List<java.time.LocalDate> value) {
        this.value = value;
        return this;
    }

    public java.util.List<java.time.LocalDate> getValue() {
        return this.value;
    }

    public DateSetField build() {
        Objects.requireNonNull(value, DateSetField.class + ": value is missing");
        return new DateSetFieldImpl(value);
    }

    /**
     * builds DateSetField without checking for non null required values
     */
    public DateSetField buildUnchecked() {
        return new DateSetFieldImpl(value);
    }

    public static DateSetFieldBuilder of() {
        return new DateSetFieldBuilder();
    }

    public static DateSetFieldBuilder of(final DateSetField template) {
        DateSetFieldBuilder builder = new DateSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
