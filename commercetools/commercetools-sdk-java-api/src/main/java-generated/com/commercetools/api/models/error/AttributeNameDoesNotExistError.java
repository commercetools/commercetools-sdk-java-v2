
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeNameDoesNotExistErrorImpl.class)
public interface AttributeNameDoesNotExistError extends ErrorObject {

    String ATTRIBUTE_NAME_DOES_NOT_EXIST = "AttributeNameDoesNotExist";

    @NotNull
    @JsonProperty("invalidAttributeName")
    public String getInvalidAttributeName();

    public void setInvalidAttributeName(final String invalidAttributeName);

    public static AttributeNameDoesNotExistError of() {
        return new AttributeNameDoesNotExistErrorImpl();
    }

    public static AttributeNameDoesNotExistError of(final AttributeNameDoesNotExistError template) {
        AttributeNameDoesNotExistErrorImpl instance = new AttributeNameDoesNotExistErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setInvalidAttributeName(template.getInvalidAttributeName());
        return instance;
    }

    public static AttributeNameDoesNotExistErrorBuilder builder() {
        return AttributeNameDoesNotExistErrorBuilder.of();
    }

    public static AttributeNameDoesNotExistErrorBuilder builder(final AttributeNameDoesNotExistError template) {
        return AttributeNameDoesNotExistErrorBuilder.of(template);
    }

    default <T> T withAttributeNameDoesNotExistError(Function<AttributeNameDoesNotExistError, T> helper) {
        return helper.apply(this);
    }
}
