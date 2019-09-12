package com.commercetools.models.Order;

import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Order.DeliveryItemImpl;

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
@JsonDeserialize(as = DeliveryItemImpl.class)
public interface DeliveryItem  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @JsonProperty("quantity")
   public Integer getQuantity();

   public void setId(final String id);
   
   public void setQuantity(final Integer quantity);
   
   public static DeliveryItemImpl of(){
      return new DeliveryItemImpl();
   }
   

   public static DeliveryItemImpl of(final DeliveryItem template) {
      DeliveryItemImpl instance = new DeliveryItemImpl();
      instance.setQuantity(template.getQuantity());
      instance.setId(template.getId());
      return instance;
   }

}