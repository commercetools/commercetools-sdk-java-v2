
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeIsSearchableActionBuilder {

    private String attributeName;

    private Boolean isSearchable;

    public ProductTypeChangeIsSearchableActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ProductTypeChangeIsSearchableActionBuilder isSearchable(final Boolean isSearchable) {
        this.isSearchable = isSearchable;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    public ProductTypeChangeIsSearchableAction build() {
        return new ProductTypeChangeIsSearchableActionImpl(attributeName, isSearchable);
    }

    public static ProductTypeChangeIsSearchableActionBuilder of() {
        return new ProductTypeChangeIsSearchableActionBuilder();
    }

    public static ProductTypeChangeIsSearchableActionBuilder of(final ProductTypeChangeIsSearchableAction template) {
        ProductTypeChangeIsSearchableActionBuilder builder = new ProductTypeChangeIsSearchableActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.isSearchable = template.getIsSearchable();
        return builder;
    }

}
