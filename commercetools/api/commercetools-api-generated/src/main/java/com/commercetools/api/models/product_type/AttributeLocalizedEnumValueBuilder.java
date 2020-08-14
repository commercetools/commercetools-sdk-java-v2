package com.commercetools.api.models.product_type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeLocalizedEnumValueBuilder {

    
    private String key;
    
    
    private com.commercetools.api.models.common.LocalizedString label;

    public AttributeLocalizedEnumValueBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    public AttributeLocalizedEnumValueBuilder label( final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    
    public String getKey(){
        return this.key;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getLabel(){
        return this.label;
    }

    public AttributeLocalizedEnumValue build() {
        return new AttributeLocalizedEnumValueImpl(key, label);
    }

    public static AttributeLocalizedEnumValueBuilder of() {
        return new AttributeLocalizedEnumValueBuilder();
    }

    public static AttributeLocalizedEnumValueBuilder of(final AttributeLocalizedEnumValue template) {
        AttributeLocalizedEnumValueBuilder builder = new AttributeLocalizedEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
