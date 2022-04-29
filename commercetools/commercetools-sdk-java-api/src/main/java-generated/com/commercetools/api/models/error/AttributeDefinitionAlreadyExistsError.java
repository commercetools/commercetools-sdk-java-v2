
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeDefinitionAlreadyExistsErrorImpl.class)
public interface AttributeDefinitionAlreadyExistsError extends ErrorObject {

    String ATTRIBUTE_DEFINITION_ALREADY_EXISTS = "AttributeDefinitionAlreadyExists";

    @NotNull
    @JsonProperty("conflictingProductTypeId")
    public String getConflictingProductTypeId();

    @NotNull
    @JsonProperty("conflictingProductTypeName")
    public String getConflictingProductTypeName();

    @NotNull
    @JsonProperty("conflictingAttributeName")
    public String getConflictingAttributeName();

    public void setConflictingProductTypeId(final String conflictingProductTypeId);

    public void setConflictingProductTypeName(final String conflictingProductTypeName);

    public void setConflictingAttributeName(final String conflictingAttributeName);

    public static AttributeDefinitionAlreadyExistsError of() {
        return new AttributeDefinitionAlreadyExistsErrorImpl();
    }

    public static AttributeDefinitionAlreadyExistsError of(final AttributeDefinitionAlreadyExistsError template) {
        AttributeDefinitionAlreadyExistsErrorImpl instance = new AttributeDefinitionAlreadyExistsErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setConflictingProductTypeId(template.getConflictingProductTypeId());
        instance.setConflictingProductTypeName(template.getConflictingProductTypeName());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    public static AttributeDefinitionAlreadyExistsErrorBuilder builder() {
        return AttributeDefinitionAlreadyExistsErrorBuilder.of();
    }

    public static AttributeDefinitionAlreadyExistsErrorBuilder builder(
            final AttributeDefinitionAlreadyExistsError template) {
        return AttributeDefinitionAlreadyExistsErrorBuilder.of(template);
    }

    default <T> T withAttributeDefinitionAlreadyExistsError(Function<AttributeDefinitionAlreadyExistsError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionAlreadyExistsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionAlreadyExistsError>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeDefinitionAlreadyExistsError>";
            }
        };
    }
}
