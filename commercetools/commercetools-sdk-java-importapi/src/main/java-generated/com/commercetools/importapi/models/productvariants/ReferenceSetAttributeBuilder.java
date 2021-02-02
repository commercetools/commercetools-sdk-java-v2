
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReferenceSetAttributeBuilder {

    @Nullable
    private String name;

    private java.util.List<com.commercetools.importapi.models.common.KeyReference> value;

    public ReferenceSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public ReferenceSetAttributeBuilder value(final com.commercetools.importapi.models.common.KeyReference... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public ReferenceSetAttributeBuilder value(
            final java.util.List<com.commercetools.importapi.models.common.KeyReference> value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.util.List<com.commercetools.importapi.models.common.KeyReference> getValue() {
        return this.value;
    }

    public ReferenceSetAttribute build() {
        return new ReferenceSetAttributeImpl(name, value);
    }

    public static ReferenceSetAttributeBuilder of() {
        return new ReferenceSetAttributeBuilder();
    }

    public static ReferenceSetAttributeBuilder of(final ReferenceSetAttribute template) {
        ReferenceSetAttributeBuilder builder = new ReferenceSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
