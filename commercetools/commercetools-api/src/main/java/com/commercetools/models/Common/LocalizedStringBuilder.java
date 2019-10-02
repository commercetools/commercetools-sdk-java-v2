package com.commercetools.models.common;


import com.commercetools.models.common.LocalizedString;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class LocalizedStringBuilder {
   
   
   private Map<String, String> values;
   
   public LocalizedStringBuilder values( final Map<String, String> values){
      this.values = values;
      return this;
   }
   
   
   public Map<String, String> getValues(){
      return this.values;
   }

   public LocalizedString build() {
       return new LocalizedStringImpl(values);
   }
   
   public static LocalizedStringBuilder of() {
      return new LocalizedStringBuilder();
   }
   
   public static LocalizedStringBuilder of(final LocalizedString template) {
      LocalizedStringBuilder builder = new LocalizedStringBuilder();
      builder.values = template.values();
      return builder;
   }
   
}