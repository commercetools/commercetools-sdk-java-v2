
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceUpdateAction standalonePriceUpdateAction = StandalonePriceUpdateAction.addPriceTierBuilder()
 *             tier(tierBuilder -> tierBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceAddPriceTierActionImpl.class, name = StandalonePriceAddPriceTierAction.ADD_PRICE_TIER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceApplyStagedChangesActionImpl.class, name = StandalonePriceApplyStagedChangesAction.APPLY_STAGED_CHANGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceChangeActiveActionImpl.class, name = StandalonePriceChangeActiveAction.CHANGE_ACTIVE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceChangeValueActionImpl.class, name = StandalonePriceChangeValueAction.CHANGE_VALUE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceRemovePriceTierActionImpl.class, name = StandalonePriceRemovePriceTierAction.REMOVE_PRICE_TIER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldActionImpl.class, name = StandalonePriceSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeActionImpl.class, name = StandalonePriceSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetDiscountedPriceActionImpl.class, name = StandalonePriceSetDiscountedPriceAction.SET_DISCOUNTED_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetKeyActionImpl.class, name = StandalonePriceSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetPriceTiersActionImpl.class, name = StandalonePriceSetPriceTiersAction.SET_PRICE_TIERS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetValidFromActionImpl.class, name = StandalonePriceSetValidFromAction.SET_VALID_FROM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetValidFromAndUntilActionImpl.class, name = StandalonePriceSetValidFromAndUntilAction.SET_VALID_FROM_AND_UNTIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetValidUntilActionImpl.class, name = StandalonePriceSetValidUntilAction.SET_VALID_UNTIL) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = StandalonePriceUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = StandalonePriceUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface StandalonePriceUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<StandalonePriceUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * factory method to create a deep copy of StandalonePriceUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceUpdateAction deepCopy(@Nullable final StandalonePriceUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceAddPriceTierAction) {
            return com.commercetools.api.models.standalone_price.StandalonePriceAddPriceTierAction.deepCopy(
                (com.commercetools.api.models.standalone_price.StandalonePriceAddPriceTierAction) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceApplyStagedChangesAction) {
            return com.commercetools.api.models.standalone_price.StandalonePriceApplyStagedChangesAction.deepCopy(
                (com.commercetools.api.models.standalone_price.StandalonePriceApplyStagedChangesAction) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceChangeActiveAction) {
            return com.commercetools.api.models.standalone_price.StandalonePriceChangeActiveAction.deepCopy(
                (com.commercetools.api.models.standalone_price.StandalonePriceChangeActiveAction) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceChangeValueAction) {
            return com.commercetools.api.models.standalone_price.StandalonePriceChangeValueAction.deepCopy(
                (com.commercetools.api.models.standalone_price.StandalonePriceChangeValueAction) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceRemovePriceTierAction) {
            return com.commercetools.api.models.standalone_price.StandalonePriceRemovePriceTierAction.deepCopy(
                (com.commercetools.api.models.standalone_price.StandalonePriceRemovePriceTierAction) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldAction) {
            return com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldAction.deepCopy(
                (com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeAction) {
            return com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeAction.deepCopy(
                (com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceSetDiscountedPriceAction) {
            return com.commercetools.api.models.standalone_price.StandalonePriceSetDiscountedPriceAction.deepCopy(
                (com.commercetools.api.models.standalone_price.StandalonePriceSetDiscountedPriceAction) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceSetKeyAction) {
            return com.commercetools.api.models.standalone_price.StandalonePriceSetKeyAction
                    .deepCopy((com.commercetools.api.models.standalone_price.StandalonePriceSetKeyAction) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceSetPriceTiersAction) {
            return com.commercetools.api.models.standalone_price.StandalonePriceSetPriceTiersAction.deepCopy(
                (com.commercetools.api.models.standalone_price.StandalonePriceSetPriceTiersAction) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceSetValidFromAction) {
            return com.commercetools.api.models.standalone_price.StandalonePriceSetValidFromAction.deepCopy(
                (com.commercetools.api.models.standalone_price.StandalonePriceSetValidFromAction) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceSetValidFromAndUntilAction) {
            return com.commercetools.api.models.standalone_price.StandalonePriceSetValidFromAndUntilAction.deepCopy(
                (com.commercetools.api.models.standalone_price.StandalonePriceSetValidFromAndUntilAction) template);
        }
        if (template instanceof com.commercetools.api.models.standalone_price.StandalonePriceSetValidUntilAction) {
            return com.commercetools.api.models.standalone_price.StandalonePriceSetValidUntilAction.deepCopy(
                (com.commercetools.api.models.standalone_price.StandalonePriceSetValidUntilAction) template);
        }
        StandalonePriceUpdateActionImpl instance = new StandalonePriceUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addPriceTier subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceAddPriceTierActionBuilder addPriceTierBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceAddPriceTierActionBuilder.of();
    }

    /**
     * builder for applyStagedChanges subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceApplyStagedChangesActionBuilder applyStagedChangesBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceApplyStagedChangesActionBuilder.of();
    }

    /**
     * builder for changeActive subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceChangeActiveActionBuilder changeActiveBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceChangeActiveActionBuilder.of();
    }

    /**
     * builder for changeValue subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceChangeValueActionBuilder changeValueBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceChangeValueActionBuilder.of();
    }

    /**
     * builder for removePriceTier subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceRemovePriceTierActionBuilder removePriceTierBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceRemovePriceTierActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDiscountedPrice subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceSetDiscountedPriceActionBuilder setDiscountedPriceBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetDiscountedPriceActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetKeyActionBuilder.of();
    }

    /**
     * builder for setPriceTiers subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceSetPriceTiersActionBuilder setPriceTiersBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetPriceTiersActionBuilder.of();
    }

    /**
     * builder for setValidFrom subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceSetValidFromActionBuilder setValidFromBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetValidFromActionBuilder.of();
    }

    /**
     * builder for setValidFromAndUntil subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceSetValidFromAndUntilActionBuilder setValidFromAndUntilBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetValidFromAndUntilActionBuilder.of();
    }

    /**
     * builder for setValidUntil subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceSetValidUntilActionBuilder setValidUntilBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetValidUntilActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceUpdateAction(Function<StandalonePriceUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceUpdateAction>";
            }
        };
    }
}
