
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FilteredFacetResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FilteredFacetResult filteredFacetResult = FilteredFacetResult.builder()
 *             .count(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FilteredFacetResultBuilder implements Builder<FilteredFacetResult> {

    private Long count;

    @Nullable
    private Long productCount;

    /**
     * set the value to the count
     * @param count value to be set
     * @return Builder
     */

    public FilteredFacetResultBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     * set the value to the productCount
     * @param productCount value to be set
     * @return Builder
     */

    public FilteredFacetResultBuilder productCount(@Nullable final Long productCount) {
        this.productCount = productCount;
        return this;
    }

    /**
     * value of count}
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * value of productCount}
     * @return productCount
     */

    @Nullable
    public Long getProductCount() {
        return this.productCount;
    }

    /**
     * builds FilteredFacetResult with checking for non-null required values
     * @return FilteredFacetResult
     */
    public FilteredFacetResult build() {
        Objects.requireNonNull(count, FilteredFacetResult.class + ": count is missing");
        return new FilteredFacetResultImpl(count, productCount);
    }

    /**
     * builds FilteredFacetResult without checking for non-null required values
     * @return FilteredFacetResult
     */
    public FilteredFacetResult buildUnchecked() {
        return new FilteredFacetResultImpl(count, productCount);
    }

    /**
     * factory method for an instance of FilteredFacetResultBuilder
     * @return builder
     */
    public static FilteredFacetResultBuilder of() {
        return new FilteredFacetResultBuilder();
    }

    /**
     * create builder for FilteredFacetResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FilteredFacetResultBuilder of(final FilteredFacetResult template) {
        FilteredFacetResultBuilder builder = new FilteredFacetResultBuilder();
        builder.count = template.getCount();
        builder.productCount = template.getProductCount();
        return builder;
    }

}
