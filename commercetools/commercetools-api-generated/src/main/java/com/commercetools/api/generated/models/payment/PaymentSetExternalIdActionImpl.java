package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import javax.annotation.Generated;
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
public final class PaymentSetExternalIdActionImpl implements PaymentSetExternalIdAction {

   private String action;
   
   private String externalId;

   @JsonCreator
   PaymentSetExternalIdActionImpl(@JsonProperty("externalId") final String externalId) {
      this.externalId = externalId;
      this.action = "setExternalId";
   }
   public PaymentSetExternalIdActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getExternalId(){
      return this.externalId;
   }

   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }

}