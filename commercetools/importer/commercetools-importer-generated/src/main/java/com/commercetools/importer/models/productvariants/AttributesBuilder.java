package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.Attributes;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributesBuilder {

    
    private Map<String, com.commercetools.importer.models.productvariants.Attribute> values;

    public AttributesBuilder values( final Map<String, com.commercetools.importer.models.productvariants.Attribute> values){
        this.values = values;
        return this;
    }

    
    public Map<String, com.commercetools.importer.models.productvariants.Attribute> getValues(){
        return this.values;
    }

    public Attributes build() {
        return new AttributesImpl(values);
    }

    public static AttributesBuilder of() {
        return new AttributesBuilder();
    }

    public static AttributesBuilder of(final Attributes template) {
        AttributesBuilder builder = new AttributesBuilder();
        builder.values = template.values();
        return builder;
    }

}
