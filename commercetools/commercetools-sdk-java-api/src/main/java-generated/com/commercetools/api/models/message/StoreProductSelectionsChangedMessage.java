
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.store.ProductSelectionSetting;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreProductSelectionsChangedMessageImpl.class)
public interface StoreProductSelectionsChangedMessage extends Message {

    String STORE_PRODUCT_SELECTIONS_CHANGED = "StoreProductSelectionsChanged";

    @Valid
    @JsonProperty("addedProductSelections")
    public List<ProductSelectionSetting> getAddedProductSelections();

    @Valid
    @JsonProperty("removedProductSelections")
    public List<ProductSelectionSetting> getRemovedProductSelections();

    @Valid
    @JsonProperty("updatedProductSelections")
    public List<ProductSelectionSetting> getUpdatedProductSelections();

    @JsonIgnore
    public void setAddedProductSelections(final ProductSelectionSetting... addedProductSelections);

    public void setAddedProductSelections(final List<ProductSelectionSetting> addedProductSelections);

    @JsonIgnore
    public void setRemovedProductSelections(final ProductSelectionSetting... removedProductSelections);

    public void setRemovedProductSelections(final List<ProductSelectionSetting> removedProductSelections);

    @JsonIgnore
    public void setUpdatedProductSelections(final ProductSelectionSetting... updatedProductSelections);

    public void setUpdatedProductSelections(final List<ProductSelectionSetting> updatedProductSelections);

    public static StoreProductSelectionsChangedMessage of() {
        return new StoreProductSelectionsChangedMessageImpl();
    }

    public static StoreProductSelectionsChangedMessage of(final StoreProductSelectionsChangedMessage template) {
        StoreProductSelectionsChangedMessageImpl instance = new StoreProductSelectionsChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setAddedProductSelections(template.getAddedProductSelections());
        instance.setRemovedProductSelections(template.getRemovedProductSelections());
        instance.setUpdatedProductSelections(template.getUpdatedProductSelections());
        return instance;
    }

    public static StoreProductSelectionsChangedMessageBuilder builder() {
        return StoreProductSelectionsChangedMessageBuilder.of();
    }

    public static StoreProductSelectionsChangedMessageBuilder builder(
            final StoreProductSelectionsChangedMessage template) {
        return StoreProductSelectionsChangedMessageBuilder.of(template);
    }

    default <T> T withStoreProductSelectionsChangedMessage(Function<StoreProductSelectionsChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreProductSelectionsChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreProductSelectionsChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreProductSelectionsChangedMessage>";
            }
        };
    }
}
