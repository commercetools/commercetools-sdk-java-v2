
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeChangeFieldDefinitionOrderActionImpl.class)
public interface TypeChangeFieldDefinitionOrderAction extends TypeUpdateAction {

    String CHANGE_FIELD_DEFINITION_ORDER = "changeFieldDefinitionOrder";

    @NotNull
    @JsonProperty("fieldNames")
    public List<String> getFieldNames();

    @JsonIgnore
    public void setFieldNames(final String... fieldNames);

    public void setFieldNames(final List<String> fieldNames);

    public static TypeChangeFieldDefinitionOrderAction of() {
        return new TypeChangeFieldDefinitionOrderActionImpl();
    }

    public static TypeChangeFieldDefinitionOrderAction of(final TypeChangeFieldDefinitionOrderAction template) {
        TypeChangeFieldDefinitionOrderActionImpl instance = new TypeChangeFieldDefinitionOrderActionImpl();
        instance.setFieldNames(template.getFieldNames());
        return instance;
    }

    public static TypeChangeFieldDefinitionOrderActionBuilder builder() {
        return TypeChangeFieldDefinitionOrderActionBuilder.of();
    }

    public static TypeChangeFieldDefinitionOrderActionBuilder builder(
            final TypeChangeFieldDefinitionOrderAction template) {
        return TypeChangeFieldDefinitionOrderActionBuilder.of(template);
    }

    default <T> T withTypeChangeFieldDefinitionOrderAction(Function<TypeChangeFieldDefinitionOrderAction, T> helper) {
        return helper.apply(this);
    }
}
