
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
@JsonDeserialize(as = StoreProductSelectionsChangedMessagePayloadImpl.class)
public interface StoreProductSelectionsChangedMessagePayload extends MessagePayload {

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

    public static StoreProductSelectionsChangedMessagePayload of() {
        return new StoreProductSelectionsChangedMessagePayloadImpl();
    }

    public static StoreProductSelectionsChangedMessagePayload of(
            final StoreProductSelectionsChangedMessagePayload template) {
        StoreProductSelectionsChangedMessagePayloadImpl instance = new StoreProductSelectionsChangedMessagePayloadImpl();
        instance.setAddedProductSelections(template.getAddedProductSelections());
        instance.setRemovedProductSelections(template.getRemovedProductSelections());
        instance.setUpdatedProductSelections(template.getUpdatedProductSelections());
        return instance;
    }

    public static StoreProductSelectionsChangedMessagePayloadBuilder builder() {
        return StoreProductSelectionsChangedMessagePayloadBuilder.of();
    }

    public static StoreProductSelectionsChangedMessagePayloadBuilder builder(
            final StoreProductSelectionsChangedMessagePayload template) {
        return StoreProductSelectionsChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withStoreProductSelectionsChangedMessagePayload(
            Function<StoreProductSelectionsChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreProductSelectionsChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreProductSelectionsChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreProductSelectionsChangedMessagePayload>";
            }
        };
    }
}
