
package com.commercetools.ml.models.missing_data;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   MissingAttributesSearchRequest missingAttributesSearchRequest = MissingAttributesSearchRequest.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingAttributesSearchRequestBuilder implements Builder<MissingAttributesSearchRequest> {

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

    /**
     *  <p>Number of results requested.</p>
     */

    public MissingAttributesSearchRequestBuilder limit(@Nullable final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public MissingAttributesSearchRequestBuilder offset(@Nullable final Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>If true, searches data from staged products in addition to published products.</p>
     */

    public MissingAttributesSearchRequestBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Maximum number of products to scan.</p>
     */

    public MissingAttributesSearchRequestBuilder productSetLimit(@Nullable final Integer productSetLimit) {
        this.productSetLimit = productSetLimit;
        return this;
    }

    /**
     *  <p>If true, searches all product variants. If false, only searches master variants.</p>
     */

    public MissingAttributesSearchRequestBuilder includeVariants(@Nullable final Boolean includeVariants) {
        this.includeVariants = includeVariants;
        return this;
    }

    /**
     *  <p>Minimum attribute coverage of variants to display, applied to both coverage types.</p>
     */

    public MissingAttributesSearchRequestBuilder coverageMin(@Nullable final Double coverageMin) {
        this.coverageMin = coverageMin;
        return this;
    }

    /**
     *  <p>Maximum attribute coverage of variants to display, applied to both coverage types.</p>
     */

    public MissingAttributesSearchRequestBuilder coverageMax(@Nullable final Double coverageMax) {
        this.coverageMax = coverageMax;
        return this;
    }

    /**
     *  <p>Default value: <code>coverageAttributeValues</code> - Allowed values: [<code>coverageAttributeValues</code>, <code>coverageAttributeNames</code>] <code>coverageAttributeValues</code> shows the product variants with the most missing attribute values first and <code>coverageAttributeNames</code> the ones with the most missing attribute names.</p>
     */

    public MissingAttributesSearchRequestBuilder sortBy(@Nullable final String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     *  <p>If true, the <code>missingAttributeNames</code> will be included in the results.</p>
     */

    public MissingAttributesSearchRequestBuilder showMissingAttributeNames(
            @Nullable final Boolean showMissingAttributeNames) {
        this.showMissingAttributeNames = showMissingAttributeNames;
        return this;
    }

    /**
     *  <p>Filters results by the provided Product IDs. Cannot be applied in combination with any other filter.</p>
     */

    public MissingAttributesSearchRequestBuilder productIds(@Nullable final String... productIds) {
        this.productIds = new ArrayList<>(Arrays.asList(productIds));
        return this;
    }

    /**
     *  <p>Filters results by the provided Product IDs. Cannot be applied in combination with any other filter.</p>
     */

    public MissingAttributesSearchRequestBuilder productIds(@Nullable final java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }

    /**
     *  <p>Filters results by the provided Product IDs. Cannot be applied in combination with any other filter.</p>
     */

    public MissingAttributesSearchRequestBuilder plusProductIds(@Nullable final String... productIds) {
        if (this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        this.productIds.addAll(Arrays.asList(productIds));
        return this;
    }

    /**
     *  <p>Filters results by the provided product type IDs. Cannot be applied in combination with any other filter.</p>
     */

    public MissingAttributesSearchRequestBuilder productTypeIds(@Nullable final String... productTypeIds) {
        this.productTypeIds = new ArrayList<>(Arrays.asList(productTypeIds));
        return this;
    }

    /**
     *  <p>Filters results by the provided product type IDs. Cannot be applied in combination with any other filter.</p>
     */

    public MissingAttributesSearchRequestBuilder productTypeIds(@Nullable final java.util.List<String> productTypeIds) {
        this.productTypeIds = productTypeIds;
        return this;
    }

    /**
     *  <p>Filters results by the provided product type IDs. Cannot be applied in combination with any other filter.</p>
     */

    public MissingAttributesSearchRequestBuilder plusProductTypeIds(@Nullable final String... productTypeIds) {
        if (this.productTypeIds == null) {
            this.productTypeIds = new ArrayList<>();
        }
        this.productTypeIds.addAll(Arrays.asList(productTypeIds));
        return this;
    }

    /**
     *  <p>Filters results by the provided attribute name. If provided, products are only checked for this attribute. Therefore, only products of product types which define the attribute name are considered. These product type IDs are then listed in <code>MissingAttributesMeta</code>. The <code>attributeCount</code> and <code>attributeCoverage</code> fields are not part of the response when using this filter. Cannot be applied in combination with any other filter.</p>
     */

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
