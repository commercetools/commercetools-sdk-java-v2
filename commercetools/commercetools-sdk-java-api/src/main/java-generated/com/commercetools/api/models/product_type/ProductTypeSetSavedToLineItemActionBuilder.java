
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeSetSavedToLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeSetSavedToLineItemAction productTypeSetSavedToLineItemAction = ProductTypeSetSavedToLineItemAction.builder()
 *             .attributeName("{attributeName}")
 *             .savedToLineItem(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeSetSavedToLineItemActionBuilder implements Builder<ProductTypeSetSavedToLineItemAction> {

    private String attributeName;

    private Boolean savedToLineItem;

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ProductTypeSetSavedToLineItemActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>Whether the Attribute value is copied onto a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> when the Product is added to a Cart. See <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> for details.</p>
     *  <p>It has no effect if the Attribute already has the given value.</p>
     * @param savedToLineItem value to be set
     * @return Builder
     */

    public ProductTypeSetSavedToLineItemActionBuilder savedToLineItem(final Boolean savedToLineItem) {
        this.savedToLineItem = savedToLineItem;
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
     *  <p>Whether the Attribute value is copied onto a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> when the Product is added to a Cart. See <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> for details.</p>
     *  <p>It has no effect if the Attribute already has the given value.</p>
     * @return savedToLineItem
     */

    public Boolean getSavedToLineItem() {
        return this.savedToLineItem;
    }

    /**
     * builds ProductTypeSetSavedToLineItemAction with checking for non-null required values
     * @return ProductTypeSetSavedToLineItemAction
     */
    public ProductTypeSetSavedToLineItemAction build() {
        Objects.requireNonNull(attributeName, ProductTypeSetSavedToLineItemAction.class + ": attributeName is missing");
        Objects.requireNonNull(savedToLineItem,
            ProductTypeSetSavedToLineItemAction.class + ": savedToLineItem is missing");
        return new ProductTypeSetSavedToLineItemActionImpl(attributeName, savedToLineItem);
    }

    /**
     * builds ProductTypeSetSavedToLineItemAction without checking for non-null required values
     * @return ProductTypeSetSavedToLineItemAction
     */
    public ProductTypeSetSavedToLineItemAction buildUnchecked() {
        return new ProductTypeSetSavedToLineItemActionImpl(attributeName, savedToLineItem);
    }

    /**
     * factory method for an instance of ProductTypeSetSavedToLineItemActionBuilder
     * @return builder
     */
    public static ProductTypeSetSavedToLineItemActionBuilder of() {
        return new ProductTypeSetSavedToLineItemActionBuilder();
    }

    /**
     * create builder for ProductTypeSetSavedToLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeSetSavedToLineItemActionBuilder of(final ProductTypeSetSavedToLineItemAction template) {
        ProductTypeSetSavedToLineItemActionBuilder builder = new ProductTypeSetSavedToLineItemActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.savedToLineItem = template.getSavedToLineItem();
        return builder;
    }

}
