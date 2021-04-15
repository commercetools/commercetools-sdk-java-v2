
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExternalOAuthFailedErrorImpl.class)
public interface ExternalOAuthFailedError extends ErrorObject {

    String EXTERNAL_O_AUTH_FAILED = "ExternalOAuthFailed";

    public static ExternalOAuthFailedError of() {
        return new ExternalOAuthFailedErrorImpl();
    }

    public static ExternalOAuthFailedError of(final ExternalOAuthFailedError template) {
        ExternalOAuthFailedErrorImpl instance = new ExternalOAuthFailedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static ExternalOAuthFailedErrorBuilder builder() {
        return ExternalOAuthFailedErrorBuilder.of();
    }

    public static ExternalOAuthFailedErrorBuilder builder(final ExternalOAuthFailedError template) {
        return ExternalOAuthFailedErrorBuilder.of(template);
    }

    default <T> T withExternalOAuthFailedError(Function<ExternalOAuthFailedError, T> helper) {
        return helper.apply(this);
    }
}
