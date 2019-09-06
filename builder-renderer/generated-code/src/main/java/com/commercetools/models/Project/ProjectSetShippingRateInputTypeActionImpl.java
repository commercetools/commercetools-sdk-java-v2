package com.commercetools.models.Project;

import com.commercetools.models.Project.ProjectUpdateAction;
import com.commercetools.models.Project.ShippingRateInputType;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectSetShippingRateInputTypeActionImpl implements ProjectSetShippingRateInputTypeAction {

   private java.lang.String action;
   
   private com.commercetools.models.Project.ShippingRateInputType shippingRateInputType;

   @JsonCreator
   ProjectSetShippingRateInputTypeActionImpl(@JsonProperty("shippingRateInputType") final com.commercetools.models.Project.ShippingRateInputType shippingRateInputType) {
      this.shippingRateInputType = shippingRateInputType;
      this.action = "setShippingRateInputType";
   }
   public ProjectSetShippingRateInputTypeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Project.ShippingRateInputType getShippingRateInputType(){
      return this.shippingRateInputType;
   }

   public void setShippingRateInputType(final com.commercetools.models.Project.ShippingRateInputType shippingRateInputType){
      this.shippingRateInputType = shippingRateInputType;
   }

}