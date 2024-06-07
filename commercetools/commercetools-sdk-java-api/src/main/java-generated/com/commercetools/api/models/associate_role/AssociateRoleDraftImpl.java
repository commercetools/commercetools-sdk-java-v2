
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
 * AssociateRoleDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleDraftImpl implements AssociateRoleDraft, ModelBase {

    private String key;

    private String name;

    private Boolean buyerAssignable;

    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleDraftImpl(@JsonProperty("key") final String key, @JsonProperty("name") final String name,
            @JsonProperty("buyerAssignable") final Boolean buyerAssignable,
            @JsonProperty("permissions") final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.name = name;
        this.buyerAssignable = buyerAssignable;
        this.permissions = permissions;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public AssociateRoleDraftImpl() {
    }

    /**
     *  <p>User-defined unique and immutable identifier for the AssociateRole.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the AssociateRole.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Whether the AssociateRole can be assigned to an Associate by a buyer.</p>
     */

    public Boolean getBuyerAssignable() {
        return this.buyerAssignable;
    }

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     */

    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions() {
        return this.permissions;
    }

    /**
     *  <p>Custom Fields for the AssociateRole.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setBuyerAssignable(final Boolean buyerAssignable) {
        this.buyerAssignable = buyerAssignable;
    }

    public void setPermissions(final com.commercetools.api.models.associate_role.Permission... permissions) {
        this.permissions = new ArrayList<>(Arrays.asList(permissions));
    }

    public void setPermissions(
            final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssociateRoleDraftImpl that = (AssociateRoleDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
                .append(buyerAssignable, that.buyerAssignable)
                .append(permissions, that.permissions)
                .append(custom, that.custom)
                .append(key, that.key)
                .append(name, that.name)
                .append(buyerAssignable, that.buyerAssignable)
                .append(permissions, that.permissions)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(name)
                .append(buyerAssignable)
                .append(permissions)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("name", name)
                .append("buyerAssignable", buyerAssignable)
                .append("permissions", permissions)
                .append("custom", custom)
                .build();
    }

}
