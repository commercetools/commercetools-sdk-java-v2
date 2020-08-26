package com.commercetools.api.models.type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeChangeNameActionBuilder {

    
    private com.commercetools.api.models.common.LocalizedString name;

    public TypeChangeNameActionBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }

    public TypeChangeNameAction build() {
        return new TypeChangeNameActionImpl(name);
    }

    public static TypeChangeNameActionBuilder of() {
        return new TypeChangeNameActionBuilder();
    }

    public static TypeChangeNameActionBuilder of(final TypeChangeNameAction template) {
        TypeChangeNameActionBuilder builder = new TypeChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
