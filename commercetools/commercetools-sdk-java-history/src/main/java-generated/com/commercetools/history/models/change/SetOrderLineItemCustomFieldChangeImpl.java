
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
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetLineItemCustomFieldAction" rel="nofollow">Set LineItem CustomField</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetLineItemCustomFieldAction" rel="nofollow">Set LineItem CustomField</a> on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetOrderLineItemCustomFieldChangeImpl implements SetOrderLineItemCustomFieldChange, ModelBase {

    private String type;

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    private String customTypeId;

    private String name;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private String lineItemId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetOrderLineItemCustomFieldChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.lang.Object previousValue,
            @JsonProperty("nextValue") final java.lang.Object nextValue,
            @JsonProperty("customTypeId") final String customTypeId, @JsonProperty("name") final String name,
            @JsonProperty("lineItem") final com.commercetools.history.models.common.LocalizedString lineItem,
            @JsonProperty("variant") final String variant, @JsonProperty("lineItemId") final String lineItemId) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.customTypeId = customTypeId;
        this.name = name;
        this.lineItem = lineItem;
        this.variant = variant;
        this.lineItemId = lineItemId;
        this.type = SET_ORDER_LINE_ITEM_CUSTOM_FIELD_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetOrderLineItemCustomFieldChangeImpl() {
        this.type = SET_ORDER_LINE_ITEM_CUSTOM_FIELD_CHANGE;
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
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     */

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
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

    public void setCustomTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setLineItem(final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
    }

    public void setVariant(final String variant) {
        this.variant = variant;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetOrderLineItemCustomFieldChangeImpl that = (SetOrderLineItemCustomFieldChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(customTypeId, that.customTypeId)
                .append(name, that.name)
                .append(lineItem, that.lineItem)
                .append(variant, that.variant)
                .append(lineItemId, that.lineItemId)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(customTypeId, that.customTypeId)
                .append(name, that.name)
                .append(lineItem, that.lineItem)
                .append(variant, that.variant)
                .append(lineItemId, that.lineItemId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(customTypeId)
                .append(name)
                .append(lineItem)
                .append(variant)
                .append(lineItemId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("customTypeId", customTypeId)
                .append("name", name)
                .append("lineItem", lineItem)
                .append("variant", variant)
                .append("lineItemId", lineItemId)
                .build();
    }

    @Override
    public SetOrderLineItemCustomFieldChange copyDeep() {
        return SetOrderLineItemCustomFieldChange.deepCopy(this);
    }
}
