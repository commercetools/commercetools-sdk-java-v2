
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
 *  <p>Generated after changing an existing Custom Field on a Business Unit using the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCustomFieldChangedMessagePayloadImpl
        implements BusinessUnitCustomFieldChangedMessagePayload, ModelBase {

    private String type;

    private String name;

    private java.lang.Object value;

    private java.lang.Object oldValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitCustomFieldChangedMessagePayloadImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value,
            @JsonProperty("oldValue") final java.lang.Object oldValue) {
        this.name = name;
        this.value = value;
        this.oldValue = oldValue;
        this.type = BUSINESS_UNIT_CUSTOM_FIELD_CHANGED;
    }

    /**
     * create empty instance
     */
    public BusinessUnitCustomFieldChangedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_CUSTOM_FIELD_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the Custom Field that changed.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     */

    public java.lang.Object getOldValue() {
        return this.oldValue;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    public void setOldValue(final java.lang.Object oldValue) {
        this.oldValue = oldValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitCustomFieldChangedMessagePayloadImpl that = (BusinessUnitCustomFieldChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(value, that.value)
                .append(oldValue, that.oldValue)
                .append(type, that.type)
                .append(name, that.name)
                .append(value, that.value)
                .append(oldValue, that.oldValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).append(value).append(oldValue).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("name", name)
                .append("value", value)
                .append("oldValue", oldValue)
                .build();
    }

    @Override
    public BusinessUnitCustomFieldChangedMessagePayload copyDeep() {
        return BusinessUnitCustomFieldChangedMessagePayload.deepCopy(this);
    }
}
