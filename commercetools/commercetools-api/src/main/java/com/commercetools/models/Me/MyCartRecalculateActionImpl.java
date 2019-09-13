package com.commercetools.models.me;

import com.commercetools.models.me.MyCartUpdateAction;
import java.lang.Boolean;
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
public final class MyCartRecalculateActionImpl implements MyCartRecalculateAction {

   private java.lang.String action;
   
   private java.lang.Boolean updateProductData;

   @JsonCreator
   MyCartRecalculateActionImpl(@JsonProperty("updateProductData") final java.lang.Boolean updateProductData) {
      this.updateProductData = updateProductData;
      this.action = "recalculate";
   }
   public MyCartRecalculateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Boolean getUpdateProductData(){
      return this.updateProductData;
   }

   public void setUpdateProductData(final java.lang.Boolean updateProductData){
      this.updateProductData = updateProductData;
   }

}