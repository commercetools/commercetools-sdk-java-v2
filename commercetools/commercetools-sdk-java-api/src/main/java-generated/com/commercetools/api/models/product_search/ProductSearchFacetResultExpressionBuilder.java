
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetResultExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResultExpression productSearchFacetResultExpression = ProductSearchFacetResultExpression.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetResultExpressionBuilder implements Builder<ProductSearchFacetResultExpression> {

    private String name;

    /**
     *  <p>Name of the facet.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSearchFacetResultExpressionBuilder name(final String name) {
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
     * builds ProductSearchFacetResultExpression with checking for non-null required values
     * @return ProductSearchFacetResultExpression
     */
    public ProductSearchFacetResultExpression build() {
        Objects.requireNonNull(name, ProductSearchFacetResultExpression.class + ": name is missing");
        return new ProductSearchFacetResultExpressionImpl(name);
    }

    /**
     * builds ProductSearchFacetResultExpression without checking for non-null required values
     * @return ProductSearchFacetResultExpression
     */
    public ProductSearchFacetResultExpression buildUnchecked() {
        return new ProductSearchFacetResultExpressionImpl(name);
    }

    /**
     * factory method for an instance of ProductSearchFacetResultExpressionBuilder
     * @return builder
     */
    public static ProductSearchFacetResultExpressionBuilder of() {
        return new ProductSearchFacetResultExpressionBuilder();
    }

    /**
     * create builder for ProductSearchFacetResultExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultExpressionBuilder of(final ProductSearchFacetResultExpression template) {
        ProductSearchFacetResultExpressionBuilder builder = new ProductSearchFacetResultExpressionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
