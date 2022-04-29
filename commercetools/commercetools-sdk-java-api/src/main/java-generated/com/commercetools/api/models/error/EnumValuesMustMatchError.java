
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = EnumValuesMustMatchErrorImpl.class)
public interface EnumValuesMustMatchError extends ErrorObject {

    String ENUM_VALUES_MUST_MATCH = "EnumValuesMustMatch";

    public static EnumValuesMustMatchError of() {
        return new EnumValuesMustMatchErrorImpl();
    }

    public static EnumValuesMustMatchError of(final EnumValuesMustMatchError template) {
        EnumValuesMustMatchErrorImpl instance = new EnumValuesMustMatchErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static EnumValuesMustMatchErrorBuilder builder() {
        return EnumValuesMustMatchErrorBuilder.of();
    }

    public static EnumValuesMustMatchErrorBuilder builder(final EnumValuesMustMatchError template) {
        return EnumValuesMustMatchErrorBuilder.of(template);
    }

    default <T> T withEnumValuesMustMatchError(Function<EnumValuesMustMatchError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<EnumValuesMustMatchError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumValuesMustMatchError>() {
            @Override
            public String toString() {
                return "TypeReference<EnumValuesMustMatchError>";
            }
        };
    }
}
