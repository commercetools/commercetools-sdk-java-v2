
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * TypeRemoveFieldDefinitionAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeRemoveFieldDefinitionActionImpl implements TypeRemoveFieldDefinitionAction, ModelBase {

    private String action;

    private String fieldName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TypeRemoveFieldDefinitionActionImpl(@JsonProperty("fieldName") final String fieldName) {
        this.fieldName = fieldName;
        this.action = REMOVE_FIELD_DEFINITION;
    }

    /**
     * create empty instance
     */
    public TypeRemoveFieldDefinitionActionImpl() {
        this.action = REMOVE_FIELD_DEFINITION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a> to remove. The removal of a FieldDefinition deletes <span>asynchronously</span> all Custom Fields using the FieldDefinition as well.</p>
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

        return new EqualsBuilder().append(action, that.action)
                .append(fieldName, that.fieldName)
                .append(action, that.action)
                .append(fieldName, that.fieldName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldName).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("fieldName", fieldName)
                .build();
    }

    @Override
    public TypeRemoveFieldDefinitionAction copyDeep() {
        return TypeRemoveFieldDefinitionAction.deepCopy(this);
    }
}
