
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
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Cart Discounts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CategorySetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Categories.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Channels.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Customers.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroupSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Customer Groups.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Discount Codes.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Inventories.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEditSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Order Edits.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Staged Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Payments.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Product Selections.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Quotes.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Staged Quotes.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequestSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Quote Requests.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Reviews.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Shopping Lists.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Stores.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomTypeChangeImpl implements SetCustomTypeChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetCustomTypeChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.CustomFields previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.CustomFields nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_CUSTOM_TYPE_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetCustomTypeChangeImpl() {
        this.type = SET_CUSTOM_TYPE_CHANGE;
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

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetCustomTypeChangeImpl that = (SetCustomTypeChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public SetCustomTypeChange copyDeep() {
        return SetCustomTypeChange.deepCopy(this);
    }
}
