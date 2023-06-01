package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
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
 * OrderEditAddStagedActionAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderEditAddStagedActionActionImpl implements OrderEditAddStagedActionAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderEditAddStagedActionActionImpl(@JsonProperty("stagedAction") final com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction) {
        this.stagedAction = stagedAction;
        this.action =  ADD_STAGED_ACTION;
    }
    /**
     * create empty instance
     */
    public OrderEditAddStagedActionActionImpl() {
        this.action =  ADD_STAGED_ACTION;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *
     */
    
    public com.commercetools.api.models.order.StagedOrderUpdateAction getStagedAction(){
        return this.stagedAction;
    }

    
    public void setStagedAction(final com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction){
        this.stagedAction = stagedAction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderEditAddStagedActionActionImpl that = (OrderEditAddStagedActionActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(stagedAction, that.stagedAction)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(stagedAction)
            .toHashCode();
    }

}
