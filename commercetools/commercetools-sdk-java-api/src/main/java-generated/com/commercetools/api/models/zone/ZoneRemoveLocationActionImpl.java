
package com.commercetools.api.models.zone;

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
 * ZoneRemoveLocationAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ZoneRemoveLocationActionImpl implements ZoneRemoveLocationAction, ModelBase {

    private String action;

    private com.commercetools.api.models.zone.Location location;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ZoneRemoveLocationActionImpl(@JsonProperty("location") final com.commercetools.api.models.zone.Location location) {
        this.location = location;
        this.action = REMOVE_LOCATION;
    }

    /**
     * create empty instance
     */
    public ZoneRemoveLocationActionImpl() {
        this.action = REMOVE_LOCATION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Location to be removed from the Zone.</p>
     */

    public com.commercetools.api.models.zone.Location getLocation() {
        return this.location;
    }

    public void setLocation(final com.commercetools.api.models.zone.Location location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ZoneRemoveLocationActionImpl that = (ZoneRemoveLocationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(location, that.location)
                .append(action, that.action)
                .append(location, that.location)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(location).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("location", location)
                .build();
    }

    @Override
    public ZoneRemoveLocationAction copyDeep() {
        return ZoneRemoveLocationAction.deepCopy(this);
    }
}
