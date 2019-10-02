package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.category.CategorySetAssetKeyActionImpl;

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
@JsonDeserialize(as = CategorySetAssetKeyActionImpl.class)
public interface CategorySetAssetKeyAction extends CategoryUpdateAction {

   
   @NotNull
   @JsonProperty("assetId")
   public String getAssetId();
   
   
   @JsonProperty("assetKey")
   public String getAssetKey();

   public void setAssetId(final String assetId);
   
   public void setAssetKey(final String assetKey);
   
   public static CategorySetAssetKeyActionImpl of(){
      return new CategorySetAssetKeyActionImpl();
   }
   

   public static CategorySetAssetKeyActionImpl of(final CategorySetAssetKeyAction template) {
      CategorySetAssetKeyActionImpl instance = new CategorySetAssetKeyActionImpl();
      instance.setAssetId(template.getAssetId());
      instance.setAssetKey(template.getAssetKey());
      return instance;
   }

}