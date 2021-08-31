
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeDescriptionActionBuilder implements Builder<ProductTypeChangeDescriptionAction> {

    private String description;

    public ProductTypeChangeDescriptionActionBuilder description(final String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public ProductTypeChangeDescriptionAction build() {
        Objects.requireNonNull(description, ProductTypeChangeDescriptionAction.class + ": description is missing");
        return new ProductTypeChangeDescriptionActionImpl(description);
    }

    /**
     * builds ProductTypeChangeDescriptionAction without checking for non null required values
     */
    public ProductTypeChangeDescriptionAction buildUnchecked() {
        return new ProductTypeChangeDescriptionActionImpl(description);
    }

    public static ProductTypeChangeDescriptionActionBuilder of() {
        return new ProductTypeChangeDescriptionActionBuilder();
    }

    public static ProductTypeChangeDescriptionActionBuilder of(final ProductTypeChangeDescriptionAction template) {
        ProductTypeChangeDescriptionActionBuilder builder = new ProductTypeChangeDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
