
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Adds a value to a <a href="ctp:api:type:CustomFieldLocalizedEnumType">LocalizedEnumType</a>.
*  This update action can be used to update a <a href="ctp:api:type:CustomFieldLocalizedEnumType">LocalizedEnumType</a> FieldDefinition and a <a href="ctp:api:type:CustomFieldSetType">SetType</a> FieldDefinition of <a href="ctp:api:type:CustomFieldLocalizedEnumType">CustomFieldLocalizedEnumType</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeAddLocalizedEnumValueActionImpl.class)
public interface TypeAddLocalizedEnumValueAction extends TypeUpdateAction {

    String ADD_LOCALIZED_ENUM_VALUE = "addLocalizedEnumValue";

    /**
    *  <p><code>name</code> of the <a href="ctp:api:type:FieldDefinition">FieldDefinition</a> to update.</p>
    */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
    *  <p>Value to append to the array.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CustomFieldLocalizedEnumValue getValue();

    public void setFieldName(final String fieldName);

    public void setValue(final CustomFieldLocalizedEnumValue value);

    public static TypeAddLocalizedEnumValueAction of() {
        return new TypeAddLocalizedEnumValueActionImpl();
    }

    public static TypeAddLocalizedEnumValueAction of(final TypeAddLocalizedEnumValueAction template) {
        TypeAddLocalizedEnumValueActionImpl instance = new TypeAddLocalizedEnumValueActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static TypeAddLocalizedEnumValueActionBuilder builder() {
        return TypeAddLocalizedEnumValueActionBuilder.of();
    }

    public static TypeAddLocalizedEnumValueActionBuilder builder(final TypeAddLocalizedEnumValueAction template) {
        return TypeAddLocalizedEnumValueActionBuilder.of(template);
    }

    default <T> T withTypeAddLocalizedEnumValueAction(Function<TypeAddLocalizedEnumValueAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypeAddLocalizedEnumValueAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeAddLocalizedEnumValueAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeAddLocalizedEnumValueAction>";
            }
        };
    }
}
