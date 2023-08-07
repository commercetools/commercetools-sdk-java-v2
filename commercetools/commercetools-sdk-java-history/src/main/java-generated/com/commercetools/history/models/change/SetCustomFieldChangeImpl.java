
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
 *   <li>Set CustomField on Cart Discounts.</li>
 *   <li>Set CustomField on Categories.</li>
 *   <li>Set CustomField on Channels.</li>
 *   <li>Set CustomField on Customers.</li>
 *   <li>Set CustomField on Customer Groups.</li>
 *   <li>Set CustomField on Discount Codes.</li>
 *   <li>Set CustomField on Inventories.</li>
 *   <li>Set CustomField on Orders.</li>
 *   <li>Set CustomField on Order Edits.</li>
 *   <li>Set CustomField on Payments.</li>
 *   <li>Set CustomField on Product Selections.</li>
 *   <li>Set CustomField on Quotes.</li>
 *   <li>Set CustomField on Quote Requests.</li>
 *   <li>Set CustomField on Reviews.</li>
 *   <li>Set CustomField on Shopping Lists.</li>
 *   <li>Set CustomField on Staged Orders.</li>
 *   <li>Set CustomField on Staged Quotes.</li>
 *   <li>Set CustomField on Stores.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomFieldChangeImpl implements SetCustomFieldChange, ModelBase {

    private String type;

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    private String name;

    private String customTypeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetCustomFieldChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.lang.Object previousValue,
            @JsonProperty("nextValue") final java.lang.Object nextValue, @JsonProperty("name") final String name,
            @JsonProperty("customTypeId") final String customTypeId) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.name = name;
        this.customTypeId = customTypeId;
        this.type = SET_CUSTOM_FIELD_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetCustomFieldChangeImpl() {
        this.type = SET_CUSTOM_FIELD_CHANGE;
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
     *  <p><code>id</code> of the referenced Type.</p>
     */

    public String getCustomTypeId() {
        return this.customTypeId;
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

    public void setCustomTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetCustomFieldChangeImpl that = (SetCustomFieldChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(name, that.name)
                .append(customTypeId, that.customTypeId)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(name, that.name)
                .append(customTypeId, that.customTypeId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(name)
                .append(customTypeId)
                .toHashCode();
    }

}
