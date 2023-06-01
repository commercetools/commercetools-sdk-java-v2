package com.commercetools.history.models.common;

import com.commercetools.history.models.common.Reference;
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
 * ItemState
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ItemStateImpl implements ItemState, ModelBase {

    
    private Integer quantity;
    
    
    private com.commercetools.history.models.common.Reference state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ItemStateImpl(@JsonProperty("quantity") final Integer quantity, @JsonProperty("state") final com.commercetools.history.models.common.Reference state) {
        this.quantity = quantity;
        this.state = state;
    }
    /**
     * create empty instance
     */
    public ItemStateImpl() {
    }

    /**
     *
     */
    
    public Integer getQuantity(){
        return this.quantity;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.Reference getState(){
        return this.state;
    }

    
    public void setQuantity(final Integer quantity){
        this.quantity = quantity;
    }
    
    
    public void setState(final com.commercetools.history.models.common.Reference state){
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ItemStateImpl that = (ItemStateImpl) o;
    
        return new EqualsBuilder()
                .append(quantity, that.quantity)
                .append(state, that.state)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(quantity)
            .append(state)
            .toHashCode();
    }

}
