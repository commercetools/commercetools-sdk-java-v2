
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExtensionHttpDestinationImpl.class)
public interface ExtensionHttpDestination extends ExtensionDestination {

    String HTTP = "HTTP";

    @NotNull
    @JsonProperty("url")
    public String getUrl();

    @Valid
    @JsonProperty("authentication")
    public ExtensionHttpDestinationAuthentication getAuthentication();

    public void setUrl(final String url);

    public void setAuthentication(final ExtensionHttpDestinationAuthentication authentication);

    public static ExtensionHttpDestination of() {
        return new ExtensionHttpDestinationImpl();
    }

    public static ExtensionHttpDestination of(final ExtensionHttpDestination template) {
        ExtensionHttpDestinationImpl instance = new ExtensionHttpDestinationImpl();
        instance.setUrl(template.getUrl());
        instance.setAuthentication(template.getAuthentication());
        return instance;
    }

    public static ExtensionHttpDestinationBuilder builder() {
        return ExtensionHttpDestinationBuilder.of();
    }

    public static ExtensionHttpDestinationBuilder builder(final ExtensionHttpDestination template) {
        return ExtensionHttpDestinationBuilder.of(template);
    }

    default <T> T withExtensionHttpDestination(Function<ExtensionHttpDestination, T> helper) {
        return helper.apply(this);
    }
}
