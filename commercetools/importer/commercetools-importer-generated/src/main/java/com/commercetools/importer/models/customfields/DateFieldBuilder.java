package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import java.time.LocalDate;
import com.commercetools.importer.models.customfields.DateField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DateFieldBuilder {

    
    private java.time.LocalDate value;

    public DateFieldBuilder value( final java.time.LocalDate value) {
        this.value = value;
        return this;
    }

    
    public java.time.LocalDate getValue(){
        return this.value;
    }

    public DateField build() {
        return new DateFieldImpl(value);
    }

    public static DateFieldBuilder of() {
        return new DateFieldBuilder();
    }

    public static DateFieldBuilder of(final DateField template) {
        DateFieldBuilder builder = new DateFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
