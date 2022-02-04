
package com.commercetools.api.models.message;

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
public class StoreProductSelectionsChangedMessagePayloadImpl
        implements StoreProductSelectionsChangedMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> addedProductSelections;

    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> removedProductSelections;

    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> updatedProductSelections;

    @JsonCreator
    StoreProductSelectionsChangedMessagePayloadImpl(
            @JsonProperty("addedProductSelections") final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> addedProductSelections,
            @JsonProperty("removedProductSelections") final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> removedProductSelections,
            @JsonProperty("updatedProductSelections") final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> updatedProductSelections) {
        this.addedProductSelections = addedProductSelections;
        this.removedProductSelections = removedProductSelections;
        this.updatedProductSelections = updatedProductSelections;
        this.type = STORE_PRODUCT_SELECTIONS_CHANGED;
    }

    public StoreProductSelectionsChangedMessagePayloadImpl() {
        this.type = STORE_PRODUCT_SELECTIONS_CHANGED;
    }

    public String getType() {
        return this.type;
    }

    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getAddedProductSelections() {
        return this.addedProductSelections;
    }

    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getRemovedProductSelections() {
        return this.removedProductSelections;
    }

    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getUpdatedProductSelections() {
        return this.updatedProductSelections;
    }

    public void setAddedProductSelections(
            final com.commercetools.api.models.store.ProductSelectionSetting... addedProductSelections) {
        this.addedProductSelections = new ArrayList<>(Arrays.asList(addedProductSelections));
    }

    public void setAddedProductSelections(
            final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> addedProductSelections) {
        this.addedProductSelections = addedProductSelections;
    }

    public void setRemovedProductSelections(
            final com.commercetools.api.models.store.ProductSelectionSetting... removedProductSelections) {
        this.removedProductSelections = new ArrayList<>(Arrays.asList(removedProductSelections));
    }

    public void setRemovedProductSelections(
            final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> removedProductSelections) {
        this.removedProductSelections = removedProductSelections;
    }

    public void setUpdatedProductSelections(
            final com.commercetools.api.models.store.ProductSelectionSetting... updatedProductSelections) {
        this.updatedProductSelections = new ArrayList<>(Arrays.asList(updatedProductSelections));
    }

    public void setUpdatedProductSelections(
            final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> updatedProductSelections) {
        this.updatedProductSelections = updatedProductSelections;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreProductSelectionsChangedMessagePayloadImpl that = (StoreProductSelectionsChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(addedProductSelections, that.addedProductSelections)
                .append(removedProductSelections, that.removedProductSelections)
                .append(updatedProductSelections, that.updatedProductSelections)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(addedProductSelections)
                .append(removedProductSelections)
                .append(updatedProductSelections)
                .toHashCode();
    }

}
