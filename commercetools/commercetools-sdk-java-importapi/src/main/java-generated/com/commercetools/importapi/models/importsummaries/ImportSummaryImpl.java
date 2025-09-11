
package com.commercetools.importapi.models.importsummaries;

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
 *  <p>The current status of <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperations</a> in an <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportContainer" rel="nofollow">ImportContainer</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportSummaryImpl implements ImportSummary, ModelBase {

    private com.commercetools.importapi.models.importsummaries.OperationStates states;

    private Long total;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImportSummaryImpl(
            @JsonProperty("states") final com.commercetools.importapi.models.importsummaries.OperationStates states,
            @JsonProperty("total") final Long total) {
        this.states = states;
        this.total = total;
    }

    /**
     * create empty instance
     */
    public ImportSummaryImpl() {
    }

    /**
     *  <p>The current <a href="https://docs.commercetools.com/apis/ctp:import:type:ProcessingState" rel="nofollow">ProcessingStates</a> of ImportOperations in an ImportContainer.</p>
     */

    public com.commercetools.importapi.models.importsummaries.OperationStates getStates() {
        return this.states;
    }

    /**
     *  <p>The total number of ImportOperations in <code>states</code>.</p>
     */

    public Long getTotal() {
        return this.total;
    }

    public void setStates(final com.commercetools.importapi.models.importsummaries.OperationStates states) {
        this.states = states;
    }

    public void setTotal(final Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImportSummaryImpl that = (ImportSummaryImpl) o;

        return new EqualsBuilder().append(states, that.states)
                .append(total, that.total)
                .append(states, that.states)
                .append(total, that.total)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(states).append(total).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("states", states)
                .append("total", total)
                .build();
    }

    @Override
    public ImportSummary copyDeep() {
        return ImportSummary.deepCopy(this);
    }
}
