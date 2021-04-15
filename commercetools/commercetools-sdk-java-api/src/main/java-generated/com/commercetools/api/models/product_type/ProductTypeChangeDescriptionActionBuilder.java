
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeDescriptionActionBuilder {

    private String description;

    public ProductTypeChangeDescriptionActionBuilder description(final String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public ProductTypeChangeDescriptionAction build() {
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
