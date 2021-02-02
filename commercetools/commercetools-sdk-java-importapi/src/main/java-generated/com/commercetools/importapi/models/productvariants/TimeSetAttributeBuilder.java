
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TimeSetAttributeBuilder {

    @Nullable
    private String name;

    private java.util.List<java.time.LocalTime> value;

    public TimeSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public TimeSetAttributeBuilder value(final java.time.LocalTime... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public TimeSetAttributeBuilder value(final java.util.List<java.time.LocalTime> value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.util.List<java.time.LocalTime> getValue() {
        return this.value;
    }

    public TimeSetAttribute build() {
        return new TimeSetAttributeImpl(name, value);
    }

    public static TimeSetAttributeBuilder of() {
        return new TimeSetAttributeBuilder();
    }

    public static TimeSetAttributeBuilder of(final TimeSetAttribute template) {
        TimeSetAttributeBuilder builder = new TimeSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
