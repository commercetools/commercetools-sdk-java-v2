
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
@JsonDeserialize(as = ChannelSetCustomTypeActionImpl.class)
public interface ChannelSetCustomTypeAction extends ChannelUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the Channel with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the Channel.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the Channel.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static ChannelSetCustomTypeAction of() {
        return new ChannelSetCustomTypeActionImpl();
    }

    public static ChannelSetCustomTypeAction of(final ChannelSetCustomTypeAction template) {
        ChannelSetCustomTypeActionImpl instance = new ChannelSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static ChannelSetCustomTypeActionBuilder builder() {
        return ChannelSetCustomTypeActionBuilder.of();
    }

    public static ChannelSetCustomTypeActionBuilder builder(final ChannelSetCustomTypeAction template) {
        return ChannelSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withChannelSetCustomTypeAction(Function<ChannelSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChannelSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelSetCustomTypeAction>";
            }
        };
    }
}
