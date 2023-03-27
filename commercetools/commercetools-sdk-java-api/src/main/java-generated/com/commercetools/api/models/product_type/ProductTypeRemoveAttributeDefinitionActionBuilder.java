
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeRemoveAttributeDefinitionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeRemoveAttributeDefinitionAction productTypeRemoveAttributeDefinitionAction = ProductTypeRemoveAttributeDefinitionAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeRemoveAttributeDefinitionActionBuilder
        implements Builder<ProductTypeRemoveAttributeDefinitionAction> {

    private String name;

    /**
     *  <p>Name of the Attribute to remove.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductTypeRemoveAttributeDefinitionActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Name of the Attribute to remove.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds ProductTypeRemoveAttributeDefinitionAction with checking for non-null required values
     * @return ProductTypeRemoveAttributeDefinitionAction
     */
    public ProductTypeRemoveAttributeDefinitionAction build() {
        Objects.requireNonNull(name, ProductTypeRemoveAttributeDefinitionAction.class + ": name is missing");
        return new ProductTypeRemoveAttributeDefinitionActionImpl(name);
    }

    /**
     * builds ProductTypeRemoveAttributeDefinitionAction without checking for non-null required values
     * @return ProductTypeRemoveAttributeDefinitionAction
     */
    public ProductTypeRemoveAttributeDefinitionAction buildUnchecked() {
        return new ProductTypeRemoveAttributeDefinitionActionImpl(name);
    }

    /**
     * factory method for an instance of ProductTypeRemoveAttributeDefinitionActionBuilder
     * @return builder
     */
    public static ProductTypeRemoveAttributeDefinitionActionBuilder of() {
        return new ProductTypeRemoveAttributeDefinitionActionBuilder();
    }

    /**
     * create builder for ProductTypeRemoveAttributeDefinitionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeRemoveAttributeDefinitionActionBuilder of(
            final ProductTypeRemoveAttributeDefinitionAction template) {
        ProductTypeRemoveAttributeDefinitionActionBuilder builder = new ProductTypeRemoveAttributeDefinitionActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
