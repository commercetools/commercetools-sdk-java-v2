
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
 * SetLineItemProductKeyChange
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemProductKeyChangeImpl implements SetLineItemProductKeyChange, ModelBase {

    private String type;

    private String change;

    private String previousValue;

    private String nextValue;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String lineItemId;

    private String variant;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetLineItemProductKeyChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final String previousValue,
            @JsonProperty("nextValue") final String nextValue,
            @JsonProperty("lineItem") final com.commercetools.history.models.common.LocalizedString lineItem,
            @JsonProperty("lineItemId") final String lineItemId, @JsonProperty("variant") final String variant) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.lineItem = lineItem;
        this.lineItemId = lineItemId;
        this.variant = variant;
        this.type = SET_LINE_ITEM_PRODUCT_KEY_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetLineItemProductKeyChangeImpl() {
        this.type = SET_LINE_ITEM_PRODUCT_KEY_CHANGE;
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

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the Product the Line Item is based on.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    /**
     *  <p><code>id</code> of the updated LineItem.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>sku</code> or <code>key</code> of the updated ProductVariant.</p>
     */

    public String getVariant() {
        return this.variant;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final String previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final String nextValue) {
        this.nextValue = nextValue;
    }

    public void setLineItem(final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setVariant(final String variant) {
        this.variant = variant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetLineItemProductKeyChangeImpl that = (SetLineItemProductKeyChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(lineItem, that.lineItem)
                .append(lineItemId, that.lineItemId)
                .append(variant, that.variant)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(lineItem, that.lineItem)
                .append(lineItemId, that.lineItemId)
                .append(variant, that.variant)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(lineItem)
                .append(lineItemId)
                .append(variant)
                .toHashCode();
    }

}
