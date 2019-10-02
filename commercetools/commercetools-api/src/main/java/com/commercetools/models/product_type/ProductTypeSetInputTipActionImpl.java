package com.commercetools.models.product_type;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product_type.ProductTypeUpdateAction;
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
public final class ProductTypeSetInputTipActionImpl implements ProductTypeSetInputTipAction {

   private String action;
   
   private String attributeName;
   
   private com.commercetools.models.common.LocalizedString inputTip;

   @JsonCreator
   ProductTypeSetInputTipActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("inputTip") final com.commercetools.models.common.LocalizedString inputTip) {
      this.attributeName = attributeName;
      this.inputTip = inputTip;
      this.action = "setInputTip";
   }
   public ProductTypeSetInputTipActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }
   
   
   public com.commercetools.models.common.LocalizedString getInputTip(){
      return this.inputTip;
   }

   public void setAttributeName(final String attributeName){
      this.attributeName = attributeName;
   }
   
   public void setInputTip(final com.commercetools.models.common.LocalizedString inputTip){
      this.inputTip = inputTip;
   }

}