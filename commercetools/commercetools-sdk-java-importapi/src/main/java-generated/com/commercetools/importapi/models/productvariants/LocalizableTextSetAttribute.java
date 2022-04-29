
package com.commercetools.importapi.models.productvariants;

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
*  <p>This type represents an attribute whose value is a localized text.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LocalizableTextSetAttributeImpl.class)
public interface LocalizableTextSetAttribute extends Attribute {

    String LTEXT_SET = "ltext-set";

    @NotNull
    @Valid
    @JsonProperty("value")
    public List<LocalizedString> getValue();

    @JsonIgnore
    public void setValue(final LocalizedString... value);

    public void setValue(final List<LocalizedString> value);

    public static LocalizableTextSetAttribute of() {
        return new LocalizableTextSetAttributeImpl();
    }

    public static LocalizableTextSetAttribute of(final LocalizableTextSetAttribute template) {
        LocalizableTextSetAttributeImpl instance = new LocalizableTextSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static LocalizableTextSetAttributeBuilder builder() {
        return LocalizableTextSetAttributeBuilder.of();
    }

    public static LocalizableTextSetAttributeBuilder builder(final LocalizableTextSetAttribute template) {
        return LocalizableTextSetAttributeBuilder.of(template);
    }

    default <T> T withLocalizableTextSetAttribute(Function<LocalizableTextSetAttribute, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LocalizableTextSetAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizableTextSetAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizableTextSetAttribute>";
            }
        };
    }
}
