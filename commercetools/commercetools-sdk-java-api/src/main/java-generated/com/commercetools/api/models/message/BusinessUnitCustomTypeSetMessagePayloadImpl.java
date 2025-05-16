
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
 *  <p>Generated after adding a Custom Type to a Business Unit using the Set Custom Type update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCustomTypeSetMessagePayloadImpl implements BusinessUnitCustomTypeSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.type.CustomFields customFields;

    private String oldTypeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitCustomTypeSetMessagePayloadImpl(
            @JsonProperty("customFields") final com.commercetools.api.models.type.CustomFields customFields,
            @JsonProperty("oldTypeId") final String oldTypeId) {
        this.customFields = customFields;
        this.oldTypeId = oldTypeId;
        this.type = BUSINESS_UNIT_CUSTOM_TYPE_SET;
    }

    /**
     * create empty instance
     */
    public BusinessUnitCustomTypeSetMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_CUSTOM_TYPE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Custom Fields that were set.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustomFields() {
        return this.customFields;
    }

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     */

    public String getOldTypeId() {
        return this.oldTypeId;
    }

    public void setCustomFields(final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
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

        BusinessUnitCustomTypeSetMessagePayloadImpl that = (BusinessUnitCustomTypeSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customFields, that.customFields)
                .append(oldTypeId, that.oldTypeId)
                .append(type, that.type)
                .append(customFields, that.customFields)
                .append(oldTypeId, that.oldTypeId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customFields).append(oldTypeId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customFields", customFields)
                .append("oldTypeId", oldTypeId)
                .build();
    }

    @Override
    public BusinessUnitCustomTypeSetMessagePayload copyDeep() {
        return BusinessUnitCustomTypeSetMessagePayload.deepCopy(this);
    }
}
