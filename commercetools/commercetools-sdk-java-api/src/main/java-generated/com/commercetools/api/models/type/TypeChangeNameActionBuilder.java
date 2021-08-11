
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeChangeNameActionBuilder implements Builder<TypeChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    public TypeChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public TypeChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public TypeChangeNameAction build() {
        Objects.requireNonNull(name, TypeChangeNameAction.class + ": name is missing");
        return new TypeChangeNameActionImpl(name);
    }

    /**
     * builds TypeChangeNameAction without checking for non null required values
     */
    public TypeChangeNameAction buildUnchecked() {
        return new TypeChangeNameActionImpl(name);
    }

    public static TypeChangeNameActionBuilder of() {
        return new TypeChangeNameActionBuilder();
    }

    public static TypeChangeNameActionBuilder of(final TypeChangeNameAction template) {
        TypeChangeNameActionBuilder builder = new TypeChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
