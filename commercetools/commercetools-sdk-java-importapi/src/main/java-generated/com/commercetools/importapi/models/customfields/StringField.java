
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a string value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StringFieldImpl.class)
public interface StringField extends CustomField {

    String STRING = "String";

    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setValue(final String value);

    public static StringField of() {
        return new StringFieldImpl();
    }

    public static StringField of(final StringField template) {
        StringFieldImpl instance = new StringFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static StringFieldBuilder builder() {
        return StringFieldBuilder.of();
    }

    public static StringFieldBuilder builder(final StringField template) {
        return StringFieldBuilder.of(template);
    }

    default <T> T withStringField(Function<StringField, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StringField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StringField>() {
            @Override
            public String toString() {
                return "TypeReference<StringField>";
            }
        };
    }
}
