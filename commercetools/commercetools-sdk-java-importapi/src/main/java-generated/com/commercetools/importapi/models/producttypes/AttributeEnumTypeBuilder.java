package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.producttypes.AttributePlainEnumValue;
import com.commercetools.importapi.models.producttypes.AttributeType;
import com.commercetools.importapi.models.producttypes.AttributeEnumType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeEnumTypeBuilder {

    
    private java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> values;

    public AttributeEnumTypeBuilder values( final java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> values) {
        this.values = values;
        return this;
    }

    
    public java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> getValues(){
        return this.values;
    }

    public AttributeEnumType build() {
        return new AttributeEnumTypeImpl(values);
    }

    public static AttributeEnumTypeBuilder of() {
        return new AttributeEnumTypeBuilder();
    }

    public static AttributeEnumTypeBuilder of(final AttributeEnumType template) {
        AttributeEnumTypeBuilder builder = new AttributeEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
