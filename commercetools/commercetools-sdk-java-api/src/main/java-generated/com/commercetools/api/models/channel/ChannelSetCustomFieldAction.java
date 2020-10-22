package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.channel.ChannelSetCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ChannelSetCustomFieldActionImpl.class)
public interface ChannelSetCustomFieldAction extends ChannelUpdateAction {

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static ChannelSetCustomFieldActionImpl of(){
        return new ChannelSetCustomFieldActionImpl();
    }
    

    public static ChannelSetCustomFieldActionImpl of(final ChannelSetCustomFieldAction template) {
        ChannelSetCustomFieldActionImpl instance = new ChannelSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T extends Accessor<ChannelSetCustomFieldAction>> T withChannelSetCustomFieldAction(Function<ChannelSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
