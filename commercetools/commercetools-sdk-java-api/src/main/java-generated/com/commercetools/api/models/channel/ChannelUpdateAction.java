
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ChannelUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ChannelUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.channel.ChannelAddRolesActionBuilder addRolesBuilder() {
        return com.commercetools.api.models.channel.ChannelAddRolesActionBuilder.of();
    }

    public static com.commercetools.api.models.channel.ChannelChangeDescriptionActionBuilder changeDescriptionBuilder() {
        return com.commercetools.api.models.channel.ChannelChangeDescriptionActionBuilder.of();
    }

    public static com.commercetools.api.models.channel.ChannelChangeKeyActionBuilder changeKeyBuilder() {
        return com.commercetools.api.models.channel.ChannelChangeKeyActionBuilder.of();
    }

    public static com.commercetools.api.models.channel.ChannelChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.channel.ChannelChangeNameActionBuilder.of();
    }

    public static com.commercetools.api.models.channel.ChannelRemoveRolesActionBuilder removeRolesBuilder() {
        return com.commercetools.api.models.channel.ChannelRemoveRolesActionBuilder.of();
    }

    public static com.commercetools.api.models.channel.ChannelSetAddressActionBuilder setAddressBuilder() {
        return com.commercetools.api.models.channel.ChannelSetAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.channel.ChannelSetAddressCustomFieldActionBuilder setAddressCustomFieldBuilder() {
        return com.commercetools.api.models.channel.ChannelSetAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.channel.ChannelSetAddressCustomTypeActionBuilder setAddressCustomTypeBuilder() {
        return com.commercetools.api.models.channel.ChannelSetAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.channel.ChannelSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.channel.ChannelSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.channel.ChannelSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.channel.ChannelSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.channel.ChannelSetGeoLocationActionBuilder setGeoLocationBuilder() {
        return com.commercetools.api.models.channel.ChannelSetGeoLocationActionBuilder.of();
    }

    public static com.commercetools.api.models.channel.ChannelSetRolesActionBuilder setRolesBuilder() {
        return com.commercetools.api.models.channel.ChannelSetRolesActionBuilder.of();
    }

    default <T> T withChannelUpdateAction(Function<ChannelUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChannelUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelUpdateAction>";
            }
        };
    }
}
