
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DateTimeSetAttributeBuilder {

    @Nullable
    private String name;

    private java.util.List<java.time.ZonedDateTime> value;

    public DateTimeSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public DateTimeSetAttributeBuilder value(final java.time.ZonedDateTime... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public DateTimeSetAttributeBuilder value(final java.util.List<java.time.ZonedDateTime> value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.util.List<java.time.ZonedDateTime> getValue() {
        return this.value;
    }

    public DateTimeSetAttribute build() {
        return new DateTimeSetAttributeImpl(name, value);
    }

    public static DateTimeSetAttributeBuilder of() {
        return new DateTimeSetAttributeBuilder();
    }

    public static DateTimeSetAttributeBuilder of(final DateTimeSetAttribute template) {
        DateTimeSetAttributeBuilder builder = new DateTimeSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
