
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
public final class ChangeLabelChangeImpl implements ChangeLabelChange {

    private String type;

    private String change;

    private String fieldName;

    private String attributeName;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    @JsonCreator
    ChangeLabelChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("fieldName") final String fieldName,
            @JsonProperty("attributeName") final String attributeName,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.LocalizedString nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.change = change;
        this.fieldName = fieldName;
        this.attributeName = attributeName;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = CHANGE_LABEL_CHANGE;
    }

    public ChangeLabelChangeImpl() {
        this.type = CHANGE_LABEL_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>changeLabel</code> on product types and types</p>
    */
    public String getChange() {
        return this.change;
    }

    /**
    *  <p>The name of the field definition to update (types).</p>
    */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
    *  <p>The name of the attribute definition to update (product-type).</p>
    */
    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setNextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeLabelChangeImpl that = (ChangeLabelChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(fieldName, that.fieldName)
                .append(attributeName, that.attributeName)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(fieldName)
                .append(attributeName)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
