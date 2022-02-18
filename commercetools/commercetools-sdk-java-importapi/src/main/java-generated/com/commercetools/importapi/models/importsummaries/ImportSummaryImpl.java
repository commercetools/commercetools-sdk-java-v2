
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

/**
*  <p>Describes the status of an <a href="/import-container#importcontainer">ImportContainer</a> by the number of resources in each <a href="/processing-state#processingstate">Processing State</a>.
*  Can be used to monitor the import progress per <a href="/import-container">Import Container</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImportSummaryImpl implements ImportSummary, ModelBase {

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
    *  <p>The import status of an <a href="/import-container#importcontainer">ImportContainer</a> given by the number of resources in each <a href="/processing-state#processingstate">Processing State</a>.</p>
    */
    public com.commercetools.importapi.models.importsummaries.OperationStates getStates() {
        return this.states;
    }

    /**
    *  <p>The total number of <a href="/import-operation#importoperation">ImportOperations</a> received for this Import Summary.</p>
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
