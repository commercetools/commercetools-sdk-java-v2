
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LocalizedEnumValueImpl.class)
public interface LocalizedEnumValue {

    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setKey(final String key);

    public void setLabel(final LocalizedString label);

    public static LocalizedEnumValue of() {
        return new LocalizedEnumValueImpl();
    }

    public static LocalizedEnumValue of(final LocalizedEnumValue template) {
        LocalizedEnumValueImpl instance = new LocalizedEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static LocalizedEnumValueBuilder builder() {
        return LocalizedEnumValueBuilder.of();
    }

    public static LocalizedEnumValueBuilder builder(final LocalizedEnumValue template) {
        return LocalizedEnumValueBuilder.of(template);
    }

    default <T> T withLocalizedEnumValue(Function<LocalizedEnumValue, T> helper) {
        return helper.apply(this);
    }
}
