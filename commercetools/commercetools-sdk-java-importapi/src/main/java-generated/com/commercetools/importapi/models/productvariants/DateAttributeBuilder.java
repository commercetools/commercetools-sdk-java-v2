
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DateAttributeBuilder {

    @Nullable
    private String name;

    private java.time.LocalDate value;

    public DateAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public DateAttributeBuilder value(final java.time.LocalDate value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.time.LocalDate getValue() {
        return this.value;
    }

    public DateAttribute build() {
        return new DateAttributeImpl(name, value);
    }

    public static DateAttributeBuilder of() {
        return new DateAttributeBuilder();
    }

    public static DateAttributeBuilder of(final DateAttribute template) {
        DateAttributeBuilder builder = new DateAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
