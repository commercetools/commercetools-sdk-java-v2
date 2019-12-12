package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.DeliveryCloudEventsFormat;
import com.commercetools.api.generated.models.subscription.DeliveryPlatformFormat;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
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
   DeliveryFormatImpl() {
      this.type = "null";
   }
   
   
   
   public String getType(){
      return this.type;
   }


}