
package com.commercetools.ml.models.missing_data;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public MissingPricesSearchRequestBuilder limit(@Nullable final Long limit) {
        this.limit = limit;
        return this;
    }

    public MissingPricesSearchRequestBuilder offset(@Nullable final Long offset) {
        this.offset = offset;
        return this;
    }

    public MissingPricesSearchRequestBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public MissingPricesSearchRequestBuilder productSetLimit(@Nullable final Long productSetLimit) {
        this.productSetLimit = productSetLimit;
        return this;
    }

    public MissingPricesSearchRequestBuilder includeVariants(@Nullable final Boolean includeVariants) {
        this.includeVariants = includeVariants;
        return this;
    }

    public MissingPricesSearchRequestBuilder currencyCode(@Nullable final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public MissingPricesSearchRequestBuilder checkDate(@Nullable final Boolean checkDate) {
        this.checkDate = checkDate;
        return this;
    }

    public MissingPricesSearchRequestBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public MissingPricesSearchRequestBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public MissingPricesSearchRequestBuilder productIds(@Nullable final String... productIds) {
        this.productIds = new ArrayList<>(Arrays.asList(productIds));
        return this;
    }

    public MissingPricesSearchRequestBuilder productIds(@Nullable final java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }

    public MissingPricesSearchRequestBuilder plusProductIds(@Nullable final String... productIds) {
        if (this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        this.productIds.addAll(Arrays.asList(productIds));
        return this;
    }

    public MissingPricesSearchRequestBuilder productTypeIds(@Nullable final String... productTypeIds) {
        this.productTypeIds = new ArrayList<>(Arrays.asList(productTypeIds));
        return this;
    }

    public MissingPricesSearchRequestBuilder productTypeIds(@Nullable final java.util.List<String> productTypeIds) {
        this.productTypeIds = productTypeIds;
        return this;
    }

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
