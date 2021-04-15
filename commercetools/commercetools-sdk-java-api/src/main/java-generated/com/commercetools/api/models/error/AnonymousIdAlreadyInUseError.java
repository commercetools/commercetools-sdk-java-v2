
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AnonymousIdAlreadyInUseErrorImpl.class)
public interface AnonymousIdAlreadyInUseError extends ErrorObject {

    String ANONYMOUS_ID_ALREADY_IN_USE = "AnonymousIdAlreadyInUse";

    public static AnonymousIdAlreadyInUseError of() {
        return new AnonymousIdAlreadyInUseErrorImpl();
    }

    public static AnonymousIdAlreadyInUseError of(final AnonymousIdAlreadyInUseError template) {
        AnonymousIdAlreadyInUseErrorImpl instance = new AnonymousIdAlreadyInUseErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static AnonymousIdAlreadyInUseErrorBuilder builder() {
        return AnonymousIdAlreadyInUseErrorBuilder.of();
    }

    public static AnonymousIdAlreadyInUseErrorBuilder builder(final AnonymousIdAlreadyInUseError template) {
        return AnonymousIdAlreadyInUseErrorBuilder.of(template);
    }

    default <T> T withAnonymousIdAlreadyInUseError(Function<AnonymousIdAlreadyInUseError, T> helper) {
        return helper.apply(this);
    }
}
