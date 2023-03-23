
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>For GoogleCloudFunction destinations, you need to grant permissions to the <code>extensions@commercetools-platform.iam.gserviceaccount.com</code> service account to invoke your function. If your function's version is 1st gen, grant the service account the IAM role <code>Cloud Functions Invoker</code>. For version 2nd gen, assign the IAM role <code>Cloud Run Invoker</code> using the Cloud Run console.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GoogleCloudFunctionDestination googleCloudFunctionDestination = GoogleCloudFunctionDestination.builder()
 *             .url("{url}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GoogleCloudFunctionDestinationImpl.class)
public interface GoogleCloudFunctionDestination extends ExtensionDestination {

    String GOOGLE_CLOUD_FUNCTION = "GoogleCloudFunction";

    /**
     *  <p>URL to the target function.</p>
     * @return url
     */
    @NotNull
    @JsonProperty("url")
    public String getUrl();

    public void setUrl(final String url);

    public static GoogleCloudFunctionDestination of() {
        return new GoogleCloudFunctionDestinationImpl();
    }

    public static GoogleCloudFunctionDestination of(final GoogleCloudFunctionDestination template) {
        GoogleCloudFunctionDestinationImpl instance = new GoogleCloudFunctionDestinationImpl();
        instance.setUrl(template.getUrl());
        return instance;
    }

    public static GoogleCloudFunctionDestinationBuilder builder() {
        return GoogleCloudFunctionDestinationBuilder.of();
    }

    public static GoogleCloudFunctionDestinationBuilder builder(final GoogleCloudFunctionDestination template) {
        return GoogleCloudFunctionDestinationBuilder.of(template);
    }

    default <T> T withGoogleCloudFunctionDestination(Function<GoogleCloudFunctionDestination, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<GoogleCloudFunctionDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GoogleCloudFunctionDestination>() {
            @Override
            public String toString() {
                return "TypeReference<GoogleCloudFunctionDestination>";
            }
        };
    }
}
