package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelAddRolesAction;
import com.commercetools.api.models.channel.ChannelChangeDescriptionAction;
import com.commercetools.api.models.channel.ChannelChangeKeyAction;
import com.commercetools.api.models.channel.ChannelChangeNameAction;
import com.commercetools.api.models.channel.ChannelRemoveRolesAction;
import com.commercetools.api.models.channel.ChannelSetAddressAction;
import com.commercetools.api.models.channel.ChannelSetCustomFieldAction;
import com.commercetools.api.models.channel.ChannelSetCustomTypeAction;
import com.commercetools.api.models.channel.ChannelSetGeoLocationAction;
import com.commercetools.api.models.channel.ChannelSetRolesAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelUpdateActionImpl implements ChannelUpdateAction {

    private String action;

    @JsonCreator
    ChannelUpdateActionImpl() {
        this.action = "null";
    }
    

    
    public String getAction(){
        return this.action;
    }


}
