package com.commercetools.api.models.standalone_price;

import com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction;
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
 *  <p>Applies all staged changes to the StandalonePrice by overwriting all current values with the values in the StagedStandalonePrice. After successfully applied, the StagedStandalonePrice will be removed from the StandalonePrice. An <code>applyStagedChanges</code> update action on a StandalonePrice that does not contain any staged changes will return a <code>400 Bad Request</code> error. Applying staged changes successfully will produce the StandalonePriceStagedChangesApplied Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StandalonePriceApplyStagedChangesActionImpl implements StandalonePriceApplyStagedChangesAction, ModelBase {

    
    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceApplyStagedChangesActionImpl() {
        this.action =  APPLY_STAGED_CHANGES;
    }
    

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StandalonePriceApplyStagedChangesActionImpl that = (StandalonePriceApplyStagedChangesActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .toHashCode();
    }

}
