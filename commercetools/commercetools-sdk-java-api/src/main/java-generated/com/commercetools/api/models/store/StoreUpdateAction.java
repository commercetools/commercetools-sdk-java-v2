
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreAddDistributionChannelActionImpl.class, name = StoreAddDistributionChannelAction.ADD_DISTRIBUTION_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreAddProductSelectionActionImpl.class, name = StoreAddProductSelectionAction.ADD_PRODUCT_SELECTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreAddSupplyChannelActionImpl.class, name = StoreAddSupplyChannelAction.ADD_SUPPLY_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreChangeProductSelectionActionImpl.class, name = StoreChangeProductSelectionAction.CHANGE_PRODUCT_SELECTION_ACTIVE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreRemoveDistributionChannelActionImpl.class, name = StoreRemoveDistributionChannelAction.REMOVE_DISTRIBUTION_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreRemoveProductSelectionActionImpl.class, name = StoreRemoveProductSelectionAction.REMOVE_PRODUCT_SELECTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreRemoveSupplyChannelActionImpl.class, name = StoreRemoveSupplyChannelAction.REMOVE_SUPPLY_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetCustomFieldActionImpl.class, name = StoreSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetCustomTypeActionImpl.class, name = StoreSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetDistributionChannelsActionImpl.class, name = StoreSetDistributionChannelsAction.SET_DISTRIBUTION_CHANNELS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetLanguagesActionImpl.class, name = StoreSetLanguagesAction.SET_LANGUAGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetNameActionImpl.class, name = StoreSetNameAction.SET_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetProductSelectionsActionImpl.class, name = StoreSetProductSelectionsAction.SET_PRODUCT_SELECTIONS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetSupplyChannelsActionImpl.class, name = StoreSetSupplyChannelsAction.SET_SUPPLY_CHANNELS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = StoreUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = StoreUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface StoreUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<StoreUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.store.StoreAddDistributionChannelActionBuilder addDistributionChannelBuilder() {
        return com.commercetools.api.models.store.StoreAddDistributionChannelActionBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreAddProductSelectionActionBuilder addProductSelectionBuilder() {
        return com.commercetools.api.models.store.StoreAddProductSelectionActionBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreAddSupplyChannelActionBuilder addSupplyChannelBuilder() {
        return com.commercetools.api.models.store.StoreAddSupplyChannelActionBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreChangeProductSelectionActionBuilder changeProductSelectionActiveBuilder() {
        return com.commercetools.api.models.store.StoreChangeProductSelectionActionBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreRemoveDistributionChannelActionBuilder removeDistributionChannelBuilder() {
        return com.commercetools.api.models.store.StoreRemoveDistributionChannelActionBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreRemoveProductSelectionActionBuilder removeProductSelectionBuilder() {
        return com.commercetools.api.models.store.StoreRemoveProductSelectionActionBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreRemoveSupplyChannelActionBuilder removeSupplyChannelBuilder() {
        return com.commercetools.api.models.store.StoreRemoveSupplyChannelActionBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.store.StoreSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.store.StoreSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreSetDistributionChannelsActionBuilder setDistributionChannelsBuilder() {
        return com.commercetools.api.models.store.StoreSetDistributionChannelsActionBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreSetLanguagesActionBuilder setLanguagesBuilder() {
        return com.commercetools.api.models.store.StoreSetLanguagesActionBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.store.StoreSetNameActionBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreSetProductSelectionsActionBuilder setProductSelectionsBuilder() {
        return com.commercetools.api.models.store.StoreSetProductSelectionsActionBuilder.of();
    }

    public static com.commercetools.api.models.store.StoreSetSupplyChannelsActionBuilder setSupplyChannelsBuilder() {
        return com.commercetools.api.models.store.StoreSetSupplyChannelsActionBuilder.of();
    }

    default <T> T withStoreUpdateAction(Function<StoreUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreUpdateAction>";
            }
        };
    }
}
