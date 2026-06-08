
package com.commercetools.checkout.models.payment_integration;

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
 *  <p>Paginated result containing PaymentIntegrations.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaginatedPaymentIntegrationImpl implements PaginatedPaymentIntegration, ModelBase {

    private Integer limit;

    private Integer offset;

    private Integer count;

    private Integer total;

    private java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegration> results;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaginatedPaymentIntegrationImpl(@JsonProperty("limit") final Integer limit,
            @JsonProperty("offset") final Integer offset, @JsonProperty("count") final Integer count,
            @JsonProperty("total") final Integer total,
            @JsonProperty("results") final java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegration> results) {
        this.limit = limit;
        this.offset = offset;
        this.count = count;
        this.total = total;
        this.results = results;
    }

    /**
     * create empty instance
     */
    public PaginatedPaymentIntegrationImpl() {
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
     *  <p>Actual number of results returned.</p>
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     *  <p>Total number of results matching the query.</p>
     */

    public Integer getTotal() {
        return this.total;
    }

    /**
     *  <p>PaymentIntegrations matching the query.</p>
     */

    public java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegration> getResults() {
        return this.results;
    }

    public void setLimit(final Integer limit) {
        this.limit = limit;
    }

    public void setOffset(final Integer offset) {
        this.offset = offset;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    public void setTotal(final Integer total) {
        this.total = total;
    }

    public void setResults(final com.commercetools.checkout.models.payment_integration.PaymentIntegration... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(
            final java.util.List<com.commercetools.checkout.models.payment_integration.PaymentIntegration> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaginatedPaymentIntegrationImpl that = (PaginatedPaymentIntegrationImpl) o;

        return new EqualsBuilder().append(limit, that.limit)
                .append(offset, that.offset)
                .append(count, that.count)
                .append(total, that.total)
                .append(results, that.results)
                .append(limit, that.limit)
                .append(offset, that.offset)
                .append(count, that.count)
                .append(total, that.total)
                .append(results, that.results)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(limit)
                .append(offset)
                .append(count)
                .append(total)
                .append(results)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("limit", limit)
                .append("offset", offset)
                .append("count", count)
                .append("total", total)
                .append("results", results)
                .build();
    }

    @Override
    public PaginatedPaymentIntegration copyDeep() {
        return PaginatedPaymentIntegration.deepCopy(this);
    }
}
