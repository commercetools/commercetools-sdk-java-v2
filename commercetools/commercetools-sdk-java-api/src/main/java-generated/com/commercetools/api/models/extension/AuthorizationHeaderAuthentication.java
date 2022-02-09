
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AuthorizationHeaderAuthenticationImpl.class)
public interface AuthorizationHeaderAuthentication extends HttpDestinationAuthentication {

    String AUTHORIZATION_HEADER = "AuthorizationHeader";

    @NotNull
    @JsonProperty("headerValue")
    public String getHeaderValue();

    public void setHeaderValue(final String headerValue);

    public static AuthorizationHeaderAuthentication of() {
        return new AuthorizationHeaderAuthenticationImpl();
    }

    public static AuthorizationHeaderAuthentication of(final AuthorizationHeaderAuthentication template) {
        AuthorizationHeaderAuthenticationImpl instance = new AuthorizationHeaderAuthenticationImpl();
        instance.setHeaderValue(template.getHeaderValue());
        return instance;
    }

    public static AuthorizationHeaderAuthenticationBuilder builder() {
        return AuthorizationHeaderAuthenticationBuilder.of();
    }

    public static AuthorizationHeaderAuthenticationBuilder builder(final AuthorizationHeaderAuthentication template) {
        return AuthorizationHeaderAuthenticationBuilder.of(template);
    }

    default <T> T withAuthorizationHeaderAuthentication(Function<AuthorizationHeaderAuthentication, T> helper) {
        return helper.apply(this);
    }
}
