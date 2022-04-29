
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.AuthorizationHeaderAuthenticationImpl.class, name = AuthorizationHeaderAuthentication.AUTHORIZATION_HEADER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.AzureFunctionsAuthenticationImpl.class, name = AzureFunctionsAuthentication.AZURE_FUNCTIONS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = HttpDestinationAuthenticationImpl.class, visible = true)
@JsonDeserialize(as = HttpDestinationAuthenticationImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface HttpDestinationAuthentication {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.api.models.extension.AuthorizationHeaderAuthenticationBuilder authorizationHeaderBuilder() {
        return com.commercetools.api.models.extension.AuthorizationHeaderAuthenticationBuilder.of();
    }

    public static com.commercetools.api.models.extension.AzureFunctionsAuthenticationBuilder azureFunctionsBuilder() {
        return com.commercetools.api.models.extension.AzureFunctionsAuthenticationBuilder.of();
    }

    default <T> T withHttpDestinationAuthentication(Function<HttpDestinationAuthentication, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<HttpDestinationAuthentication> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<HttpDestinationAuthentication>() {
            @Override
            public String toString() {
                return "TypeReference<HttpDestinationAuthentication>";
            }
        };
    }
}
