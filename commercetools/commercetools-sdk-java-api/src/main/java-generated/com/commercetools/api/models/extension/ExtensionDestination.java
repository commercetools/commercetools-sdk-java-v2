
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
 *  <p>Generic type for destinations.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionDestination extensionDestination = ExtensionDestination.awsLambdaBuilder()
 *             arn("{arn}")
 *             accessKey("{accessKey}")
 *             accessSecret("{accessSecret}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.AWSLambdaDestinationImpl.class, name = AWSLambdaDestination.AWS_LAMBDA),
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.GoogleCloudFunctionDestinationImpl.class, name = GoogleCloudFunctionDestination.GOOGLE_CLOUD_FUNCTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.HttpDestinationImpl.class, name = HttpDestination.HTTP) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ExtensionDestinationImpl.class, visible = true)
@JsonDeserialize(as = ExtensionDestinationImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ExtensionDestination {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * factory method to create a deep copy of ExtensionDestination
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionDestination deepCopy(@Nullable final ExtensionDestination template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.extension.AWSLambdaDestination) {
            return com.commercetools.api.models.extension.AWSLambdaDestination
                    .deepCopy((com.commercetools.api.models.extension.AWSLambdaDestination) template);
        }
        if (template instanceof com.commercetools.api.models.extension.GoogleCloudFunctionDestination) {
            return com.commercetools.api.models.extension.GoogleCloudFunctionDestination
                    .deepCopy((com.commercetools.api.models.extension.GoogleCloudFunctionDestination) template);
        }
        if (template instanceof com.commercetools.api.models.extension.HttpDestination) {
            return com.commercetools.api.models.extension.HttpDestination
                    .deepCopy((com.commercetools.api.models.extension.HttpDestination) template);
        }
        ExtensionDestinationImpl instance = new ExtensionDestinationImpl();
        return instance;
    }

    /**
     * builder for awsLambda subtype
     * @return builder
     */
    public static com.commercetools.api.models.extension.AWSLambdaDestinationBuilder awsLambdaBuilder() {
        return com.commercetools.api.models.extension.AWSLambdaDestinationBuilder.of();
    }

    /**
     * builder for googleCloudFunction subtype
     * @return builder
     */
    public static com.commercetools.api.models.extension.GoogleCloudFunctionDestinationBuilder googleCloudFunctionBuilder() {
        return com.commercetools.api.models.extension.GoogleCloudFunctionDestinationBuilder.of();
    }

    /**
     * builder for http subtype
     * @return builder
     */
    public static com.commercetools.api.models.extension.HttpDestinationBuilder httpBuilder() {
        return com.commercetools.api.models.extension.HttpDestinationBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionDestination(Function<ExtensionDestination, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionDestination>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionDestination>";
            }
        };
    }
}
