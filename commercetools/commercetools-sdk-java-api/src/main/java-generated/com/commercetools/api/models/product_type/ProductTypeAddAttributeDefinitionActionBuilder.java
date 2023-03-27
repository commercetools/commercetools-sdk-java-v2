
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeAddAttributeDefinitionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeAddAttributeDefinitionAction productTypeAddAttributeDefinitionAction = ProductTypeAddAttributeDefinitionAction.builder()
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeAddAttributeDefinitionActionBuilder
        implements Builder<ProductTypeAddAttributeDefinitionAction> {

    private com.commercetools.api.models.product_type.AttributeDefinitionDraft attribute;

    /**
     *  <p>Value to append to <code>attributes</code>.</p>
     * @param builder function to build the attribute value
     * @return Builder
     */

    public ProductTypeAddAttributeDefinitionActionBuilder attribute(
            Function<com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder, com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder> builder) {
        this.attribute = builder.apply(com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to append to <code>attributes</code>.</p>
     * @param attribute value to be set
     * @return Builder
     */

    public ProductTypeAddAttributeDefinitionActionBuilder attribute(
            final com.commercetools.api.models.product_type.AttributeDefinitionDraft attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     *  <p>Value to append to <code>attributes</code>.</p>
     * @return attribute
     */

    public com.commercetools.api.models.product_type.AttributeDefinitionDraft getAttribute() {
        return this.attribute;
    }

    /**
     * builds ProductTypeAddAttributeDefinitionAction with checking for non-null required values
     * @return ProductTypeAddAttributeDefinitionAction
     */
    public ProductTypeAddAttributeDefinitionAction build() {
        Objects.requireNonNull(attribute, ProductTypeAddAttributeDefinitionAction.class + ": attribute is missing");
        return new ProductTypeAddAttributeDefinitionActionImpl(attribute);
    }

    /**
     * builds ProductTypeAddAttributeDefinitionAction without checking for non-null required values
     * @return ProductTypeAddAttributeDefinitionAction
     */
    public ProductTypeAddAttributeDefinitionAction buildUnchecked() {
        return new ProductTypeAddAttributeDefinitionActionImpl(attribute);
    }

    /**
     * factory method for an instance of ProductTypeAddAttributeDefinitionActionBuilder
     * @return builder
     */
    public static ProductTypeAddAttributeDefinitionActionBuilder of() {
        return new ProductTypeAddAttributeDefinitionActionBuilder();
    }

    /**
     * create builder for ProductTypeAddAttributeDefinitionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeAddAttributeDefinitionActionBuilder of(
            final ProductTypeAddAttributeDefinitionAction template) {
        ProductTypeAddAttributeDefinitionActionBuilder builder = new ProductTypeAddAttributeDefinitionActionBuilder();
        builder.attribute = template.getAttribute();
        return builder;
    }

}
