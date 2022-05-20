
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DateAttributeBuilder implements Builder<DateAttribute> {

    @Nullable
    private String name;

    private java.time.LocalDate value;

    /**
    *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
    */

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
        Objects.requireNonNull(value, DateAttribute.class + ": value is missing");
        return new DateAttributeImpl(name, value);
    }

    /**
     * builds DateAttribute without checking for non null required values
     */
    public DateAttribute buildUnchecked() {
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
