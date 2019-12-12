package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.ResourceNotFoundErrorImpl;

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
@JsonDeserialize(as = ResourceNotFoundErrorImpl.class)
public interface ResourceNotFoundError extends ErrorObject {


   
   public static ResourceNotFoundErrorImpl of(){
      return new ResourceNotFoundErrorImpl();
   }
   

   public static ResourceNotFoundErrorImpl of(final ResourceNotFoundError template) {
      ResourceNotFoundErrorImpl instance = new ResourceNotFoundErrorImpl();
      instance.setMessage(template.getMessage());
      return instance;
   }

}