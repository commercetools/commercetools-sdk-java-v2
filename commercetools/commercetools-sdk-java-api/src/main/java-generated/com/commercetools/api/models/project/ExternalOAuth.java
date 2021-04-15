
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExternalOAuthImpl.class)
public interface ExternalOAuth {

    @NotNull
    @JsonProperty("url")
    public String getUrl();

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
}
