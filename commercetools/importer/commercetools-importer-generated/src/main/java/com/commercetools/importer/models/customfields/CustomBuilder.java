package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.common.TypeKeyReference;
import com.commercetools.importer.models.customfields.FieldContainer;
import com.commercetools.importer.models.customfields.Custom;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomBuilder {

    
    private com.commercetools.importer.models.common.TypeKeyReference type;
    
    @Nullable
    private com.commercetools.importer.models.customfields.FieldContainer fields;

    public CustomBuilder type( final com.commercetools.importer.models.common.TypeKeyReference type) {
        this.type = type;
        return this;
    }
    
    public CustomBuilder fields(@Nullable final com.commercetools.importer.models.customfields.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    
    public com.commercetools.importer.models.common.TypeKeyReference getType(){
        return this.type;
    }
    
    @Nullable
    public com.commercetools.importer.models.customfields.FieldContainer getFields(){
        return this.fields;
    }

    public Custom build() {
        return new CustomImpl(type, fields);
    }

    public static CustomBuilder of() {
        return new CustomBuilder();
    }

    public static CustomBuilder of(final Custom template) {
        CustomBuilder builder = new CustomBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
