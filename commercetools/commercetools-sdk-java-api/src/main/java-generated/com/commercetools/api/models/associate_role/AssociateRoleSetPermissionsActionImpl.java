
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Updating the Permissions on an AssociateRole generates an AssociateRolePermissionsSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleSetPermissionsActionImpl implements AssociateRoleSetPermissionsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleSetPermissionsActionImpl(
            @JsonProperty("permissions") final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
        this.action = SET_PERMISSIONS;
    }

    /**
     * create empty instance
     */
    public AssociateRoleSetPermissionsActionImpl() {
        this.action = SET_PERMISSIONS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Overrides the current list of Permissions for the AssociateRole.</p>
     */

    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions() {
        return this.permissions;
    }

    public void setPermissions(final com.commercetools.api.models.associate_role.Permission... permissions) {
        this.permissions = new ArrayList<>(Arrays.asList(permissions));
    }

    public void setPermissions(
            final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssociateRoleSetPermissionsActionImpl that = (AssociateRoleSetPermissionsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(permissions, that.permissions)
                .append(action, that.action)
                .append(permissions, that.permissions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(permissions).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("permissions", permissions)
                .build();
    }

    @Override
    public AssociateRoleSetPermissionsAction copyDeep() {
        return AssociateRoleSetPermissionsAction.deepCopy(this);
    }
}
