
package com.commercetools.importapi.models.importsummaries;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>An import summary describes the states of import resources of a given import sink.</p>
*  <p>It is used to track the overall progress of import resources.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportSummaryImpl implements ImportSummary {

    private com.commercetools.importapi.models.importsummaries.OperationStates states;

    private Long total;

    @JsonCreator
    ImportSummaryImpl(
            @JsonProperty("states") final com.commercetools.importapi.models.importsummaries.OperationStates states,
            @JsonProperty("total") final Long total) {
        this.states = states;
        this.total = total;
    }

    public ImportSummaryImpl() {
    }

    /**
    *  <p>The states summary for this import summary.</p>
    */
    public com.commercetools.importapi.models.importsummaries.OperationStates getStates() {
        return this.states;
    }

    /**
    *  <p>The total number of import operations received for this import group.</p>
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

        return new EqualsBuilder().append(states, that.states).append(total, that.total).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(states).append(total).toHashCode();
    }

}
