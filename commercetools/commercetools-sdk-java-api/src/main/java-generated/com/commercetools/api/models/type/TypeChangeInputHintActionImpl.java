
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

/**
*  <p>Changes the <code>inputHint</code> of <a href="ctp:api:type:CustomFieldStringType">CustomFieldStringType</a> <a href="ctp:api:type:FieldDefinition">FieldDefinition</a>, a <a href="ctp:api:type:CustomFieldLocalizedStringType">CustomFieldLocalizedStringType</a> <a href="ctp:api:type:FieldDefinition">FieldDefinition</a>, and <a href="ctp:api:type:CustomFieldSetType">CustomFieldSetType</a> <a href="ctp:api:type:FieldDefinition">FieldDefinition</a> of these string-based FieldTypes.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypeChangeInputHintActionImpl implements TypeChangeInputHintAction, ModelBase {

    private String action;

    private String fieldName;

    private com.commercetools.api.models.type.TypeTextInputHint inputHint;

    @JsonCreator
    TypeChangeInputHintActionImpl(@JsonProperty("fieldName") final String fieldName,
            @JsonProperty("inputHint") final com.commercetools.api.models.type.TypeTextInputHint inputHint) {
        this.fieldName = fieldName;
        this.inputHint = inputHint;
        this.action = CHANGE_INPUT_HINT;
    }

    public TypeChangeInputHintActionImpl() {
        this.action = CHANGE_INPUT_HINT;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p><code>name</code> of the <a href="ctp:api:type:FieldDefinition">Field Definition</a> to update.</p>
    */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
    *  <p>New value to set.
    *  Must not be empty.</p>
    */
    public com.commercetools.api.models.type.TypeTextInputHint getInputHint() {
        return this.inputHint;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public void setInputHint(final com.commercetools.api.models.type.TypeTextInputHint inputHint) {
        this.inputHint = inputHint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypeChangeInputHintActionImpl that = (TypeChangeInputHintActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(fieldName, that.fieldName)
                .append(inputHint, that.inputHint)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldName).append(inputHint).toHashCode();
    }

}
