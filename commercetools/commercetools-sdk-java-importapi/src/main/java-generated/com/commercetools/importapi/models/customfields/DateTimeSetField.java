
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a date time set value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DateTimeSetFieldImpl.class)
public interface DateTimeSetField extends CustomField {

    String DATE_TIME_SET = "DateTimeSet";

    @NotNull
    @JsonProperty("value")
    public List<ZonedDateTime> getValue();

    @JsonIgnore
    public void setValue(final ZonedDateTime... value);

    public void setValue(final List<ZonedDateTime> value);

    public static DateTimeSetField of() {
        return new DateTimeSetFieldImpl();
    }

    public static DateTimeSetField of(final DateTimeSetField template) {
        DateTimeSetFieldImpl instance = new DateTimeSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static DateTimeSetFieldBuilder builder() {
        return DateTimeSetFieldBuilder.of();
    }

    public static DateTimeSetFieldBuilder builder(final DateTimeSetField template) {
        return DateTimeSetFieldBuilder.of(template);
    }

    default <T> T withDateTimeSetField(Function<DateTimeSetField, T> helper) {
        return helper.apply(this);
    }
}
