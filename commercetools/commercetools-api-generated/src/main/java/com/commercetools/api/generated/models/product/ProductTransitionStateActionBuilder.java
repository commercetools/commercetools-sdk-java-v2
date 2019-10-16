package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.product.ProductTransitionStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTransitionStateActionBuilder {
   
   @Nullable
   private Boolean force;
   
   @Nullable
   private com.commercetools.api.generated.models.state.StateResourceIdentifier state;
   
   public ProductTransitionStateActionBuilder force(@Nullable final Boolean force) {
      this.force = force;
      return this;
   }
   
   public ProductTransitionStateActionBuilder state(@Nullable final com.commercetools.api.generated.models.state.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   @Nullable
   public Boolean getForce(){
      return this.force;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getState(){
      return this.state;
   }

   public ProductTransitionStateAction build() {
       return new ProductTransitionStateActionImpl(force, state);
   }
   
   public static ProductTransitionStateActionBuilder of() {
      return new ProductTransitionStateActionBuilder();
   }
   
   public static ProductTransitionStateActionBuilder of(final ProductTransitionStateAction template) {
      ProductTransitionStateActionBuilder builder = new ProductTransitionStateActionBuilder();
      builder.force = template.getForce();
      builder.state = template.getState();
      return builder;
   }
   
}