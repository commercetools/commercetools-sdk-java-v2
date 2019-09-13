package com.commercetools.models.me;

import com.commercetools.models.me.MyCartUpdateAction;
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
public final class MyCartAddDiscountCodeActionImpl implements MyCartAddDiscountCodeAction {

   private java.lang.String action;
   
   private java.lang.String code;

   @JsonCreator
   MyCartAddDiscountCodeActionImpl(@JsonProperty("code") final java.lang.String code) {
      this.code = code;
      this.action = "addDiscountCode";
   }
   public MyCartAddDiscountCodeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }

   public void setCode(final java.lang.String code){
      this.code = code;
   }

}