package com.commercetools.models.order;

import com.commercetools.models.order.ReturnItem;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.order.ReturnInfoImpl;

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
@JsonDeserialize(as = ReturnInfoImpl.class)
public interface ReturnInfo  {

   
   @NotNull
   @Valid
   @JsonProperty("items")
   public List<ReturnItem> getItems();
   
   
   @JsonProperty("returnTrackingId")
   public String getReturnTrackingId();
   
   
   @JsonProperty("returnDate")
   public ZonedDateTime getReturnDate();

   public void setItems(final List<ReturnItem> items);
   
   public void setReturnTrackingId(final String returnTrackingId);
   
   public void setReturnDate(final ZonedDateTime returnDate);
   
   public static ReturnInfoImpl of(){
      return new ReturnInfoImpl();
   }
   

   public static ReturnInfoImpl of(final ReturnInfo template) {
      ReturnInfoImpl instance = new ReturnInfoImpl();
      instance.setReturnDate(template.getReturnDate());
      instance.setReturnTrackingId(template.getReturnTrackingId());
      instance.setItems(template.getItems());
      return instance;
   }

}