package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateUpdateAction;
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
 * StateUpdate
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StateUpdateImpl implements StateUpdate, ModelBase {

    
    private Long version;
    
    
    private java.util.List<com.commercetools.api.models.state.StateUpdateAction> actions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StateUpdateImpl(@JsonProperty("version") final Long version, @JsonProperty("actions") final java.util.List<com.commercetools.api.models.state.StateUpdateAction> actions) {
        this.version = version;
        this.actions = actions;
    }
    /**
     * create empty instance
     */
    public StateUpdateImpl() {
    }

    /**
     *  <p>Expected version of the State on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     */
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Update actions to be performed on the State.</p>
     */
    
    public java.util.List<com.commercetools.api.models.state.StateUpdateAction> getActions(){
        return this.actions;
    }

    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    
    public void setActions(final com.commercetools.api.models.state.StateUpdateAction ...actions){
       this.actions = new ArrayList<>(Arrays.asList(actions));
    }
    
    
    public void setActions(final java.util.List<com.commercetools.api.models.state.StateUpdateAction> actions){
       this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StateUpdateImpl that = (StateUpdateImpl) o;
    
        return new EqualsBuilder()
                .append(version, that.version)
                .append(actions, that.actions)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(version)
            .append(actions)
            .toHashCode();
    }

}
