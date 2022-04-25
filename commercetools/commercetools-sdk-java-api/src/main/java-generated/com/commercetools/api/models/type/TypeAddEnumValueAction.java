
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
*  <p>Adds a value to an <a href="ctp:api:type:CustomFieldEnumType">EnumType</a>.
*  This update action can be used to update an <a href="ctp:api:type:CustomFieldEnumType">EnumType</a> FieldDefinition and a <a href="ctp:api:type:CustomFieldSetType">SetType</a> FieldDefinition of <a href="ctp:api:type:CustomFieldEnumType">EnumType</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeAddEnumValueActionImpl.class)
public interface TypeAddEnumValueAction extends TypeUpdateAction {

    String ADD_ENUM_VALUE = "addEnumValue";

    /**
    *  <p><code>name</code> of the <a href="ctp:api:type:FieldDefinition">Field Definition</a> to update.</p>
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
    public CustomFieldEnumValue getValue();

    public void setFieldName(final String fieldName);

    public void setValue(final CustomFieldEnumValue value);

    public static TypeAddEnumValueAction of() {
        return new TypeAddEnumValueActionImpl();
    }

    public static TypeAddEnumValueAction of(final TypeAddEnumValueAction template) {
        TypeAddEnumValueActionImpl instance = new TypeAddEnumValueActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static TypeAddEnumValueActionBuilder builder() {
        return TypeAddEnumValueActionBuilder.of();
    }

    public static TypeAddEnumValueActionBuilder builder(final TypeAddEnumValueAction template) {
        return TypeAddEnumValueActionBuilder.of(template);
    }

    default <T> T withTypeAddEnumValueAction(Function<TypeAddEnumValueAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypeAddEnumValueAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeAddEnumValueAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeAddEnumValueAction>";
            }
        };
    }
}
