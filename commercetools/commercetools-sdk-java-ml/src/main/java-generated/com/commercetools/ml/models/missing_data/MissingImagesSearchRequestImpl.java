
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
public class MissingImagesSearchRequestImpl implements MissingImagesSearchRequest, ModelBase {

    private Long limit;

    private Long offset;

    private Boolean staged;

    private Long productSetLimit;

    private Boolean includeVariants;

    private Boolean autoThreshold;

    private Long threshold;

    private java.util.List<String> productIds;

    private java.util.List<String> productTypeIds;

    @JsonCreator
    MissingImagesSearchRequestImpl(@JsonProperty("limit") final Long limit, @JsonProperty("offset") final Long offset,
            @JsonProperty("staged") final Boolean staged, @JsonProperty("productSetLimit") final Long productSetLimit,
            @JsonProperty("includeVariants") final Boolean includeVariants,
            @JsonProperty("autoThreshold") final Boolean autoThreshold, @JsonProperty("threshold") final Long threshold,
            @JsonProperty("productIds") final java.util.List<String> productIds,
            @JsonProperty("productTypeIds") final java.util.List<String> productTypeIds) {
        this.limit = limit;
        this.offset = offset;
        this.staged = staged;
        this.productSetLimit = productSetLimit;
        this.includeVariants = includeVariants;
        this.autoThreshold = autoThreshold;
        this.threshold = threshold;
        this.productIds = productIds;
        this.productTypeIds = productTypeIds;
    }

    public MissingImagesSearchRequestImpl() {
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getOffset() {
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
    public Long getProductSetLimit() {
        return this.productSetLimit;
    }

    /**
    *  <p>If true, searches all product variants. If false, only searches master variants.</p>
    */
    public Boolean getIncludeVariants() {
        return this.includeVariants;
    }

    /**
    *  <p>If true, uses the median number of images per product variant as a threshold value.</p>
    */
    public Boolean getAutoThreshold() {
        return this.autoThreshold;
    }

    /**
    *  <p>The minimum number of images a product variant must have. Anything below this value is considered a product variant with missing images.</p>
    */
    public Long getThreshold() {
        return this.threshold;
    }

    /**
    *  <p>Filters results by the provided Product IDs. Cannot be applied in combination with any other filter.</p>
    */
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    /**
    *  <p>Filters results by the provided product type IDs. It cannot be applied in combination with any other filter.</p>
    */
    public java.util.List<String> getProductTypeIds() {
        return this.productTypeIds;
    }

    public void setLimit(final Long limit) {
        this.limit = limit;
    }

    public void setOffset(final Long offset) {
        this.offset = offset;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setProductSetLimit(final Long productSetLimit) {
        this.productSetLimit = productSetLimit;
    }

    public void setIncludeVariants(final Boolean includeVariants) {
        this.includeVariants = includeVariants;
    }

    public void setAutoThreshold(final Boolean autoThreshold) {
        this.autoThreshold = autoThreshold;
    }

    public void setThreshold(final Long threshold) {
        this.threshold = threshold;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingImagesSearchRequestImpl that = (MissingImagesSearchRequestImpl) o;

        return new EqualsBuilder().append(limit, that.limit)
                .append(offset, that.offset)
                .append(staged, that.staged)
                .append(productSetLimit, that.productSetLimit)
                .append(includeVariants, that.includeVariants)
                .append(autoThreshold, that.autoThreshold)
                .append(threshold, that.threshold)
                .append(productIds, that.productIds)
                .append(productTypeIds, that.productTypeIds)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(limit)
                .append(offset)
                .append(staged)
                .append(productSetLimit)
                .append(includeVariants)
                .append(autoThreshold)
                .append(threshold)
                .append(productIds)
                .append(productTypeIds)
                .toHashCode();
    }

}
