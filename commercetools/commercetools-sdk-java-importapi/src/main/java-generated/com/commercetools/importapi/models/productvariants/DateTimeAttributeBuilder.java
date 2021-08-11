
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DateTimeAttributeBuilder implements Builder<DateTimeAttribute> {

    @Nullable
    private String name;

    private java.time.ZonedDateTime value;

    public DateTimeAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public DateTimeAttributeBuilder value(final java.time.ZonedDateTime value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.time.ZonedDateTime getValue() {
        return this.value;
    }

    public DateTimeAttribute build() {
        Objects.requireNonNull(value, DateTimeAttribute.class + ": value is missing");
        return new DateTimeAttributeImpl(name, value);
    }

    /**
     * builds DateTimeAttribute without checking for non null required values
     */
    public DateTimeAttribute buildUnchecked() {
        return new DateTimeAttributeImpl(name, value);
    }

    public static DateTimeAttributeBuilder of() {
        return new DateTimeAttributeBuilder();
    }

    public static DateTimeAttributeBuilder of(final DateTimeAttribute template) {
        DateTimeAttributeBuilder builder = new DateTimeAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
