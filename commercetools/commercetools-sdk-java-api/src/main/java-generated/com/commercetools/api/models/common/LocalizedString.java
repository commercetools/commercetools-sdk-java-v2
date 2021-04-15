
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LocalizedStringImpl.class)
public interface LocalizedString {

    @NotNull
    @JsonAnyGetter
    public Map<String, String> values();

    @JsonAnySetter
    public void setValue(String key, String value);

    public static LocalizedString of() {
        return new LocalizedStringImpl();
    }

    public static LocalizedString of(final LocalizedString template) {
        LocalizedStringImpl instance = new LocalizedStringImpl();
        return instance;
    }

    public static LocalizedStringBuilder builder() {
        return LocalizedStringBuilder.of();
    }

    public static LocalizedStringBuilder builder(final LocalizedString template) {
        return LocalizedStringBuilder.of(template);
    }

    default <T> T withLocalizedString(Function<LocalizedString, T> helper) {
        return helper.apply(this);
    }
}
