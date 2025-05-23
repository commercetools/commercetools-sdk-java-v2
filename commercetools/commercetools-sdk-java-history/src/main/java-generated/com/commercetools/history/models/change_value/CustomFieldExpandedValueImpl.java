
package com.commercetools.history.models.change_value;

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
 *  <p>Only present if <code>expand</code> is set to <code>true</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldExpandedValueImpl implements CustomFieldExpandedValue, ModelBase {

    private String name;

    private java.lang.Object value;

    private com.commercetools.history.models.common.LocalizedString label;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomFieldExpandedValueImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value,
            @JsonProperty("label") final com.commercetools.history.models.common.LocalizedString label) {
        this.name = name;
        this.value = value;
        this.label = label;
    }

    /**
     * create empty instance
     */
    public CustomFieldExpandedValueImpl() {
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>User-defined label of the Custom Field.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    public void setLabel(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldExpandedValueImpl that = (CustomFieldExpandedValueImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(value, that.value)
                .append(label, that.label)
                .append(name, that.name)
                .append(value, that.value)
                .append(label, that.label)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(value).append(label).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("value", value)
                .append("label", label)
                .build();
    }

    @Override
    public CustomFieldExpandedValue copyDeep() {
        return CustomFieldExpandedValue.deepCopy(this);
    }
}
