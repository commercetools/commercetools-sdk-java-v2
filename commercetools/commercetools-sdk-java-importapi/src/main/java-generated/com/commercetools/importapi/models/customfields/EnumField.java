
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a enum value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = EnumFieldImpl.class)
public interface EnumField extends CustomField {

    String ENUM = "Enum";

    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setValue(final String value);

    public static EnumField of() {
        return new EnumFieldImpl();
    }

    public static EnumField of(final EnumField template) {
        EnumFieldImpl instance = new EnumFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static EnumFieldBuilder builder() {
        return EnumFieldBuilder.of();
    }

    public static EnumFieldBuilder builder(final EnumField template) {
        return EnumFieldBuilder.of(template);
    }

    default <T> T withEnumField(Function<EnumField, T> helper) {
        return helper.apply(this);
    }
}
