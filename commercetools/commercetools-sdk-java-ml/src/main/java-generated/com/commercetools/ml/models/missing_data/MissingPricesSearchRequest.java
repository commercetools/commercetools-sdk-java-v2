
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingPricesSearchRequestImpl.class)
public interface MissingPricesSearchRequest {

    @JsonProperty("limit")
    public Long getLimit();

    @JsonProperty("offset")
    public Long getOffset();

    /**
    *  <p>If true, searches data from staged products in addition to published products.</p>
    */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
    *  <p>Maximum number of products to scan.</p>
    */

    @JsonProperty("productSetLimit")
    public Long getProductSetLimit();

    /**
    *  <p>If true, searches all product variants. If false, only searches master variants.</p>
    */

    @JsonProperty("includeVariants")
    public Boolean getIncludeVariants();

    /**
    *  <p>If used, only checks if a product variant has a price in the provided currency code.</p>
    */

    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    /**
    *  <p>If true, checks if there are prices for the specified date range and time.</p>
    */

    @JsonProperty("checkDate")
    public Boolean getCheckDate();

    /**
    *  <p>Starting date of the range to check. If no value is given, checks prices valid at the time the search is initiated.</p>
    */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
    *  <p>Ending date of the range to check. If no value is given, it is equal to <code>validFrom</code>.</p>
    */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
    *  <p>Filters results by the provided Product IDs. Cannot be applied in combination with the <code>productTypeIds</code> filter.</p>
    */

    @JsonProperty("productIds")
    public List<String> getProductIds();

    /**
    *  <p>Filters results by the provided product type IDs. Cannot be applied in combination with the <code>productIds</code> filter.</p>
    */

    @JsonProperty("productTypeIds")
    public List<String> getProductTypeIds();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setStaged(final Boolean staged);

    public void setProductSetLimit(final Long productSetLimit);

    public void setIncludeVariants(final Boolean includeVariants);

    public void setCurrencyCode(final String currencyCode);

    public void setCheckDate(final Boolean checkDate);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    @JsonIgnore
    public void setProductIds(final String... productIds);

    public void setProductIds(final List<String> productIds);

    @JsonIgnore
    public void setProductTypeIds(final String... productTypeIds);

    public void setProductTypeIds(final List<String> productTypeIds);

    public static MissingPricesSearchRequest of() {
        return new MissingPricesSearchRequestImpl();
    }

    public static MissingPricesSearchRequest of(final MissingPricesSearchRequest template) {
        MissingPricesSearchRequestImpl instance = new MissingPricesSearchRequestImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setStaged(template.getStaged());
        instance.setProductSetLimit(template.getProductSetLimit());
        instance.setIncludeVariants(template.getIncludeVariants());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setCheckDate(template.getCheckDate());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setProductIds(template.getProductIds());
        instance.setProductTypeIds(template.getProductTypeIds());
        return instance;
    }

    public static MissingPricesSearchRequestBuilder builder() {
        return MissingPricesSearchRequestBuilder.of();
    }

    public static MissingPricesSearchRequestBuilder builder(final MissingPricesSearchRequest template) {
        return MissingPricesSearchRequestBuilder.of(template);
    }

    default <T> T withMissingPricesSearchRequest(Function<MissingPricesSearchRequest, T> helper) {
        return helper.apply(this);
    }
}
