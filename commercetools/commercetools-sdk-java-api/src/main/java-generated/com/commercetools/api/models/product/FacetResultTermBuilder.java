
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class FacetResultTermBuilder implements Builder<FacetResultTerm> {

    private java.lang.Object term;

    private Long count;

    @Nullable
    private Long productCount;

    public FacetResultTermBuilder term(final java.lang.Object term) {
        this.term = term;
        return this;
    }

    public FacetResultTermBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public FacetResultTermBuilder productCount(@Nullable final Long productCount) {
        this.productCount = productCount;
        return this;
    }

    public java.lang.Object getTerm() {
        return this.term;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getProductCount() {
        return this.productCount;
    }

    public FacetResultTerm build() {
        Objects.requireNonNull(term, FacetResultTerm.class + ": term is missing");
        Objects.requireNonNull(count, FacetResultTerm.class + ": count is missing");
        return new FacetResultTermImpl(term, count, productCount);
    }

    /**
     * builds FacetResultTerm without checking for non null required values
     */
    public FacetResultTerm buildUnchecked() {
        return new FacetResultTermImpl(term, count, productCount);
    }

    public static FacetResultTermBuilder of() {
        return new FacetResultTermBuilder();
    }

    public static FacetResultTermBuilder of(final FacetResultTerm template) {
        FacetResultTermBuilder builder = new FacetResultTermBuilder();
        builder.term = template.getTerm();
        builder.count = template.getCount();
        builder.productCount = template.getProductCount();
        return builder;
    }

}
