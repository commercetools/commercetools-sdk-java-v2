
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class NumberAttributeBuilder {

    @Nullable
    private String name;

    private Double value;

    public NumberAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public NumberAttributeBuilder value(final Double value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public Double getValue() {
        return this.value;
    }

    public NumberAttribute build() {
        return new NumberAttributeImpl(name, value);
    }

    public static NumberAttributeBuilder of() {
        return new NumberAttributeBuilder();
    }

    public static NumberAttributeBuilder of(final NumberAttribute template) {
        NumberAttributeBuilder builder = new NumberAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
