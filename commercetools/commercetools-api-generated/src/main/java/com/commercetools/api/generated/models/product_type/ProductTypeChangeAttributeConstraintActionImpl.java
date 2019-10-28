package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeConstraintEnumDraft;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class ProductTypeChangeAttributeConstraintActionImpl implements ProductTypeChangeAttributeConstraintAction {

   private String action;
   
   private com.commercetools.api.generated.models.product_type.AttributeConstraintEnumDraft newValue;
   
   private String attributeName;

   @JsonCreator
   ProductTypeChangeAttributeConstraintActionImpl(@JsonProperty("newValue") final com.commercetools.api.generated.models.product_type.AttributeConstraintEnumDraft newValue, @JsonProperty("attributeName") final String attributeName) {
      this.newValue = newValue;
      this.attributeName = attributeName;
      this.action = "changeAttributeConstraint";
   }
   public ProductTypeChangeAttributeConstraintActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.product_type.AttributeConstraintEnumDraft getNewValue(){
      return this.newValue;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }

   public void setNewValue(final com.commercetools.api.generated.models.product_type.AttributeConstraintEnumDraft newValue){
      this.newValue = newValue;
   }
   
   public void setAttributeName(final String attributeName){
      this.attributeName = attributeName;
   }

}