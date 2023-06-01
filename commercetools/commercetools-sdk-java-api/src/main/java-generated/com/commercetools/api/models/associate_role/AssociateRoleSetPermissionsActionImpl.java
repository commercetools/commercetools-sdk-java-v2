package com.commercetools.api.models.associate_role;

import com.commercetools.api.models.associate_role.AssociateRoleUpdateAction;
import com.commercetools.api.models.associate_role.Permission;
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
 *  <p>Updating the Permissions on an AssociateRole generates an AssociateRolePermissionsSet Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssociateRoleSetPermissionsActionImpl implements AssociateRoleSetPermissionsAction, ModelBase {

    
    private String action;
    
    
    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleSetPermissionsActionImpl(@JsonProperty("permissions") final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
        this.action =  SET_PERMISSIONS;
    }
    /**
     * create empty instance
     */
    public AssociateRoleSetPermissionsActionImpl() {
        this.action =  SET_PERMISSIONS;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Overrides the current list of Permissions for the AssociateRole.</p>
     */
    
    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions(){
        return this.permissions;
    }

    
    public void setPermissions(final com.commercetools.api.models.associate_role.Permission ...permissions){
       this.permissions = new ArrayList<>(Arrays.asList(permissions));
    }
    
    
    public void setPermissions(final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions){
       this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AssociateRoleSetPermissionsActionImpl that = (AssociateRoleSetPermissionsActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(permissions, that.permissions)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(permissions)
            .toHashCode();
    }

}
