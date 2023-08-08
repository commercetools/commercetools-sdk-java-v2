
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

/**
 *  <p>Change triggered by the Update CustomObject request when a new property is added.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddPropertyChangeImpl implements AddPropertyChange, ModelBase {

    private String type;

    private String change;

    private java.lang.Object nextValue;

    private String path;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AddPropertyChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final java.lang.Object nextValue, @JsonProperty("path") final String path) {
        this.change = change;
        this.nextValue = nextValue;
        this.path = path;
        this.type = ADD_PROPERTY_CHANGE;
    }

    /**
     * create empty instance
     */
    public AddPropertyChangeImpl() {
        this.type = ADD_PROPERTY_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Path to the new property that was added.</p>
     */

    public String getPath() {
        return this.path;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AddPropertyChangeImpl that = (AddPropertyChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(path, that.path)
                .append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(path, that.path)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(nextValue).append(path).toHashCode();
    }

}
