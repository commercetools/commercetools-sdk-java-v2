
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
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Cart Discounts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CategorySetCustomFieldAction" rel="nofollow">Set CustomField</a> on Categories.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Channels.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Customers.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroupSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Customer Groups.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Discount Codes.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetCustomFieldAction" rel="nofollow">Set CustomField</a> on Inventories.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEditSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Order Edits.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Payments.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Product Selections.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Quotes.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequestSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Quote Requests.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Reviews.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Shopping Lists.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Staged Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Staged Quotes.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Stores.</li>
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("name", name)
                .append("customTypeId", customTypeId)
                .build();
    }

    @Override
    public SetCustomFieldChange copyDeep() {
        return SetCustomFieldChange.deepCopy(this);
    }
}
