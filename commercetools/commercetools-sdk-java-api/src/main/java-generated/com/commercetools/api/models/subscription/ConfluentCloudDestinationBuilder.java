
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ConfluentCloudDestinationBuilder
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
public class ConfluentCloudDestinationBuilder implements Builder<ConfluentCloudDestination> {

    private String bootstrapServer;

    private String apiKey;

    private String apiSecret;

    private String acks;

    private String topic;

    @Nullable
    private String key;

    /**
     *  <p>URL to the bootstrap server including the port number in the format <code>&lt;xxxxx&gt;.&lt;region&gt;.&lt;provider&gt;.confluent.cloud:9092</code>.</p>
     * @param bootstrapServer value to be set
     * @return Builder
     */

    public ConfluentCloudDestinationBuilder bootstrapServer(final String bootstrapServer) {
        this.bootstrapServer = bootstrapServer;
        return this;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param apiKey value to be set
     * @return Builder
     */

    public ConfluentCloudDestinationBuilder apiKey(final String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param apiSecret value to be set
     * @return Builder
     */

    public ConfluentCloudDestinationBuilder apiSecret(final String apiSecret) {
        this.apiSecret = apiSecret;
        return this;
    }

    /**
     *  <p>The Kafka <code>acks</code> value.</p>
     * @param acks value to be set
     * @return Builder
     */

    public ConfluentCloudDestinationBuilder acks(final String acks) {
        this.acks = acks;
        return this;
    }

    /**
     *  <p>The name of the topic.</p>
     * @param topic value to be set
     * @return Builder
     */

    public ConfluentCloudDestinationBuilder topic(final String topic) {
        this.topic = topic;
        return this;
    }

    /**
     *  <p>The Kafka record key.</p>
     * @param key value to be set
     * @return Builder
     */

    public ConfluentCloudDestinationBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>URL to the bootstrap server including the port number in the format <code>&lt;xxxxx&gt;.&lt;region&gt;.&lt;provider&gt;.confluent.cloud:9092</code>.</p>
     * @return bootstrapServer
     */

    public String getBootstrapServer() {
        return this.bootstrapServer;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return apiKey
     */

    public String getApiKey() {
        return this.apiKey;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return apiSecret
     */

    public String getApiSecret() {
        return this.apiSecret;
    }

    /**
     *  <p>The Kafka <code>acks</code> value.</p>
     * @return acks
     */

    public String getAcks() {
        return this.acks;
    }

    /**
     *  <p>The name of the topic.</p>
     * @return topic
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     *  <p>The Kafka record key.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ConfluentCloudDestination with checking for non-null required values
     * @return ConfluentCloudDestination
     */
    public ConfluentCloudDestination build() {
        Objects.requireNonNull(bootstrapServer, ConfluentCloudDestination.class + ": bootstrapServer is missing");
        Objects.requireNonNull(apiKey, ConfluentCloudDestination.class + ": apiKey is missing");
        Objects.requireNonNull(apiSecret, ConfluentCloudDestination.class + ": apiSecret is missing");
        Objects.requireNonNull(acks, ConfluentCloudDestination.class + ": acks is missing");
        Objects.requireNonNull(topic, ConfluentCloudDestination.class + ": topic is missing");
        return new ConfluentCloudDestinationImpl(bootstrapServer, apiKey, apiSecret, acks, topic, key);
    }

    /**
     * builds ConfluentCloudDestination without checking for non-null required values
     * @return ConfluentCloudDestination
     */
    public ConfluentCloudDestination buildUnchecked() {
        return new ConfluentCloudDestinationImpl(bootstrapServer, apiKey, apiSecret, acks, topic, key);
    }

    /**
     * factory method for an instance of ConfluentCloudDestinationBuilder
     * @return builder
     */
    public static ConfluentCloudDestinationBuilder of() {
        return new ConfluentCloudDestinationBuilder();
    }

    /**
     * create builder for ConfluentCloudDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ConfluentCloudDestinationBuilder of(final ConfluentCloudDestination template) {
        ConfluentCloudDestinationBuilder builder = new ConfluentCloudDestinationBuilder();
        builder.bootstrapServer = template.getBootstrapServer();
        builder.apiKey = template.getApiKey();
        builder.apiSecret = template.getApiSecret();
        builder.acks = template.getAcks();
        builder.topic = template.getTopic();
        builder.key = template.getKey();
        return builder;
    }

}
