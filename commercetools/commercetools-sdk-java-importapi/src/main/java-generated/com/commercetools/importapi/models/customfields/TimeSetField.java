
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a time set value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TimeSetFieldImpl.class)
public interface TimeSetField extends CustomField {

    String TIME_SET = "TimeSet";

    @NotNull
    @JsonProperty("value")
    public List<LocalTime> getValue();

    @JsonIgnore
    public void setValue(final LocalTime... value);

    public void setValue(final List<LocalTime> value);

    public static TimeSetField of() {
        return new TimeSetFieldImpl();
    }

    public static TimeSetField of(final TimeSetField template) {
        TimeSetFieldImpl instance = new TimeSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static TimeSetFieldBuilder builder() {
        return TimeSetFieldBuilder.of();
    }

    public static TimeSetFieldBuilder builder(final TimeSetField template) {
        return TimeSetFieldBuilder.of(template);
    }

    default <T> T withTimeSetField(Function<TimeSetField, T> helper) {
        return helper.apply(this);
    }
}
