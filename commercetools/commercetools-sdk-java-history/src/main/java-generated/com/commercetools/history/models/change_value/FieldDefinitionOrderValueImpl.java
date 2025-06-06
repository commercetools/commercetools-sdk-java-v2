
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
 * FieldDefinitionOrderValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FieldDefinitionOrderValueImpl implements FieldDefinitionOrderValue, ModelBase {

    private String name;

    private com.commercetools.history.models.common.LocalizedString label;

    /**
     * create instance with all properties
     */
    @JsonCreator
    FieldDefinitionOrderValueImpl(@JsonProperty("name") final String name,
            @JsonProperty("label") final com.commercetools.history.models.common.LocalizedString label) {
        this.name = name;
        this.label = label;
    }

    /**
     * create empty instance
     */
    public FieldDefinitionOrderValueImpl() {
    }

    /**
     *  <p>Name of the FieldDefinition.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Descriptive label of the field.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public void setName(final String name) {
        this.name = name;
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

        FieldDefinitionOrderValueImpl that = (FieldDefinitionOrderValueImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(label, that.label)
                .append(name, that.name)
                .append(label, that.label)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(label).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("label", label)
                .build();
    }

    @Override
    public FieldDefinitionOrderValue copyDeep() {
        return FieldDefinitionOrderValue.deepCopy(this);
    }
}
