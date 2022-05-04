
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
*  <p>Values of a SetType Custom Field are sets of values of the specified <code>elementType</code> (without duplicate elements).</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomFieldSetTypeImpl.class)
public interface CustomFieldSetType extends FieldType {

    String SET = "Set";

    /**
    *  <p>Field type of the elements in the set.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("elementType")
    public FieldType getElementType();

    public void setElementType(final FieldType elementType);

    public static CustomFieldSetType of() {
        return new CustomFieldSetTypeImpl();
    }

    public static CustomFieldSetType of(final CustomFieldSetType template) {
        CustomFieldSetTypeImpl instance = new CustomFieldSetTypeImpl();
        instance.setElementType(template.getElementType());
        return instance;
    }

    public static CustomFieldSetTypeBuilder builder() {
        return CustomFieldSetTypeBuilder.of();
    }

    public static CustomFieldSetTypeBuilder builder(final CustomFieldSetType template) {
        return CustomFieldSetTypeBuilder.of(template);
    }

    default <T> T withCustomFieldSetType(Function<CustomFieldSetType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldSetType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldSetType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldSetType>";
            }
        };
    }
}
