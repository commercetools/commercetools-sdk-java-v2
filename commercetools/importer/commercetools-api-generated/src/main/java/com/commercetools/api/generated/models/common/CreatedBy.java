package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.ClientLogging;
import com.commercetools.api.generated.models.common.CreatedByImpl;

import com.fasterxml.jackson.annotation.*;
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
@JsonDeserialize(as = CreatedByImpl.class)
public interface CreatedBy extends ClientLogging {


   
   public static CreatedByImpl of(){
      return new CreatedByImpl();
   }
   

   public static CreatedByImpl of(final CreatedBy template) {
      CreatedByImpl instance = new CreatedByImpl();
      instance.setAnonymousId(template.getAnonymousId());
      instance.setClientId(template.getClientId());
      instance.setExternalUserId(template.getExternalUserId());
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}