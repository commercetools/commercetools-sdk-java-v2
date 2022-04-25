
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a number value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = NumberSetFieldImpl.class)
public interface NumberSetField extends CustomField {

    String NUMBER_SET = "NumberSet";

    @NotNull
    @JsonProperty("value")
    public List<Double> getValue();

    @JsonIgnore
    public void setValue(final Double... value);

    public void setValue(final List<Double> value);

    public static NumberSetField of() {
        return new NumberSetFieldImpl();
    }

    public static NumberSetField of(final NumberSetField template) {
        NumberSetFieldImpl instance = new NumberSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static NumberSetFieldBuilder builder() {
        return NumberSetFieldBuilder.of();
    }

    public static NumberSetFieldBuilder builder(final NumberSetField template) {
        return NumberSetFieldBuilder.of(template);
    }

    default <T> T withNumberSetField(Function<NumberSetField, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<NumberSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NumberSetField>() {
            @Override
            public String toString() {
                return "TypeReference<NumberSetField>";
            }
        };
    }
}
