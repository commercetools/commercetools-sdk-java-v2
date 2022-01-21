
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
public class SetPropertyChangeImpl implements SetPropertyChange, ModelBase {

    private String type;

    private String change;

    private String path;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    @JsonCreator
    SetPropertyChangeImpl(@JsonProperty("change") final String change, @JsonProperty("path") final String path,
            @JsonProperty("nextValue") final java.lang.Object nextValue,
            @JsonProperty("previousValue") final java.lang.Object previousValue) {
        this.change = change;
        this.path = path;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_PROPERTY_CHANGE;
    }

    public SetPropertyChangeImpl() {
        this.type = SET_PROPERTY_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setProperty</code> on custom objects</p>
    */
    public String getChange() {
        return this.change;
    }

    /**
    *  <p>Value path to the property that was changed</p>
    */
    public String getPath() {
        return this.path;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public void setNextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetPropertyChangeImpl that = (SetPropertyChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(path, that.path)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(path)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
