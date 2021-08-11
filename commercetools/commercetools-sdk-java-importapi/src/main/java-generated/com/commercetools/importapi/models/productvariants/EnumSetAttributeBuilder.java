
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class EnumSetAttributeBuilder implements Builder<EnumSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<String> value;

    public EnumSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public EnumSetAttributeBuilder value(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public EnumSetAttributeBuilder value(final java.util.List<String> value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.util.List<String> getValue() {
        return this.value;
    }

    public EnumSetAttribute build() {
        Objects.requireNonNull(value, EnumSetAttribute.class + ": value is missing");
        return new EnumSetAttributeImpl(name, value);
    }

    /**
     * builds EnumSetAttribute without checking for non null required values
     */
    public EnumSetAttribute buildUnchecked() {
        return new EnumSetAttributeImpl(name, value);
    }

    public static EnumSetAttributeBuilder of() {
        return new EnumSetAttributeBuilder();
    }

    public static EnumSetAttributeBuilder of(final EnumSetAttribute template) {
        EnumSetAttributeBuilder builder = new EnumSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
