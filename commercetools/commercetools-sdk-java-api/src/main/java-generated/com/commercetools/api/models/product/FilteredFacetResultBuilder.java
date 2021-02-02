
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class FilteredFacetResultBuilder {

    private Long count;

    @Nullable
    private Long productCount;

    public FilteredFacetResultBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public FilteredFacetResultBuilder productCount(@Nullable final Long productCount) {
        this.productCount = productCount;
        return this;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getProductCount() {
        return this.productCount;
    }

    public FilteredFacetResult build() {
        return new FilteredFacetResultImpl(count, productCount);
    }

    public static FilteredFacetResultBuilder of() {
        return new FilteredFacetResultBuilder();
    }

    public static FilteredFacetResultBuilder of(final FilteredFacetResult template) {
        FilteredFacetResultBuilder builder = new FilteredFacetResultBuilder();
        builder.count = template.getCount();
        builder.productCount = template.getProductCount();
        return builder;
    }

}
