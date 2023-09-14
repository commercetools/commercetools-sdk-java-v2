
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
 *  <p>Generated after adding a Custom Type to an Address of a Customer using the Set Custom Type in Address update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressCustomTypeSetMessagePayloadImpl
        implements CustomerAddressCustomTypeSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.type.CustomFields customFields;

    private String previousTypeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerAddressCustomTypeSetMessagePayloadImpl(
            @JsonProperty("customFields") final com.commercetools.api.models.type.CustomFields customFields,
            @JsonProperty("previousTypeId") final String previousTypeId) {
        this.customFields = customFields;
        this.previousTypeId = previousTypeId;
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
     *  <p><code>id</code> of the previous Custom Type.</p>
     *  <p>Absent when there has not been a Custom Type before.</p>
     */

    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    public void setCustomFields(final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
    }

    public void setPreviousTypeId(final String previousTypeId) {
        this.previousTypeId = previousTypeId;
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
                .append(type, that.type)
                .append(customFields, that.customFields)
                .append(previousTypeId, that.previousTypeId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customFields).append(previousTypeId).toHashCode();
    }

}
