package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeEnumType;
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

    
    private java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values;

    public AttributeEnumTypeBuilder values( final java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values) {
        this.values = values;
        return this;
    }

    
    public java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> getValues(){
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
