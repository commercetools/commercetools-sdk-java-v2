package com.commercetools.models.me;

import com.commercetools.models.me.MyCartUpdateAction;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.me.MyCartSetDeleteDaysAfterLastModificationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetDeleteDaysAfterLastModificationActionBuilder {
   
   @Nullable
   private java.lang.Integer deleteDaysAfterLastModification;
   
   public MyCartSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(@Nullable final java.lang.Integer deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   @Nullable
   public java.lang.Integer getDeleteDaysAfterLastModification(){
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