
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TimeSetAttributeBuilder implements Builder<TimeSetAttribute> {

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

    public TimeSetAttributeBuilder plusValue(final java.time.LocalTime... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
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
        Objects.requireNonNull(value, TimeSetAttribute.class + ": value is missing");
        return new TimeSetAttributeImpl(name, value);
    }

    /**
     * builds TimeSetAttribute without checking for non null required values
     */
    public TimeSetAttribute buildUnchecked() {
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
