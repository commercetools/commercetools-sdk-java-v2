
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DateSetAttributeBuilder implements Builder<DateSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<java.time.LocalDate> value;

    public DateSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public DateSetAttributeBuilder value(final java.time.LocalDate... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public DateSetAttributeBuilder value(final java.util.List<java.time.LocalDate> value) {
        this.value = value;
        return this;
    }

    public DateSetAttributeBuilder plusValue(final java.time.LocalDate... value) {
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

    public java.util.List<java.time.LocalDate> getValue() {
        return this.value;
    }

    public DateSetAttribute build() {
        Objects.requireNonNull(value, DateSetAttribute.class + ": value is missing");
        return new DateSetAttributeImpl(name, value);
    }

    /**
     * builds DateSetAttribute without checking for non null required values
     */
    public DateSetAttribute buildUnchecked() {
        return new DateSetAttributeImpl(name, value);
    }

    public static DateSetAttributeBuilder of() {
        return new DateSetAttributeBuilder();
    }

    public static DateSetAttributeBuilder of(final DateSetAttribute template) {
        DateSetAttributeBuilder builder = new DateSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
