
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
     */

    public ProductTypeChangeAttributeNameActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>New user-defined name of the Attribute that is unique with the Project. When using the same <code>name</code> for an Attribute in two or more ProductTypes all fields of the AttributeDefinition of this Attribute need to be the same across the ProductTypes, otherwise an AttributeDefinitionAlreadyExistsError will be returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
     */

    public ProductTypeChangeAttributeNameActionBuilder newAttributeName(final String newAttributeName) {
        this.newAttributeName = newAttributeName;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getNewAttributeName() {
        return this.newAttributeName;
    }

    public ProductTypeChangeAttributeNameAction build() {
        Objects.requireNonNull(attributeName,
            ProductTypeChangeAttributeNameAction.class + ": attributeName is missing");
        Objects.requireNonNull(newAttributeName,
            ProductTypeChangeAttributeNameAction.class + ": newAttributeName is missing");
        return new ProductTypeChangeAttributeNameActionImpl(attributeName, newAttributeName);
    }

    /**
     * builds ProductTypeChangeAttributeNameAction without checking for non null required values
     */
    public ProductTypeChangeAttributeNameAction buildUnchecked() {
        return new ProductTypeChangeAttributeNameActionImpl(attributeName, newAttributeName);
    }

    public static ProductTypeChangeAttributeNameActionBuilder of() {
        return new ProductTypeChangeAttributeNameActionBuilder();
    }

    public static ProductTypeChangeAttributeNameActionBuilder of(final ProductTypeChangeAttributeNameAction template) {
        ProductTypeChangeAttributeNameActionBuilder builder = new ProductTypeChangeAttributeNameActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newAttributeName = template.getNewAttributeName();
        return builder;
    }

}
