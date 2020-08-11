package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
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
public final class CategorySetExternalIdActionImpl implements CategorySetExternalIdAction {

   private String action;

   private String externalId;

   @JsonCreator
   CategorySetExternalIdActionImpl(@JsonProperty("externalId") final String externalId) {
      this.externalId = externalId;
      this.action = "setExternalId";
   }
   public CategorySetExternalIdActionImpl() {

   }


   public String getAction(){
      return this.action;
   }

   /**
   *  <p>If not defined, the external ID is unset.</p>
   */
   public String getExternalId(){
      return this.externalId;
   }

   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }

}
