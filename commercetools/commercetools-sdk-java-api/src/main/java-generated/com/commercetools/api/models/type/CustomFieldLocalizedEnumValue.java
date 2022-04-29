
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Defines an allowed value of a <a href="ctp:api:type:CustomFieldLocalizedEnumType">CustomFieldLocalizedEnumType</a> field.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomFieldLocalizedEnumValueImpl.class)
public interface CustomFieldLocalizedEnumValue {

    /**
    *  <p>Key of the value used as a programmatic identifier.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Descriptive localized label of the value.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setKey(final String key);

    public void setLabel(final LocalizedString label);

    public static CustomFieldLocalizedEnumValue of() {
        return new CustomFieldLocalizedEnumValueImpl();
    }

    public static CustomFieldLocalizedEnumValue of(final CustomFieldLocalizedEnumValue template) {
        CustomFieldLocalizedEnumValueImpl instance = new CustomFieldLocalizedEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static CustomFieldLocalizedEnumValueBuilder builder() {
        return CustomFieldLocalizedEnumValueBuilder.of();
    }

    public static CustomFieldLocalizedEnumValueBuilder builder(final CustomFieldLocalizedEnumValue template) {
        return CustomFieldLocalizedEnumValueBuilder.of(template);
    }

    default <T> T withCustomFieldLocalizedEnumValue(Function<CustomFieldLocalizedEnumValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldLocalizedEnumValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldLocalizedEnumValue>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldLocalizedEnumValue>";
            }
        };
    }
}
