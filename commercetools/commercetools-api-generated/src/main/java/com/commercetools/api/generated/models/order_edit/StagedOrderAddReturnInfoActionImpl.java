package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.ReturnItemDraft;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderAddReturnInfoActionImpl implements StagedOrderAddReturnInfoAction {

   private String action;
   
   private java.time.ZonedDateTime returnDate;
   
   private String returnTrackingId;
   
   private java.util.List<com.commercetools.api.generated.models.order.ReturnItemDraft> items;

   @JsonCreator
   StagedOrderAddReturnInfoActionImpl(@JsonProperty("returnDate") final java.time.ZonedDateTime returnDate, @JsonProperty("returnTrackingId") final String returnTrackingId, @JsonProperty("items") final java.util.List<com.commercetools.api.generated.models.order.ReturnItemDraft> items) {
      this.returnDate = returnDate;
      this.returnTrackingId = returnTrackingId;
      this.items = items;
      this.action = "addReturnInfo";
   }
   public StagedOrderAddReturnInfoActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.time.ZonedDateTime getReturnDate(){
      return this.returnDate;
   }
   
   
   public String getReturnTrackingId(){
      return this.returnTrackingId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.ReturnItemDraft> getItems(){
      return this.items;
   }

   public void setReturnDate(final java.time.ZonedDateTime returnDate){
      this.returnDate = returnDate;
   }
   
   public void setReturnTrackingId(final String returnTrackingId){
      this.returnTrackingId = returnTrackingId;
   }
   
   public void setItems(final java.util.List<com.commercetools.api.generated.models.order.ReturnItemDraft> items){
      this.items = items;
   }

}