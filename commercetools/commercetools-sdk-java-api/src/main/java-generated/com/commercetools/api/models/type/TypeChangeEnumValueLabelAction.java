
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
*  <p>Changes the <code>label</code> of an <a href="ctp:api:type:CustomFieldEnumValue">EnumValue</a> of an <a href="ctp:api:type:CustomFieldEnumType">EnumType</a> FieldDefinition.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeChangeEnumValueLabelActionImpl.class)
public interface TypeChangeEnumValueLabelAction extends TypeUpdateAction {

    String CHANGE_ENUM_VALUE_LABEL = "changeEnumValueLabel";

    /**
    *  <p><code>name</code> of the <a href="ctp:api:type:FieldDefinition">FieldDefinition</a> to update.</p>
    */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
    *  <p>New value to set.
    *  Must not be empty.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CustomFieldEnumValue getValue();

    public void setFieldName(final String fieldName);

    public void setValue(final CustomFieldEnumValue value);

    public static TypeChangeEnumValueLabelAction of() {
        return new TypeChangeEnumValueLabelActionImpl();
    }

    public static TypeChangeEnumValueLabelAction of(final TypeChangeEnumValueLabelAction template) {
        TypeChangeEnumValueLabelActionImpl instance = new TypeChangeEnumValueLabelActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static TypeChangeEnumValueLabelActionBuilder builder() {
        return TypeChangeEnumValueLabelActionBuilder.of();
    }

    public static TypeChangeEnumValueLabelActionBuilder builder(final TypeChangeEnumValueLabelAction template) {
        return TypeChangeEnumValueLabelActionBuilder.of(template);
    }

    default <T> T withTypeChangeEnumValueLabelAction(Function<TypeChangeEnumValueLabelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeEnumValueLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeEnumValueLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeEnumValueLabelAction>";
            }
        };
    }
}
