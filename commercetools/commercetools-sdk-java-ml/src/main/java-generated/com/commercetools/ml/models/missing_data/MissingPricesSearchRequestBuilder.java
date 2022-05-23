
package com.commercetools.ml.models.missing_data;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   MissingPricesSearchRequest missingPricesSearchRequest = MissingPricesSearchRequest.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingPricesSearchRequestBuilder implements Builder<MissingPricesSearchRequest> {

    @Nullable
    private Long limit;

    @Nullable
    private Long offset;

    @Nullable
    private Boolean staged;

    @Nullable
    private Long productSetLimit;

    @Nullable
    private Boolean includeVariants;

    @Nullable
    private String currencyCode;

    @Nullable
    private Boolean checkDate;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private java.util.List<String> productIds;

    @Nullable
    private java.util.List<String> productTypeIds;

    /**
     *  <p>Number of results requested.</p>
     */

    public MissingPricesSearchRequestBuilder limit(@Nullable final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public MissingPricesSearchRequestBuilder offset(@Nullable final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>If true, searches data from staged products in addition to published products.</p>
     */

    public MissingPricesSearchRequestBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Maximum number of products to scan.</p>
     */

    public MissingPricesSearchRequestBuilder productSetLimit(@Nullable final Long productSetLimit) {
        this.productSetLimit = productSetLimit;
        return this;
    }

    /**
     *  <p>If true, searches all product variants. If false, only searches master variants.</p>
     */

    public MissingPricesSearchRequestBuilder includeVariants(@Nullable final Boolean includeVariants) {
        this.includeVariants = includeVariants;
        return this;
    }

    /**
     *  <p>If used, only checks if a product variant has a price in the provided currency code.</p>
     */

    public MissingPricesSearchRequestBuilder currencyCode(@Nullable final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     *  <p>If true, checks if there are prices for the specified date range and time.</p>
     */

    public MissingPricesSearchRequestBuilder checkDate(@Nullable final Boolean checkDate) {
        this.checkDate = checkDate;
        return this;
    }

    /**
     *  <p>Starting date of the range to check. If no value is given, checks prices valid at the time the search is initiated.</p>
     */

    public MissingPricesSearchRequestBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Ending date of the range to check. If no value is given, it is equal to <code>validFrom</code>.</p>
     */

    public MissingPricesSearchRequestBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Filters results by the provided Product IDs. Cannot be applied in combination with the <code>productTypeIds</code> filter.</p>
     */

    public MissingPricesSearchRequestBuilder productIds(@Nullable final String... productIds) {
        this.productIds = new ArrayList<>(Arrays.asList(productIds));
        return this;
    }

    /**
     *  <p>Filters results by the provided Product IDs. Cannot be applied in combination with the <code>productTypeIds</code> filter.</p>
     */

    public MissingPricesSearchRequestBuilder productIds(@Nullable final java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }

    /**
     *  <p>Filters results by the provided Product IDs. Cannot be applied in combination with the <code>productTypeIds</code> filter.</p>
     */

    public MissingPricesSearchRequestBuilder plusProductIds(@Nullable final String... productIds) {
        if (this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        this.productIds.addAll(Arrays.asList(productIds));
        return this;
    }

    /**
     *  <p>Filters results by the provided product type IDs. Cannot be applied in combination with the <code>productIds</code> filter.</p>
     */

    public MissingPricesSearchRequestBuilder productTypeIds(@Nullable final String... productTypeIds) {
        this.productTypeIds = new ArrayList<>(Arrays.asList(productTypeIds));
        return this;
    }

    /**
     *  <p>Filters results by the provided product type IDs. Cannot be applied in combination with the <code>productIds</code> filter.</p>
     */

    public MissingPricesSearchRequestBuilder productTypeIds(@Nullable final java.util.List<String> productTypeIds) {
        this.productTypeIds = productTypeIds;
        return this;
    }

    /**
     *  <p>Filters results by the provided product type IDs. Cannot be applied in combination with the <code>productIds</code> filter.</p>
     */

    public MissingPricesSearchRequestBuilder plusProductTypeIds(@Nullable final String... productTypeIds) {
        if (this.productTypeIds == null) {
            this.productTypeIds = new ArrayList<>();
        }
        this.productTypeIds.addAll(Arrays.asList(productTypeIds));
        return this;
    }

    @Nullable
    public Long getLimit() {
        return this.limit;
    }

    @Nullable
    public Long getOffset() {
        return this.offset;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public Long getProductSetLimit() {
        return this.productSetLimit;
    }

    @Nullable
    public Boolean getIncludeVariants() {
        return this.includeVariants;
    }

    @Nullable
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public Boolean getCheckDate() {
        return this.checkDate;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    @Nullable
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    @Nullable
    public java.util.List<String> getProductTypeIds() {
        return this.productTypeIds;
    }

    public MissingPricesSearchRequest build() {
        return new MissingPricesSearchRequestImpl(limit, offset, staged, productSetLimit, includeVariants, currencyCode,
            checkDate, validFrom, validUntil, productIds, productTypeIds);
    }

    /**
     * builds MissingPricesSearchRequest without checking for non null required values
     */
    public MissingPricesSearchRequest buildUnchecked() {
        return new MissingPricesSearchRequestImpl(limit, offset, staged, productSetLimit, includeVariants, currencyCode,
            checkDate, validFrom, validUntil, productIds, productTypeIds);
    }

    public static MissingPricesSearchRequestBuilder of() {
        return new MissingPricesSearchRequestBuilder();
    }

    public static MissingPricesSearchRequestBuilder of(final MissingPricesSearchRequest template) {
        MissingPricesSearchRequestBuilder builder = new MissingPricesSearchRequestBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.staged = template.getStaged();
        builder.productSetLimit = template.getProductSetLimit();
        builder.includeVariants = template.getIncludeVariants();
        builder.currencyCode = template.getCurrencyCode();
        builder.checkDate = template.getCheckDate();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.productIds = template.getProductIds();
        builder.productTypeIds = template.getProductTypeIds();
        return builder;
    }

}
