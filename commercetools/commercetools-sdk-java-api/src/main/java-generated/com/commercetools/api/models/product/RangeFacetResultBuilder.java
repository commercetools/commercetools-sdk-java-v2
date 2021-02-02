
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RangeFacetResultBuilder {

    private java.util.List<com.commercetools.api.models.product.FacetResultRange> ranges;

    public RangeFacetResultBuilder ranges(final com.commercetools.api.models.product.FacetResultRange... ranges) {
        this.ranges = new ArrayList<>(Arrays.asList(ranges));
        return this;
    }

    public RangeFacetResultBuilder ranges(
            final java.util.List<com.commercetools.api.models.product.FacetResultRange> ranges) {
        this.ranges = ranges;
        return this;
    }

    public java.util.List<com.commercetools.api.models.product.FacetResultRange> getRanges() {
        return this.ranges;
    }

    public RangeFacetResult build() {
        return new RangeFacetResultImpl(ranges);
    }

    public static RangeFacetResultBuilder of() {
        return new RangeFacetResultBuilder();
    }

    public static RangeFacetResultBuilder of(final RangeFacetResult template) {
        RangeFacetResultBuilder builder = new RangeFacetResultBuilder();
        builder.ranges = template.getRanges();
        return builder;
    }

}
