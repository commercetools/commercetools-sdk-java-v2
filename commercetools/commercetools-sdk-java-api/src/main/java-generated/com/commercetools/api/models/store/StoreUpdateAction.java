package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreAddCountryAction;
import com.commercetools.api.models.store.StoreAddDistributionChannelAction;
import com.commercetools.api.models.store.StoreAddProductSelectionAction;
import com.commercetools.api.models.store.StoreAddSupplyChannelAction;
import com.commercetools.api.models.store.StoreChangeProductSelectionAction;
import com.commercetools.api.models.store.StoreRemoveCountryAction;
import com.commercetools.api.models.store.StoreRemoveDistributionChannelAction;
import com.commercetools.api.models.store.StoreRemoveProductSelectionAction;
import com.commercetools.api.models.store.StoreRemoveSupplyChannelAction;
import com.commercetools.api.models.store.StoreSetCountriesAction;
import com.commercetools.api.models.store.StoreSetCustomFieldAction;
import com.commercetools.api.models.store.StoreSetCustomTypeAction;
import com.commercetools.api.models.store.StoreSetDistributionChannelsAction;
import com.commercetools.api.models.store.StoreSetLanguagesAction;
import com.commercetools.api.models.store.StoreSetNameAction;
import com.commercetools.api.models.store.StoreSetProductSelectionsAction;
import com.commercetools.api.models.store.StoreSetSupplyChannelsAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreAddCountryActionImpl.class, name = StoreAddCountryAction.ADD_COUNTRY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreAddDistributionChannelActionImpl.class, name = StoreAddDistributionChannelAction.ADD_DISTRIBUTION_CHANNEL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreAddProductSelectionActionImpl.class, name = StoreAddProductSelectionAction.ADD_PRODUCT_SELECTION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreAddSupplyChannelActionImpl.class, name = StoreAddSupplyChannelAction.ADD_SUPPLY_CHANNEL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreChangeProductSelectionActionImpl.class, name = StoreChangeProductSelectionAction.CHANGE_PRODUCT_SELECTION_ACTIVE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreRemoveCountryActionImpl.class, name = StoreRemoveCountryAction.REMOVE_COUNTRY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreRemoveDistributionChannelActionImpl.class, name = StoreRemoveDistributionChannelAction.REMOVE_DISTRIBUTION_CHANNEL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreRemoveProductSelectionActionImpl.class, name = StoreRemoveProductSelectionAction.REMOVE_PRODUCT_SELECTION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreRemoveSupplyChannelActionImpl.class, name = StoreRemoveSupplyChannelAction.REMOVE_SUPPLY_CHANNEL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetCountriesActionImpl.class, name = StoreSetCountriesAction.SET_COUNTRIES),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetCustomFieldActionImpl.class, name = StoreSetCustomFieldAction.SET_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetCustomTypeActionImpl.class, name = StoreSetCustomTypeAction.SET_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetDistributionChannelsActionImpl.class, name = StoreSetDistributionChannelsAction.SET_DISTRIBUTION_CHANNELS),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetLanguagesActionImpl.class, name = StoreSetLanguagesAction.SET_LANGUAGES),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetNameActionImpl.class, name = StoreSetNameAction.SET_NAME),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetProductSelectionsActionImpl.class, name = StoreSetProductSelectionsAction.SET_PRODUCT_SELECTIONS),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetSupplyChannelsActionImpl.class, name = StoreSetSupplyChannelsAction.SET_SUPPLY_CHANNELS)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = StoreUpdateActionImpl.class,
    visible = true
)
@JsonDeserialize(as = StoreUpdateActionImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface StoreUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<StoreUpdateAction> {


    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();




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
        if (template instanceof com.commercetools.api.models.store.StoreAddCountryAction) {
            return com.commercetools.api.models.store.StoreAddCountryAction.deepCopy((com.commercetools.api.models.store.StoreAddCountryAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreAddDistributionChannelAction) {
            return com.commercetools.api.models.store.StoreAddDistributionChannelAction.deepCopy((com.commercetools.api.models.store.StoreAddDistributionChannelAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreAddProductSelectionAction) {
            return com.commercetools.api.models.store.StoreAddProductSelectionAction.deepCopy((com.commercetools.api.models.store.StoreAddProductSelectionAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreAddSupplyChannelAction) {
            return com.commercetools.api.models.store.StoreAddSupplyChannelAction.deepCopy((com.commercetools.api.models.store.StoreAddSupplyChannelAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreChangeProductSelectionAction) {
            return com.commercetools.api.models.store.StoreChangeProductSelectionAction.deepCopy((com.commercetools.api.models.store.StoreChangeProductSelectionAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreRemoveCountryAction) {
            return com.commercetools.api.models.store.StoreRemoveCountryAction.deepCopy((com.commercetools.api.models.store.StoreRemoveCountryAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreRemoveDistributionChannelAction) {
            return com.commercetools.api.models.store.StoreRemoveDistributionChannelAction.deepCopy((com.commercetools.api.models.store.StoreRemoveDistributionChannelAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreRemoveProductSelectionAction) {
            return com.commercetools.api.models.store.StoreRemoveProductSelectionAction.deepCopy((com.commercetools.api.models.store.StoreRemoveProductSelectionAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreRemoveSupplyChannelAction) {
            return com.commercetools.api.models.store.StoreRemoveSupplyChannelAction.deepCopy((com.commercetools.api.models.store.StoreRemoveSupplyChannelAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreSetCountriesAction) {
            return com.commercetools.api.models.store.StoreSetCountriesAction.deepCopy((com.commercetools.api.models.store.StoreSetCountriesAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreSetCustomFieldAction) {
            return com.commercetools.api.models.store.StoreSetCustomFieldAction.deepCopy((com.commercetools.api.models.store.StoreSetCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreSetCustomTypeAction) {
            return com.commercetools.api.models.store.StoreSetCustomTypeAction.deepCopy((com.commercetools.api.models.store.StoreSetCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreSetDistributionChannelsAction) {
            return com.commercetools.api.models.store.StoreSetDistributionChannelsAction.deepCopy((com.commercetools.api.models.store.StoreSetDistributionChannelsAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreSetLanguagesAction) {
            return com.commercetools.api.models.store.StoreSetLanguagesAction.deepCopy((com.commercetools.api.models.store.StoreSetLanguagesAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreSetNameAction) {
            return com.commercetools.api.models.store.StoreSetNameAction.deepCopy((com.commercetools.api.models.store.StoreSetNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreSetProductSelectionsAction) {
            return com.commercetools.api.models.store.StoreSetProductSelectionsAction.deepCopy((com.commercetools.api.models.store.StoreSetProductSelectionsAction)template);
        }
        if (template instanceof com.commercetools.api.models.store.StoreSetSupplyChannelsAction) {
            return com.commercetools.api.models.store.StoreSetSupplyChannelsAction.deepCopy((com.commercetools.api.models.store.StoreSetSupplyChannelsAction)template);
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
