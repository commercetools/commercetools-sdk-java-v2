package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.type.TypeResourceIdentifier;
import com.commercetools.models.category.CategorySetAssetCustomTypeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CategorySetAssetCustomTypeActionImpl.class)
public interface CategorySetAssetCustomTypeAction extends CategoryUpdateAction {

   
   
   @JsonProperty("assetId")
   public String getAssetId();
   
   
   @JsonProperty("assetKey")
   public String getAssetKey();
   
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public Object getFields();

   public void setAssetId(final String assetId);
   
   public void setAssetKey(final String assetKey);
   
   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final Object fields);
   
   public static CategorySetAssetCustomTypeActionImpl of(){
      return new CategorySetAssetCustomTypeActionImpl();
   }
   

   public static CategorySetAssetCustomTypeActionImpl of(final CategorySetAssetCustomTypeAction template) {
      CategorySetAssetCustomTypeActionImpl instance = new CategorySetAssetCustomTypeActionImpl();
      instance.setAssetId(template.getAssetId());
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      instance.setAssetKey(template.getAssetKey());
      return instance;
   }

}