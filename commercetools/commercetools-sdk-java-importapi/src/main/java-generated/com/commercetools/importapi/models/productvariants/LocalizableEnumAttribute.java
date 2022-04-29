
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This type represents an attribute whose value is a localized enum.
*  The attribute value refers to the key of the enum value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LocalizableEnumAttributeImpl.class)
public interface LocalizableEnumAttribute extends Attribute {

    String LENUM = "lenum";

    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setValue(final String value);

    public static LocalizableEnumAttribute of() {
        return new LocalizableEnumAttributeImpl();
    }

    public static LocalizableEnumAttribute of(final LocalizableEnumAttribute template) {
        LocalizableEnumAttributeImpl instance = new LocalizableEnumAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static LocalizableEnumAttributeBuilder builder() {
        return LocalizableEnumAttributeBuilder.of();
    }

    public static LocalizableEnumAttributeBuilder builder(final LocalizableEnumAttribute template) {
        return LocalizableEnumAttributeBuilder.of(template);
    }

    default <T> T withLocalizableEnumAttribute(Function<LocalizableEnumAttribute, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LocalizableEnumAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizableEnumAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizableEnumAttribute>";
            }
        };
    }
}
