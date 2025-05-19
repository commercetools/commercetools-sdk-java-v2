
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

    public ChannelUpdateAction copyDeep();

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

        if (!(template instanceof ChannelUpdateActionImpl)) {
            return template.copyDeep();
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
