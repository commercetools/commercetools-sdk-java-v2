package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.LocalizableTextAttribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LocalizableTextAttributeBuilder {

    @Nullable
    private String name;
    
    
    private com.commercetools.importer.models.common.LocalizedString value;

    public LocalizableTextAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }
    
    public LocalizableTextAttributeBuilder value( final com.commercetools.importer.models.common.LocalizedString value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName(){
        return this.name;
    }
    
    
    public com.commercetools.importer.models.common.LocalizedString getValue(){
        return this.value;
    }

    public LocalizableTextAttribute build() {
        return new LocalizableTextAttributeImpl(name, value);
    }

    public static LocalizableTextAttributeBuilder of() {
        return new LocalizableTextAttributeBuilder();
    }

    public static LocalizableTextAttributeBuilder of(final LocalizableTextAttribute template) {
        LocalizableTextAttributeBuilder builder = new LocalizableTextAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
