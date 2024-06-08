
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ChannelUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelUpdateAction channelUpdateAction = ChannelUpdateAction.addRolesBuilder()
 *             plusRoles(rolesBuilder -> rolesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelAddRolesActionImpl.class, name = ChannelAddRolesAction.ADD_ROLES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelChangeDescriptionActionImpl.class, name = ChannelChangeDescriptionAction.CHANGE_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelChangeKeyActionImpl.class, name = ChannelChangeKeyAction.CHANGE_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelChangeNameActionImpl.class, name = ChannelChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelRemoveRolesActionImpl.class, name = ChannelRemoveRolesAction.REMOVE_ROLES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelSetAddressActionImpl.class, name = ChannelSetAddressAction.SET_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelSetAddressCustomFieldActionImpl.class, name = ChannelSetAddressCustomFieldAction.SET_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelSetAddressCustomTypeActionImpl.class, name = ChannelSetAddressCustomTypeAction.SET_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelSetCustomFieldActionImpl.class, name = ChannelSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelSetCustomTypeActionImpl.class, name = ChannelSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelSetGeoLocationActionImpl.class, name = ChannelSetGeoLocationAction.SET_GEO_LOCATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelSetRolesActionImpl.class, name = ChannelSetRolesAction.SET_ROLES) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ChannelUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ChannelUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ChannelUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ChannelUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * factory method to create a deep copy of ChannelUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelUpdateAction deepCopy(@Nullable final ChannelUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelAddRolesAction) {
            return com.commercetools.api.models.channel.ChannelAddRolesAction
                    .deepCopy((com.commercetools.api.models.channel.ChannelAddRolesAction) template);
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelChangeDescriptionAction) {
            return com.commercetools.api.models.channel.ChannelChangeDescriptionAction
                    .deepCopy((com.commercetools.api.models.channel.ChannelChangeDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelChangeKeyAction) {
            return com.commercetools.api.models.channel.ChannelChangeKeyAction
                    .deepCopy((com.commercetools.api.models.channel.ChannelChangeKeyAction) template);
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelChangeNameAction) {
            return com.commercetools.api.models.channel.ChannelChangeNameAction
                    .deepCopy((com.commercetools.api.models.channel.ChannelChangeNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelRemoveRolesAction) {
            return com.commercetools.api.models.channel.ChannelRemoveRolesAction
                    .deepCopy((com.commercetools.api.models.channel.ChannelRemoveRolesAction) template);
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelSetAddressAction) {
            return com.commercetools.api.models.channel.ChannelSetAddressAction
                    .deepCopy((com.commercetools.api.models.channel.ChannelSetAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelSetAddressCustomFieldAction) {
            return com.commercetools.api.models.channel.ChannelSetAddressCustomFieldAction
                    .deepCopy((com.commercetools.api.models.channel.ChannelSetAddressCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelSetAddressCustomTypeAction) {
            return com.commercetools.api.models.channel.ChannelSetAddressCustomTypeAction
                    .deepCopy((com.commercetools.api.models.channel.ChannelSetAddressCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelSetCustomFieldAction) {
            return com.commercetools.api.models.channel.ChannelSetCustomFieldAction
                    .deepCopy((com.commercetools.api.models.channel.ChannelSetCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelSetCustomTypeAction) {
            return com.commercetools.api.models.channel.ChannelSetCustomTypeAction
                    .deepCopy((com.commercetools.api.models.channel.ChannelSetCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelSetGeoLocationAction) {
            return com.commercetools.api.models.channel.ChannelSetGeoLocationAction
                    .deepCopy((com.commercetools.api.models.channel.ChannelSetGeoLocationAction) template);
        }
        if (template instanceof com.commercetools.api.models.channel.ChannelSetRolesAction) {
            return com.commercetools.api.models.channel.ChannelSetRolesAction
                    .deepCopy((com.commercetools.api.models.channel.ChannelSetRolesAction) template);
        }
        ChannelUpdateActionImpl instance = new ChannelUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addRoles subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelAddRolesActionBuilder addRolesBuilder() {
        return com.commercetools.api.models.channel.ChannelAddRolesActionBuilder.of();
    }

    /**
     * builder for changeDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelChangeDescriptionActionBuilder changeDescriptionBuilder() {
        return com.commercetools.api.models.channel.ChannelChangeDescriptionActionBuilder.of();
    }

    /**
     * builder for changeKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelChangeKeyActionBuilder changeKeyBuilder() {
        return com.commercetools.api.models.channel.ChannelChangeKeyActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.channel.ChannelChangeNameActionBuilder.of();
    }

    /**
     * builder for removeRoles subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelRemoveRolesActionBuilder removeRolesBuilder() {
        return com.commercetools.api.models.channel.ChannelRemoveRolesActionBuilder.of();
    }

    /**
     * builder for setAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelSetAddressActionBuilder setAddressBuilder() {
        return com.commercetools.api.models.channel.ChannelSetAddressActionBuilder.of();
    }

    /**
     * builder for setAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelSetAddressCustomFieldActionBuilder setAddressCustomFieldBuilder() {
        return com.commercetools.api.models.channel.ChannelSetAddressCustomFieldActionBuilder.of();
    }

    /**
     * builder for setAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelSetAddressCustomTypeActionBuilder setAddressCustomTypeBuilder() {
        return com.commercetools.api.models.channel.ChannelSetAddressCustomTypeActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.channel.ChannelSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.channel.ChannelSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setGeoLocation subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelSetGeoLocationActionBuilder setGeoLocationBuilder() {
        return com.commercetools.api.models.channel.ChannelSetGeoLocationActionBuilder.of();
    }

    /**
     * builder for setRoles subtype
     * @return builder
     */
    public static com.commercetools.api.models.channel.ChannelSetRolesActionBuilder setRolesBuilder() {
        return com.commercetools.api.models.channel.ChannelSetRolesActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelUpdateAction(Function<ChannelUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelUpdateAction>";
            }
        };
    }
}
