package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.producttypes.AttributeType;
import com.commercetools.importer.models.producttypes.AttributeSetType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeSetTypeBuilder {

    
    private com.commercetools.importer.models.producttypes.AttributeType elementType;

    public AttributeSetTypeBuilder elementType( final com.commercetools.importer.models.producttypes.AttributeType elementType) {
        this.elementType = elementType;
        return this;
    }

    
    public com.commercetools.importer.models.producttypes.AttributeType getElementType(){
        return this.elementType;
    }

    public AttributeSetType build() {
        return new AttributeSetTypeImpl(elementType);
    }

    public static AttributeSetTypeBuilder of() {
        return new AttributeSetTypeBuilder();
    }

    public static AttributeSetTypeBuilder of(final AttributeSetType template) {
        AttributeSetTypeBuilder builder = new AttributeSetTypeBuilder();
        builder.elementType = template.getElementType();
        return builder;
    }

}
