package com.commercetools.models.category;

import com.commercetools.models.category.CategoryResourceIdentifier;
import com.commercetools.models.category.CategoryUpdateAction;
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
public final class CategoryChangeParentActionImpl implements CategoryChangeParentAction {

   private String action;
   
   private com.commercetools.models.category.CategoryResourceIdentifier parent;

   @JsonCreator
   CategoryChangeParentActionImpl(@JsonProperty("parent") final com.commercetools.models.category.CategoryResourceIdentifier parent) {
      this.parent = parent;
      this.action = "changeParent";
   }
   public CategoryChangeParentActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.category.CategoryResourceIdentifier getParent(){
      return this.parent;
   }

   public void setParent(final com.commercetools.models.category.CategoryResourceIdentifier parent){
      this.parent = parent;
   }

}