package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.channel.ChannelUpdateImpl;

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
@JsonDeserialize(as = ChannelUpdateImpl.class)
public interface ChannelUpdate extends com.commercetools.api.models.ResourceUpdate<ChannelUpdate, ChannelUpdateAction> {


    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ChannelUpdateAction> getActions();

    
    public void setVersion(final Long version);
    
    
    
    @JsonIgnore
    public void setActions(final ChannelUpdateAction ...actions);
    public void setActions(final List<ChannelUpdateAction> actions);

    public static ChannelUpdate of(){
        return new ChannelUpdateImpl();
    }
    

    public static ChannelUpdate of(final ChannelUpdate template) {
        ChannelUpdateImpl instance = new ChannelUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ChannelUpdateBuilder builder(){
        return ChannelUpdateBuilder.of();
    }
    
    public static ChannelUpdateBuilder builder(final ChannelUpdate template){
        return ChannelUpdateBuilder.of(template);
    }
    

    default <T> T withChannelUpdate(Function<ChannelUpdate, T> helper) {
        return helper.apply(this);
    }
}
