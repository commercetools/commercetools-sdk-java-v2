
package com.commercetools.api.models.customer;

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
 *  <p>Adding or updating a Custom Type on an Address of a Customer generates the CustomerAddressCustomTypeSet Message, and removing one generates the CustomerAddressCustomTypeRemoved Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetAddressCustomTypeActionImpl implements CustomerSetAddressCustomTypeAction, ModelBase {

    private String action;

    private String addressId;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetAddressCustomTypeActionImpl(@JsonProperty("addressId") final String addressId,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.addressId = addressId;
        this.type = type;
        this.fields = fields;
        this.action = SET_ADDRESS_CUSTOM_TYPE;
    }

    /**
     * create empty instance
     */
    public CustomerSetAddressCustomTypeActionImpl() {
        this.action = SET_ADDRESS_CUSTOM_TYPE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>User-defined unique identifier of the Address to be updated.</p>
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Defines the Type that extends the <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     */

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code>.</p>
     */

    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public void setAddressId(final String addressId) {
        this.addressId = addressId;
    }

    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
    }

    public void setFields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSetAddressCustomTypeActionImpl that = (CustomerSetAddressCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(addressId, that.addressId)
                .append(type, that.type)
                .append(fields, that.fields)
                .append(action, that.action)
                .append(addressId, that.addressId)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(addressId).append(type).append(fields).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("addressId", addressId)
                .append("type", type)
                .append("fields", fields)
                .build();
    }

    @Override
    public CustomerSetAddressCustomTypeAction copyDeep() {
        return CustomerSetAddressCustomTypeAction.deepCopy(this);
    }
}
