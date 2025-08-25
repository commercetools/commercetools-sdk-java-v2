
package com.commercetools.api.models.business_unit;

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
 *  <p>Adding or updating a Custom Type on an Address of a Business Unit generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddressCustomTypeSetMessage" rel="nofollow">BusinessUnitAddressCustomTypeSet</a> Message, and removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddressCustomTypeRemovedMessage" rel="nofollow">BusinessUnitAddressCustomTypeRemoved</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetAddressCustomTypeActionImpl implements BusinessUnitSetAddressCustomTypeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    private String addressId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitSetAddressCustomTypeActionImpl(
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields,
            @JsonProperty("addressId") final String addressId) {
        this.type = type;
        this.fields = fields;
        this.addressId = addressId;
        this.action = SET_ADDRESS_CUSTOM_TYPE;
    }

    /**
     * create empty instance
     */
    public BusinessUnitSetAddressCustomTypeActionImpl() {
        this.action = SET_ADDRESS_CUSTOM_TYPE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>address</code> with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     */

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> for the <code>address</code>.</p>
     */

    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     *  <p>ID of the address to be extended.</p>
     */

    public String getAddressId() {
        return this.addressId;
    }

    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
    }

    public void setFields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
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

        BusinessUnitSetAddressCustomTypeActionImpl that = (BusinessUnitSetAddressCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(type, that.type)
                .append(fields, that.fields)
                .append(addressId, that.addressId)
                .append(action, that.action)
                .append(type, that.type)
                .append(fields, that.fields)
                .append(addressId, that.addressId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(type).append(fields).append(addressId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("type", type)
                .append("fields", fields)
                .append("addressId", addressId)
                .build();
    }

    @Override
    public BusinessUnitSetAddressCustomTypeAction copyDeep() {
        return BusinessUnitSetAddressCustomTypeAction.deepCopy(this);
    }
}
