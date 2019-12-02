package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.ReturnItem;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReturnInfoImpl implements ReturnInfo {

   private java.time.ZonedDateTime returnDate;
   
   private String returnTrackingId;
   
   private java.util.List<com.commercetools.api.generated.models.order.ReturnItem> items;

   @JsonCreator
   ReturnInfoImpl(@JsonProperty("returnDate") final java.time.ZonedDateTime returnDate, @JsonProperty("returnTrackingId") final String returnTrackingId, @JsonProperty("items") final java.util.List<com.commercetools.api.generated.models.order.ReturnItem> items) {
      this.returnDate = returnDate;
      this.returnTrackingId = returnTrackingId;
      this.items = items;
   }
   public ReturnInfoImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getReturnDate(){
      return this.returnDate;
   }
   
   /**
   *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
   */
   public String getReturnTrackingId(){
      return this.returnTrackingId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.ReturnItem> getItems(){
      return this.items;
   }

   public void setReturnDate(final java.time.ZonedDateTime returnDate){
      this.returnDate = returnDate;
   }
   
   public void setReturnTrackingId(final String returnTrackingId){
      this.returnTrackingId = returnTrackingId;
   }
   
   public void setItems(final java.util.List<com.commercetools.api.generated.models.order.ReturnItem> items){
      this.items = items;
   }

}