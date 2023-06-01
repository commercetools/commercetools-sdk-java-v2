package com.commercetools.api.models.project;

import com.commercetools.api.models.associate_role.AssociateRoleKeyReference;
import com.commercetools.api.models.project.BusinessUnitConfigurationStatus;
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
 * BusinessUnitConfiguration
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitConfigurationImpl implements BusinessUnitConfiguration, ModelBase {

    
    private com.commercetools.api.models.project.BusinessUnitConfigurationStatus myBusinessUnitStatusOnCreation;
    
    
    private com.commercetools.api.models.associate_role.AssociateRoleKeyReference myBusinessUnitAssociateRoleOnCreation;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitConfigurationImpl(@JsonProperty("myBusinessUnitStatusOnCreation") final com.commercetools.api.models.project.BusinessUnitConfigurationStatus myBusinessUnitStatusOnCreation, @JsonProperty("myBusinessUnitAssociateRoleOnCreation") final com.commercetools.api.models.associate_role.AssociateRoleKeyReference myBusinessUnitAssociateRoleOnCreation) {
        this.myBusinessUnitStatusOnCreation = myBusinessUnitStatusOnCreation;
        this.myBusinessUnitAssociateRoleOnCreation = myBusinessUnitAssociateRoleOnCreation;
    }
    /**
     * create empty instance
     */
    public BusinessUnitConfigurationImpl() {
    }

    /**
     *  <p>Status of Business Units created using the My Business Unit endpoint.</p>
     */
    
    public com.commercetools.api.models.project.BusinessUnitConfigurationStatus getMyBusinessUnitStatusOnCreation(){
        return this.myBusinessUnitStatusOnCreation;
    }
    
    /**
     *  <p>Default Associate Role assigned to the Associate creating a Business Unit using the My Business Unit endpoint.</p>
     */
    
    public com.commercetools.api.models.associate_role.AssociateRoleKeyReference getMyBusinessUnitAssociateRoleOnCreation(){
        return this.myBusinessUnitAssociateRoleOnCreation;
    }

    
    public void setMyBusinessUnitStatusOnCreation(final com.commercetools.api.models.project.BusinessUnitConfigurationStatus myBusinessUnitStatusOnCreation){
        this.myBusinessUnitStatusOnCreation = myBusinessUnitStatusOnCreation;
    }
    
    
    public void setMyBusinessUnitAssociateRoleOnCreation(final com.commercetools.api.models.associate_role.AssociateRoleKeyReference myBusinessUnitAssociateRoleOnCreation){
        this.myBusinessUnitAssociateRoleOnCreation = myBusinessUnitAssociateRoleOnCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        BusinessUnitConfigurationImpl that = (BusinessUnitConfigurationImpl) o;
    
        return new EqualsBuilder()
                .append(myBusinessUnitStatusOnCreation, that.myBusinessUnitStatusOnCreation)
                .append(myBusinessUnitAssociateRoleOnCreation, that.myBusinessUnitAssociateRoleOnCreation)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(myBusinessUnitStatusOnCreation)
            .append(myBusinessUnitAssociateRoleOnCreation)
            .toHashCode();
    }

}
