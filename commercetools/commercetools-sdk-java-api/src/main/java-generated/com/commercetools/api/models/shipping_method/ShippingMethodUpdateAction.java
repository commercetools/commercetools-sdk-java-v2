
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodUpdateAction shippingMethodUpdateAction = ShippingMethodUpdateAction.addShippingRateBuilder()
 *             zone(zoneBuilder -> zoneBuilder)
 *             shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodAddShippingRateActionImpl.class, name = ShippingMethodAddShippingRateAction.ADD_SHIPPING_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodAddZoneActionImpl.class, name = ShippingMethodAddZoneAction.ADD_ZONE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodChangeIsDefaultActionImpl.class, name = ShippingMethodChangeIsDefaultAction.CHANGE_IS_DEFAULT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodChangeNameActionImpl.class, name = ShippingMethodChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodChangeTaxCategoryActionImpl.class, name = ShippingMethodChangeTaxCategoryAction.CHANGE_TAX_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodRemoveShippingRateActionImpl.class, name = ShippingMethodRemoveShippingRateAction.REMOVE_SHIPPING_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneActionImpl.class, name = ShippingMethodRemoveZoneAction.REMOVE_ZONE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetCustomFieldActionImpl.class, name = ShippingMethodSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetCustomTypeActionImpl.class, name = ShippingMethodSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetDescriptionActionImpl.class, name = ShippingMethodSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetKeyActionImpl.class, name = ShippingMethodSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedDescriptionActionImpl.class, name = ShippingMethodSetLocalizedDescriptionAction.SET_LOCALIZED_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedNameActionImpl.class, name = ShippingMethodSetLocalizedNameAction.SET_LOCALIZED_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.shipping_method.ShippingMethodSetPredicateActionImpl.class, name = ShippingMethodSetPredicateAction.SET_PREDICATE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ShippingMethodUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ShippingMethodUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShippingMethodUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<ShippingMethodUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * builder for addShippingRate subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodAddShippingRateActionBuilder addShippingRateBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodAddShippingRateActionBuilder.of();
    }

    /**
     * builder for addZone subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodAddZoneActionBuilder addZoneBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodAddZoneActionBuilder.of();
    }

    /**
     * builder for changeIsDefault subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodChangeIsDefaultActionBuilder changeIsDefaultBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodChangeIsDefaultActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodChangeNameActionBuilder.of();
    }

    /**
     * builder for changeTaxCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodChangeTaxCategoryActionBuilder changeTaxCategoryBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodChangeTaxCategoryActionBuilder.of();
    }

    /**
     * builder for removeShippingRate subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodRemoveShippingRateActionBuilder removeShippingRateBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodRemoveShippingRateActionBuilder.of();
    }

    /**
     * builder for removeZone subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneActionBuilder removeZoneBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodSetKeyActionBuilder.of();
    }

    /**
     * builder for setLocalizedDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedDescriptionActionBuilder setLocalizedDescriptionBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedDescriptionActionBuilder.of();
    }

    /**
     * builder for setLocalizedName subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedNameActionBuilder setLocalizedNameBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedNameActionBuilder.of();
    }

    /**
     * builder for setPredicate subtype
     * @return builder
     */
    public static com.commercetools.api.models.shipping_method.ShippingMethodSetPredicateActionBuilder setPredicateBuilder() {
        return com.commercetools.api.models.shipping_method.ShippingMethodSetPredicateActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodUpdateAction(Function<ShippingMethodUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodUpdateAction>";
            }
        };
    }
}
