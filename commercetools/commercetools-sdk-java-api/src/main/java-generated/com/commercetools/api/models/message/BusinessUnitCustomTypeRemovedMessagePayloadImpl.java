
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
 *  <p>Generated after removing a Custom Type from a Business Unit using the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomTypeAction" rel="nofollow">Set Custom Type</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCustomTypeRemovedMessagePayloadImpl
        implements BusinessUnitCustomTypeRemovedMessagePayload, ModelBase {

    private String type;

    private String oldTypeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitCustomTypeRemovedMessagePayloadImpl(@JsonProperty("oldTypeId") final String oldTypeId) {
        this.oldTypeId = oldTypeId;
        this.type = BUSINESS_UNIT_CUSTOM_TYPE_REMOVED;
    }

    /**
     * create empty instance
     */
    public BusinessUnitCustomTypeRemovedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_CUSTOM_TYPE_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     */

    public String getOldTypeId() {
        return this.oldTypeId;
    }

    public void setOldTypeId(final String oldTypeId) {
        this.oldTypeId = oldTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitCustomTypeRemovedMessagePayloadImpl that = (BusinessUnitCustomTypeRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(oldTypeId, that.oldTypeId)
                .append(type, that.type)
                .append(oldTypeId, that.oldTypeId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(oldTypeId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("oldTypeId", oldTypeId)
                .build();
    }

    @Override
    public BusinessUnitCustomTypeRemovedMessagePayload copyDeep() {
        return BusinessUnitCustomTypeRemovedMessagePayload.deepCopy(this);
    }
}
