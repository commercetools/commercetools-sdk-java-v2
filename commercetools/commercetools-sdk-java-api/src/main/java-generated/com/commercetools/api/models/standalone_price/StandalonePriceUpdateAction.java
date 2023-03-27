
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
 *     StandalonePriceUpdateAction standalonePriceUpdateAction = StandalonePriceUpdateAction.applyStagedChangesBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceApplyStagedChangesActionImpl.class, name = StandalonePriceApplyStagedChangesAction.APPLY_STAGED_CHANGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceChangeActiveActionImpl.class, name = StandalonePriceChangeActiveAction.CHANGE_ACTIVE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceChangeValueActionImpl.class, name = StandalonePriceChangeValueAction.CHANGE_VALUE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldActionImpl.class, name = StandalonePriceSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeActionImpl.class, name = StandalonePriceSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetDiscountedPriceActionImpl.class, name = StandalonePriceSetDiscountedPriceAction.SET_DISCOUNTED_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.standalone_price.StandalonePriceSetKeyActionImpl.class, name = StandalonePriceSetKeyAction.SET_KEY) })
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
