
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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

    public StandalonePriceUpdateAction copyDeep();

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

        if (!(template instanceof StandalonePriceUpdateActionImpl)) {
            return template.copyDeep();
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
     * builder for removeStagedChanges subtype
     * @return builder
     */
    public static com.commercetools.api.models.standalone_price.StandalonePriceRemoveStagedChangesActionBuilder removeStagedChangesBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceRemoveStagedChangesActionBuilder.of();
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
