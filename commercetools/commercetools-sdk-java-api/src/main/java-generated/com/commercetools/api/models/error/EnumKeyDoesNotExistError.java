
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = EnumKeyDoesNotExistErrorImpl.class)
public interface EnumKeyDoesNotExistError extends ErrorObject {

    String ENUM_KEY_DOES_NOT_EXIST = "EnumKeyDoesNotExist";

    @NotNull
    @JsonProperty("conflictingEnumKey")
    public String getConflictingEnumKey();

    @NotNull
    @JsonProperty("conflictingAttributeName")
    public String getConflictingAttributeName();

    public void setConflictingEnumKey(final String conflictingEnumKey);

    public void setConflictingAttributeName(final String conflictingAttributeName);

    public static EnumKeyDoesNotExistError of() {
        return new EnumKeyDoesNotExistErrorImpl();
    }

    public static EnumKeyDoesNotExistError of(final EnumKeyDoesNotExistError template) {
        EnumKeyDoesNotExistErrorImpl instance = new EnumKeyDoesNotExistErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setConflictingEnumKey(template.getConflictingEnumKey());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    public static EnumKeyDoesNotExistErrorBuilder builder() {
        return EnumKeyDoesNotExistErrorBuilder.of();
    }

    public static EnumKeyDoesNotExistErrorBuilder builder(final EnumKeyDoesNotExistError template) {
        return EnumKeyDoesNotExistErrorBuilder.of(template);
    }

    default <T> T withEnumKeyDoesNotExistError(Function<EnumKeyDoesNotExistError, T> helper) {
        return helper.apply(this);
    }
}
