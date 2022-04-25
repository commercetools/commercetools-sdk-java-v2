
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a localized string set value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LocalizedStringSetFieldImpl.class)
public interface LocalizedStringSetField extends CustomField {

    String LOCALIZED_STRING_SET = "LocalizedStringSet";

    @NotNull
    @Valid
    @JsonProperty("value")
    public List<LocalizedString> getValue();

    @JsonIgnore
    public void setValue(final LocalizedString... value);

    public void setValue(final List<LocalizedString> value);

    public static LocalizedStringSetField of() {
        return new LocalizedStringSetFieldImpl();
    }

    public static LocalizedStringSetField of(final LocalizedStringSetField template) {
        LocalizedStringSetFieldImpl instance = new LocalizedStringSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static LocalizedStringSetFieldBuilder builder() {
        return LocalizedStringSetFieldBuilder.of();
    }

    public static LocalizedStringSetFieldBuilder builder(final LocalizedStringSetField template) {
        return LocalizedStringSetFieldBuilder.of(template);
    }

    default <T> T withLocalizedStringSetField(Function<LocalizedStringSetField, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LocalizedStringSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizedStringSetField>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedStringSetField>";
            }
        };
    }
}
