
package com.commercetools.history.models.change;

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
public class AddFieldDefinitionChangeImpl implements AddFieldDefinitionChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.FieldDefinition nextValue;

    @JsonCreator
    AddFieldDefinitionChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.FieldDefinition nextValue) {
        this.change = change;
        this.nextValue = nextValue;
        this.type = ADD_FIELD_DEFINITION_CHANGE;
    }

    public AddFieldDefinitionChangeImpl() {
        this.type = ADD_FIELD_DEFINITION_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>addFieldDefinition</code> on payments</p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.FieldDefinition getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.common.FieldDefinition nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AddFieldDefinitionChangeImpl that = (AddFieldDefinitionChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(nextValue).toHashCode();
    }

}
