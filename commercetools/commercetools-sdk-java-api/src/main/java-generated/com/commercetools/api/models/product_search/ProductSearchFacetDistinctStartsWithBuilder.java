
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetDistinctStartsWithBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetDistinctStartsWith productSearchFacetDistinctStartsWith = ProductSearchFacetDistinctStartsWith.builder()
 *             .value("{value}")
 *             .caseInsensitive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetDistinctStartsWithBuilder implements Builder<ProductSearchFacetDistinctStartsWith> {

    private String value;

    private Boolean caseInsensitive;

    /**
     *  <p>Text to match against the start of the target value.</p>
     * @param value value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctStartsWithBuilder value(final String value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>If <code>true</code>, the <code>value</code> is not case sensitive.</p>
     * @param caseInsensitive value to be set
     * @return Builder
     */

    public ProductSearchFacetDistinctStartsWithBuilder caseInsensitive(final Boolean caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
        return this;
    }

    /**
     *  <p>Text to match against the start of the target value.</p>
     * @return value
     */

    public String getValue() {
        return this.value;
    }

    /**
     *  <p>If <code>true</code>, the <code>value</code> is not case sensitive.</p>
     * @return caseInsensitive
     */

    public Boolean getCaseInsensitive() {
        return this.caseInsensitive;
    }

    /**
     * builds ProductSearchFacetDistinctStartsWith with checking for non-null required values
     * @return ProductSearchFacetDistinctStartsWith
     */
    public ProductSearchFacetDistinctStartsWith build() {
        Objects.requireNonNull(value, ProductSearchFacetDistinctStartsWith.class + ": value is missing");
        Objects.requireNonNull(caseInsensitive,
            ProductSearchFacetDistinctStartsWith.class + ": caseInsensitive is missing");
        return new ProductSearchFacetDistinctStartsWithImpl(value, caseInsensitive);
    }

    /**
     * builds ProductSearchFacetDistinctStartsWith without checking for non-null required values
     * @return ProductSearchFacetDistinctStartsWith
     */
    public ProductSearchFacetDistinctStartsWith buildUnchecked() {
        return new ProductSearchFacetDistinctStartsWithImpl(value, caseInsensitive);
    }

    /**
     * factory method for an instance of ProductSearchFacetDistinctStartsWithBuilder
     * @return builder
     */
    public static ProductSearchFacetDistinctStartsWithBuilder of() {
        return new ProductSearchFacetDistinctStartsWithBuilder();
    }

    /**
     * create builder for ProductSearchFacetDistinctStartsWith instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetDistinctStartsWithBuilder of(final ProductSearchFacetDistinctStartsWith template) {
        ProductSearchFacetDistinctStartsWithBuilder builder = new ProductSearchFacetDistinctStartsWithBuilder();
        builder.value = template.getValue();
        builder.caseInsensitive = template.getCaseInsensitive();
        return builder;
    }

}
