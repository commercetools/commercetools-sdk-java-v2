package com.commercetools.api.models.project;

import com.commercetools.api.models.project.OrderSearchStatus;
import com.commercetools.api.models.project.ProjectUpdateAction;
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
 * ProjectChangeOrderSearchStatusAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProjectChangeOrderSearchStatusActionImpl implements ProjectChangeOrderSearchStatusAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.project.OrderSearchStatus status;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectChangeOrderSearchStatusActionImpl(@JsonProperty("status") final com.commercetools.api.models.project.OrderSearchStatus status) {
        this.status = status;
        this.action =  CHANGE_ORDER_SEARCH_STATUS;
    }
    /**
     * create empty instance
     */
    public ProjectChangeOrderSearchStatusActionImpl() {
        this.action =  CHANGE_ORDER_SEARCH_STATUS;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Activates or deactivates the Order Search feature. Activation will trigger building a search index for the Orders in the Project.</p>
     */
    
    public com.commercetools.api.models.project.OrderSearchStatus getStatus(){
        return this.status;
    }

    
    public void setStatus(final com.commercetools.api.models.project.OrderSearchStatus status){
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProjectChangeOrderSearchStatusActionImpl that = (ProjectChangeOrderSearchStatusActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(status, that.status)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(status)
            .toHashCode();
    }

}
