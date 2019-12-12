package com.commercetools.api.generated.models.subscription;


import com.commercetools.api.generated.models.subscription.PayloadNotIncludedImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PayloadNotIncludedImpl.class)
public interface PayloadNotIncluded  {

   
   @NotNull
   @JsonProperty("reason")
   public String getReason();
   
   @NotNull
   @JsonProperty("payloadType")
   public String getPayloadType();

   public void setReason(final String reason);
   
   public void setPayloadType(final String payloadType);
   
   public static PayloadNotIncludedImpl of(){
      return new PayloadNotIncludedImpl();
   }
   

   public static PayloadNotIncludedImpl of(final PayloadNotIncluded template) {
      PayloadNotIncludedImpl instance = new PayloadNotIncludedImpl();
      instance.setReason(template.getReason());
      instance.setPayloadType(template.getPayloadType());
      return instance;
   }

}