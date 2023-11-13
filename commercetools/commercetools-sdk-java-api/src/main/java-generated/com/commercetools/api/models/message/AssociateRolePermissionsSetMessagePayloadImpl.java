
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
 *  <p>Generated after a successful Set Permissions update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRolePermissionsSetMessagePayloadImpl
        implements AssociateRolePermissionsSetMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRolePermissionsSetMessagePayloadImpl(
            @JsonProperty("permissions") final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
        this.type = ASSOCIATE_ROLE_PERMISSIONS_SET;
    }

    /**
     * create empty instance
     */
    public AssociateRolePermissionsSetMessagePayloadImpl() {
        this.type = ASSOCIATE_ROLE_PERMISSIONS_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Permission assigned to the AssociateRole.</p>
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

        AssociateRolePermissionsSetMessagePayloadImpl that = (AssociateRolePermissionsSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(permissions, that.permissions)
                .append(type, that.type)
                .append(permissions, that.permissions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(permissions).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("permissions", permissions)
                .build();
    }

}
