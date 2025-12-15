
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderChangePriceRoundingModeAction" rel="nofollow">Change Price Rounding Mode</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeLineItemPriceRoundingModeChangeImpl implements ChangeLineItemPriceRoundingModeChange, ModelBase {

    private String type;

    private String change;

    private String variant;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String lineItemId;

    private com.commercetools.history.models.common.RoundingMode previousValue;

    private com.commercetools.history.models.common.RoundingMode nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeLineItemPriceRoundingModeChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("variant") final String variant,
            @JsonProperty("lineItem") final com.commercetools.history.models.common.LocalizedString lineItem,
            @JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.RoundingMode previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.RoundingMode nextValue) {
        this.change = change;
        this.variant = variant;
        this.lineItem = lineItem;
        this.lineItemId = lineItemId;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = CHANGE_LINE_ITEM_PRICE_ROUNDING_MODE_CHANGE;
    }

    /**
     * create empty instance
     */
    public ChangeLineItemPriceRoundingModeChangeImpl() {
        this.type = CHANGE_LINE_ITEM_PRICE_ROUNDING_MODE_CHANGE;
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
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.RoundingMode getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.RoundingMode getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setVariant(final String variant) {
        this.variant = variant;
    }

    public void setLineItem(final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.RoundingMode previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.RoundingMode nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeLineItemPriceRoundingModeChangeImpl that = (ChangeLineItemPriceRoundingModeChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(variant, that.variant)
                .append(lineItem, that.lineItem)
                .append(lineItemId, that.lineItemId)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(variant, that.variant)
                .append(lineItem, that.lineItem)
                .append(lineItemId, that.lineItemId)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(variant)
                .append(lineItem)
                .append(lineItemId)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("variant", variant)
                .append("lineItem", lineItem)
                .append("lineItemId", lineItemId)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public ChangeLineItemPriceRoundingModeChange copyDeep() {
        return ChangeLineItemPriceRoundingModeChange.deepCopy(this);
    }
}
