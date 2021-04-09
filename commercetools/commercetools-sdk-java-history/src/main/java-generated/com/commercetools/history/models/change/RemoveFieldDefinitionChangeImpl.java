
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveFieldDefinitionChangeImpl implements RemoveFieldDefinitionChange {

    private String type;

    private String change;

    private com.commercetools.history.models.common.FieldDefinition previousValue;

    @JsonCreator
    RemoveFieldDefinitionChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.FieldDefinition previousValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.type = REMOVE_FIELD_DEFINITION_CHANGE;
    }

    public RemoveFieldDefinitionChangeImpl() {
        this.type = REMOVE_FIELD_DEFINITION_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>removeFieldDefinition</code> on payments</p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.FieldDefinition getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.FieldDefinition previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RemoveFieldDefinitionChangeImpl that = (RemoveFieldDefinitionChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(previousValue).toHashCode();
    }

}
