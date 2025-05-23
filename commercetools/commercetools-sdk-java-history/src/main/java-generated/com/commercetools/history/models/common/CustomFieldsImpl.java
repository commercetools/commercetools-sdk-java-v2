
package com.commercetools.history.models.common;

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
 * CustomFields
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldsImpl implements CustomFields, ModelBase {

    private com.commercetools.history.models.common.Reference type;

    private java.lang.Object fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomFieldsImpl(@JsonProperty("type") final com.commercetools.history.models.common.Reference type,
            @JsonProperty("fields") final java.lang.Object fields) {
        this.type = type;
        this.fields = fields;
    }

    /**
     * create empty instance
     */
    public CustomFieldsImpl() {
    }

    /**
     *
     */

    public com.commercetools.history.models.common.Reference getType() {
        return this.type;
    }

    /**
     *  <p>A valid JSON object, based on FieldDefinition.</p>
     */

    public java.lang.Object getFields() {
        return this.fields;
    }

    public void setType(final com.commercetools.history.models.common.Reference type) {
        this.type = type;
    }

    public void setFields(final java.lang.Object fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldsImpl that = (CustomFieldsImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(fields, that.fields)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(fields).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("fields", fields)
                .build();
    }

    @Override
    public CustomFields copyDeep() {
        return CustomFields.deepCopy(this);
    }
}
