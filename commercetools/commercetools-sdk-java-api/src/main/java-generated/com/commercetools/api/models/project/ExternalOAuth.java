
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Represents a RFC 7662 compliant <a href="https://datatracker.ietf.org/doc/html/rfc7662">OAuth 2.0 Token Introspection</a> endpoint. For more information, see <a href="/../api/authorization#requesting-an-access-token-using-an-external-oauth-server">Requesting an access token using an external OAuth 2.0 server</a>.</p>
*  <p>You can only configure <strong>one</strong> external OAuth 2.0 endpoint per Project. To authenticate using multiple external services (such as social network logins), use a middle layer authentication service.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExternalOAuthImpl.class)
public interface ExternalOAuth {

    /**
    *  <p>URL with authorization header.</p>
    */
    @NotNull
    @JsonProperty("url")
    public String getUrl();

    /**
    *  <p>Partially hidden on retrieval.</p>
    */
    @NotNull
    @JsonProperty("authorizationHeader")
    public String getAuthorizationHeader();

    public void setUrl(final String url);

    public void setAuthorizationHeader(final String authorizationHeader);

    public static ExternalOAuth of() {
        return new ExternalOAuthImpl();
    }

    public static ExternalOAuth of(final ExternalOAuth template) {
        ExternalOAuthImpl instance = new ExternalOAuthImpl();
        instance.setUrl(template.getUrl());
        instance.setAuthorizationHeader(template.getAuthorizationHeader());
        return instance;
    }

    public static ExternalOAuthBuilder builder() {
        return ExternalOAuthBuilder.of();
    }

    public static ExternalOAuthBuilder builder(final ExternalOAuth template) {
        return ExternalOAuthBuilder.of(template);
    }

    default <T> T withExternalOAuth(Function<ExternalOAuth, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExternalOAuth> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExternalOAuth>() {
            @Override
            public String toString() {
                return "TypeReference<ExternalOAuth>";
            }
        };
    }
}
