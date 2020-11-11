package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.DeliveryCloudEventsFormat;
import com.commercetools.api.models.subscription.DeliveryPlatformFormat;
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
public final class DeliveryFormatImpl implements DeliveryFormat {

    private String type;

    @JsonCreator
    DeliveryFormatImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    public DeliveryFormatImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }


}
