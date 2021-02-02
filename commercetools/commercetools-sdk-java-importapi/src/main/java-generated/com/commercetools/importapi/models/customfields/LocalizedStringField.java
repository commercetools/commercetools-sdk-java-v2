
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
*  <p>A field with a localized string value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LocalizedStringFieldImpl.class)
public interface LocalizedStringField extends CustomField {

    String LOCALIZED_STRING = "LocalizedString";

    @NotNull
    @Valid
    @JsonProperty("value")
    public LocalizedString getValue();

    public void setValue(final LocalizedString value);

    public static LocalizedStringField of() {
        return new LocalizedStringFieldImpl();
    }

    public static LocalizedStringField of(final LocalizedStringField template) {
        LocalizedStringFieldImpl instance = new LocalizedStringFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static LocalizedStringFieldBuilder builder() {
        return LocalizedStringFieldBuilder.of();
    }

    public static LocalizedStringFieldBuilder builder(final LocalizedStringField template) {
        return LocalizedStringFieldBuilder.of(template);
    }

    default <T> T withLocalizedStringField(Function<LocalizedStringField, T> helper) {
        return helper.apply(this);
    }
}
