
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
public class AddToCategoryChangeImpl implements AddToCategoryChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.Reference category;

    private java.util.List<com.commercetools.history.models.common.Reference> previousValue;

    private java.util.List<com.commercetools.history.models.common.Reference> nextValue;

    @JsonCreator
    AddToCategoryChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("category") final com.commercetools.history.models.common.Reference category,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.Reference> previousValue,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.Reference> nextValue) {
        this.change = change;
        this.category = category;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = ADD_TO_CATEGORY_CHANGE;
    }

    public AddToCategoryChangeImpl() {
        this.type = ADD_TO_CATEGORY_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>addToCategory</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Reference getCategory() {
        return this.category;
    }

    public java.util.List<com.commercetools.history.models.common.Reference> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.common.Reference> getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setCategory(final com.commercetools.history.models.common.Reference category) {
        this.category = category;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Reference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(
            final java.util.List<com.commercetools.history.models.common.Reference> previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.Reference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<com.commercetools.history.models.common.Reference> nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AddToCategoryChangeImpl that = (AddToCategoryChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(category, that.category)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(category)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
