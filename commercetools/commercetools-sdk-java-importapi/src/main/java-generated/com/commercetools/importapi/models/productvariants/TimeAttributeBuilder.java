
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TimeAttributeBuilder {

    @Nullable
    private String name;

    private java.time.LocalTime value;

    public TimeAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public TimeAttributeBuilder value(final java.time.LocalTime value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.time.LocalTime getValue() {
        return this.value;
    }

    public TimeAttribute build() {
        return new TimeAttributeImpl(name, value);
    }

    public static TimeAttributeBuilder of() {
        return new TimeAttributeBuilder();
    }

    public static TimeAttributeBuilder of(final TimeAttribute template) {
        TimeAttributeBuilder builder = new TimeAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
