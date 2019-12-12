package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.category.CategorySetAssetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySetAssetKeyActionBuilder {
   
   
   private String assetId;
   
   @Nullable
   private String assetKey;
   
   public CategorySetAssetKeyActionBuilder assetId( final String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategorySetAssetKeyActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   
   public String getAssetId(){
      return this.assetId;
   }
   
   @Nullable
   public String getAssetKey(){
      return this.assetKey;
   }

   public CategorySetAssetKeyAction build() {
       return new CategorySetAssetKeyActionImpl(assetId, assetKey);
   }
   
   public static CategorySetAssetKeyActionBuilder of() {
      return new CategorySetAssetKeyActionBuilder();
   }
   
   public static CategorySetAssetKeyActionBuilder of(final CategorySetAssetKeyAction template) {
      CategorySetAssetKeyActionBuilder builder = new CategorySetAssetKeyActionBuilder();
      builder.assetId = template.getAssetId();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}