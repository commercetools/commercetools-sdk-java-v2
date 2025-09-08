
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRoleAddPermissionAction" rel="nofollow">Add Permissions</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRolePermissionAddedMessagePayloadImpl
        implements AssociateRolePermissionAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.associate_role.Permission permission;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRolePermissionAddedMessagePayloadImpl(
            @JsonProperty("permission") final com.commercetools.api.models.associate_role.Permission permission) {
        this.permission = permission;
        this.type = ASSOCIATE_ROLE_PERMISSION_ADDED;
    }

    /**
     * create empty instance
     */
    public AssociateRolePermissionAddedMessagePayloadImpl() {
        this.type = ASSOCIATE_ROLE_PERMISSION_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Permission that was added to the AssociateRole.</p>
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

        AssociateRolePermissionAddedMessagePayloadImpl that = (AssociateRolePermissionAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(permission, that.permission)
                .append(type, that.type)
                .append(permission, that.permission)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(permission).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("permission", permission)
                .build();
    }

    @Override
    public AssociateRolePermissionAddedMessagePayload copyDeep() {
        return AssociateRolePermissionAddedMessagePayload.deepCopy(this);
    }
}
