
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductRemoveFromCategoryActionBuilder {

    private com.commercetools.api.models.category.CategoryResourceIdentifier category;

    @Nullable
    private Boolean staged;

    public ProductRemoveFromCategoryActionBuilder category(
            final com.commercetools.api.models.category.CategoryResourceIdentifier category) {
        this.category = category;
        return this;
    }

    public ProductRemoveFromCategoryActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.category.CategoryResourceIdentifier getCategory() {
        return this.category;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductRemoveFromCategoryAction build() {
        return new ProductRemoveFromCategoryActionImpl(category, staged);
    }

    public static ProductRemoveFromCategoryActionBuilder of() {
        return new ProductRemoveFromCategoryActionBuilder();
    }

    public static ProductRemoveFromCategoryActionBuilder of(final ProductRemoveFromCategoryAction template) {
        ProductRemoveFromCategoryActionBuilder builder = new ProductRemoveFromCategoryActionBuilder();
        builder.category = template.getCategory();
        builder.staged = template.getStaged();
        return builder;
    }

}
