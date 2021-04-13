
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeCountImpl implements AttributeCount {

    private Integer productTypeAttributes;

    private Integer variantAttributes;

    private Integer missingAttributeValues;

    @JsonCreator
    AttributeCountImpl(@JsonProperty("productTypeAttributes") final Integer productTypeAttributes,
            @JsonProperty("variantAttributes") final Integer variantAttributes,
            @JsonProperty("missingAttributeValues") final Integer missingAttributeValues) {
        this.productTypeAttributes = productTypeAttributes;
        this.variantAttributes = variantAttributes;
        this.missingAttributeValues = missingAttributeValues;
    }

    public AttributeCountImpl() {
    }

    /**
    *  <p>Number of attributes defined in the product type.</p>
    */
    public Integer getProductTypeAttributes() {
        return this.productTypeAttributes;
    }

    /**
    *  <p>Number of attributes defined in the variant.</p>
    */
    public Integer getVariantAttributes() {
        return this.variantAttributes;
    }

    /**
    *  <p>Number of attributes missing values in the variant.</p>
    */
    public Integer getMissingAttributeValues() {
        return this.missingAttributeValues;
    }

    public void setProductTypeAttributes(final Integer productTypeAttributes) {
        this.productTypeAttributes = productTypeAttributes;
    }

    public void setVariantAttributes(final Integer variantAttributes) {
        this.variantAttributes = variantAttributes;
    }

    public void setMissingAttributeValues(final Integer missingAttributeValues) {
        this.missingAttributeValues = missingAttributeValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributeCountImpl that = (AttributeCountImpl) o;

        return new EqualsBuilder().append(productTypeAttributes, that.productTypeAttributes)
                .append(variantAttributes, that.variantAttributes)
                .append(missingAttributeValues, that.missingAttributeValues)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productTypeAttributes)
                .append(variantAttributes)
                .append(missingAttributeValues)
                .toHashCode();
    }

}
