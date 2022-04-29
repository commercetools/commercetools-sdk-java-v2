
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelSetAddressCustomTypeActionImpl.class)
public interface ChannelSetAddressCustomTypeAction extends ChannelUpdateAction {

    String SET_ADDRESS_CUSTOM_TYPE = "setAddressCustomType";

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the <code>address</code> with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the <code>address</code>.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static ChannelSetAddressCustomTypeAction of() {
        return new ChannelSetAddressCustomTypeActionImpl();
    }

    public static ChannelSetAddressCustomTypeAction of(final ChannelSetAddressCustomTypeAction template) {
        ChannelSetAddressCustomTypeActionImpl instance = new ChannelSetAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static ChannelSetAddressCustomTypeActionBuilder builder() {
        return ChannelSetAddressCustomTypeActionBuilder.of();
    }

    public static ChannelSetAddressCustomTypeActionBuilder builder(final ChannelSetAddressCustomTypeAction template) {
        return ChannelSetAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withChannelSetAddressCustomTypeAction(Function<ChannelSetAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChannelSetAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelSetAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelSetAddressCustomTypeAction>";
            }
        };
    }
}
