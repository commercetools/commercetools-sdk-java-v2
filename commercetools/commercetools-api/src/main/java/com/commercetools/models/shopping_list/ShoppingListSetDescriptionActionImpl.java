package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
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
public final class ShoppingListSetDescriptionActionImpl implements ShoppingListSetDescriptionAction {

   private String action;
   
   private com.commercetools.models.common.LocalizedString description;

   @JsonCreator
   ShoppingListSetDescriptionActionImpl(@JsonProperty("description") final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      this.action = "setDescription";
   }
   public ShoppingListSetDescriptionActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }

   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }

}