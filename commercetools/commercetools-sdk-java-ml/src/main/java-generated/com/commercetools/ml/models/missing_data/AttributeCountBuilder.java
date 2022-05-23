
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeCountBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeCount attributeCount = AttributeCount.builder()
 *             .productTypeAttributes(0.3)
 *             .variantAttributes(0.3)
 *             .missingAttributeValues(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeCountBuilder implements Builder<AttributeCount> {

    private Integer productTypeAttributes;

    private Integer variantAttributes;

    private Integer missingAttributeValues;

    /**
     <*  <p>Number of attributes defined in the product type.</p>>
     */

    public AttributeCountBuilder productTypeAttributes(final Integer productTypeAttributes) {
        this.productTypeAttributes = productTypeAttributes;
        return this;
    }

    /**
     <*  <p>Number of attributes defined in the variant.</p>>
     */

    public AttributeCountBuilder variantAttributes(final Integer variantAttributes) {
        this.variantAttributes = variantAttributes;
        return this;
    }

    /**
     <*  <p>Number of attributes missing values in the variant.</p>>
     */

    public AttributeCountBuilder missingAttributeValues(final Integer missingAttributeValues) {
        this.missingAttributeValues = missingAttributeValues;
        return this;
    }

    public Integer getProductTypeAttributes() {
        return this.productTypeAttributes;
    }

    public Integer getVariantAttributes() {
        return this.variantAttributes;
    }

    public Integer getMissingAttributeValues() {
        return this.missingAttributeValues;
    }

    public AttributeCount build() {
        Objects.requireNonNull(productTypeAttributes, AttributeCount.class + ": productTypeAttributes is missing");
        Objects.requireNonNull(variantAttributes, AttributeCount.class + ": variantAttributes is missing");
        Objects.requireNonNull(missingAttributeValues, AttributeCount.class + ": missingAttributeValues is missing");
        return new AttributeCountImpl(productTypeAttributes, variantAttributes, missingAttributeValues);
    }

    /**
     * builds AttributeCount without checking for non null required values
     */
    public AttributeCount buildUnchecked() {
        return new AttributeCountImpl(productTypeAttributes, variantAttributes, missingAttributeValues);
    }

    public static AttributeCountBuilder of() {
        return new AttributeCountBuilder();
    }

    public static AttributeCountBuilder of(final AttributeCount template) {
        AttributeCountBuilder builder = new AttributeCountBuilder();
        builder.productTypeAttributes = template.getProductTypeAttributes();
        builder.variantAttributes = template.getVariantAttributes();
        builder.missingAttributeValues = template.getMissingAttributeValues();
        return builder;
    }

}
