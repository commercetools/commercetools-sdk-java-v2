package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.LocalizedString;
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
public final class CategorySetMetaDescriptionActionImpl implements CategorySetMetaDescriptionAction {

   private java.lang.String action;
   
   private com.commercetools.models.Common.LocalizedString metaDescription;

   @JsonCreator
   CategorySetMetaDescriptionActionImpl(@JsonProperty("metaDescription") final com.commercetools.models.Common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      this.action = "setMetaDescription";
   }
   public CategorySetMetaDescriptionActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }

   public void setMetaDescription(final com.commercetools.models.Common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }

}