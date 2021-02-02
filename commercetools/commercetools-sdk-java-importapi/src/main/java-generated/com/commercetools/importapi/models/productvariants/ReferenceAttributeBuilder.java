
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReferenceAttributeBuilder {

    @Nullable
    private String name;

    private com.commercetools.importapi.models.common.KeyReference value;

    public ReferenceAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public ReferenceAttributeBuilder value(final com.commercetools.importapi.models.common.KeyReference value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public com.commercetools.importapi.models.common.KeyReference getValue() {
        return this.value;
    }

    public ReferenceAttribute build() {
        return new ReferenceAttributeImpl(name, value);
    }

    public static ReferenceAttributeBuilder of() {
        return new ReferenceAttributeBuilder();
    }

    public static ReferenceAttributeBuilder of(final ReferenceAttribute template) {
        ReferenceAttributeBuilder builder = new ReferenceAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
