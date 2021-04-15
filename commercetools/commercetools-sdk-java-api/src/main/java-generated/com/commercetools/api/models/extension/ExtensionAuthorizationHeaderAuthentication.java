
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExtensionAuthorizationHeaderAuthenticationImpl.class)
public interface ExtensionAuthorizationHeaderAuthentication extends ExtensionHttpDestinationAuthentication {

    String AUTHORIZATION_HEADER = "AuthorizationHeader";

    @NotNull
    @JsonProperty("headerValue")
    public String getHeaderValue();

    public void setHeaderValue(final String headerValue);

    public static ExtensionAuthorizationHeaderAuthentication of() {
        return new ExtensionAuthorizationHeaderAuthenticationImpl();
    }

    public static ExtensionAuthorizationHeaderAuthentication of(
            final ExtensionAuthorizationHeaderAuthentication template) {
        ExtensionAuthorizationHeaderAuthenticationImpl instance = new ExtensionAuthorizationHeaderAuthenticationImpl();
        instance.setHeaderValue(template.getHeaderValue());
        return instance;
    }

    public static ExtensionAuthorizationHeaderAuthenticationBuilder builder() {
        return ExtensionAuthorizationHeaderAuthenticationBuilder.of();
    }

    public static ExtensionAuthorizationHeaderAuthenticationBuilder builder(
            final ExtensionAuthorizationHeaderAuthentication template) {
        return ExtensionAuthorizationHeaderAuthenticationBuilder.of(template);
    }

    default <T> T withExtensionAuthorizationHeaderAuthentication(
            Function<ExtensionAuthorizationHeaderAuthentication, T> helper) {
        return helper.apply(this);
    }
}
