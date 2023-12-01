
package com.commercetools.api.models.channel;

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
 * ChannelDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelDraftImpl implements ChannelDraft, ModelBase {

    private String key;

    private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.common.BaseAddress address;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private com.commercetools.api.models.common.GeoJson geoLocation;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChannelDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("roles") final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("geoLocation") final com.commercetools.api.models.common.GeoJson geoLocation) {
        this.key = key;
        this.roles = roles;
        this.name = name;
        this.description = description;
        this.address = address;
        this.custom = custom;
        this.geoLocation = geoLocation;
    }

    /**
     * create empty instance
     */
    public ChannelDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the Channel.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Roles of the Channel. Each channel must have at least one role. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> getRoles() {
        return this.roles;
    }

    /**
     *  <p>Name of the Channel.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the Channel.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Address where the Channel is located.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     *  <p>Custom fields defined for the Channel.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>GeoJSON geometry object encoding the geo location of the Channel. Currently, only the Point type is supported.</p>
     */

    public com.commercetools.api.models.common.GeoJson getGeoLocation() {
        return this.geoLocation;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setRoles(final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
    }

    public void setRoles(final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setAddress(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setGeoLocation(final com.commercetools.api.models.common.GeoJson geoLocation) {
        this.geoLocation = geoLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChannelDraftImpl that = (ChannelDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(roles, that.roles)
                .append(name, that.name)
                .append(description, that.description)
                .append(address, that.address)
                .append(custom, that.custom)
                .append(geoLocation, that.geoLocation)
                .append(key, that.key)
                .append(roles, that.roles)
                .append(name, that.name)
                .append(description, that.description)
                .append(address, that.address)
                .append(custom, that.custom)
                .append(geoLocation, that.geoLocation)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(roles)
                .append(name)
                .append(description)
                .append(address)
                .append(custom)
                .append(geoLocation)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("roles", roles)
                .append("name", name)
                .append("description", description)
                .append("address", address)
                .append("custom", custom)
                .append("geoLocation", geoLocation)
                .build();
    }

}
