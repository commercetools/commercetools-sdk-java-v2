package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelUpdateImpl implements ChannelUpdate {

    private Long version;
    
    private java.util.List<com.commercetools.api.models.channel.ChannelUpdateAction> actions;

    @JsonCreator
    ChannelUpdateImpl(@JsonProperty("version") final Long version, @JsonProperty("actions") final java.util.List<com.commercetools.api.models.channel.ChannelUpdateAction> actions) {
        this.version = version;
        this.actions = actions;
    }
    public ChannelUpdateImpl() {
       
    }

    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.util.List<com.commercetools.api.models.channel.ChannelUpdateAction> getActions(){
        return this.actions;
    }

    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setActions(final com.commercetools.api.models.channel.ChannelUpdateAction ...actions){
       this.actions = new ArrayList<>(Arrays.asList(actions));
    }
    
    public void setActions(final java.util.List<com.commercetools.api.models.channel.ChannelUpdateAction> actions){
       this.actions = actions;
    }

}
