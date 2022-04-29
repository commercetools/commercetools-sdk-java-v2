
package com.commercetools.api.models.type;

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
public class TypeRemoveFieldDefinitionActionImpl implements TypeRemoveFieldDefinitionAction, ModelBase {

    private String action;

    private String fieldName;

    @JsonCreator
    TypeRemoveFieldDefinitionActionImpl(@JsonProperty("fieldName") final String fieldName) {
        this.fieldName = fieldName;
        this.action = REMOVE_FIELD_DEFINITION;
    }

    public TypeRemoveFieldDefinitionActionImpl() {
        this.action = REMOVE_FIELD_DEFINITION;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p><code>name</code> of the <a href="ctp:api:type:FieldDefinition">FieldDefinition</a> to remove.
    *  The removal of a FieldDefinition deletes <a href="/../api/general-concepts#eventual-consistency">asynchronously</a> all Custom Fields using the FieldDefinition as well.</p>
    */
    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypeRemoveFieldDefinitionActionImpl that = (TypeRemoveFieldDefinitionActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(fieldName, that.fieldName).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldName).toHashCode();
    }

}
