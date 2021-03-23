
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
public final class MissingAttributesSearchRequestImpl implements MissingAttributesSearchRequest {

    private Integer limit;

    private Integer offset;

    private Boolean staged;

    private Integer productSetLimit;

    private Boolean includeVariants;

    private Double coverageMin;

    private Double coverageMax;

    private String sortBy;

    private Boolean showMissingAttributeNames;

    private java.util.List<String> productIds;

    private java.util.List<String> productTypeIds;

    private String attributeName;

    @JsonCreator
    MissingAttributesSearchRequestImpl(@JsonProperty("limit") final Integer limit,
            @JsonProperty("offset") final Integer offset, @JsonProperty("staged") final Boolean staged,
            @JsonProperty("productSetLimit") final Integer productSetLimit,
            @JsonProperty("includeVariants") final Boolean includeVariants,
            @JsonProperty("coverageMin") final Double coverageMin,
            @JsonProperty("coverageMax") final Double coverageMax, @JsonProperty("sortBy") final String sortBy,
            @JsonProperty("showMissingAttributeNames") final Boolean showMissingAttributeNames,
            @JsonProperty("productIds") final java.util.List<String> productIds,
            @JsonProperty("productTypeIds") final java.util.List<String> productTypeIds,
            @JsonProperty("attributeName") final String attributeName) {
        this.limit = limit;
        this.offset = offset;
        this.staged = staged;
        this.productSetLimit = productSetLimit;
        this.includeVariants = includeVariants;
        this.coverageMin = coverageMin;
        this.coverageMax = coverageMax;
        this.sortBy = sortBy;
        this.showMissingAttributeNames = showMissingAttributeNames;
        this.productIds = productIds;
        this.productTypeIds = productTypeIds;
        this.attributeName = attributeName;
    }

    public MissingAttributesSearchRequestImpl() {
    }

    public Integer getLimit() {
        return this.limit;
    }

    public Integer getOffset() {
        return this.offset;
    }

    /**
    *  <p>If true, searches data from staged products in addition to published products.</p>
    */
    public Boolean getStaged() {
        return this.staged;
    }

    /**
    *  <p>Maximum number of products to scan.</p>
    */
    public Integer getProductSetLimit() {
        return this.productSetLimit;
    }

    /**
    *  <p>If true, searches all product variants. If false, only searches master variants.</p>
    */
    public Boolean getIncludeVariants() {
        return this.includeVariants;
    }

    /**
    *  <p>Minimum attribute coverage of variants to display, applied to both coverage types.</p>
    */
    public Double getCoverageMin() {
        return this.coverageMin;
    }

    /**
    *  <p>Maximum attribute coverage of variants to display, applied to both coverage types.</p>
    */
    public Double getCoverageMax() {
        return this.coverageMax;
    }

    /**
    *  <p>Default value: <code>coverageAttributeValues</code> - Allowed values: [<code>coverageAttributeValues</code>, <code>coverageAttributeNames</code>]
    *  <code>coverageAttributeValues</code> shows the product variants with the most missing attribute values first and <code>coverageAttributeNames</code> the ones with the most missing attribute names.</p>
    */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
    *  <p>If true, the <code>missingAttributeNames</code> will be included in the results.</p>
    */
    public Boolean getShowMissingAttributeNames() {
        return this.showMissingAttributeNames;
    }

    /**
    *  <p>Filters results by the provided Product IDs.
    *  Cannot be applied in combination with any other filter.</p>
    */
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    /**
    *  <p>Filters results by the provided product type IDs.
    *  Cannot be applied in combination with any other filter.</p>
    */
    public java.util.List<String> getProductTypeIds() {
        return this.productTypeIds;
    }

    /**
    *  <p>Filters results by the provided attribute name. If provided,  products are only checked for this attribute. Therefore, only products of product types which define the attribute name are considered. These product type IDs
    *  are then listed in <code>MissingAttributesMeta</code>. The  <code>attributeCount</code> and <code>attributeCoverage</code> fields are not part of the response when using this filter. Cannot be applied in combination with any other filter.</p>
    */
    public String getAttributeName() {
        return this.attributeName;
    }

    public void setLimit(final Integer limit) {
        this.limit = limit;
    }

    public void setOffset(final Integer offset) {
        this.offset = offset;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setProductSetLimit(final Integer productSetLimit) {
        this.productSetLimit = productSetLimit;
    }

    public void setIncludeVariants(final Boolean includeVariants) {
        this.includeVariants = includeVariants;
    }

    public void setCoverageMin(final Double coverageMin) {
        this.coverageMin = coverageMin;
    }

    public void setCoverageMax(final Double coverageMax) {
        this.coverageMax = coverageMax;
    }

    public void setSortBy(final String sortBy) {
        this.sortBy = sortBy;
    }

    public void setShowMissingAttributeNames(final Boolean showMissingAttributeNames) {
        this.showMissingAttributeNames = showMissingAttributeNames;
    }

    public void setProductIds(final String... productIds) {
        this.productIds = new ArrayList<>(Arrays.asList(productIds));
    }

    public void setProductIds(final java.util.List<String> productIds) {
        this.productIds = productIds;
    }

    public void setProductTypeIds(final String... productTypeIds) {
        this.productTypeIds = new ArrayList<>(Arrays.asList(productTypeIds));
    }

    public void setProductTypeIds(final java.util.List<String> productTypeIds) {
        this.productTypeIds = productTypeIds;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingAttributesSearchRequestImpl that = (MissingAttributesSearchRequestImpl) o;

        return new EqualsBuilder().append(limit, that.limit)
                .append(offset, that.offset)
                .append(staged, that.staged)
                .append(productSetLimit, that.productSetLimit)
                .append(includeVariants, that.includeVariants)
                .append(coverageMin, that.coverageMin)
                .append(coverageMax, that.coverageMax)
                .append(sortBy, that.sortBy)
                .append(showMissingAttributeNames, that.showMissingAttributeNames)
                .append(productIds, that.productIds)
                .append(productTypeIds, that.productTypeIds)
                .append(attributeName, that.attributeName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(limit)
                .append(offset)
                .append(staged)
                .append(productSetLimit)
                .append(includeVariants)
                .append(coverageMin)
                .append(coverageMax)
                .append(sortBy)
                .append(showMissingAttributeNames)
                .append(productIds)
                .append(productTypeIds)
                .append(attributeName)
                .toHashCode();
    }

}
