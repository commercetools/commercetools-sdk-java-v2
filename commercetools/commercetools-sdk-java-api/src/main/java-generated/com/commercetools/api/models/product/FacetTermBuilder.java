
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FacetTermBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FacetTerm facetTerm = FacetTerm.builder()
 *             .count(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FacetTermBuilder implements Builder<FacetTerm> {

    private java.lang.Object term;

    private Long count;

    @Nullable
    private Long productCount;

    /**
     *
     * @param term value to be set
     * @return Builder
     */

    public FacetTermBuilder term(final java.lang.Object term) {
        this.term = term;
        return this;
    }

    /**
     *
     * @param count value to be set
     * @return Builder
     */

    public FacetTermBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *
     * @param productCount value to be set
     * @return Builder
     */

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

    /**
     * builds FacetTerm with checking for non-null required values
     * @return FacetTerm
     */
    public FacetTerm build() {
        Objects.requireNonNull(term, FacetTerm.class + ": term is missing");
        Objects.requireNonNull(count, FacetTerm.class + ": count is missing");
        return new FacetTermImpl(term, count, productCount);
    }

    /**
     * builds FacetTerm without checking for non-null required values
     * @return FacetTerm
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
