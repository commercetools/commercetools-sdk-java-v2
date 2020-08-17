package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.errors.DuplicateAttributeValueError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateAttributeValueErrorBuilder {

    
    private String message;
    
    
    private com.commercetools.importer.models.productvariants.Attribute attribute;

    public DuplicateAttributeValueErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    public DuplicateAttributeValueErrorBuilder attribute( final com.commercetools.importer.models.productvariants.Attribute attribute) {
        this.attribute = attribute;
        return this;
    }

    
    public String getMessage(){
        return this.message;
    }
    
    
    public com.commercetools.importer.models.productvariants.Attribute getAttribute(){
        return this.attribute;
    }

    public DuplicateAttributeValueError build() {
        return new DuplicateAttributeValueErrorImpl(message, attribute);
    }

    public static DuplicateAttributeValueErrorBuilder of() {
        return new DuplicateAttributeValueErrorBuilder();
    }

    public static DuplicateAttributeValueErrorBuilder of(final DuplicateAttributeValueError template) {
        DuplicateAttributeValueErrorBuilder builder = new DuplicateAttributeValueErrorBuilder();
        builder.message = template.getMessage();
        builder.attribute = template.getAttribute();
        return builder;
    }

}
