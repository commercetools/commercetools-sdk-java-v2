
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a localized enum value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LocalizedEnumFieldImpl.class)
public interface LocalizedEnumField extends CustomField {

    String LOCALIZED_ENUM = "LocalizedEnum";

    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setValue(final String value);

    public static LocalizedEnumField of() {
        return new LocalizedEnumFieldImpl();
    }

    public static LocalizedEnumField of(final LocalizedEnumField template) {
        LocalizedEnumFieldImpl instance = new LocalizedEnumFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static LocalizedEnumFieldBuilder builder() {
        return LocalizedEnumFieldBuilder.of();
    }

    public static LocalizedEnumFieldBuilder builder(final LocalizedEnumField template) {
        return LocalizedEnumFieldBuilder.of(template);
    }

    default <T> T withLocalizedEnumField(Function<LocalizedEnumField, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LocalizedEnumField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizedEnumField>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedEnumField>";
            }
        };
    }
}
