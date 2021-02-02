
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DateFieldBuilder {

    private java.time.LocalDate value;

    public DateFieldBuilder value(final java.time.LocalDate value) {
        this.value = value;
        return this;
    }

    public java.time.LocalDate getValue() {
        return this.value;
    }

    public DateField build() {
        return new DateFieldImpl(value);
    }

    public static DateFieldBuilder of() {
        return new DateFieldBuilder();
    }

    public static DateFieldBuilder of(final DateField template) {
        DateFieldBuilder builder = new DateFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
