
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductAddedToCategoryMessagePayloadBuilder {

    private com.commercetools.api.models.category.CategoryReference category;

    private Boolean staged;

    public ProductAddedToCategoryMessagePayloadBuilder category(
            final com.commercetools.api.models.category.CategoryReference category) {
        this.category = category;
        return this;
    }

    public ProductAddedToCategoryMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.category.CategoryReference getCategory() {
        return this.category;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public ProductAddedToCategoryMessagePayload build() {
        return new ProductAddedToCategoryMessagePayloadImpl(category, staged);
    }

    public static ProductAddedToCategoryMessagePayloadBuilder of() {
        return new ProductAddedToCategoryMessagePayloadBuilder();
    }

    public static ProductAddedToCategoryMessagePayloadBuilder of(final ProductAddedToCategoryMessagePayload template) {
        ProductAddedToCategoryMessagePayloadBuilder builder = new ProductAddedToCategoryMessagePayloadBuilder();
        builder.category = template.getCategory();
        builder.staged = template.getStaged();
        return builder;
    }

}
