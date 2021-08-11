
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategorySetDescriptionActionBuilder implements Builder<CategorySetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    public CategorySetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CategorySetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public CategorySetDescriptionAction build() {
        return new CategorySetDescriptionActionImpl(description);
    }

    /**
     * builds CategorySetDescriptionAction without checking for non null required values
     */
    public CategorySetDescriptionAction buildUnchecked() {
        return new CategorySetDescriptionActionImpl(description);
    }

    public static CategorySetDescriptionActionBuilder of() {
        return new CategorySetDescriptionActionBuilder();
    }

    public static CategorySetDescriptionActionBuilder of(final CategorySetDescriptionAction template) {
        CategorySetDescriptionActionBuilder builder = new CategorySetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
