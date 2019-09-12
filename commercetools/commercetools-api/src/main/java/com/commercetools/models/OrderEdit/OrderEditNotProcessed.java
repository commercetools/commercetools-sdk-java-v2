package com.commercetools.models.OrderEdit;

import com.commercetools.models.OrderEdit.OrderEditResult;
import java.lang.String;
import com.commercetools.models.OrderEdit.OrderEditNotProcessedImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = OrderEditNotProcessedImpl.class)
public interface OrderEditNotProcessed extends OrderEditResult {


   
   public static OrderEditNotProcessedImpl of(){
      return new OrderEditNotProcessedImpl();
   }
   

   public static OrderEditNotProcessedImpl of(final OrderEditNotProcessed template) {
      OrderEditNotProcessedImpl instance = new OrderEditNotProcessedImpl();
      return instance;
   }

}