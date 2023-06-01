package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.associate_role.AssociateRoleKeyReference;
import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
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
 * InheritedAssociateRoleAssignment
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InheritedAssociateRoleAssignmentImpl implements InheritedAssociateRoleAssignment, ModelBase {

    
    private com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole;
    
    
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference source;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InheritedAssociateRoleAssignmentImpl(@JsonProperty("associateRole") final com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole, @JsonProperty("source") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference source) {
        this.associateRole = associateRole;
        this.source = source;
    }
    /**
     * create empty instance
     */
    public InheritedAssociateRoleAssignmentImpl() {
    }

    /**
     *  <p>Inherited role the Associate holds within a Business Unit.</p>
     */
    
    public com.commercetools.api.models.associate_role.AssociateRoleKeyReference getAssociateRole(){
        return this.associateRole;
    }
    
    /**
     *  <p>Reference to the parent Business Unit where the assignment is defined explicitly.</p>
     */
    
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getSource(){
        return this.source;
    }

    
    public void setAssociateRole(final com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole){
        this.associateRole = associateRole;
    }
    
    
    public void setSource(final com.commercetools.api.models.business_unit.BusinessUnitKeyReference source){
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        InheritedAssociateRoleAssignmentImpl that = (InheritedAssociateRoleAssignmentImpl) o;
    
        return new EqualsBuilder()
                .append(associateRole, that.associateRole)
                .append(source, that.source)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(associateRole)
            .append(source)
            .toHashCode();
    }

}
