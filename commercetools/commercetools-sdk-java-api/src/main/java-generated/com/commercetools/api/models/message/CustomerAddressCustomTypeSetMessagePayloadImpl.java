
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
 *  <p>Generated after adding a Custom Type to an Address of a Customer using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetAddressCustomTypeAction" rel="nofollow">Set Custom Type in Address</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressCustomTypeSetMessagePayloadImpl
        implements CustomerAddressCustomTypeSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.type.CustomFields customFields;

    private String previousTypeId;

    private String addressId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerAddressCustomTypeSetMessagePayloadImpl(
            @JsonProperty("customFields") final com.commercetools.api.models.type.CustomFields customFields,
            @JsonProperty("previousTypeId") final String previousTypeId,
            @JsonProperty("addressId") final String addressId) {
        this.customFields = customFields;
        this.previousTypeId = previousTypeId;
        this.addressId = addressId;
        this.type = CUSTOMER_ADDRESS_CUSTOM_TYPE_SET;
    }

    /**
     * create empty instance
     */
    public CustomerAddressCustomTypeSetMessagePayloadImpl() {
        this.type = CUSTOMER_ADDRESS_CUSTOM_TYPE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustomFields() {
        return this.customFields;
    }

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     */

    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> on which the Custom Field was set.</p>
     */

    public String getAddressId() {
        return this.addressId;
    }

    public void setCustomFields(final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
    }

    public void setPreviousTypeId(final String previousTypeId) {
        this.previousTypeId = previousTypeId;
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

        CustomerAddressCustomTypeSetMessagePayloadImpl that = (CustomerAddressCustomTypeSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customFields, that.customFields)
                .append(previousTypeId, that.previousTypeId)
                .append(addressId, that.addressId)
                .append(type, that.type)
                .append(customFields, that.customFields)
                .append(previousTypeId, that.previousTypeId)
                .append(addressId, that.addressId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(customFields)
                .append(previousTypeId)
                .append(addressId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customFields", customFields)
                .append("previousTypeId", previousTypeId)
                .append("addressId", addressId)
                .build();
    }

    @Override
    public CustomerAddressCustomTypeSetMessagePayload copyDeep() {
        return CustomerAddressCustomTypeSetMessagePayload.deepCopy(this);
    }
}
