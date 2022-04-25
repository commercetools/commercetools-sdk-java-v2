
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

    /**
    *  <p>Must match the set of <code>name</code>s of FieldDefinitions (up to order).</p>
    */
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

    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeFieldDefinitionOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeFieldDefinitionOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeFieldDefinitionOrderAction>";
            }
        };
    }
}
