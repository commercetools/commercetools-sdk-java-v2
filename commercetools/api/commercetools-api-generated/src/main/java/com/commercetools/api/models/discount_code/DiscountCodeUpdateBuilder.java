package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeUpdateBuilder {


   private java.util.List<com.commercetools.api.models.discount_code.DiscountCodeUpdateAction> actions;


   private Long version;

   public DiscountCodeUpdateBuilder actions( final java.util.List<com.commercetools.api.models.discount_code.DiscountCodeUpdateAction> actions) {
      this.actions = actions;
      return this;
   }

   public DiscountCodeUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }


   public java.util.List<com.commercetools.api.models.discount_code.DiscountCodeUpdateAction> getActions(){
      return this.actions;
   }


   public Long getVersion(){
      return this.version;
   }

   public DiscountCodeUpdate build() {
       return new DiscountCodeUpdateImpl(actions, version);
   }

   public static DiscountCodeUpdateBuilder of() {
      return new DiscountCodeUpdateBuilder();
   }

   public static DiscountCodeUpdateBuilder of(final DiscountCodeUpdate template) {
      DiscountCodeUpdateBuilder builder = new DiscountCodeUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }

}
