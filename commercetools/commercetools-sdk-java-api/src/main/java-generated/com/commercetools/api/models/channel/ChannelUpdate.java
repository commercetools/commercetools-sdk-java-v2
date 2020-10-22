package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.channel.ChannelUpdateImpl;

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
@JsonDeserialize(as = ChannelUpdateImpl.class)
public interface ChannelUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ChannelUpdateAction> getActions();

    public void setVersion(final Long version);
    
    public void setActions(final List<ChannelUpdateAction> actions);

    public static ChannelUpdateImpl of(){
        return new ChannelUpdateImpl();
    }
    

    public static ChannelUpdateImpl of(final ChannelUpdate template) {
        ChannelUpdateImpl instance = new ChannelUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T extends Accessor<ChannelUpdate>> T withChannelUpdate(Function<ChannelUpdate, T> helper) {
        return helper.apply(this);
    }
}
