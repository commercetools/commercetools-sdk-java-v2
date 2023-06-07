
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This destination can be used to push events and messages to Confluent Cloud. To set up a Subscription of this type, first, create a topic in Confluent Cloud. Then, to allow Composable Commerce to push events and messages to your topic, generate API keys for your topic, and create the Subscription destination using the generated credentials.</p>
 *  <p>The Composable Commerce producer uses the following values: <code>SASL_SSL</code> for<code>security.protocol</code>, <code>PLAIN</code> for<code>sasl.mechanism</code>, and the default value (1048576) for <code>max.request.size</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ConfluentCloudDestination confluentCloudDestination = ConfluentCloudDestination.builder()
 *             .bootstrapServer("{bootstrapServer}")
 *             .apiKey("{apiKey}")
 *             .apiSecret("{apiSecret}")
 *             .acks("{acks}")
 *             .topic("{topic}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ConfluentCloudDestinationImpl.class)
public interface ConfluentCloudDestination extends Destination {

    /**
     * discriminator value for ConfluentCloudDestination
     */
    String CONFLUENT_CLOUD = "ConfluentCloud";

    /**
     *  <p>URL to the bootstrap server including the port number in the format <code>&lt;xxxxx&gt;.&lt;region&gt;.&lt;provider&gt;.confluent.cloud:9092</code>.</p>
     * @return bootstrapServer
     */
    @NotNull
    @JsonProperty("bootstrapServer")
    public String getBootstrapServer();

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return apiKey
     */
    @NotNull
    @JsonProperty("apiKey")
    public String getApiKey();

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return apiSecret
     */
    @NotNull
    @JsonProperty("apiSecret")
    public String getApiSecret();

    /**
     *  <p>The Kafka <code>acks</code> value. Can be <code>"0"</code>, <code>"1"</code>, or <code>"all"</code>.</p>
     * @return acks
     */
    @NotNull
    @JsonProperty("acks")
    public String getAcks();

    /**
     *  <p>The name of the topic.</p>
     * @return topic
     */
    @NotNull
    @JsonProperty("topic")
    public String getTopic();

    /**
     *  <p>The Kafka record key.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>URL to the bootstrap server including the port number in the format <code>&lt;xxxxx&gt;.&lt;region&gt;.&lt;provider&gt;.confluent.cloud:9092</code>.</p>
     * @param bootstrapServer value to be set
     */

    public void setBootstrapServer(final String bootstrapServer);

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param apiKey value to be set
     */

    public void setApiKey(final String apiKey);

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param apiSecret value to be set
     */

    public void setApiSecret(final String apiSecret);

    /**
     *  <p>The Kafka <code>acks</code> value. Can be <code>"0"</code>, <code>"1"</code>, or <code>"all"</code>.</p>
     * @param acks value to be set
     */

    public void setAcks(final String acks);

    /**
     *  <p>The name of the topic.</p>
     * @param topic value to be set
     */

    public void setTopic(final String topic);

    /**
     *  <p>The Kafka record key.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ConfluentCloudDestination
     */
    public static ConfluentCloudDestination of() {
        return new ConfluentCloudDestinationImpl();
    }

    /**
     * factory method to create a shallow copy ConfluentCloudDestination
     * @param template instance to be copied
     * @return copy instance
     */
    public static ConfluentCloudDestination of(final ConfluentCloudDestination template) {
        ConfluentCloudDestinationImpl instance = new ConfluentCloudDestinationImpl();
        instance.setBootstrapServer(template.getBootstrapServer());
        instance.setApiKey(template.getApiKey());
        instance.setApiSecret(template.getApiSecret());
        instance.setAcks(template.getAcks());
        instance.setTopic(template.getTopic());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ConfluentCloudDestination
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ConfluentCloudDestination deepCopy(@Nullable final ConfluentCloudDestination template) {
        if (template == null) {
            return null;
        }
        ConfluentCloudDestinationImpl instance = new ConfluentCloudDestinationImpl();
        instance.setBootstrapServer(template.getBootstrapServer());
        instance.setApiKey(template.getApiKey());
        instance.setApiSecret(template.getApiSecret());
        instance.setAcks(template.getAcks());
        instance.setTopic(template.getTopic());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ConfluentCloudDestination
     * @return builder
     */
    public static ConfluentCloudDestinationBuilder builder() {
        return ConfluentCloudDestinationBuilder.of();
    }

    /**
     * create builder for ConfluentCloudDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ConfluentCloudDestinationBuilder builder(final ConfluentCloudDestination template) {
        return ConfluentCloudDestinationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withConfluentCloudDestination(Function<ConfluentCloudDestination, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ConfluentCloudDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ConfluentCloudDestination>() {
            @Override
            public String toString() {
                return "TypeReference<ConfluentCloudDestination>";
            }
        };
    }
}
