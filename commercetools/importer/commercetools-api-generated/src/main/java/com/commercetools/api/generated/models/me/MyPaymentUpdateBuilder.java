package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyPaymentUpdateAction;
import com.commercetools.api.generated.models.me.MyPaymentUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyPaymentUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.me.MyPaymentUpdateAction> actions;
   
   
   private Long version;
   
   public MyPaymentUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.me.MyPaymentUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public MyPaymentUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.me.MyPaymentUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public MyPaymentUpdate build() {
       return new MyPaymentUpdateImpl(actions, version);
   }
   
   public static MyPaymentUpdateBuilder of() {
      return new MyPaymentUpdateBuilder();
   }
   
   public static MyPaymentUpdateBuilder of(final MyPaymentUpdate template) {
      MyPaymentUpdateBuilder builder = new MyPaymentUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}