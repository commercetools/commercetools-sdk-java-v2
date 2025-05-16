
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
 *  <p>Generated after adding a Custom Type to an address of a Business Unit using the Set Custom Type in Address update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddressCustomTypeSetMessagePayloadImpl
        implements BusinessUnitAddressCustomTypeSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.type.CustomFields customFields;

    private String oldTypeId;

    private String addressId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitAddressCustomTypeSetMessagePayloadImpl(
            @JsonProperty("customFields") final com.commercetools.api.models.type.CustomFields customFields,
            @JsonProperty("oldTypeId") final String oldTypeId, @JsonProperty("addressId") final String addressId) {
        this.customFields = customFields;
        this.oldTypeId = oldTypeId;
        this.addressId = addressId;
        this.type = BUSINESS_UNIT_ADDRESS_CUSTOM_TYPE_SET;
    }

    /**
     * create empty instance
     */
    public BusinessUnitAddressCustomTypeSetMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_ADDRESS_CUSTOM_TYPE_SET;
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

    /**
     *  <p><code>id</code> of the Address on which the Custom Field was set.</p>
     */

    public String getAddressId() {
        return this.addressId;
    }

    public void setCustomFields(final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
    }

    public void setOldTypeId(final String oldTypeId) {
        this.oldTypeId = oldTypeId;
    }

    public void setAddressId(final String addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitAddressCustomTypeSetMessagePayloadImpl that = (BusinessUnitAddressCustomTypeSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customFields, that.customFields)
                .append(oldTypeId, that.oldTypeId)
                .append(addressId, that.addressId)
                .append(type, that.type)
                .append(customFields, that.customFields)
                .append(oldTypeId, that.oldTypeId)
                .append(addressId, that.addressId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(customFields)
                .append(oldTypeId)
                .append(addressId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customFields", customFields)
                .append("oldTypeId", oldTypeId)
                .append("addressId", addressId)
                .build();
    }

    @Override
    public BusinessUnitAddressCustomTypeSetMessagePayload copyDeep() {
        return BusinessUnitAddressCustomTypeSetMessagePayload.deepCopy(this);
    }
}
