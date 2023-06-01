package com.commercetools.api.models.associate_role;

import com.commercetools.api.models.associate_role.AssociateRoleAddPermissionAction;
import com.commercetools.api.models.associate_role.AssociateRoleChangeBuyerAssignableAction;
import com.commercetools.api.models.associate_role.AssociateRoleRemovePermissionAction;
import com.commercetools.api.models.associate_role.AssociateRoleSetCustomFieldAction;
import com.commercetools.api.models.associate_role.AssociateRoleSetCustomTypeAction;
import com.commercetools.api.models.associate_role.AssociateRoleSetNameAction;
import com.commercetools.api.models.associate_role.AssociateRoleSetPermissionsAction;
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
 * AssociateRoleUpdateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssociateRoleUpdateActionImpl implements AssociateRoleUpdateAction, ModelBase {

    
    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    /**
     * create empty instance
     */
    public AssociateRoleUpdateActionImpl() {
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AssociateRoleUpdateActionImpl that = (AssociateRoleUpdateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .toHashCode();
    }

}
