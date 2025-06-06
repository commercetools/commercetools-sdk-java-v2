
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
 *  <p>We recommend creating an Identify and Access Management (IAM) user with an <code>accessKey</code> and <code>accessSecret</code> pair, specifically for each Extension that only has the <code>lambda:InvokeFunction</code> permission on this function.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AWSLambdaDestination aWSLambdaDestination = AWSLambdaDestination.builder()
 *             .arn("{arn}")
 *             .accessKey("{accessKey}")
 *             .accessSecret("{accessSecret}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AWSLambda")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AWSLambdaDestinationImpl.class)
public interface AWSLambdaDestination extends ExtensionDestination {

    /**
     * discriminator value for AWSLambdaDestination
     */
    String AWS_LAMBDA = "AWSLambda";

    /**
     *  <p>Amazon Resource Name (ARN) of the Lambda function in the format <code>arn:aws:lambda:&lt;region&gt;:&lt;accountid&gt;:function:&lt;functionName&gt;</code>. Use the format <code>arn:aws:lambda:&lt;region&gt;:&lt;accountid&gt;:function:&lt;functionName&gt;:&lt;functionAlias/version&gt;</code> to point to a specific version of the function.</p>
     * @return arn
     */
    @NotNull
    @JsonProperty("arn")
    public String getArn();

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return accessKey
     */
    @NotNull
    @JsonProperty("accessKey")
    public String getAccessKey();

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return accessSecret
     */
    @NotNull
    @JsonProperty("accessSecret")
    public String getAccessSecret();

    /**
     *  <p>Amazon Resource Name (ARN) of the Lambda function in the format <code>arn:aws:lambda:&lt;region&gt;:&lt;accountid&gt;:function:&lt;functionName&gt;</code>. Use the format <code>arn:aws:lambda:&lt;region&gt;:&lt;accountid&gt;:function:&lt;functionName&gt;:&lt;functionAlias/version&gt;</code> to point to a specific version of the function.</p>
     * @param arn value to be set
     */

    public void setArn(final String arn);

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param accessKey value to be set
     */

    public void setAccessKey(final String accessKey);

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param accessSecret value to be set
     */

    public void setAccessSecret(final String accessSecret);

    /**
     * factory method
     * @return instance of AWSLambdaDestination
     */
    public static AWSLambdaDestination of() {
        return new AWSLambdaDestinationImpl();
    }

    /**
     * factory method to create a shallow copy AWSLambdaDestination
     * @param template instance to be copied
     * @return copy instance
     */
    public static AWSLambdaDestination of(final AWSLambdaDestination template) {
        AWSLambdaDestinationImpl instance = new AWSLambdaDestinationImpl();
        instance.setArn(template.getArn());
        instance.setAccessKey(template.getAccessKey());
        instance.setAccessSecret(template.getAccessSecret());
        return instance;
    }

    public AWSLambdaDestination copyDeep();

    /**
     * factory method to create a deep copy of AWSLambdaDestination
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AWSLambdaDestination deepCopy(@Nullable final AWSLambdaDestination template) {
        if (template == null) {
            return null;
        }
        AWSLambdaDestinationImpl instance = new AWSLambdaDestinationImpl();
        instance.setArn(template.getArn());
        instance.setAccessKey(template.getAccessKey());
        instance.setAccessSecret(template.getAccessSecret());
        return instance;
    }

    /**
     * builder factory method for AWSLambdaDestination
     * @return builder
     */
    public static AWSLambdaDestinationBuilder builder() {
        return AWSLambdaDestinationBuilder.of();
    }

    /**
     * create builder for AWSLambdaDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AWSLambdaDestinationBuilder builder(final AWSLambdaDestination template) {
        return AWSLambdaDestinationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAWSLambdaDestination(Function<AWSLambdaDestination, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AWSLambdaDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AWSLambdaDestination>() {
            @Override
            public String toString() {
                return "TypeReference<AWSLambdaDestination>";
            }
        };
    }
}
