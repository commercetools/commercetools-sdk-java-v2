
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategorySetExternalIdActionBuilder implements Builder<CategorySetExternalIdAction> {

    @Nullable
    private String externalId;

    public CategorySetExternalIdActionBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    public CategorySetExternalIdAction build() {
        return new CategorySetExternalIdActionImpl(externalId);
    }

    /**
     * builds CategorySetExternalIdAction without checking for non null required values
     */
    public CategorySetExternalIdAction buildUnchecked() {
        return new CategorySetExternalIdActionImpl(externalId);
    }

    public static CategorySetExternalIdActionBuilder of() {
        return new CategorySetExternalIdActionBuilder();
    }

    public static CategorySetExternalIdActionBuilder of(final CategorySetExternalIdAction template) {
        CategorySetExternalIdActionBuilder builder = new CategorySetExternalIdActionBuilder();
        builder.externalId = template.getExternalId();
        return builder;
    }

}
