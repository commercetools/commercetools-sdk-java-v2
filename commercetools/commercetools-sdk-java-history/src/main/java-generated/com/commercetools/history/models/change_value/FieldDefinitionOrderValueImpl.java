
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Shape of the value for action <code>changeFieldDefinitionOrder</code></p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class FieldDefinitionOrderValueImpl implements FieldDefinitionOrderValue {

    private String name;

    private com.commercetools.history.models.common.LocalizedString label;

    @JsonCreator
    FieldDefinitionOrderValueImpl(@JsonProperty("name") final String name,
            @JsonProperty("label") final com.commercetools.history.models.common.LocalizedString label) {
        this.name = name;
        this.label = label;
    }

    public FieldDefinitionOrderValueImpl() {
    }

    public String getName() {
        return this.name;
    }

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

        return new EqualsBuilder().append(name, that.name).append(label, that.label).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(label).toHashCode();
    }

}
