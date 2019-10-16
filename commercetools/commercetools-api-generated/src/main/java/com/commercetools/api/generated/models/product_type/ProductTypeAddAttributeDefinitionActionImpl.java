package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
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
public final class ProductTypeAddAttributeDefinitionActionImpl implements ProductTypeAddAttributeDefinitionAction {

   private String action;
   
   private com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft attribute;

   @JsonCreator
   ProductTypeAddAttributeDefinitionActionImpl(@JsonProperty("attribute") final com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft attribute) {
      this.attribute = attribute;
      this.action = "addAttributeDefinition";
   }
   public ProductTypeAddAttributeDefinitionActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft getAttribute(){
      return this.attribute;
   }

   public void setAttribute(final com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft attribute){
      this.attribute = attribute;
   }

}