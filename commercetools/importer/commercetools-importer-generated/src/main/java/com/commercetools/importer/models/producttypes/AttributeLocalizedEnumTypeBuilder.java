package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.producttypes.AttributeLocalizedEnumValue;
import com.commercetools.importer.models.producttypes.AttributeType;
import com.commercetools.importer.models.producttypes.AttributeLocalizedEnumType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeLocalizedEnumTypeBuilder {

    
    private java.util.List<com.commercetools.importer.models.producttypes.AttributeLocalizedEnumValue> values;

    public AttributeLocalizedEnumTypeBuilder values( final java.util.List<com.commercetools.importer.models.producttypes.AttributeLocalizedEnumValue> values) {
        this.values = values;
        return this;
    }

    
    public java.util.List<com.commercetools.importer.models.producttypes.AttributeLocalizedEnumValue> getValues(){
        return this.values;
    }

    public AttributeLocalizedEnumType build() {
        return new AttributeLocalizedEnumTypeImpl(values);
    }

    public static AttributeLocalizedEnumTypeBuilder of() {
        return new AttributeLocalizedEnumTypeBuilder();
    }

    public static AttributeLocalizedEnumTypeBuilder of(final AttributeLocalizedEnumType template) {
        AttributeLocalizedEnumTypeBuilder builder = new AttributeLocalizedEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
