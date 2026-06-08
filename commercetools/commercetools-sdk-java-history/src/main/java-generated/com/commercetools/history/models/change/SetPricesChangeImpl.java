
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetPricesAction" rel="nofollow">Set Prices</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetPricesChangeImpl implements SetPricesChange, ModelBase {

    private String type;

    private String change;

    private java.util.List<com.commercetools.history.models.common.Price> previousValue;

    private java.util.List<com.commercetools.history.models.common.Price> nextValue;

    private String catalogData;

    private String variant;

    private java.util.List<com.commercetools.history.models.common.Price> addedItems;

    private java.util.List<com.commercetools.history.models.common.Price> removedItems;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetPricesChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.Price> previousValue,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.Price> nextValue,
            @JsonProperty("catalogData") final String catalogData, @JsonProperty("variant") final String variant,
            @JsonProperty("addedItems") final java.util.List<com.commercetools.history.models.common.Price> addedItems,
            @JsonProperty("removedItems") final java.util.List<com.commercetools.history.models.common.Price> removedItems) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.catalogData = catalogData;
        this.variant = variant;
        this.addedItems = addedItems;
        this.removedItems = removedItems;
        this.type = SET_PRICES_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetPricesChangeImpl() {
        this.type = SET_PRICES_CHANGE;
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

    public java.util.List<com.commercetools.history.models.common.Price> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public java.util.List<com.commercetools.history.models.common.Price> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     */

    public String getCatalogData() {
        return this.catalogData;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     *  <p>Elements added to the array.</p>
     */

    public java.util.List<com.commercetools.history.models.common.Price> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     */

    public java.util.List<com.commercetools.history.models.common.Price> getRemovedItems() {
        return this.removedItems;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Price... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(final java.util.List<com.commercetools.history.models.common.Price> previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.Price... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<com.commercetools.history.models.common.Price> nextValue) {
        this.nextValue = nextValue;
    }

    public void setCatalogData(final String catalogData) {
        this.catalogData = catalogData;
    }

    public void setVariant(final String variant) {
        this.variant = variant;
    }

    public void setAddedItems(final com.commercetools.history.models.common.Price... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
    }

    public void setAddedItems(final java.util.List<com.commercetools.history.models.common.Price> addedItems) {
        this.addedItems = addedItems;
    }

    public void setRemovedItems(final com.commercetools.history.models.common.Price... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
    }

    public void setRemovedItems(final java.util.List<com.commercetools.history.models.common.Price> removedItems) {
        this.removedItems = removedItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetPricesChangeImpl that = (SetPricesChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(catalogData, that.catalogData)
                .append(variant, that.variant)
                .append(addedItems, that.addedItems)
                .append(removedItems, that.removedItems)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(catalogData, that.catalogData)
                .append(variant, that.variant)
                .append(addedItems, that.addedItems)
                .append(removedItems, that.removedItems)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(catalogData)
                .append(variant)
                .append(addedItems)
                .append(removedItems)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("catalogData", catalogData)
                .append("variant", variant)
                .append("addedItems", addedItems)
                .append("removedItems", removedItems)
                .build();
    }

    @Override
    public SetPricesChange copyDeep() {
        return SetPricesChange.deepCopy(this);
    }
}
