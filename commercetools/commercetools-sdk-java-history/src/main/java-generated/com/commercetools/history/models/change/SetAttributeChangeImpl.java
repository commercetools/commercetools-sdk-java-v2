
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
 *  <p>Change triggered by the Set Attribute update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAttributeChangeImpl implements SetAttributeChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.change_value.AttributeValue previousValue;

    private com.commercetools.history.models.change_value.AttributeValue nextValue;

    private String catalogData;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetAttributeChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.change_value.AttributeValue previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.change_value.AttributeValue nextValue,
            @JsonProperty("catalogData") final String catalogData) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.catalogData = catalogData;
        this.type = SET_ATTRIBUTE_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetAttributeChangeImpl() {
        this.type = SET_ATTRIBUTE_CHANGE;
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

    public com.commercetools.history.models.change_value.AttributeValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.change_value.AttributeValue getNextValue() {
        return this.nextValue;
    }

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged ProductCatalogData was updated.</li>
     *   <li><code>current</code>, if the current ProductCatalogData was updated.</li>
     *  </ul>
     */

    public String getCatalogData() {
        return this.catalogData;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.change_value.AttributeValue previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.change_value.AttributeValue nextValue) {
        this.nextValue = nextValue;
    }

    public void setCatalogData(final String catalogData) {
        this.catalogData = catalogData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetAttributeChangeImpl that = (SetAttributeChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(catalogData, that.catalogData)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(catalogData, that.catalogData)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(catalogData)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("catalogData", catalogData)
                .build();
    }

}
