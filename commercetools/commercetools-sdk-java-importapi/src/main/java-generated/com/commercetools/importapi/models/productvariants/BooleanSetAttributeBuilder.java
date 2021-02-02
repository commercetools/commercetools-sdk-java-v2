
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class BooleanSetAttributeBuilder {

    @Nullable
    private String name;

    private java.util.List<Boolean> value;

    public BooleanSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public BooleanSetAttributeBuilder value(final Boolean... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public BooleanSetAttributeBuilder value(final java.util.List<Boolean> value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.util.List<Boolean> getValue() {
        return this.value;
    }

    public BooleanSetAttribute build() {
        return new BooleanSetAttributeImpl(name, value);
    }

    public static BooleanSetAttributeBuilder of() {
        return new BooleanSetAttributeBuilder();
    }

    public static BooleanSetAttributeBuilder of(final BooleanSetAttribute template) {
        BooleanSetAttributeBuilder builder = new BooleanSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
