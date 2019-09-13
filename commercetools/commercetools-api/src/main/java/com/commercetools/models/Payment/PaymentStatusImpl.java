package com.commercetools.models.payment;

import com.commercetools.models.state.StateReference;
import java.lang.String;
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
public final class PaymentStatusImpl implements PaymentStatus {

   private java.lang.String interfaceText;
   
   private com.commercetools.models.state.StateReference state;
   
   private java.lang.String interfaceCode;

   @JsonCreator
   PaymentStatusImpl(@JsonProperty("interfaceText") final java.lang.String interfaceText, @JsonProperty("state") final com.commercetools.models.state.StateReference state, @JsonProperty("interfaceCode") final java.lang.String interfaceCode) {
      this.interfaceText = interfaceText;
      this.state = state;
      this.interfaceCode = interfaceCode;
   }
   public PaymentStatusImpl() {
      
   }
   
   
   public java.lang.String getInterfaceText(){
      return this.interfaceText;
   }
   
   
   public com.commercetools.models.state.StateReference getState(){
      return this.state;
   }
   
   
   public java.lang.String getInterfaceCode(){
      return this.interfaceCode;
   }

   public void setInterfaceText(final java.lang.String interfaceText){
      this.interfaceText = interfaceText;
   }
   
   public void setState(final com.commercetools.models.state.StateReference state){
      this.state = state;
   }
   
   public void setInterfaceCode(final java.lang.String interfaceCode){
      this.interfaceCode = interfaceCode;
   }

}