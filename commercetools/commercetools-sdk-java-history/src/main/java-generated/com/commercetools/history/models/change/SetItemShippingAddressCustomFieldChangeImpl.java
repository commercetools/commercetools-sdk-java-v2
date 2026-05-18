
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetItemShippingAddressCustomFieldAction" rel="nofollow">Set ItemShipping Address CustomField</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetItemShippingAddressCustomFieldChangeImpl implements SetItemShippingAddressCustomFieldChange, ModelBase {

    private String type;

    private String change;

    private String addressId;

    private String name;

    private String customTypeId;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetItemShippingAddressCustomFieldChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("addressId") final String addressId, @JsonProperty("name") final String name,
            @JsonProperty("customTypeId") final String customTypeId,
            @JsonProperty("previousValue") final java.lang.Object previousValue,
            @JsonProperty("nextValue") final java.lang.Object nextValue) {
        this.change = change;
        this.addressId = addressId;
        this.name = name;
        this.customTypeId = customTypeId;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetItemShippingAddressCustomFieldChangeImpl() {
        this.type = SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD_CHANGE;
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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a>.</p>
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     */

    public String getCustomTypeId() {
        return this.customTypeId;
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

    public void setChange(final String change) {
        this.change = change;
    }

    public void setAddressId(final String addressId) {
        this.addressId = addressId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setCustomTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
    }

    public void setPreviousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetItemShippingAddressCustomFieldChangeImpl that = (SetItemShippingAddressCustomFieldChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(addressId, that.addressId)
                .append(name, that.name)
                .append(customTypeId, that.customTypeId)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(addressId, that.addressId)
                .append(name, that.name)
                .append(customTypeId, that.customTypeId)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(addressId)
                .append(name)
                .append(customTypeId)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("addressId", addressId)
                .append("name", name)
                .append("customTypeId", customTypeId)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public SetItemShippingAddressCustomFieldChange copyDeep() {
        return SetItemShippingAddressCustomFieldChange.deepCopy(this);
    }
}
