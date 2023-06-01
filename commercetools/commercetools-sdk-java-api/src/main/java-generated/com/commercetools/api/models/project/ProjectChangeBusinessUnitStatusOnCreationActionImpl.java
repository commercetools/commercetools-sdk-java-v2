package com.commercetools.api.models.project;

import com.commercetools.api.models.project.BusinessUnitConfigurationStatus;
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
 * ProjectChangeBusinessUnitStatusOnCreationAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProjectChangeBusinessUnitStatusOnCreationActionImpl implements ProjectChangeBusinessUnitStatusOnCreationAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.project.BusinessUnitConfigurationStatus status;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectChangeBusinessUnitStatusOnCreationActionImpl(@JsonProperty("status") final com.commercetools.api.models.project.BusinessUnitConfigurationStatus status) {
        this.status = status;
        this.action =  CHANGE_MY_BUSINESS_UNIT_STATUS_ON_CREATION;
    }
    /**
     * create empty instance
     */
    public ProjectChangeBusinessUnitStatusOnCreationActionImpl() {
        this.action =  CHANGE_MY_BUSINESS_UNIT_STATUS_ON_CREATION;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Status for Business Units created using the My Business Unit endpoint.</p>
     */
    
    public com.commercetools.api.models.project.BusinessUnitConfigurationStatus getStatus(){
        return this.status;
    }

    
    public void setStatus(final com.commercetools.api.models.project.BusinessUnitConfigurationStatus status){
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProjectChangeBusinessUnitStatusOnCreationActionImpl that = (ProjectChangeBusinessUnitStatusOnCreationActionImpl) o;
    
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
