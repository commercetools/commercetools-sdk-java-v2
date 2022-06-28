
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeLabelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeLabelAction productTypeChangeLabelAction = ProductTypeChangeLabelAction.builder()
 *             .attributeName("{attributeName}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeLabelActionBuilder implements Builder<ProductTypeChangeLabelAction> {

    private String attributeName;

    private com.commercetools.api.models.common.LocalizedString label;

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */

    public ProductTypeChangeLabelActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public ProductTypeChangeLabelActionBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public ProductTypeChangeLabelActionBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public ProductTypeChangeLabelAction build() {
        Objects.requireNonNull(attributeName, ProductTypeChangeLabelAction.class + ": attributeName is missing");
        Objects.requireNonNull(label, ProductTypeChangeLabelAction.class + ": label is missing");
        return new ProductTypeChangeLabelActionImpl(attributeName, label);
    }

    /**
     * builds ProductTypeChangeLabelAction without checking for non null required values
     */
    public ProductTypeChangeLabelAction buildUnchecked() {
        return new ProductTypeChangeLabelActionImpl(attributeName, label);
    }

    public static ProductTypeChangeLabelActionBuilder of() {
        return new ProductTypeChangeLabelActionBuilder();
    }

    public static ProductTypeChangeLabelActionBuilder of(final ProductTypeChangeLabelAction template) {
        ProductTypeChangeLabelActionBuilder builder = new ProductTypeChangeLabelActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.label = template.getLabel();
        return builder;
    }

}
