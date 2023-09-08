
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
 *  <p>Generated after adding a Custom Field to a Business Unit using the Set CustomField update action. If a Custom Field already exists with the same name, a BusinessUnitCustomFieldChanged Message is generated instead.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCustomFieldAddedMessagePayloadImpl
        implements BusinessUnitCustomFieldAddedMessagePayload, ModelBase {

    private String type;

    private String name;

    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitCustomFieldAddedMessagePayloadImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value) {
        this.name = name;
        this.value = value;
        this.type = BUSINESS_UNIT_CUSTOM_FIELD_ADDED;
    }

    /**
     * create empty instance
     */
    public BusinessUnitCustomFieldAddedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_CUSTOM_FIELD_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the Custom Field that was added.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitCustomFieldAddedMessagePayloadImpl that = (BusinessUnitCustomFieldAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(value, that.value)
                .append(type, that.type)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).append(value).toHashCode();
    }

}
