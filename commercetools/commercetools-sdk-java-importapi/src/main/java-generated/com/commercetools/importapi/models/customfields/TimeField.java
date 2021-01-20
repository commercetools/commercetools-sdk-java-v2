
package com.commercetools.importapi.models.customfields;

import java.io.IOException;
import java.time.*;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.TimeFieldImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a time value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TimeFieldImpl.class)
public interface TimeField extends CustomField {

    @NotNull
    @JsonProperty("value")
    public LocalTime getValue();

    public void setValue(final LocalTime value);

    public static TimeField of() {
        return new TimeFieldImpl();
    }

    public static TimeField of(final TimeField template) {
        TimeFieldImpl instance = new TimeFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static TimeFieldBuilder builder() {
        return TimeFieldBuilder.of();
    }

    public static TimeFieldBuilder builder(final TimeField template) {
        return TimeFieldBuilder.of(template);
    }

    default <T> T withTimeField(Function<TimeField, T> helper) {
        return helper.apply(this);
    }
}
