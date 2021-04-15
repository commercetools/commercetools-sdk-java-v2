
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetCategoryOrderHintActionBuilder {

    private String categoryId;

    @Nullable
    private String orderHint;

    @Nullable
    private Boolean staged;

    public ProductSetCategoryOrderHintActionBuilder categoryId(final String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public ProductSetCategoryOrderHintActionBuilder orderHint(@Nullable final String orderHint) {
        this.orderHint = orderHint;
        return this;
    }

    public ProductSetCategoryOrderHintActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public String getOrderHint() {
        return this.orderHint;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetCategoryOrderHintAction build() {
        return new ProductSetCategoryOrderHintActionImpl(categoryId, orderHint, staged);
    }

    public static ProductSetCategoryOrderHintActionBuilder of() {
        return new ProductSetCategoryOrderHintActionBuilder();
    }

    public static ProductSetCategoryOrderHintActionBuilder of(final ProductSetCategoryOrderHintAction template) {
        ProductSetCategoryOrderHintActionBuilder builder = new ProductSetCategoryOrderHintActionBuilder();
        builder.categoryId = template.getCategoryId();
        builder.orderHint = template.getOrderHint();
        builder.staged = template.getStaged();
        return builder;
    }

}
