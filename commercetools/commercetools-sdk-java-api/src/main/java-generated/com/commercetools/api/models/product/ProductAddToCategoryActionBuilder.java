
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductAddToCategoryActionBuilder {

    private com.commercetools.api.models.category.CategoryResourceIdentifier category;

    @Nullable
    private String orderHint;

    @Nullable
    private Boolean staged;

    public ProductAddToCategoryActionBuilder category(
            final com.commercetools.api.models.category.CategoryResourceIdentifier category) {
        this.category = category;
        return this;
    }

    public ProductAddToCategoryActionBuilder orderHint(@Nullable final String orderHint) {
        this.orderHint = orderHint;
        return this;
    }

    public ProductAddToCategoryActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.category.CategoryResourceIdentifier getCategory() {
        return this.category;
    }

    @Nullable
    public String getOrderHint() {
        return this.orderHint;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductAddToCategoryAction build() {
        return new ProductAddToCategoryActionImpl(category, orderHint, staged);
    }

    public static ProductAddToCategoryActionBuilder of() {
        return new ProductAddToCategoryActionBuilder();
    }

    public static ProductAddToCategoryActionBuilder of(final ProductAddToCategoryAction template) {
        ProductAddToCategoryActionBuilder builder = new ProductAddToCategoryActionBuilder();
        builder.category = template.getCategory();
        builder.orderHint = template.getOrderHint();
        builder.staged = template.getStaged();
        return builder;
    }

}
