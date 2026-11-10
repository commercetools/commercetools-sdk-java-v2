
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>The response body for a bulk update of Variants. Contains the individual result for each Variant in the request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateResponseImpl implements VariantBulkUpdateResponse, ModelBase {

    private Integer successCount;

    private Integer failureCount;

    private java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateResult> results;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantBulkUpdateResponseImpl(@JsonProperty("successCount") final Integer successCount,
            @JsonProperty("failureCount") final Integer failureCount,
            @JsonProperty("results") final java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateResult> results) {
        this.successCount = successCount;
        this.failureCount = failureCount;
        this.results = results;
    }

    /**
     * create empty instance
     */
    public VariantBulkUpdateResponseImpl() {
    }

    /**
     *  <p>Number of Variants that were successfully updated.</p>
     */

    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     *  <p>Number of Variants that failed to update.</p>
     */

    public Integer getFailureCount() {
        return this.failureCount;
    }

    /**
     *  <p>Results for each Variant in the request, in the same order as the <code>items</code> in the request body.</p>
     */

    public java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateResult> getResults() {
        return this.results;
    }

    public void setSuccessCount(final Integer successCount) {
        this.successCount = successCount;
    }

    public void setFailureCount(final Integer failureCount) {
        this.failureCount = failureCount;
    }

    public void setResults(final com.commercetools.api.models.variant.VariantBulkUpdateResult... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(final java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateResult> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantBulkUpdateResponseImpl that = (VariantBulkUpdateResponseImpl) o;

        return new EqualsBuilder().append(successCount, that.successCount)
                .append(failureCount, that.failureCount)
                .append(results, that.results)
                .append(successCount, that.successCount)
                .append(failureCount, that.failureCount)
                .append(results, that.results)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(successCount).append(failureCount).append(results).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("successCount", successCount)
                .append("failureCount", failureCount)
                .append("results", results)
                .build();
    }

    @Override
    public VariantBulkUpdateResponse copyDeep() {
        return VariantBulkUpdateResponse.deepCopy(this);
    }
}
