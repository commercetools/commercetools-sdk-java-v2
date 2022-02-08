
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AzureFunctionsAuthenticationImpl.class)
public interface AzureFunctionsAuthentication extends HttpDestinationAuthentication {

    String AZURE_FUNCTIONS = "AzureFunctions";

    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static AzureFunctionsAuthentication of() {
        return new AzureFunctionsAuthenticationImpl();
    }

    public static AzureFunctionsAuthentication of(final AzureFunctionsAuthentication template) {
        AzureFunctionsAuthenticationImpl instance = new AzureFunctionsAuthenticationImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static AzureFunctionsAuthenticationBuilder builder() {
        return AzureFunctionsAuthenticationBuilder.of();
    }

    public static AzureFunctionsAuthenticationBuilder builder(final AzureFunctionsAuthentication template) {
        return AzureFunctionsAuthenticationBuilder.of(template);
    }

    default <T> T withAzureFunctionsAuthentication(Function<AzureFunctionsAuthentication, T> helper) {
        return helper.apply(this);
    }
}
