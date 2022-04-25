
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Changes the order of <a href="ctp:api:type:CustomFieldLocalizedEnumValue">LocalizedEnumValues</a> in a <a href="ctp:api:type:CustomFieldLocalizedEnumType">LocalizedEnumType</a> FieldDefinition.
*  This update action can be used to update a <a href="ctp:api:type:CustomFieldLocalizedEnumType">LocalizedEnumType</a> FieldDefinition and a <a href="ctp:api:type:CustomFieldSetType">SetType</a> of <a href="ctp:api:type:CustomFieldLocalizedEnumType">LocalizedEnumType</a> FieldDefinitions.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeChangeLocalizedEnumValueOrderActionImpl.class)
public interface TypeChangeLocalizedEnumValueOrderAction extends TypeUpdateAction {

    String CHANGE_LOCALIZED_ENUM_VALUE_ORDER = "changeLocalizedEnumValueOrder";

    /**
    *  <p><code>name</code> of the <a href="ctp:api:type:FieldDefinition">Field Definition</a> to update.</p>
    */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
    *  <p>Must match the set of <code>key</code>s of the LocalizedEnumValues in the FieldDefinition (up to order).</p>
    */
    @NotNull
    @JsonProperty("keys")
    public List<String> getKeys();

    public void setFieldName(final String fieldName);

    @JsonIgnore
    public void setKeys(final String... keys);

    public void setKeys(final List<String> keys);

    public static TypeChangeLocalizedEnumValueOrderAction of() {
        return new TypeChangeLocalizedEnumValueOrderActionImpl();
    }

    public static TypeChangeLocalizedEnumValueOrderAction of(final TypeChangeLocalizedEnumValueOrderAction template) {
        TypeChangeLocalizedEnumValueOrderActionImpl instance = new TypeChangeLocalizedEnumValueOrderActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setKeys(template.getKeys());
        return instance;
    }

    public static TypeChangeLocalizedEnumValueOrderActionBuilder builder() {
        return TypeChangeLocalizedEnumValueOrderActionBuilder.of();
    }

    public static TypeChangeLocalizedEnumValueOrderActionBuilder builder(
            final TypeChangeLocalizedEnumValueOrderAction template) {
        return TypeChangeLocalizedEnumValueOrderActionBuilder.of(template);
    }

    default <T> T withTypeChangeLocalizedEnumValueOrderAction(
            Function<TypeChangeLocalizedEnumValueOrderAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeLocalizedEnumValueOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeLocalizedEnumValueOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeLocalizedEnumValueOrderAction>";
            }
        };
    }
}
