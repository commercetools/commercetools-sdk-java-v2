package com.commercetools.models.me;

import java.lang.Long;
import java.lang.String;
import com.commercetools.models.me.MyOrderFromCartDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyOrderFromCartDraftBuilder {
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   public MyOrderFromCartDraftBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public MyOrderFromCartDraftBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public MyOrderFromCartDraft build() {
       return new MyOrderFromCartDraftImpl(id, version);
   }
   
   public static MyOrderFromCartDraftBuilder of() {
      return new MyOrderFromCartDraftBuilder();
   }
   
   public static MyOrderFromCartDraftBuilder of(final MyOrderFromCartDraft template) {
      MyOrderFromCartDraftBuilder builder = new MyOrderFromCartDraftBuilder();
      builder.id = template.getId();
      builder.version = template.getVersion();
      return builder;
   }
   
}