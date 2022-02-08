
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class FacetTermBuilder implements Builder<FacetTerm> {

    private java.lang.Object term;

    private Long count;

    @Nullable
    private Long productCount;

    public FacetTermBuilder term(final java.lang.Object term) {
        this.term = term;
        return this;
    }

    public FacetTermBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public FacetTermBuilder productCount(@Nullable final Long productCount) {
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

    public FacetTerm build() {
        Objects.requireNonNull(term, FacetTerm.class + ": term is missing");
        Objects.requireNonNull(count, FacetTerm.class + ": count is missing");
        return new FacetTermImpl(term, count, productCount);
    }

    /**
     * builds FacetTerm without checking for non null required values
     */
    public FacetTerm buildUnchecked() {
        return new FacetTermImpl(term, count, productCount);
    }

    public static FacetTermBuilder of() {
        return new FacetTermBuilder();
    }

    public static FacetTermBuilder of(final FacetTerm template) {
        FacetTermBuilder builder = new FacetTermBuilder();
        builder.term = template.getTerm();
        builder.count = template.getCount();
        builder.productCount = template.getProductCount();
        return builder;
    }

}
