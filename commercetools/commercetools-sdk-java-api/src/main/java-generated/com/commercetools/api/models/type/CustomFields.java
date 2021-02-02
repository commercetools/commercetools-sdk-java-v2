
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomFieldsImpl.class)
public interface CustomFields {

    @NotNull
    @Valid
    @JsonProperty("type")
    public TypeReference getType();

    /**
    *  <p>A valid JSON object, based on FieldDefinition.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeReference type);

    public void setFields(final FieldContainer fields);

    public static CustomFields of() {
        return new CustomFieldsImpl();
    }

    public static CustomFields of(final CustomFields template) {
        CustomFieldsImpl instance = new CustomFieldsImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CustomFieldsBuilder builder() {
        return CustomFieldsBuilder.of();
    }

    public static CustomFieldsBuilder builder(final CustomFields template) {
        return CustomFieldsBuilder.of(template);
    }

    default <T> T withCustomFields(Function<CustomFields, T> helper) {
        return helper.apply(this);
    }
}
