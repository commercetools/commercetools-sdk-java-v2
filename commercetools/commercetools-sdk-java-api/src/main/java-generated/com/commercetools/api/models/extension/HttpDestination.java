
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>We recommend an encrypted <code>HTTPS</code> connection for production setups. However, we also accept unencrypted <code>HTTP</code> connections for development purposes. HTTP redirects will not be followed and cache headers will be ignored.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = HttpDestinationImpl.class)
public interface HttpDestination extends ExtensionDestination {

    String HTTP = "HTTP";

    /**
    *  <p>URL to the target destination.</p>
    */
    @NotNull
    @JsonProperty("url")
    public String getUrl();

    /**
    *  <p>Authentication methods (such as <code>Basic</code> or <code>Bearer</code>).</p>
    */
    @Valid
    @JsonProperty("authentication")
    public HttpDestinationAuthentication getAuthentication();

    public void setUrl(final String url);

    public void setAuthentication(final HttpDestinationAuthentication authentication);

    public static HttpDestination of() {
        return new HttpDestinationImpl();
    }

    public static HttpDestination of(final HttpDestination template) {
        HttpDestinationImpl instance = new HttpDestinationImpl();
        instance.setUrl(template.getUrl());
        instance.setAuthentication(template.getAuthentication());
        return instance;
    }

    public static HttpDestinationBuilder builder() {
        return HttpDestinationBuilder.of();
    }

    public static HttpDestinationBuilder builder(final HttpDestination template) {
        return HttpDestinationBuilder.of(template);
    }

    default <T> T withHttpDestination(Function<HttpDestination, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<HttpDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<HttpDestination>() {
            @Override
            public String toString() {
                return "TypeReference<HttpDestination>";
            }
        };
    }
}
