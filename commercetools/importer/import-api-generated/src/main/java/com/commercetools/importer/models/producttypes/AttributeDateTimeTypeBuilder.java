package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.producttypes.AttributeType;
import com.commercetools.importer.models.producttypes.AttributeDateTimeType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeDateTimeTypeBuilder {
   
   
   

   public AttributeDateTimeType build() {
       return new AttributeDateTimeTypeImpl();
   }
   
   public static AttributeDateTimeTypeBuilder of() {
      return new AttributeDateTimeTypeBuilder();
   }
   
   public static AttributeDateTimeTypeBuilder of(final AttributeDateTimeType template) {
      AttributeDateTimeTypeBuilder builder = new AttributeDateTimeTypeBuilder();
      return builder;
   }
   
}