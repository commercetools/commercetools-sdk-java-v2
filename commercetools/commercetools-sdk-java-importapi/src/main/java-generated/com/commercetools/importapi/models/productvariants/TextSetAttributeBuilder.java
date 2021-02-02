
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TextSetAttributeBuilder {

    @Nullable
    private String name;

    private java.util.List<String> value;

    public TextSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public TextSetAttributeBuilder value(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public TextSetAttributeBuilder value(final java.util.List<String> value) {
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

    public TextSetAttribute build() {
        return new TextSetAttributeImpl(name, value);
    }

    public static TextSetAttributeBuilder of() {
        return new TextSetAttributeBuilder();
    }

    public static TextSetAttributeBuilder of(final TextSetAttribute template) {
        TextSetAttributeBuilder builder = new TextSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
