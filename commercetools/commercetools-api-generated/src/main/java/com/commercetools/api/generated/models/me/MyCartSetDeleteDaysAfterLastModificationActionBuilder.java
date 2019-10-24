package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartSetDeleteDaysAfterLastModificationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartSetDeleteDaysAfterLastModificationActionBuilder {
   
   @Nullable
   private Integer deleteDaysAfterLastModification;
   
   public MyCartSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(@Nullable final Integer deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   @Nullable
   public Integer getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }

   public MyCartSetDeleteDaysAfterLastModificationAction build() {
       return new MyCartSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
   }
   
   public static MyCartSetDeleteDaysAfterLastModificationActionBuilder of() {
      return new MyCartSetDeleteDaysAfterLastModificationActionBuilder();
   }
   
   public static MyCartSetDeleteDaysAfterLastModificationActionBuilder of(final MyCartSetDeleteDaysAfterLastModificationAction template) {
      MyCartSetDeleteDaysAfterLastModificationActionBuilder builder = new MyCartSetDeleteDaysAfterLastModificationActionBuilder();
      builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
      return builder;
   }
   
}