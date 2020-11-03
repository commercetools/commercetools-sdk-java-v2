package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import java.time.ZonedDateTime;
import com.commercetools.importapi.models.customfields.DateTimeSetFieldImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>A field with a date time set value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DateTimeSetFieldImpl.class)
public interface DateTimeSetField extends CustomField {

    
    @NotNull
    @JsonProperty("value")
    public List<ZonedDateTime> getValue();

    @JsonIgnore
    public void setValue(final ZonedDateTime ...value);
    public void setValue(final List<ZonedDateTime> value);

    public static DateTimeSetFieldImpl of(){
        return new DateTimeSetFieldImpl();
    }
    

    public static DateTimeSetFieldImpl of(final DateTimeSetField template) {
        DateTimeSetFieldImpl instance = new DateTimeSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withDateTimeSetField(Function<DateTimeSetField, T> helper) {
        return helper.apply(this);
    }
}
