
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DateTimeFieldBuilder {

    private java.time.ZonedDateTime value;

    public DateTimeFieldBuilder value(final java.time.ZonedDateTime value) {
        this.value = value;
        return this;
    }

    public java.time.ZonedDateTime getValue() {
        return this.value;
    }

    public DateTimeField build() {
        return new DateTimeFieldImpl(value);
    }

    public static DateTimeFieldBuilder of() {
        return new DateTimeFieldBuilder();
    }

    public static DateTimeFieldBuilder of(final DateTimeField template) {
        DateTimeFieldBuilder builder = new DateTimeFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
