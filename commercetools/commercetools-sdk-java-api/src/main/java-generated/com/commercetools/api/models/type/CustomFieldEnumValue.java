
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Defines an allowed value of a <a href="ctp:api:type:CustomFieldEnumType">CustomFieldEnumType</a> field.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomFieldEnumValueImpl.class)
public interface CustomFieldEnumValue {

    /**
    *  <p>Key of the value used as a programmatic identifier.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Descriptive label of the value.</p>
    */
    @NotNull
    @JsonProperty("label")
    public String getLabel();

    public void setKey(final String key);

    public void setLabel(final String label);

    public static CustomFieldEnumValue of() {
        return new CustomFieldEnumValueImpl();
    }

    public static CustomFieldEnumValue of(final CustomFieldEnumValue template) {
        CustomFieldEnumValueImpl instance = new CustomFieldEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static CustomFieldEnumValueBuilder builder() {
        return CustomFieldEnumValueBuilder.of();
    }

    public static CustomFieldEnumValueBuilder builder(final CustomFieldEnumValue template) {
        return CustomFieldEnumValueBuilder.of(template);
    }

    default <T> T withCustomFieldEnumValue(Function<CustomFieldEnumValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldEnumValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldEnumValue>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldEnumValue>";
            }
        };
    }
}
