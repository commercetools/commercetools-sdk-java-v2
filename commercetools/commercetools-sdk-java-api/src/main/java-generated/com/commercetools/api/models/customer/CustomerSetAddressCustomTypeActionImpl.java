
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerSetAddressCustomTypeActionImpl implements CustomerSetAddressCustomTypeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    private String addressId;

    @JsonCreator
    CustomerSetAddressCustomTypeActionImpl(
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields,
            @JsonProperty("addressId") final String addressId) {
        this.type = type;
        this.fields = fields;
        this.addressId = addressId;
        this.action = SET_ADDRESS_CUSTOM_TYPE;
    }

    public CustomerSetAddressCustomTypeActionImpl() {
        this.action = SET_ADDRESS_CUSTOM_TYPE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the <code>address</code> with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
    */
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the <code>address</code>.</p>
    */
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

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

        CustomerSetAddressCustomTypeActionImpl that = (CustomerSetAddressCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(type, that.type)
                .append(fields, that.fields)
                .append(addressId, that.addressId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(type).append(fields).append(addressId).toHashCode();
    }

}
