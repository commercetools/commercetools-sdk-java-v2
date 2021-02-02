
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExtensionAzureFunctionsAuthenticationImpl.class)
public interface ExtensionAzureFunctionsAuthentication extends ExtensionHttpDestinationAuthentication {

    String AZURE_FUNCTIONS = "AzureFunctions";

    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ExtensionAzureFunctionsAuthentication of() {
        return new ExtensionAzureFunctionsAuthenticationImpl();
    }

    public static ExtensionAzureFunctionsAuthentication of(final ExtensionAzureFunctionsAuthentication template) {
        ExtensionAzureFunctionsAuthenticationImpl instance = new ExtensionAzureFunctionsAuthenticationImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ExtensionAzureFunctionsAuthenticationBuilder builder() {
        return ExtensionAzureFunctionsAuthenticationBuilder.of();
    }

    public static ExtensionAzureFunctionsAuthenticationBuilder builder(
            final ExtensionAzureFunctionsAuthentication template) {
        return ExtensionAzureFunctionsAuthenticationBuilder.of(template);
    }

    default <T> T withExtensionAzureFunctionsAuthentication(Function<ExtensionAzureFunctionsAuthentication, T> helper) {
        return helper.apply(this);
    }
}
