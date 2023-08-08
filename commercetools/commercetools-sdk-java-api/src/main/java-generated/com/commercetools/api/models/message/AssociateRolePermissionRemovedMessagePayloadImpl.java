
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

/**
 *  <p>Generated after a successful Remove Permissions update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRolePermissionRemovedMessagePayloadImpl
        implements AssociateRolePermissionRemovedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.associate_role.Permission permission;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRolePermissionRemovedMessagePayloadImpl(
            @JsonProperty("permission") final com.commercetools.api.models.associate_role.Permission permission) {
        this.permission = permission;
        this.type = ASSOCIATE_ROLE_PERMISSION_REMOVED;
    }

    /**
     * create empty instance
     */
    public AssociateRolePermissionRemovedMessagePayloadImpl() {
        this.type = ASSOCIATE_ROLE_PERMISSION_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Permission that was removed from the AssociateRole.</p>
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

        AssociateRolePermissionRemovedMessagePayloadImpl that = (AssociateRolePermissionRemovedMessagePayloadImpl) o;

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

}
