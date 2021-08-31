
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeCountBuilder implements Builder<AttributeCount> {

    private Integer productTypeAttributes;

    private Integer variantAttributes;

    private Integer missingAttributeValues;

    public AttributeCountBuilder productTypeAttributes(final Integer productTypeAttributes) {
        this.productTypeAttributes = productTypeAttributes;
        return this;
    }

    public AttributeCountBuilder variantAttributes(final Integer variantAttributes) {
        this.variantAttributes = variantAttributes;
        return this;
    }

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
