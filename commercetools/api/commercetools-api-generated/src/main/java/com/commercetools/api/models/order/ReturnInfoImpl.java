package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ReturnItem;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReturnInfoImpl implements ReturnInfo {

   private java.util.List<com.commercetools.api.models.order.ReturnItem> items;
   
   private String returnTrackingId;
   
   private java.time.ZonedDateTime returnDate;

   @JsonCreator
   ReturnInfoImpl(@JsonProperty("items") final java.util.List<com.commercetools.api.models.order.ReturnItem> items, @JsonProperty("returnTrackingId") final String returnTrackingId, @JsonProperty("returnDate") final java.time.ZonedDateTime returnDate) {
      this.items = items;
      this.returnTrackingId = returnTrackingId;
      this.returnDate = returnDate;
   }
   public ReturnInfoImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.api.models.order.ReturnItem> getItems(){
      return this.items;
   }
   
   /**
   *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
   */
   public String getReturnTrackingId(){
      return this.returnTrackingId;
   }
   
   
   public java.time.ZonedDateTime getReturnDate(){
      return this.returnDate;
   }

   public void setItems(final java.util.List<com.commercetools.api.models.order.ReturnItem> items){
      this.items = items;
   }
   
   public void setReturnTrackingId(final String returnTrackingId){
      this.returnTrackingId = returnTrackingId;
   }
   
   public void setReturnDate(final java.time.ZonedDateTime returnDate){
      this.returnDate = returnDate;
   }

}
