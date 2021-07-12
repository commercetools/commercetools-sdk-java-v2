
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This type represents an attribute whose value is a set of dates with time.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DateTimeSetAttributeImpl.class)
public interface DateTimeSetAttribute extends Attribute {

    String DATETIME_SET = "datetime-set";

    @NotNull
    @JsonProperty("value")
    public List<ZonedDateTime> getValue();

    @JsonIgnore
    public void setValue(final ZonedDateTime... value);

    public void setValue(final List<ZonedDateTime> value);

    public static DateTimeSetAttribute of() {
        return new DateTimeSetAttributeImpl();
    }

    public static DateTimeSetAttribute of(final DateTimeSetAttribute template) {
        DateTimeSetAttributeImpl instance = new DateTimeSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static DateTimeSetAttributeBuilder builder() {
        return DateTimeSetAttributeBuilder.of();
    }

    public static DateTimeSetAttributeBuilder builder(final DateTimeSetAttribute template) {
        return DateTimeSetAttributeBuilder.of(template);
    }

    default <T> T withDateTimeSetAttribute(Function<DateTimeSetAttribute, T> helper) {
        return helper.apply(this);
    }
}
