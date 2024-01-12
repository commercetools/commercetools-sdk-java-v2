
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetResultCountBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResultCount productSearchFacetResultCount = ProductSearchFacetResultCount.builder()
 *             .name("{name}")
 *             .value(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetResultCountBuilder implements Builder<ProductSearchFacetResultCount> {

    private String name;

    private Long value;

    /**
     *  <p>Name of the facet.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSearchFacetResultCountBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Number of Products (or Product Variants) matching the query.</p>
     * @param value value to be set
     * @return Builder
     */

    public ProductSearchFacetResultCountBuilder value(final Long value) {
        this.value = value;
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
     *  <p>Number of Products (or Product Variants) matching the query.</p>
     * @return value
     */

    public Long getValue() {
        return this.value;
    }

    /**
     * builds ProductSearchFacetResultCount with checking for non-null required values
     * @return ProductSearchFacetResultCount
     */
    public ProductSearchFacetResultCount build() {
        Objects.requireNonNull(name, ProductSearchFacetResultCount.class + ": name is missing");
        Objects.requireNonNull(value, ProductSearchFacetResultCount.class + ": value is missing");
        return new ProductSearchFacetResultCountImpl(name, value);
    }

    /**
     * builds ProductSearchFacetResultCount without checking for non-null required values
     * @return ProductSearchFacetResultCount
     */
    public ProductSearchFacetResultCount buildUnchecked() {
        return new ProductSearchFacetResultCountImpl(name, value);
    }

    /**
     * factory method for an instance of ProductSearchFacetResultCountBuilder
     * @return builder
     */
    public static ProductSearchFacetResultCountBuilder of() {
        return new ProductSearchFacetResultCountBuilder();
    }

    /**
     * create builder for ProductSearchFacetResultCount instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultCountBuilder of(final ProductSearchFacetResultCount template) {
        ProductSearchFacetResultCountBuilder builder = new ProductSearchFacetResultCountBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
