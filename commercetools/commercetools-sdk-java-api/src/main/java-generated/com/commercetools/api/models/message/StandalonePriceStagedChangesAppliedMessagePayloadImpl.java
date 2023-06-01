package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.standalone_price.StagedStandalonePrice;
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
 *  <p>Generated after a successful Apply Staged Changes update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StandalonePriceStagedChangesAppliedMessagePayloadImpl implements StandalonePriceStagedChangesAppliedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.standalone_price.StagedStandalonePrice stagedChanges;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceStagedChangesAppliedMessagePayloadImpl(@JsonProperty("stagedChanges") final com.commercetools.api.models.standalone_price.StagedStandalonePrice stagedChanges) {
        this.stagedChanges = stagedChanges;
        this.type =  STANDALONE_PRICE_STAGED_CHANGES_APPLIED;
    }
    /**
     * create empty instance
     */
    public StandalonePriceStagedChangesAppliedMessagePayloadImpl() {
        this.type =  STANDALONE_PRICE_STAGED_CHANGES_APPLIED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Applied changes of the StandalonePrice after the Apply Staged Changes update action.</p>
     */
    
    public com.commercetools.api.models.standalone_price.StagedStandalonePrice getStagedChanges(){
        return this.stagedChanges;
    }

    
    public void setStagedChanges(final com.commercetools.api.models.standalone_price.StagedStandalonePrice stagedChanges){
        this.stagedChanges = stagedChanges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StandalonePriceStagedChangesAppliedMessagePayloadImpl that = (StandalonePriceStagedChangesAppliedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(stagedChanges, that.stagedChanges)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(stagedChanges)
            .toHashCode();
    }

}
