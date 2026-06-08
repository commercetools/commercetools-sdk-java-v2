
package com.commercetools.api.models.customer_search;

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
 * CustomerIndexingProgress
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerIndexingProgressImpl implements CustomerIndexingProgress, ModelBase {

    private Integer indexed;

    private Integer failed;

    private Integer estimatedTotal;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerIndexingProgressImpl(@JsonProperty("indexed") final Integer indexed,
            @JsonProperty("failed") final Integer failed,
            @JsonProperty("estimatedTotal") final Integer estimatedTotal) {
        this.indexed = indexed;
        this.failed = failed;
        this.estimatedTotal = estimatedTotal;
    }

    /**
     * create empty instance
     */
    public CustomerIndexingProgressImpl() {
    }

    /**
     *  <p>The number of Customers successfully indexed.</p>
     */

    public Integer getIndexed() {
        return this.indexed;
    }

    /**
     *  <p>The number of Customers that failed to be indexed.</p>
     */

    public Integer getFailed() {
        return this.failed;
    }

    /**
     *  <p>The estimated total number of Customers to be indexed.</p>
     */

    public Integer getEstimatedTotal() {
        return this.estimatedTotal;
    }

    public void setIndexed(final Integer indexed) {
        this.indexed = indexed;
    }

    public void setFailed(final Integer failed) {
        this.failed = failed;
    }

    public void setEstimatedTotal(final Integer estimatedTotal) {
        this.estimatedTotal = estimatedTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerIndexingProgressImpl that = (CustomerIndexingProgressImpl) o;

        return new EqualsBuilder().append(indexed, that.indexed)
                .append(failed, that.failed)
                .append(estimatedTotal, that.estimatedTotal)
                .append(indexed, that.indexed)
                .append(failed, that.failed)
                .append(estimatedTotal, that.estimatedTotal)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(indexed).append(failed).append(estimatedTotal).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("indexed", indexed)
                .append("failed", failed)
                .append("estimatedTotal", estimatedTotal)
                .build();
    }

    @Override
    public CustomerIndexingProgress copyDeep() {
        return CustomerIndexingProgress.deepCopy(this);
    }
}
