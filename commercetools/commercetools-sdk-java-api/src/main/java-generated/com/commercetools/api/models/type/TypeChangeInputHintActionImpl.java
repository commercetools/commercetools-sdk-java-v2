
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
 *  <p>Changes the <code>inputHint</code> of CustomFieldStringType FieldDefinition, a CustomFieldLocalizedStringType FieldDefinition, and CustomFieldSetType FieldDefinition of these string-based FieldTypes.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeChangeInputHintActionImpl implements TypeChangeInputHintAction, ModelBase {

    private String action;

    private String fieldName;

    private com.commercetools.api.models.type.TypeTextInputHint inputHint;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TypeChangeInputHintActionImpl(@JsonProperty("fieldName") final String fieldName,
            @JsonProperty("inputHint") final com.commercetools.api.models.type.TypeTextInputHint inputHint) {
        this.fieldName = fieldName;
        this.inputHint = inputHint;
        this.action = CHANGE_INPUT_HINT;
    }

    /**
     * create empty instance
     */
    public TypeChangeInputHintActionImpl() {
        this.action = CHANGE_INPUT_HINT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>name</code> of the Field Definition to update.</p>
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
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
                .append(action, that.action)
                .append(fieldName, that.fieldName)
                .append(inputHint, that.inputHint)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldName).append(inputHint).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("fieldName", fieldName)
                .append("inputHint", inputHint)
                .build();
    }

    @Override
    public TypeChangeInputHintAction copyDeep() {
        return TypeChangeInputHintAction.deepCopy(this);
    }
}
