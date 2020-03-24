package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.errors.InvalidInputImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>Invalid input has been sent to the service. The client application should validate the input according to the
*  constraints described in the error message before sending the request.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InvalidInputImpl.class)
public interface InvalidInput extends ErrorObject {


   
   public static InvalidInputImpl of(){
      return new InvalidInputImpl();
   }
   

   public static InvalidInputImpl of(final InvalidInput template) {
      InvalidInputImpl instance = new InvalidInputImpl();
      instance.setMessage(template.getMessage());
      return instance;
   }

}