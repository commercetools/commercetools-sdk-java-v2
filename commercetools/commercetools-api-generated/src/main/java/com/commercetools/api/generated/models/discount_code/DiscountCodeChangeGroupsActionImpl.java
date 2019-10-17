package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
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
public final class DiscountCodeChangeGroupsActionImpl implements DiscountCodeChangeGroupsAction {

   private String action;
   
   private java.util.List<String> groups;

   @JsonCreator
   DiscountCodeChangeGroupsActionImpl(@JsonProperty("groups") final java.util.List<String> groups) {
      this.groups = groups;
      this.action = "changeGroups";
   }
   public DiscountCodeChangeGroupsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<String> getGroups(){
      return this.groups;
   }

   public void setGroups(final java.util.List<String> groups){
      this.groups = groups;
   }

}