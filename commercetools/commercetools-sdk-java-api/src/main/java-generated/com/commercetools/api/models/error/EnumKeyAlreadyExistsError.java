package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.EnumKeyAlreadyExistsErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = EnumKeyAlreadyExistsErrorImpl.class)
public interface EnumKeyAlreadyExistsError extends ErrorObject {

    
    @NotNull
    @JsonProperty("conflictingEnumKey")
    public String getConflictingEnumKey();
    
    @NotNull
    @JsonProperty("conflictingAttributeName")
    public String getConflictingAttributeName();

    public void setConflictingEnumKey(final String conflictingEnumKey);
    
    public void setConflictingAttributeName(final String conflictingAttributeName);

    public static EnumKeyAlreadyExistsErrorImpl of(){
        return new EnumKeyAlreadyExistsErrorImpl();
    }
    

    public static EnumKeyAlreadyExistsErrorImpl of(final EnumKeyAlreadyExistsError template) {
        EnumKeyAlreadyExistsErrorImpl instance = new EnumKeyAlreadyExistsErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setConflictingEnumKey(template.getConflictingEnumKey());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    default <T> T withEnumKeyAlreadyExistsError(Function<EnumKeyAlreadyExistsError, T> helper) {
        return helper.apply(this);
    }
}
