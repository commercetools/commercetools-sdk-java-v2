
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
public class TypeChangeLabelActionImpl implements TypeChangeLabelAction, ModelBase {

    private String action;

    private String fieldName;

    private com.commercetools.api.models.common.LocalizedString label;

    @JsonCreator
    TypeChangeLabelActionImpl(@JsonProperty("fieldName") final String fieldName,
            @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label) {
        this.fieldName = fieldName;
        this.label = label;
        this.action = CHANGE_LABEL;
    }

    public TypeChangeLabelActionImpl() {
        this.action = CHANGE_LABEL;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Name of the <a href="ctp:api:type:FieldDefinition">Field Definition</a> to update.</p>
    */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
    *  <p>JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values are the corresponding strings used for that language.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public void setLabel(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypeChangeLabelActionImpl that = (TypeChangeLabelActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(fieldName, that.fieldName)
                .append(label, that.label)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldName).append(label).toHashCode();
    }

}
