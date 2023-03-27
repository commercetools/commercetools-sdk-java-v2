
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeAttributeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeAttributeNameAction productTypeChangeAttributeNameAction = ProductTypeChangeAttributeNameAction.builder()
 *             .attributeName("{attributeName}")
 *             .newAttributeName("{newAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeAttributeNameActionBuilder implements Builder<ProductTypeChangeAttributeNameAction> {

    private String attributeName;

    private String newAttributeName;

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ProductTypeChangeAttributeNameActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>New user-defined name of the Attribute that is unique with the Project.</p>
     *  <p>When using the same <code>name</code> for an Attribute in two or more ProductTypes, all fields of the AttributeDefinition of this Attribute must be the same across the ProductTypes. If not, an AttributeDefinitionAlreadyExists error is returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
     * @param newAttributeName value to be set
     * @return Builder
     */

    public ProductTypeChangeAttributeNameActionBuilder newAttributeName(final String newAttributeName) {
        this.newAttributeName = newAttributeName;
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
     *  <p>New user-defined name of the Attribute that is unique with the Project.</p>
     *  <p>When using the same <code>name</code> for an Attribute in two or more ProductTypes, all fields of the AttributeDefinition of this Attribute must be the same across the ProductTypes. If not, an AttributeDefinitionAlreadyExists error is returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
     * @return newAttributeName
     */

    public String getNewAttributeName() {
        return this.newAttributeName;
    }

    /**
     * builds ProductTypeChangeAttributeNameAction with checking for non-null required values
     * @return ProductTypeChangeAttributeNameAction
     */
    public ProductTypeChangeAttributeNameAction build() {
        Objects.requireNonNull(attributeName,
            ProductTypeChangeAttributeNameAction.class + ": attributeName is missing");
        Objects.requireNonNull(newAttributeName,
            ProductTypeChangeAttributeNameAction.class + ": newAttributeName is missing");
        return new ProductTypeChangeAttributeNameActionImpl(attributeName, newAttributeName);
    }

    /**
     * builds ProductTypeChangeAttributeNameAction without checking for non-null required values
     * @return ProductTypeChangeAttributeNameAction
     */
    public ProductTypeChangeAttributeNameAction buildUnchecked() {
        return new ProductTypeChangeAttributeNameActionImpl(attributeName, newAttributeName);
    }

    /**
     * factory method for an instance of ProductTypeChangeAttributeNameActionBuilder
     * @return builder
     */
    public static ProductTypeChangeAttributeNameActionBuilder of() {
        return new ProductTypeChangeAttributeNameActionBuilder();
    }

    /**
     * create builder for ProductTypeChangeAttributeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeAttributeNameActionBuilder of(final ProductTypeChangeAttributeNameAction template) {
        ProductTypeChangeAttributeNameActionBuilder builder = new ProductTypeChangeAttributeNameActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newAttributeName = template.getNewAttributeName();
        return builder;
    }

}
