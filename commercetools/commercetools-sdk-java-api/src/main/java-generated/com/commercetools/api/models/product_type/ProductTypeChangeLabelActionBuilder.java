
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
     * @param attributeName value to be set
     * @return Builder
     */

    public ProductTypeChangeLabelActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public ProductTypeChangeLabelActionBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public ProductTypeChangeLabelActionBuilder withLabel(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param label value to be set
     * @return Builder
     */

    public ProductTypeChangeLabelActionBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
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
     *  <p>New value to set. Must not be empty.</p>
     * @return label
     */

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     * builds ProductTypeChangeLabelAction with checking for non-null required values
     * @return ProductTypeChangeLabelAction
     */
    public ProductTypeChangeLabelAction build() {
        Objects.requireNonNull(attributeName, ProductTypeChangeLabelAction.class + ": attributeName is missing");
        Objects.requireNonNull(label, ProductTypeChangeLabelAction.class + ": label is missing");
        return new ProductTypeChangeLabelActionImpl(attributeName, label);
    }

    /**
     * builds ProductTypeChangeLabelAction without checking for non-null required values
     * @return ProductTypeChangeLabelAction
     */
    public ProductTypeChangeLabelAction buildUnchecked() {
        return new ProductTypeChangeLabelActionImpl(attributeName, label);
    }

    /**
     * factory method for an instance of ProductTypeChangeLabelActionBuilder
     * @return builder
     */
    public static ProductTypeChangeLabelActionBuilder of() {
        return new ProductTypeChangeLabelActionBuilder();
    }

    /**
     * create builder for ProductTypeChangeLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeLabelActionBuilder of(final ProductTypeChangeLabelAction template) {
        ProductTypeChangeLabelActionBuilder builder = new ProductTypeChangeLabelActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.label = template.getLabel();
        return builder;
    }

}
