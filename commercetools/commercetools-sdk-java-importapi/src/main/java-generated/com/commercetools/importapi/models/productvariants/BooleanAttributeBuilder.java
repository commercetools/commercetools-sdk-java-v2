
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class BooleanAttributeBuilder implements Builder<BooleanAttribute> {

    @Nullable
    private String name;

    private Boolean value;

    public BooleanAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public BooleanAttributeBuilder value(final Boolean value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public Boolean getValue() {
        return this.value;
    }

    public BooleanAttribute build() {
        Objects.requireNonNull(value, BooleanAttribute.class + ": value is missing");
        return new BooleanAttributeImpl(name, value);
    }

    /**
     * builds BooleanAttribute without checking for non null required values
     */
    public BooleanAttribute buildUnchecked() {
        return new BooleanAttributeImpl(name, value);
    }

    public static BooleanAttributeBuilder of() {
        return new BooleanAttributeBuilder();
    }

    public static BooleanAttributeBuilder of(final BooleanAttribute template) {
        BooleanAttributeBuilder builder = new BooleanAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
