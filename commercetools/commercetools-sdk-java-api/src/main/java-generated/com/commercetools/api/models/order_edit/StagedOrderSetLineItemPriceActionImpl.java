
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetLineItemPriceActionImpl implements StagedOrderSetLineItemPriceAction, ModelBase {

    private String action;

    private String lineItemId;

    private com.commercetools.api.models.common.Money externalPrice;

    @JsonCreator
    StagedOrderSetLineItemPriceActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice) {
        this.lineItemId = lineItemId;
        this.externalPrice = externalPrice;
        this.action = SET_LINE_ITEM_PRICE;
    }

    public StagedOrderSetLineItemPriceActionImpl() {
        this.action = SET_LINE_ITEM_PRICE;
    }

    public String getAction() {
        return this.action;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.
    *  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetLineItemPriceActionImpl that = (StagedOrderSetLineItemPriceActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(externalPrice, that.externalPrice)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemId).append(externalPrice).toHashCode();
    }

}
