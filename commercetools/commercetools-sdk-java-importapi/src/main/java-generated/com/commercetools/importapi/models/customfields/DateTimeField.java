package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import java.time.ZonedDateTime;
import com.commercetools.importapi.models.customfields.DateTimeFieldImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>A field with a date time value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DateTimeFieldImpl.class)
public interface DateTimeField extends CustomField {

    
    @NotNull
    @JsonProperty("value")
    public ZonedDateTime getValue();

    public void setValue(final ZonedDateTime value);

    public static DateTimeFieldImpl of(){
        return new DateTimeFieldImpl();
    }
    

    public static DateTimeFieldImpl of(final DateTimeField template) {
        DateTimeFieldImpl instance = new DateTimeFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    default <T extends Accessor<DateTimeField>> T withDateTimeField(Function<DateTimeField, T> helper) {
        return helper.apply(this);
    }
}
