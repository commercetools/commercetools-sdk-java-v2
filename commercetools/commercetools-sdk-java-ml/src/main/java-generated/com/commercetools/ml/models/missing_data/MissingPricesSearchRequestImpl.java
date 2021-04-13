
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
public final class MissingPricesSearchRequestImpl implements MissingPricesSearchRequest {

    private Long limit;

    private Long offset;

    private Boolean staged;

    private Long productSetLimit;

    private Boolean includeVariants;

    private String currencyCode;

    private Boolean checkDate;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private java.util.List<String> productIds;

    private java.util.List<String> productTypeIds;

    @JsonCreator
    MissingPricesSearchRequestImpl(@JsonProperty("limit") final Long limit, @JsonProperty("offset") final Long offset,
            @JsonProperty("staged") final Boolean staged, @JsonProperty("productSetLimit") final Long productSetLimit,
            @JsonProperty("includeVariants") final Boolean includeVariants,
            @JsonProperty("currencyCode") final String currencyCode, @JsonProperty("checkDate") final Boolean checkDate,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("productIds") final java.util.List<String> productIds,
            @JsonProperty("productTypeIds") final java.util.List<String> productTypeIds) {
        this.limit = limit;
        this.offset = offset;
        this.staged = staged;
        this.productSetLimit = productSetLimit;
        this.includeVariants = includeVariants;
        this.currencyCode = currencyCode;
        this.checkDate = checkDate;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.productIds = productIds;
        this.productTypeIds = productTypeIds;
    }

    public MissingPricesSearchRequestImpl() {
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
    *  <p>If used, only checks if a product variant has a price in the provided currency code.</p>
    */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
    *  <p>If true, checks if there are prices for the specified date range and time.</p>
    */
    public Boolean getCheckDate() {
        return this.checkDate;
    }

    /**
    *  <p>Starting date of the range to check. If no value is given, checks prices valid at the time the search is initiated.</p>
    */
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
    *  <p>Ending date of the range to check. If no value is given, it is equal to <code>validFrom</code>.</p>
    */
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
    *  <p>Filters results by the provided Product IDs. Cannot be applied in combination with the <code>productTypeIds</code> filter.</p>
    */
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    /**
    *  <p>Filters results by the provided product type IDs. Cannot be applied in combination with the <code>productIds</code> filter.</p>
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

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setCheckDate(final Boolean checkDate) {
        this.checkDate = checkDate;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
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

        MissingPricesSearchRequestImpl that = (MissingPricesSearchRequestImpl) o;

        return new EqualsBuilder().append(limit, that.limit)
                .append(offset, that.offset)
                .append(staged, that.staged)
                .append(productSetLimit, that.productSetLimit)
                .append(includeVariants, that.includeVariants)
                .append(currencyCode, that.currencyCode)
                .append(checkDate, that.checkDate)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
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
                .append(currencyCode)
                .append(checkDate)
                .append(validFrom)
                .append(validUntil)
                .append(productIds)
                .append(productTypeIds)
                .toHashCode();
    }

}
