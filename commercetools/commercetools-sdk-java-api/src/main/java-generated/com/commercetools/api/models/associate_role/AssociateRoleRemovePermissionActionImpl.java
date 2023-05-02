
package com.commercetools.api.models.associate_role;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Removing a Permission from an AssociateRole generates an AssociateRolePermissionRemoved Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleRemovePermissionActionImpl implements AssociateRoleRemovePermissionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.associate_role.Permission permission;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleRemovePermissionActionImpl(
            @JsonProperty("permission") final com.commercetools.api.models.associate_role.Permission permission) {
        this.permission = permission;
        this.action = REMOVE_PERMISSION;
    }

    /**
     * create empty instance
     */
    public AssociateRoleRemovePermissionActionImpl() {
        this.action = REMOVE_PERMISSION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Permission to be removed from the AssociateRole.</p>
     */

    public com.commercetools.api.models.associate_role.Permission getPermission() {
        return this.permission;
    }

    public void setPermission(final com.commercetools.api.models.associate_role.Permission permission) {
        this.permission = permission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssociateRoleRemovePermissionActionImpl that = (AssociateRoleRemovePermissionActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(permission, that.permission).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(permission).toHashCode();
    }

}
