
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReferenceAttributeBuilder implements Builder<ReferenceAttribute> {

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
        Objects.requireNonNull(value, ReferenceAttribute.class + ": value is missing");
        return new ReferenceAttributeImpl(name, value);
    }

    /**
     * builds ReferenceAttribute without checking for non null required values
     */
    public ReferenceAttribute buildUnchecked() {
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
