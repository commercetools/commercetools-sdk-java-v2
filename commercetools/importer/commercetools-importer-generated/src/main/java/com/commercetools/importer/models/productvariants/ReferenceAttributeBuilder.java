package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.ReferenceAttribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReferenceAttributeBuilder {

    @Nullable
    private String name;
    
    
    private com.commercetools.importer.models.common.KeyReference value;

    public ReferenceAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }
    
    public ReferenceAttributeBuilder value( final com.commercetools.importer.models.common.KeyReference value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName(){
        return this.name;
    }
    
    
    public com.commercetools.importer.models.common.KeyReference getValue(){
        return this.value;
    }

    public ReferenceAttribute build() {
        return new ReferenceAttributeImpl(name, value);
    }

    public static ReferenceAttributeBuilder of() {
        return new ReferenceAttributeBuilder();
    }

    public static ReferenceAttributeBuilder of(final ReferenceAttribute template) {
        ReferenceAttributeBuilder builder = new ReferenceAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
