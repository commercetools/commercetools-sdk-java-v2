package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.channel.ChannelChangeNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ChannelChangeNameActionImpl.class)
public interface ChannelChangeNameAction extends ChannelUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static ChannelChangeNameActionImpl of(){
        return new ChannelChangeNameActionImpl();
    }
    

    public static ChannelChangeNameActionImpl of(final ChannelChangeNameAction template) {
        ChannelChangeNameActionImpl instance = new ChannelChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    default <T> T withChannelChangeNameAction(Function<ChannelChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
