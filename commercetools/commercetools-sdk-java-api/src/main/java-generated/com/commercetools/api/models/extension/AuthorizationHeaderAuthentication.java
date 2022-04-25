
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The <code>Authorization</code> header will be set to the content of <code>headerValue</code>. The authentication scheme (such as <code>Basic</code> or <code>Bearer</code>) should be included in the <code>headerValue</code>.</p>
*  <p>For example, the <code>headerValue</code> for <a href="https://datatracker.ietf.org/doc/html/rfc7617">Basic Authentication</a> should be set to <code>Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==</code>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AuthorizationHeaderAuthenticationImpl.class)
public interface AuthorizationHeaderAuthentication extends HttpDestinationAuthentication {

    String AUTHORIZATION_HEADER = "AuthorizationHeader";

    /**
    *  <p>Partially hidden on retrieval for security reasons.</p>
    */
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

    public static com.fasterxml.jackson.core.type.TypeReference<AuthorizationHeaderAuthentication> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AuthorizationHeaderAuthentication>() {
            @Override
            public String toString() {
                return "TypeReference<AuthorizationHeaderAuthentication>";
            }
        };
    }
}
