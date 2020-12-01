package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.type.CustomFields;
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
public final class PaymentInteractionAddedMessagePayloadImpl implements PaymentInteractionAddedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.type.CustomFields interaction;

    @JsonCreator
    PaymentInteractionAddedMessagePayloadImpl(@JsonProperty("interaction") final com.commercetools.api.models.type.CustomFields interaction) {
        this.interaction = interaction;
        this.type = "PaymentInteractionAdded";
    }
    public PaymentInteractionAddedMessagePayloadImpl() {
        this.type = "PaymentInteractionAdded";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.type.CustomFields getInteraction(){
        return this.interaction;
    }

    public void setInteraction(final com.commercetools.api.models.type.CustomFields interaction){
        this.interaction = interaction;
    }

}
