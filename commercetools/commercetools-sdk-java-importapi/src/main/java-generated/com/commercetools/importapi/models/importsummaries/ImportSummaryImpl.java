package com.commercetools.importapi.models.importsummaries;

import com.commercetools.importapi.models.importsummaries.OperationStates;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Describes the status of an ImportContainer by the number of resources in each Processing State. Can be used to monitor the import progress per Import Container.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ImportSummaryImpl implements ImportSummary, ModelBase {

    
    private com.commercetools.importapi.models.importsummaries.OperationStates states;
    
    
    private Long total;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImportSummaryImpl(@JsonProperty("states") final com.commercetools.importapi.models.importsummaries.OperationStates states, @JsonProperty("total") final Long total) {
        this.states = states;
        this.total = total;
    }
    /**
     * create empty instance
     */
    public ImportSummaryImpl() {
    }

    /**
     *  <p>The import status of an ImportContainer given by the number of resources in each Processing State.</p>
     */
    
    public com.commercetools.importapi.models.importsummaries.OperationStates getStates(){
        return this.states;
    }
    
    /**
     *  <p>The total number of ImportOperations received for this Import Summary.</p>
     */
    
    public Long getTotal(){
        return this.total;
    }

    
    public void setStates(final com.commercetools.importapi.models.importsummaries.OperationStates states){
        this.states = states;
    }
    
    
    public void setTotal(final Long total){
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ImportSummaryImpl that = (ImportSummaryImpl) o;
    
        return new EqualsBuilder()
                .append(states, that.states)
                .append(total, that.total)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(states)
            .append(total)
            .toHashCode();
    }

}
