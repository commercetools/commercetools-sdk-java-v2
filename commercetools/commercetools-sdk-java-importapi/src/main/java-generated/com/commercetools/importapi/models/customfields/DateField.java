
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a date value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DateFieldImpl.class)
public interface DateField extends CustomField {

    String DATE = "Date";

    @NotNull
    @JsonProperty("value")
    public LocalDate getValue();

    public void setValue(final LocalDate value);

    public static DateField of() {
        return new DateFieldImpl();
    }

    public static DateField of(final DateField template) {
        DateFieldImpl instance = new DateFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static DateFieldBuilder builder() {
        return DateFieldBuilder.of();
    }

    public static DateFieldBuilder builder(final DateField template) {
        return DateFieldBuilder.of(template);
    }

    default <T> T withDateField(Function<DateField, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DateField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DateField>() {
            @Override
            public String toString() {
                return "TypeReference<DateField>";
            }
        };
    }
}
