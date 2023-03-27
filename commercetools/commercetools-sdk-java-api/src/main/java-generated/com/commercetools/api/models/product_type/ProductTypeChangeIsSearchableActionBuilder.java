
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeIsSearchableActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeIsSearchableAction productTypeChangeIsSearchableAction = ProductTypeChangeIsSearchableAction.builder()
 *             .attributeName("{attributeName}")
 *             .isSearchable(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeIsSearchableActionBuilder implements Builder<ProductTypeChangeIsSearchableAction> {

    private String attributeName;

    private Boolean isSearchable;

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ProductTypeChangeIsSearchableActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>Determines whether the Attribute's values can be used in full-text search queries, filters, and facets. See AttributeDefinition for details.</p>
     * @param isSearchable value to be set
     * @return Builder
     */

    public ProductTypeChangeIsSearchableActionBuilder isSearchable(final Boolean isSearchable) {
        this.isSearchable = isSearchable;
        return this;
    }

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     *  <p>Determines whether the Attribute's values can be used in full-text search queries, filters, and facets. See AttributeDefinition for details.</p>
     * @return isSearchable
     */

    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    /**
     * builds ProductTypeChangeIsSearchableAction with checking for non-null required values
     * @return ProductTypeChangeIsSearchableAction
     */
    public ProductTypeChangeIsSearchableAction build() {
        Objects.requireNonNull(attributeName, ProductTypeChangeIsSearchableAction.class + ": attributeName is missing");
        Objects.requireNonNull(isSearchable, ProductTypeChangeIsSearchableAction.class + ": isSearchable is missing");
        return new ProductTypeChangeIsSearchableActionImpl(attributeName, isSearchable);
    }

    /**
     * builds ProductTypeChangeIsSearchableAction without checking for non-null required values
     * @return ProductTypeChangeIsSearchableAction
     */
    public ProductTypeChangeIsSearchableAction buildUnchecked() {
        return new ProductTypeChangeIsSearchableActionImpl(attributeName, isSearchable);
    }

    /**
     * factory method for an instance of ProductTypeChangeIsSearchableActionBuilder
     * @return builder
     */
    public static ProductTypeChangeIsSearchableActionBuilder of() {
        return new ProductTypeChangeIsSearchableActionBuilder();
    }

    /**
     * create builder for ProductTypeChangeIsSearchableAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeIsSearchableActionBuilder of(final ProductTypeChangeIsSearchableAction template) {
        ProductTypeChangeIsSearchableActionBuilder builder = new ProductTypeChangeIsSearchableActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.isSearchable = template.getIsSearchable();
        return builder;
    }

}
