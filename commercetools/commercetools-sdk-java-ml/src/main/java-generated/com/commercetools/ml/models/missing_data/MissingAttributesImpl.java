
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MissingAttributesImpl implements MissingAttributes, ModelBase {

    private com.commercetools.ml.models.common.ProductReference product;

    private com.commercetools.ml.models.common.ProductTypeReference productType;

    private Integer variantId;

    private java.util.List<String> missingAttributeValues;

    private java.util.List<String> missingAttributeNames;

    private com.commercetools.ml.models.missing_data.AttributeCount attributeCount;

    private com.commercetools.ml.models.missing_data.AttributeCoverage attributeCoverage;

    @JsonCreator
    MissingAttributesImpl(@JsonProperty("product") final com.commercetools.ml.models.common.ProductReference product,
            @JsonProperty("productType") final com.commercetools.ml.models.common.ProductTypeReference productType,
            @JsonProperty("variantId") final Integer variantId,
            @JsonProperty("missingAttributeValues") final java.util.List<String> missingAttributeValues,
            @JsonProperty("missingAttributeNames") final java.util.List<String> missingAttributeNames,
            @JsonProperty("attributeCount") final com.commercetools.ml.models.missing_data.AttributeCount attributeCount,
            @JsonProperty("attributeCoverage") final com.commercetools.ml.models.missing_data.AttributeCoverage attributeCoverage) {
        this.product = product;
        this.productType = productType;
        this.variantId = variantId;
        this.missingAttributeValues = missingAttributeValues;
        this.missingAttributeNames = missingAttributeNames;
        this.attributeCount = attributeCount;
        this.attributeCoverage = attributeCoverage;
    }

    public MissingAttributesImpl() {
    }

    public com.commercetools.ml.models.common.ProductReference getProduct() {
        return this.product;
    }

    public com.commercetools.ml.models.common.ProductTypeReference getProductType() {
        return this.productType;
    }

    /**
    *  <p>ID of a ProductVariant.</p>
    */
    public Integer getVariantId() {
        return this.variantId;
    }

    /**
    *  <p>The names of the attributes of the product type that the variant is missing, sorted by attribute importance in descending order.</p>
    */
    public java.util.List<String> getMissingAttributeValues() {
        return this.missingAttributeValues;
    }

    /**
    *  <p>The names of the attributes of the product type that the variant is missing, sorted by attribute importance in descending order.</p>
    */
    public java.util.List<String> getMissingAttributeNames() {
        return this.missingAttributeNames;
    }

    public com.commercetools.ml.models.missing_data.AttributeCount getAttributeCount() {
        return this.attributeCount;
    }

    public com.commercetools.ml.models.missing_data.AttributeCoverage getAttributeCoverage() {
        return this.attributeCoverage;
    }

    public void setProduct(final com.commercetools.ml.models.common.ProductReference product) {
        this.product = product;
    }

    public void setProductType(final com.commercetools.ml.models.common.ProductTypeReference productType) {
        this.productType = productType;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    public void setMissingAttributeValues(final String... missingAttributeValues) {
        this.missingAttributeValues = new ArrayList<>(Arrays.asList(missingAttributeValues));
    }

    public void setMissingAttributeValues(final java.util.List<String> missingAttributeValues) {
        this.missingAttributeValues = missingAttributeValues;
    }

    public void setMissingAttributeNames(final String... missingAttributeNames) {
        this.missingAttributeNames = new ArrayList<>(Arrays.asList(missingAttributeNames));
    }

    public void setMissingAttributeNames(final java.util.List<String> missingAttributeNames) {
        this.missingAttributeNames = missingAttributeNames;
    }

    public void setAttributeCount(final com.commercetools.ml.models.missing_data.AttributeCount attributeCount) {
        this.attributeCount = attributeCount;
    }

    public void setAttributeCoverage(
            final com.commercetools.ml.models.missing_data.AttributeCoverage attributeCoverage) {
        this.attributeCoverage = attributeCoverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingAttributesImpl that = (MissingAttributesImpl) o;

        return new EqualsBuilder().append(product, that.product)
                .append(productType, that.productType)
                .append(variantId, that.variantId)
                .append(missingAttributeValues, that.missingAttributeValues)
                .append(missingAttributeNames, that.missingAttributeNames)
                .append(attributeCount, that.attributeCount)
                .append(attributeCoverage, that.attributeCoverage)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(product)
                .append(productType)
                .append(variantId)
                .append(missingAttributeValues)
                .append(missingAttributeNames)
                .append(attributeCount)
                .append(attributeCoverage)
                .toHashCode();
    }

}
