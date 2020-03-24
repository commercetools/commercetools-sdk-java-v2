package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.MoneySetAttribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MoneySetAttributeBuilder {
   
   @Nullable
   private String name;
   
   
   private java.util.List<com.commercetools.importer.models.common.Money> value;
   
   public MoneySetAttributeBuilder name(@Nullable final String name) {
      this.name = name;
      return this;
   }
   
   public MoneySetAttributeBuilder value( final java.util.List<com.commercetools.importer.models.common.Money> value) {
      this.value = value;
      return this;
   }
   
   @Nullable
   public String getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.importer.models.common.Money> getValue(){
      return this.value;
   }

   public MoneySetAttribute build() {
       return new MoneySetAttributeImpl(name, value);
   }
   
   public static MoneySetAttributeBuilder of() {
      return new MoneySetAttributeBuilder();
   }
   
   public static MoneySetAttributeBuilder of(final MoneySetAttribute template) {
      MoneySetAttributeBuilder builder = new MoneySetAttributeBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}