
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class FieldDefinitionImpl implements FieldDefinition, ModelBase {

    private com.commercetools.history.models.common.FieldType type;

    private String name;

    private com.commercetools.history.models.common.LocalizedString label;

    private com.commercetools.history.models.common.TextInputHint inputHint;

    @JsonCreator
    FieldDefinitionImpl(@JsonProperty("type") final com.commercetools.history.models.common.FieldType type,
            @JsonProperty("name") final String name,
            @JsonProperty("label") final com.commercetools.history.models.common.LocalizedString label,
            @JsonProperty("inputHint") final com.commercetools.history.models.common.TextInputHint inputHint) {
        this.type = type;
        this.name = name;
        this.label = label;
        this.inputHint = inputHint;
    }

    public FieldDefinitionImpl() {
    }

    public com.commercetools.history.models.common.FieldType getType() {
        return this.type;
    }

    /**
    *  <p>The name of the field. The name must be between two and 36 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>). The name must be unique for a given resource type ID. In case there is a field with the same name in another type it has to have the same FieldType also.</p>
    */
    public String getName() {
        return this.name;
    }

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public com.commercetools.history.models.common.TextInputHint getInputHint() {
        return this.inputHint;
    }

    public void setType(final com.commercetools.history.models.common.FieldType type) {
        this.type = type;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setLabel(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
    }

    public void setInputHint(final com.commercetools.history.models.common.TextInputHint inputHint) {
        this.inputHint = inputHint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        FieldDefinitionImpl that = (FieldDefinitionImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(label, that.label)
                .append(inputHint, that.inputHint)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).append(label).append(inputHint).toHashCode();
    }

}
