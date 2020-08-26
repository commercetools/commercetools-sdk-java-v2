package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import java.time.ZonedDateTime;
import com.commercetools.importapi.models.customfields.DateTimeSetField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DateTimeSetFieldBuilder {


    private java.util.List<java.time.ZonedDateTime> value;

    public DateTimeSetFieldBuilder value( final java.util.List<java.time.ZonedDateTime> value) {
        this.value = value;
        return this;
    }


    public java.util.List<java.time.ZonedDateTime> getValue(){
        return this.value;
    }

    public DateTimeSetField build() {
        return new DateTimeSetFieldImpl(value);
    }

    public static DateTimeSetFieldBuilder of() {
        return new DateTimeSetFieldBuilder();
    }

    public static DateTimeSetFieldBuilder of(final DateTimeSetField template) {
        DateTimeSetFieldBuilder builder = new DateTimeSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
