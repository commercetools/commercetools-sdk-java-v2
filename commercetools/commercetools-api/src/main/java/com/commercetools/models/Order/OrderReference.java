package com.commercetools.models.Order;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Order.Order;
import com.commercetools.models.Order.OrderReferenceImpl;

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
@JsonDeserialize(as = OrderReferenceImpl.class)
public interface OrderReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public Order getObj();

   public void setObj(final Order obj);
   
   public static OrderReferenceImpl of(){
      return new OrderReferenceImpl();
   }
   

   public static OrderReferenceImpl of(final OrderReference template) {
      OrderReferenceImpl instance = new OrderReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}