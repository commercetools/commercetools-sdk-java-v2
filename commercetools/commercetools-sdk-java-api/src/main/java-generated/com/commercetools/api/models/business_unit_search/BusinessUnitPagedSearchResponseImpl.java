
package com.commercetools.api.models.business_unit_search;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * BusinessUnitPagedSearchResponse
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitPagedSearchResponseImpl implements BusinessUnitPagedSearchResponse, ModelBase {

    private Long total;

    private Integer limit;

    private Integer offset;

    private java.util.List<com.commercetools.api.models.business_unit_search.BusinessUnitSearchResult> results;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitPagedSearchResponseImpl(@JsonProperty("total") final Long total,
            @JsonProperty("limit") final Integer limit, @JsonProperty("offset") final Integer offset,
            @JsonProperty("results") final java.util.List<com.commercetools.api.models.business_unit_search.BusinessUnitSearchResult> results) {
        this.total = total;
        this.limit = limit;
        this.offset = offset;
        this.results = results;
    }

    /**
     * create empty instance
     */
    public BusinessUnitPagedSearchResponseImpl() {
    }

    /**
     *  <p>Total number of results matching the query.</p>
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of results requested.</p>
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     *  <p>Search result containing the Business Units matching the search query.</p>
     */

    public java.util.List<com.commercetools.api.models.business_unit_search.BusinessUnitSearchResult> getResults() {
        return this.results;
    }

    public void setTotal(final Long total) {
        this.total = total;
    }

    public void setLimit(final Integer limit) {
        this.limit = limit;
    }

    public void setOffset(final Integer offset) {
        this.offset = offset;
    }

    public void setResults(
            final com.commercetools.api.models.business_unit_search.BusinessUnitSearchResult... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(
            final java.util.List<com.commercetools.api.models.business_unit_search.BusinessUnitSearchResult> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitPagedSearchResponseImpl that = (BusinessUnitPagedSearchResponseImpl) o;

        return new EqualsBuilder().append(total, that.total)
                .append(limit, that.limit)
                .append(offset, that.offset)
                .append(results, that.results)
                .append(total, that.total)
                .append(limit, that.limit)
                .append(offset, that.offset)
                .append(results, that.results)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(total).append(limit).append(offset).append(results).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("total", total)
                .append("limit", limit)
                .append("offset", offset)
                .append("results", results)
                .build();
    }

    @Override
    public BusinessUnitPagedSearchResponse copyDeep() {
        return BusinessUnitPagedSearchResponse.deepCopy(this);
    }
}
