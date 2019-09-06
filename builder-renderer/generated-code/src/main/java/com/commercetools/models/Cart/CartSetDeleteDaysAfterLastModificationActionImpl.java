package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.Integer;
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
public final class CartSetDeleteDaysAfterLastModificationActionImpl implements CartSetDeleteDaysAfterLastModificationAction {

   private java.lang.String action;
   
   private java.lang.Integer deleteDaysAfterLastModification;

   @JsonCreator
   CartSetDeleteDaysAfterLastModificationActionImpl(@JsonProperty("deleteDaysAfterLastModification") final java.lang.Integer deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      this.action = "setDeleteDaysAfterLastModification";
   }
   public CartSetDeleteDaysAfterLastModificationActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Integer getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }

   public void setDeleteDaysAfterLastModification(final java.lang.Integer deleteDaysAfterLastModification){
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
   }

}