package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.MoneySetField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MoneySetFieldBuilder {
   
   
   private java.util.List<com.commercetools.importer.models.common.Money> value;
   
   public MoneySetFieldBuilder value( final java.util.List<com.commercetools.importer.models.common.Money> value) {
      this.value = value;
      return this;
   }
   
   
   public java.util.List<com.commercetools.importer.models.common.Money> getValue(){
      return this.value;
   }

   public MoneySetField build() {
       return new MoneySetFieldImpl(value);
   }
   
   public static MoneySetFieldBuilder of() {
      return new MoneySetFieldBuilder();
   }
   
   public static MoneySetFieldBuilder of(final MoneySetField template) {
      MoneySetFieldBuilder builder = new MoneySetFieldBuilder();
      builder.value = template.getValue();
      return builder;
   }
   
}