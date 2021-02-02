
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeChangeInputHintActionImpl implements TypeChangeInputHintAction {

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

    public String getFieldName() {
        return this.fieldName;
    }

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

        return new EqualsBuilder().append(action, that.action).append(fieldName, that.fieldName).append(inputHint,
            that.inputHint).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldName).append(inputHint).toHashCode();
    }

}
