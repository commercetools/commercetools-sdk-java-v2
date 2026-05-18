
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
 * SetAddressCustomFieldChange
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAddressCustomFieldChangeImpl implements SetAddressCustomFieldChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.Address address;

    private String name;

    private String customTypeId;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetAddressCustomFieldChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("address") final com.commercetools.history.models.common.Address address,
            @JsonProperty("name") final String name, @JsonProperty("customTypeId") final String customTypeId,
            @JsonProperty("previousValue") final java.lang.Object previousValue,
            @JsonProperty("nextValue") final java.lang.Object nextValue) {
        this.change = change;
        this.address = address;
        this.name = name;
        this.customTypeId = customTypeId;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_ADDRESS_CUSTOM_FIELD_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetAddressCustomFieldChangeImpl() {
        this.type = SET_ADDRESS_CUSTOM_FIELD_CHANGE;
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> which was extended.</p>
     */

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Field</a>.</p>
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

    public void setAddress(final com.commercetools.history.models.common.Address address) {
        this.address = address;
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

        SetAddressCustomFieldChangeImpl that = (SetAddressCustomFieldChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(address, that.address)
                .append(name, that.name)
                .append(customTypeId, that.customTypeId)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(address, that.address)
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
                .append(address)
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
                .append("address", address)
                .append("name", name)
                .append("customTypeId", customTypeId)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public SetAddressCustomFieldChange copyDeep() {
        return SetAddressCustomFieldChange.deepCopy(this);
    }
}
