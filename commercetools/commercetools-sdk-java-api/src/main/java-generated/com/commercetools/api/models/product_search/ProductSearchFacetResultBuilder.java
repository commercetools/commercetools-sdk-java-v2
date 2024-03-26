
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResult productSearchFacetResult = ProductSearchFacetResult.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetResultBuilder implements Builder<ProductSearchFacetResult> {

    private String name;

    /**
     *  <p>Name of the facet.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSearchFacetResultBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Name of the facet.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds ProductSearchFacetResult with checking for non-null required values
     * @return ProductSearchFacetResult
     */
    public ProductSearchFacetResult build() {
        Objects.requireNonNull(name, ProductSearchFacetResult.class + ": name is missing");
        return new ProductSearchFacetResultImpl(name);
    }

    /**
     * builds ProductSearchFacetResult without checking for non-null required values
     * @return ProductSearchFacetResult
     */
    public ProductSearchFacetResult buildUnchecked() {
        return new ProductSearchFacetResultImpl(name);
    }

    /**
     * factory method for an instance of ProductSearchFacetResultBuilder
     * @return builder
     */
    public static ProductSearchFacetResultBuilder of() {
        return new ProductSearchFacetResultBuilder();
    }

    /**
     * create builder for ProductSearchFacetResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultBuilder of(final ProductSearchFacetResult template) {
        ProductSearchFacetResultBuilder builder = new ProductSearchFacetResultBuilder();
        builder.name = template.getName();
        return builder;
    }

}
