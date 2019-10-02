package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.LocalizedString;
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
public final class CategorySetMetaTitleActionImpl implements CategorySetMetaTitleAction {

   private String action;
   
   private com.commercetools.models.common.LocalizedString metaTitle;

   @JsonCreator
   CategorySetMetaTitleActionImpl(@JsonProperty("metaTitle") final com.commercetools.models.common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      this.action = "setMetaTitle";
   }
   public CategorySetMetaTitleActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }

   public void setMetaTitle(final com.commercetools.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }

}