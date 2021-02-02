
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TimeSetFieldBuilder {

    private java.util.List<java.time.LocalTime> value;

    public TimeSetFieldBuilder value(final java.time.LocalTime... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public TimeSetFieldBuilder value(final java.util.List<java.time.LocalTime> value) {
        this.value = value;
        return this;
    }

    public java.util.List<java.time.LocalTime> getValue() {
        return this.value;
    }

    public TimeSetField build() {
        return new TimeSetFieldImpl(value);
    }

    public static TimeSetFieldBuilder of() {
        return new TimeSetFieldBuilder();
    }

    public static TimeSetFieldBuilder of(final TimeSetField template) {
        TimeSetFieldBuilder builder = new TimeSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
