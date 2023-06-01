package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateTypeEnum;
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
 * StateChangeTypeAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StateChangeTypeActionImpl implements StateChangeTypeAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.state.StateTypeEnum type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StateChangeTypeActionImpl(@JsonProperty("type") final com.commercetools.api.models.state.StateTypeEnum type) {
        this.type = type;
        this.action =  CHANGE_TYPE;
    }
    /**
     * create empty instance
     */
    public StateChangeTypeActionImpl() {
        this.action =  CHANGE_TYPE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Resource or object types the State shall be assigned to. Must not be empty.</p>
     */
    
    public com.commercetools.api.models.state.StateTypeEnum getType(){
        return this.type;
    }

    
    public void setType(final com.commercetools.api.models.state.StateTypeEnum type){
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StateChangeTypeActionImpl that = (StateChangeTypeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(type, that.type)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(type)
            .toHashCode();
    }

}
