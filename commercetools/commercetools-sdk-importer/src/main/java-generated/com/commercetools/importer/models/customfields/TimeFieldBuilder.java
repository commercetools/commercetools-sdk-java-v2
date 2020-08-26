package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import java.time.LocalTime;
import com.commercetools.importer.models.customfields.TimeField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TimeFieldBuilder {

    
    private java.time.LocalTime value;

    public TimeFieldBuilder value( final java.time.LocalTime value) {
        this.value = value;
        return this;
    }

    
    public java.time.LocalTime getValue(){
        return this.value;
    }

    public TimeField build() {
        return new TimeFieldImpl(value);
    }

    public static TimeFieldBuilder of() {
        return new TimeFieldBuilder();
    }

    public static TimeFieldBuilder of(final TimeField template) {
        TimeFieldBuilder builder = new TimeFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
