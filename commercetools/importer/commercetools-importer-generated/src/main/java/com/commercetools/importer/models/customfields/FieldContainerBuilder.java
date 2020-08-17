package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.FieldContainer;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class FieldContainerBuilder {

    
    private Map<String, com.commercetools.importer.models.customfields.CustomField> values;

    public FieldContainerBuilder values( final Map<String, com.commercetools.importer.models.customfields.CustomField> values){
        this.values = values;
        return this;
    }

    
    public Map<String, com.commercetools.importer.models.customfields.CustomField> getValues(){
        return this.values;
    }

    public FieldContainer build() {
        return new FieldContainerImpl(values);
    }

    public static FieldContainerBuilder of() {
        return new FieldContainerBuilder();
    }

    public static FieldContainerBuilder of(final FieldContainer template) {
        FieldContainerBuilder builder = new FieldContainerBuilder();
        builder.values = template.values();
        return builder;
    }

}
