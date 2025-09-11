
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
 *  <p>Adding a Permission to an <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a> generates an <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRolePermissionAddedMessage" rel="nofollow">AssociateRolePermissionAdded</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleAddPermissionActionImpl implements AssociateRoleAddPermissionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.associate_role.Permission permission;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleAddPermissionActionImpl(
            @JsonProperty("permission") final com.commercetools.api.models.associate_role.Permission permission) {
        this.permission = permission;
        this.action = ADD_PERMISSION;
    }

    /**
     * create empty instance
     */
    public AssociateRoleAddPermissionActionImpl() {
        this.action = ADD_PERMISSION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Permission to be added to the AssociateRole.</p>
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

        AssociateRoleAddPermissionActionImpl that = (AssociateRoleAddPermissionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(permission, that.permission)
                .append(action, that.action)
                .append(permission, that.permission)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(permission).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("permission", permission)
                .build();
    }

    @Override
    public AssociateRoleAddPermissionAction copyDeep() {
        return AssociateRoleAddPermissionAction.deepCopy(this);
    }
}
