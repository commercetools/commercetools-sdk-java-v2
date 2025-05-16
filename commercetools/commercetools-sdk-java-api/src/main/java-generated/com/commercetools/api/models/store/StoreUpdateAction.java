
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * StoreUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreUpdateAction storeUpdateAction = StoreUpdateAction.addCountryBuilder()
 *             country(countryBuilder -> countryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = StoreUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = StoreUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface StoreUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<StoreUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public StoreUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of StoreUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreUpdateAction deepCopy(@Nullable final StoreUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof StoreUpdateActionImpl)) {
            return template.copyDeep();
        }
        StoreUpdateActionImpl instance = new StoreUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addCountry subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreAddCountryActionBuilder addCountryBuilder() {
        return com.commercetools.api.models.store.StoreAddCountryActionBuilder.of();
    }

    /**
     * builder for addDistributionChannel subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreAddDistributionChannelActionBuilder addDistributionChannelBuilder() {
        return com.commercetools.api.models.store.StoreAddDistributionChannelActionBuilder.of();
    }

    /**
     * builder for addProductSelection subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreAddProductSelectionActionBuilder addProductSelectionBuilder() {
        return com.commercetools.api.models.store.StoreAddProductSelectionActionBuilder.of();
    }

    /**
     * builder for addSupplyChannel subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreAddSupplyChannelActionBuilder addSupplyChannelBuilder() {
        return com.commercetools.api.models.store.StoreAddSupplyChannelActionBuilder.of();
    }

    /**
     * builder for changeProductSelectionActive subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreChangeProductSelectionActionBuilder changeProductSelectionActiveBuilder() {
        return com.commercetools.api.models.store.StoreChangeProductSelectionActionBuilder.of();
    }

    /**
     * builder for removeCountry subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreRemoveCountryActionBuilder removeCountryBuilder() {
        return com.commercetools.api.models.store.StoreRemoveCountryActionBuilder.of();
    }

    /**
     * builder for removeDistributionChannel subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreRemoveDistributionChannelActionBuilder removeDistributionChannelBuilder() {
        return com.commercetools.api.models.store.StoreRemoveDistributionChannelActionBuilder.of();
    }

    /**
     * builder for removeProductSelection subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreRemoveProductSelectionActionBuilder removeProductSelectionBuilder() {
        return com.commercetools.api.models.store.StoreRemoveProductSelectionActionBuilder.of();
    }

    /**
     * builder for removeSupplyChannel subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreRemoveSupplyChannelActionBuilder removeSupplyChannelBuilder() {
        return com.commercetools.api.models.store.StoreRemoveSupplyChannelActionBuilder.of();
    }

    /**
     * builder for setCountries subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreSetCountriesActionBuilder setCountriesBuilder() {
        return com.commercetools.api.models.store.StoreSetCountriesActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.store.StoreSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.store.StoreSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDistributionChannels subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreSetDistributionChannelsActionBuilder setDistributionChannelsBuilder() {
        return com.commercetools.api.models.store.StoreSetDistributionChannelsActionBuilder.of();
    }

    /**
     * builder for setLanguages subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreSetLanguagesActionBuilder setLanguagesBuilder() {
        return com.commercetools.api.models.store.StoreSetLanguagesActionBuilder.of();
    }

    /**
     * builder for setName subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.store.StoreSetNameActionBuilder.of();
    }

    /**
     * builder for setProductSelections subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreSetProductSelectionsActionBuilder setProductSelectionsBuilder() {
        return com.commercetools.api.models.store.StoreSetProductSelectionsActionBuilder.of();
    }

    /**
     * builder for setSupplyChannels subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreSetSupplyChannelsActionBuilder setSupplyChannelsBuilder() {
        return com.commercetools.api.models.store.StoreSetSupplyChannelsActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreUpdateAction(Function<StoreUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreUpdateAction>";
            }
        };
    }
}
