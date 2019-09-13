package com.commercetools.models.discount_code;

import com.commercetools.models.discount_code.DiscountCodeUpdateAction;
import java.lang.Long;
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
public final class DiscountCodeSetMaxApplicationsActionImpl implements DiscountCodeSetMaxApplicationsAction {

   private java.lang.String action;
   
   private java.lang.Long maxApplications;

   @JsonCreator
   DiscountCodeSetMaxApplicationsActionImpl(@JsonProperty("maxApplications") final java.lang.Long maxApplications) {
      this.maxApplications = maxApplications;
      this.action = "setMaxApplications";
   }
   public DiscountCodeSetMaxApplicationsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Long getMaxApplications(){
      return this.maxApplications;
   }

   public void setMaxApplications(final java.lang.Long maxApplications){
      this.maxApplications = maxApplications;
   }

}