
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeSetDescriptionActionBuilder implements Builder<TypeSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    public TypeSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public TypeSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public TypeSetDescriptionAction build() {
        return new TypeSetDescriptionActionImpl(description);
    }

    /**
     * builds TypeSetDescriptionAction without checking for non null required values
     */
    public TypeSetDescriptionAction buildUnchecked() {
        return new TypeSetDescriptionActionImpl(description);
    }

    public static TypeSetDescriptionActionBuilder of() {
        return new TypeSetDescriptionActionBuilder();
    }

    public static TypeSetDescriptionActionBuilder of(final TypeSetDescriptionAction template) {
        TypeSetDescriptionActionBuilder builder = new TypeSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
