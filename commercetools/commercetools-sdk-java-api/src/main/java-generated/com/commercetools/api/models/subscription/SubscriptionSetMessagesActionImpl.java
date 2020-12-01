package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.MessageSubscription;
import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
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
public final class SubscriptionSetMessagesActionImpl implements SubscriptionSetMessagesAction {

    private String action;
    
    private java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages;

    @JsonCreator
    SubscriptionSetMessagesActionImpl(@JsonProperty("messages") final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages) {
        this.messages = messages;
        this.action = "setMessages";
    }
    public SubscriptionSetMessagesActionImpl() {
        this.action = "setMessages";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.util.List<com.commercetools.api.models.subscription.MessageSubscription> getMessages(){
        return this.messages;
    }

    public void setMessages(final com.commercetools.api.models.subscription.MessageSubscription ...messages){
       this.messages = new ArrayList<>(Arrays.asList(messages));
    }
    
    public void setMessages(final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages){
       this.messages = messages;
    }

}
