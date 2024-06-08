
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ZoneUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneUpdateAction zoneUpdateAction = ZoneUpdateAction.addLocationBuilder()
 *             location(locationBuilder -> locationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneAddLocationActionImpl.class, name = ZoneAddLocationAction.ADD_LOCATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneChangeNameActionImpl.class, name = ZoneChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneRemoveLocationActionImpl.class, name = ZoneRemoveLocationAction.REMOVE_LOCATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneSetDescriptionActionImpl.class, name = ZoneSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneSetKeyActionImpl.class, name = ZoneSetKeyAction.SET_KEY) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ZoneUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ZoneUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ZoneUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ZoneUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * factory method to create a deep copy of ZoneUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ZoneUpdateAction deepCopy(@Nullable final ZoneUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.zone.ZoneAddLocationAction) {
            return com.commercetools.api.models.zone.ZoneAddLocationAction
                    .deepCopy((com.commercetools.api.models.zone.ZoneAddLocationAction) template);
        }
        if (template instanceof com.commercetools.api.models.zone.ZoneChangeNameAction) {
            return com.commercetools.api.models.zone.ZoneChangeNameAction
                    .deepCopy((com.commercetools.api.models.zone.ZoneChangeNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.zone.ZoneRemoveLocationAction) {
            return com.commercetools.api.models.zone.ZoneRemoveLocationAction
                    .deepCopy((com.commercetools.api.models.zone.ZoneRemoveLocationAction) template);
        }
        if (template instanceof com.commercetools.api.models.zone.ZoneSetDescriptionAction) {
            return com.commercetools.api.models.zone.ZoneSetDescriptionAction
                    .deepCopy((com.commercetools.api.models.zone.ZoneSetDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.zone.ZoneSetKeyAction) {
            return com.commercetools.api.models.zone.ZoneSetKeyAction
                    .deepCopy((com.commercetools.api.models.zone.ZoneSetKeyAction) template);
        }
        ZoneUpdateActionImpl instance = new ZoneUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addLocation subtype
     * @return builder
     */
    public static com.commercetools.api.models.zone.ZoneAddLocationActionBuilder addLocationBuilder() {
        return com.commercetools.api.models.zone.ZoneAddLocationActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.zone.ZoneChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.zone.ZoneChangeNameActionBuilder.of();
    }

    /**
     * builder for removeLocation subtype
     * @return builder
     */
    public static com.commercetools.api.models.zone.ZoneRemoveLocationActionBuilder removeLocationBuilder() {
        return com.commercetools.api.models.zone.ZoneRemoveLocationActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.zone.ZoneSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.zone.ZoneSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.zone.ZoneSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.zone.ZoneSetKeyActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withZoneUpdateAction(Function<ZoneUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ZoneUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneUpdateAction>";
            }
        };
    }
}
