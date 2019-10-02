package com.commercetools.models.me;


import com.commercetools.models.me.MyOrderFromCartDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyOrderFromCartDraftBuilder {
   
   
   private String id;
   
   
   private Long version;
   
   public MyOrderFromCartDraftBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public MyOrderFromCartDraftBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
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