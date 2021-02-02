
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.TypeKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The representation to be sent to the server when creating a resource with custom fields.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomImpl.class)
public interface Custom {

    /**
    *  <p>The type that provides the field definitions for this object.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("type")
    public TypeKeyReference getType();

    /**
    *  <p>The custom fields of this object.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeKeyReference type);

    public void setFields(final FieldContainer fields);

    public static Custom of() {
        return new CustomImpl();
    }

    public static Custom of(final Custom template) {
        CustomImpl instance = new CustomImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CustomBuilder builder() {
        return CustomBuilder.of();
    }

    public static CustomBuilder builder(final Custom template) {
        return CustomBuilder.of(template);
    }

    default <T> T withCustom(Function<Custom, T> helper) {
        return helper.apply(this);
    }
}
