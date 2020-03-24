package com.commercetools.api.generated.models.tax_category;


import com.commercetools.api.generated.models.tax_category.SubRate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubRateBuilder {
   
   
   private Integer amount;
   
   
   private String name;
   
   public SubRateBuilder amount( final Integer amount) {
      this.amount = amount;
      return this;
   }
   
   public SubRateBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   
   public Integer getAmount(){
      return this.amount;
   }
   
   
   public String getName(){
      return this.name;
   }

   public SubRate build() {
       return new SubRateImpl(amount, name);
   }
   
   public static SubRateBuilder of() {
      return new SubRateBuilder();
   }
   
   public static SubRateBuilder of(final SubRate template) {
      SubRateBuilder builder = new SubRateBuilder();
      builder.amount = template.getAmount();
      builder.name = template.getName();
      return builder;
   }
   
}