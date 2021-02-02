
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class NumberSetAttributeBuilder {

    @Nullable
    private String name;

    private java.util.List<Double> value;

    public NumberSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public NumberSetAttributeBuilder value(final Double... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public NumberSetAttributeBuilder value(final java.util.List<Double> value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.util.List<Double> getValue() {
        return this.value;
    }

    public NumberSetAttribute build() {
        return new NumberSetAttributeImpl(name, value);
    }

    public static NumberSetAttributeBuilder of() {
        return new NumberSetAttributeBuilder();
    }

    public static NumberSetAttributeBuilder of(final NumberSetAttribute template) {
        NumberSetAttributeBuilder builder = new NumberSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
