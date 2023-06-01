package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.InheritedAssociateRoleAssignment;
import com.commercetools.api.models.customer.CustomerReference;
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
 * InheritedAssociate
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InheritedAssociateImpl implements InheritedAssociate, ModelBase {

    
    private java.util.List<com.commercetools.api.models.business_unit.InheritedAssociateRoleAssignment> associateRoleAssignments;
    
    
    private com.commercetools.api.models.customer.CustomerReference customer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InheritedAssociateImpl(@JsonProperty("associateRoleAssignments") final java.util.List<com.commercetools.api.models.business_unit.InheritedAssociateRoleAssignment> associateRoleAssignments, @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer) {
        this.associateRoleAssignments = associateRoleAssignments;
        this.customer = customer;
    }
    /**
     * create empty instance
     */
    public InheritedAssociateImpl() {
    }

    /**
     *  <p>Inherited roles of the Associate within a Business Unit.</p>
     */
    
    public java.util.List<com.commercetools.api.models.business_unit.InheritedAssociateRoleAssignment> getAssociateRoleAssignments(){
        return this.associateRoleAssignments;
    }
    
    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     */
    
    public com.commercetools.api.models.customer.CustomerReference getCustomer(){
        return this.customer;
    }

    
    public void setAssociateRoleAssignments(final com.commercetools.api.models.business_unit.InheritedAssociateRoleAssignment ...associateRoleAssignments){
       this.associateRoleAssignments = new ArrayList<>(Arrays.asList(associateRoleAssignments));
    }
    
    
    public void setAssociateRoleAssignments(final java.util.List<com.commercetools.api.models.business_unit.InheritedAssociateRoleAssignment> associateRoleAssignments){
       this.associateRoleAssignments = associateRoleAssignments;
    }
    
    
    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer){
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        InheritedAssociateImpl that = (InheritedAssociateImpl) o;
    
        return new EqualsBuilder()
                .append(associateRoleAssignments, that.associateRoleAssignments)
                .append(customer, that.customer)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(associateRoleAssignments)
            .append(customer)
            .toHashCode();
    }

}
