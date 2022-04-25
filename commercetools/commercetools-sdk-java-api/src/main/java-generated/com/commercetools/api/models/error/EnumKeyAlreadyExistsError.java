
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = EnumKeyAlreadyExistsErrorImpl.class)
public interface EnumKeyAlreadyExistsError extends ErrorObject {

    String ENUM_KEY_ALREADY_EXISTS = "EnumKeyAlreadyExists";

    @NotNull
    @JsonProperty("conflictingEnumKey")
    public String getConflictingEnumKey();

    @NotNull
    @JsonProperty("conflictingAttributeName")
    public String getConflictingAttributeName();

    public void setConflictingEnumKey(final String conflictingEnumKey);

    public void setConflictingAttributeName(final String conflictingAttributeName);

    public static EnumKeyAlreadyExistsError of() {
        return new EnumKeyAlreadyExistsErrorImpl();
    }

    public static EnumKeyAlreadyExistsError of(final EnumKeyAlreadyExistsError template) {
        EnumKeyAlreadyExistsErrorImpl instance = new EnumKeyAlreadyExistsErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setConflictingEnumKey(template.getConflictingEnumKey());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    public static EnumKeyAlreadyExistsErrorBuilder builder() {
        return EnumKeyAlreadyExistsErrorBuilder.of();
    }

    public static EnumKeyAlreadyExistsErrorBuilder builder(final EnumKeyAlreadyExistsError template) {
        return EnumKeyAlreadyExistsErrorBuilder.of(template);
    }

    default <T> T withEnumKeyAlreadyExistsError(Function<EnumKeyAlreadyExistsError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<EnumKeyAlreadyExistsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumKeyAlreadyExistsError>() {
            @Override
            public String toString() {
                return "TypeReference<EnumKeyAlreadyExistsError>";
            }
        };
    }
}
