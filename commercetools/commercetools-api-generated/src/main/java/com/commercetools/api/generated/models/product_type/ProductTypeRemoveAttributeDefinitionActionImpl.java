package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeRemoveAttributeDefinitionActionImpl implements ProductTypeRemoveAttributeDefinitionAction {

   private String action;
   
   private String name;

   @JsonCreator
   ProductTypeRemoveAttributeDefinitionActionImpl(@JsonProperty("name") final String name) {
      this.name = name;
      this.action = "removeAttributeDefinition";
   }
   public ProductTypeRemoveAttributeDefinitionActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>The name of the attribute to remove.</p>
   */
   public String getName(){
      return this.name;
   }

   public void setName(final String name){
      this.name = name;
   }

}