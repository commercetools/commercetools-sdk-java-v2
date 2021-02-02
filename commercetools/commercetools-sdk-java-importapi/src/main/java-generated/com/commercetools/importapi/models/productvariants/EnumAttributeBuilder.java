
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class EnumAttributeBuilder {

    @Nullable
    private String name;

    private String value;

    public EnumAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public EnumAttributeBuilder value(final String value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public EnumAttribute build() {
        return new EnumAttributeImpl(name, value);
    }

    public static EnumAttributeBuilder of() {
        return new EnumAttributeBuilder();
    }

    public static EnumAttributeBuilder of(final EnumAttribute template) {
        EnumAttributeBuilder builder = new EnumAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
