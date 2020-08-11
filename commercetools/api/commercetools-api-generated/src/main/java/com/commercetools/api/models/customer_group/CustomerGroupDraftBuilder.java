package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.type.CustomFields;
import com.commercetools.api.models.customer_group.CustomerGroupDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerGroupDraftBuilder {


   private String groupName;

   @Nullable
   private com.commercetools.api.models.type.CustomFields custom;

   @Nullable
   private String key;

   public CustomerGroupDraftBuilder groupName( final String groupName) {
      this.groupName = groupName;
      return this;
   }

   public CustomerGroupDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }

   public CustomerGroupDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }


   public String getGroupName(){
      return this.groupName;
   }

   @Nullable
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }

   @Nullable
   public String getKey(){
      return this.key;
   }

   public CustomerGroupDraft build() {
       return new CustomerGroupDraftImpl(groupName, custom, key);
   }

   public static CustomerGroupDraftBuilder of() {
      return new CustomerGroupDraftBuilder();
   }

   public static CustomerGroupDraftBuilder of(final CustomerGroupDraft template) {
      CustomerGroupDraftBuilder builder = new CustomerGroupDraftBuilder();
      builder.groupName = template.getGroupName();
      builder.custom = template.getCustom();
      builder.key = template.getKey();
      return builder;
   }

}
