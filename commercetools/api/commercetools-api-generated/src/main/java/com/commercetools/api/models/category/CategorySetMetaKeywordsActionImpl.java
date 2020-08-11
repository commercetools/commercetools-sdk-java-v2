package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySetMetaKeywordsActionImpl implements CategorySetMetaKeywordsAction {

   private String action;

   private com.commercetools.api.models.common.LocalizedString metaKeywords;

   @JsonCreator
   CategorySetMetaKeywordsActionImpl(@JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords) {
      this.metaKeywords = metaKeywords;
      this.action = "setMetaKeywords";
   }
   public CategorySetMetaKeywordsActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public com.commercetools.api.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }

   public void setMetaKeywords(final com.commercetools.api.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }

}
