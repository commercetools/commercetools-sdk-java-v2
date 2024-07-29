
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>This destination can be used to push notifications to Confluent Cloud. To set up a Subscription of this type, first, create a topic in Confluent Cloud. Then, to allow Composable Commerce to push notifications to your topic, generate API keys for your topic, and create the Subscription destination using the generated credentials.</p>
 *  <p>The Composable Commerce producer uses the following values: <code>SASL_SSL</code> for<code>security.protocol</code>, <code>PLAIN</code> for<code>sasl.mechanism</code>, and the default value (1048576) for <code>max.request.size</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ConfluentCloudDestinationImpl implements ConfluentCloudDestination, ModelBase {

    private String type;

    private String bootstrapServer;

    private String apiKey;

    private String apiSecret;

    private String acks;

    private String topic;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ConfluentCloudDestinationImpl(@JsonProperty("bootstrapServer") final String bootstrapServer,
            @JsonProperty("apiKey") final String apiKey, @JsonProperty("apiSecret") final String apiSecret,
            @JsonProperty("acks") final String acks, @JsonProperty("topic") final String topic,
            @JsonProperty("key") final String key) {
        this.bootstrapServer = bootstrapServer;
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.acks = acks;
        this.topic = topic;
        this.key = key;
        this.type = CONFLUENT_CLOUD;
    }

    /**
     * create empty instance
     */
    public ConfluentCloudDestinationImpl() {
        this.type = CONFLUENT_CLOUD;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>URL to the bootstrap server including the port number in the format <code>&lt;xxxxx&gt;.&lt;region&gt;.&lt;provider&gt;.confluent.cloud:9092</code>.</p>
     */

    public String getBootstrapServer() {
        return this.bootstrapServer;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     */

    public String getApiKey() {
        return this.apiKey;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     */

    public String getApiSecret() {
        return this.apiSecret;
    }

    /**
     *  <p>The Kafka <code>acks</code> value.</p>
     */

    public String getAcks() {
        return this.acks;
    }

    /**
     *  <p>The name of the topic.</p>
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     *  <p>The Kafka record key.</p>
     */

    public String getKey() {
        return this.key;
    }

    public void setBootstrapServer(final String bootstrapServer) {
        this.bootstrapServer = bootstrapServer;
    }

    public void setApiKey(final String apiKey) {
        this.apiKey = apiKey;
    }

    public void setApiSecret(final String apiSecret) {
        this.apiSecret = apiSecret;
    }

    public void setAcks(final String acks) {
        this.acks = acks;
    }

    public void setTopic(final String topic) {
        this.topic = topic;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ConfluentCloudDestinationImpl that = (ConfluentCloudDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(bootstrapServer, that.bootstrapServer)
                .append(apiKey, that.apiKey)
                .append(apiSecret, that.apiSecret)
                .append(acks, that.acks)
                .append(topic, that.topic)
                .append(key, that.key)
                .append(type, that.type)
                .append(bootstrapServer, that.bootstrapServer)
                .append(apiKey, that.apiKey)
                .append(apiSecret, that.apiSecret)
                .append(acks, that.acks)
                .append(topic, that.topic)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(bootstrapServer)
                .append(apiKey)
                .append(apiSecret)
                .append(acks)
                .append(topic)
                .append(key)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("bootstrapServer", bootstrapServer)
                .append("apiKey", apiKey)
                .append("apiSecret", apiSecret)
                .append("acks", acks)
                .append("topic", topic)
                .append("key", key)
                .build();
    }

}
