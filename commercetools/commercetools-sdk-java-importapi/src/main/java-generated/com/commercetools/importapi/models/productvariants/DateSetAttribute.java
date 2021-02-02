
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This type represents an attribute which value is a set of dates.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DateSetAttributeImpl.class)
public interface DateSetAttribute extends Attribute {

    String DATE_SET = "date-set";

    @NotNull
    @JsonProperty("value")
    public List<LocalDate> getValue();

    @JsonIgnore
    public void setValue(final LocalDate... value);

    public void setValue(final List<LocalDate> value);

    public static DateSetAttribute of() {
        return new DateSetAttributeImpl();
    }

    public static DateSetAttribute of(final DateSetAttribute template) {
        DateSetAttributeImpl instance = new DateSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static DateSetAttributeBuilder builder() {
        return DateSetAttributeBuilder.of();
    }

    public static DateSetAttributeBuilder builder(final DateSetAttribute template) {
        return DateSetAttributeBuilder.of(template);
    }

    default <T> T withDateSetAttribute(Function<DateSetAttribute, T> helper) {
        return helper.apply(this);
    }
}
