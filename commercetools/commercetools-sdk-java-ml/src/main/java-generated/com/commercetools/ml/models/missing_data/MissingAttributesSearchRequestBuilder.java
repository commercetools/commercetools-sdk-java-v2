
package com.commercetools.ml.models.missing_data;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingAttributesSearchRequestBuilder implements Builder<MissingAttributesSearchRequest> {

    @Nullable
    private Integer limit;

    @Nullable
    private Integer offset;

    @Nullable
    private Boolean staged;

    @Nullable
    private Integer productSetLimit;

    @Nullable
    private Boolean includeVariants;

    @Nullable
    private Double coverageMin;

    @Nullable
    private Double coverageMax;

    @Nullable
    private String sortBy;

    @Nullable
    private Boolean showMissingAttributeNames;

    @Nullable
    private java.util.List<String> productIds;

    @Nullable
    private java.util.List<String> productTypeIds;

    @Nullable
    private String attributeName;

    public MissingAttributesSearchRequestBuilder limit(@Nullable final Integer limit) {
        this.limit = limit;
        return this;
    }

    public MissingAttributesSearchRequestBuilder offset(@Nullable final Integer offset) {
        this.offset = offset;
        return this;
    }

    public MissingAttributesSearchRequestBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public MissingAttributesSearchRequestBuilder productSetLimit(@Nullable final Integer productSetLimit) {
        this.productSetLimit = productSetLimit;
        return this;
    }

    public MissingAttributesSearchRequestBuilder includeVariants(@Nullable final Boolean includeVariants) {
        this.includeVariants = includeVariants;
        return this;
    }

    public MissingAttributesSearchRequestBuilder coverageMin(@Nullable final Double coverageMin) {
        this.coverageMin = coverageMin;
        return this;
    }

    public MissingAttributesSearchRequestBuilder coverageMax(@Nullable final Double coverageMax) {
        this.coverageMax = coverageMax;
        return this;
    }

    public MissingAttributesSearchRequestBuilder sortBy(@Nullable final String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    public MissingAttributesSearchRequestBuilder showMissingAttributeNames(
            @Nullable final Boolean showMissingAttributeNames) {
        this.showMissingAttributeNames = showMissingAttributeNames;
        return this;
    }

    public MissingAttributesSearchRequestBuilder productIds(@Nullable final String... productIds) {
        this.productIds = new ArrayList<>(Arrays.asList(productIds));
        return this;
    }

    public MissingAttributesSearchRequestBuilder productIds(@Nullable final java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }

    public MissingAttributesSearchRequestBuilder productTypeIds(@Nullable final String... productTypeIds) {
        this.productTypeIds = new ArrayList<>(Arrays.asList(productTypeIds));
        return this;
    }

    public MissingAttributesSearchRequestBuilder productTypeIds(@Nullable final java.util.List<String> productTypeIds) {
        this.productTypeIds = productTypeIds;
        return this;
    }

    public MissingAttributesSearchRequestBuilder attributeName(@Nullable final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    @Nullable
    public Integer getLimit() {
        return this.limit;
    }

    @Nullable
    public Integer getOffset() {
        return this.offset;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public Integer getProductSetLimit() {
        return this.productSetLimit;
    }

    @Nullable
    public Boolean getIncludeVariants() {
        return this.includeVariants;
    }

    @Nullable
    public Double getCoverageMin() {
        return this.coverageMin;
    }

    @Nullable
    public Double getCoverageMax() {
        return this.coverageMax;
    }

    @Nullable
    public String getSortBy() {
        return this.sortBy;
    }

    @Nullable
    public Boolean getShowMissingAttributeNames() {
        return this.showMissingAttributeNames;
    }

    @Nullable
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    @Nullable
    public java.util.List<String> getProductTypeIds() {
        return this.productTypeIds;
    }

    @Nullable
    public String getAttributeName() {
        return this.attributeName;
    }

    public MissingAttributesSearchRequest build() {
        return new MissingAttributesSearchRequestImpl(limit, offset, staged, productSetLimit, includeVariants,
            coverageMin, coverageMax, sortBy, showMissingAttributeNames, productIds, productTypeIds, attributeName);
    }

    /**
     * builds MissingAttributesSearchRequest without checking for non null required values
     */
    public MissingAttributesSearchRequest buildUnchecked() {
        return new MissingAttributesSearchRequestImpl(limit, offset, staged, productSetLimit, includeVariants,
            coverageMin, coverageMax, sortBy, showMissingAttributeNames, productIds, productTypeIds, attributeName);
    }

    public static MissingAttributesSearchRequestBuilder of() {
        return new MissingAttributesSearchRequestBuilder();
    }

    public static MissingAttributesSearchRequestBuilder of(final MissingAttributesSearchRequest template) {
        MissingAttributesSearchRequestBuilder builder = new MissingAttributesSearchRequestBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.staged = template.getStaged();
        builder.productSetLimit = template.getProductSetLimit();
        builder.includeVariants = template.getIncludeVariants();
        builder.coverageMin = template.getCoverageMin();
        builder.coverageMax = template.getCoverageMax();
        builder.sortBy = template.getSortBy();
        builder.showMissingAttributeNames = template.getShowMissingAttributeNames();
        builder.productIds = template.getProductIds();
        builder.productTypeIds = template.getProductTypeIds();
        builder.attributeName = template.getAttributeName();
        return builder;
    }

}
