
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
*  <p>A field with a date set value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DateSetFieldImpl.class)
public interface DateSetField extends CustomField {

    String DATE_SET = "DateSet";

    @NotNull
    @JsonProperty("value")
    public List<LocalDate> getValue();

    @JsonIgnore
    public void setValue(final LocalDate... value);

    public void setValue(final List<LocalDate> value);

    public static DateSetField of() {
        return new DateSetFieldImpl();
    }

    public static DateSetField of(final DateSetField template) {
        DateSetFieldImpl instance = new DateSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static DateSetFieldBuilder builder() {
        return DateSetFieldBuilder.of();
    }

    public static DateSetFieldBuilder builder(final DateSetField template) {
        return DateSetFieldBuilder.of(template);
    }

    default <T> T withDateSetField(Function<DateSetField, T> helper) {
        return helper.apply(this);
    }
}
