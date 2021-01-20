
package com.commercetools.importapi.models.customfields;

import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.TimeField;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TimeFieldBuilder {

    private java.time.LocalTime value;

    public TimeFieldBuilder value(final java.time.LocalTime value) {
        this.value = value;
        return this;
    }

    public java.time.LocalTime getValue() {
        return this.value;
    }

    public TimeField build() {
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
