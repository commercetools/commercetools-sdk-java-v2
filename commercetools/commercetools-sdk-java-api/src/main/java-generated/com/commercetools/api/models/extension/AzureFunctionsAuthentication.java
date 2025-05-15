
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>To protect your Azure Function, set its <code>authLevel</code> to <code>function</code> and provide the function's key to be used inside the <code>x-functions-key</code> header. For more information, see the Azure Functions documentation.</p>
 *  <p>To protect the secret key from being exposed, remove the code parameter and secret key from the URL. For example, use <code>https://foo.azurewebsites.net/api/bar</code> instead of <code>https://foo.azurewebsites.net/api/bar?code=secret</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AzureFunctionsAuthentication azureFunctionsAuthentication = AzureFunctionsAuthentication.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AzureFunctions")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AzureFunctionsAuthenticationImpl.class)
public interface AzureFunctionsAuthentication extends HttpDestinationAuthentication {

    /**
     * discriminator value for AzureFunctionsAuthentication
     */
    String AZURE_FUNCTIONS = "AzureFunctions";

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of AzureFunctionsAuthentication
     */
    public static AzureFunctionsAuthentication of() {
        return new AzureFunctionsAuthenticationImpl();
    }

    /**
     * factory method to create a shallow copy AzureFunctionsAuthentication
     * @param template instance to be copied
     * @return copy instance
     */
    public static AzureFunctionsAuthentication of(final AzureFunctionsAuthentication template) {
        AzureFunctionsAuthenticationImpl instance = new AzureFunctionsAuthenticationImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public AzureFunctionsAuthentication copyDeep();

    /**
     * factory method to create a deep copy of AzureFunctionsAuthentication
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AzureFunctionsAuthentication deepCopy(@Nullable final AzureFunctionsAuthentication template) {
        if (template == null) {
            return null;
        }
        AzureFunctionsAuthenticationImpl instance = new AzureFunctionsAuthenticationImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for AzureFunctionsAuthentication
     * @return builder
     */
    public static AzureFunctionsAuthenticationBuilder builder() {
        return AzureFunctionsAuthenticationBuilder.of();
    }

    /**
     * create builder for AzureFunctionsAuthentication instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AzureFunctionsAuthenticationBuilder builder(final AzureFunctionsAuthentication template) {
        return AzureFunctionsAuthenticationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAzureFunctionsAuthentication(Function<AzureFunctionsAuthentication, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AzureFunctionsAuthentication> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AzureFunctionsAuthentication>() {
            @Override
            public String toString() {
                return "TypeReference<AzureFunctionsAuthentication>";
            }
        };
    }
}
