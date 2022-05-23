
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 <p>Represents a RFC 7662 compliant OAuth 2.0 Token Introspection endpoint. For more information, see Requesting an access token using an external OAuth 2.0 server.</p>
 <p>You can only configure <strong>one</strong> external OAuth 2.0 endpoint per Project. To authenticate using multiple external services (such as social network logins), use a middle layer authentication service.</p>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ExternalOAuth externalOAuth = ExternalOAuth.builder()
           .url("{url}")
           .authorizationHeader("{authorizationHeader}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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
