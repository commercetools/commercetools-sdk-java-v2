
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Change triggered by the Change AttributeDefinition IsSearchable update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeIsSearchableChangeImpl implements ChangeIsSearchableChange, ModelBase {

    private String type;

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    private String attributeName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeIsSearchableChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final Boolean previousValue,
            @JsonProperty("nextValue") final Boolean nextValue,
            @JsonProperty("attributeName") final String attributeName) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.attributeName = attributeName;
        this.type = CHANGE_IS_SEARCHABLE_CHANGE;
    }

    /**
     * create empty instance
     */
    public ChangeIsSearchableChangeImpl() {
        this.type = CHANGE_IS_SEARCHABLE_CHANGE;
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
     *  <p>Value before the change.</p>
     */

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public Boolean getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated AttributeDefinition.</p>
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeIsSearchableChangeImpl that = (ChangeIsSearchableChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(attributeName, that.attributeName)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(attributeName, that.attributeName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(attributeName)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("attributeName", attributeName)
                .build();
    }

    @Override
    public ChangeIsSearchableChange copyDeep() {
        return ChangeIsSearchableChange.deepCopy(this);
    }
}
