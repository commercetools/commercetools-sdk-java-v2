package com.commercetools.models.OrderEdit;

import com.commercetools.models.Error.ErrorObject;
import com.commercetools.models.OrderEdit.OrderEditResult;
import java.lang.String;
import com.commercetools.models.OrderEdit.OrderEditPreviewFailureImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderEditPreviewFailureImpl.class)
public interface OrderEditPreviewFailure extends OrderEditResult {

   
   @NotNull
   @Valid
   @JsonProperty("errors")
   public List<ErrorObject> getErrors();

   public void setErrors(final List<ErrorObject> errors);
   
   public static OrderEditPreviewFailureImpl of(){
      return new OrderEditPreviewFailureImpl();
   }
   

   public static OrderEditPreviewFailureImpl of(final OrderEditPreviewFailure template) {
      OrderEditPreviewFailureImpl instance = new OrderEditPreviewFailureImpl();
      instance.setErrors(template.getErrors());
      return instance;
   }

}