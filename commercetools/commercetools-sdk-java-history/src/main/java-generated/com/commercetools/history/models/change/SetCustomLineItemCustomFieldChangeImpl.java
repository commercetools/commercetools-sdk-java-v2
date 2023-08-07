
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
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set CustomLineItem Custom Type on Orders.</li>
 *   <li>Set CustomLineItem Custom Type on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomLineItemCustomFieldChangeImpl implements SetCustomLineItemCustomFieldChange, ModelBase {

    private String type;

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    private String name;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetCustomLineItemCustomFieldChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.lang.Object previousValue,
            @JsonProperty("nextValue") final java.lang.Object nextValue, @JsonProperty("name") final String name,
            @JsonProperty("customLineItem") final com.commercetools.history.models.common.LocalizedString customLineItem,
            @JsonProperty("customLineItemId") final String customLineItemId) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.name = name;
        this.customLineItem = customLineItem;
        this.customLineItemId = customLineItemId;
        this.type = SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetCustomLineItemCustomFieldChangeImpl() {
        this.type = SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD_CHANGE;
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

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Name of the updated CustomLineItem.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    /**
     *  <p><code>id</code> of the updated CustomLineItem.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setCustomLineItem(final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetCustomLineItemCustomFieldChangeImpl that = (SetCustomLineItemCustomFieldChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(name, that.name)
                .append(customLineItem, that.customLineItem)
                .append(customLineItemId, that.customLineItemId)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(name, that.name)
                .append(customLineItem, that.customLineItem)
                .append(customLineItemId, that.customLineItemId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(name)
                .append(customLineItem)
                .append(customLineItemId)
                .toHashCode();
    }

}
