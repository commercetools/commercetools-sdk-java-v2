
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
 *  <p>Azure Event Grid can be used to push notifications to Azure Functions, HTTP endpoints (webhooks), and several other Azure tools. Event Grid can only be used with the CloudEventsFormat. To set up a Subscription with Azure Event Grid, first create a topic in the Azure Portal. To allow Composable Commerce to push notifications to your topic, provide an access key.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AzureEventGridDestinationImpl implements AzureEventGridDestination, ModelBase {

    private String type;

    private String uri;

    private String accessKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AzureEventGridDestinationImpl(@JsonProperty("uri") final String uri,
            @JsonProperty("accessKey") final String accessKey) {
        this.uri = uri;
        this.accessKey = accessKey;
        this.type = EVENT_GRID;
    }

    /**
     * create empty instance
     */
    public AzureEventGridDestinationImpl() {
        this.type = EVENT_GRID;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>URI of the topic.</p>
     */

    public String getUri() {
        return this.uri;
    }

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     */

    public String getAccessKey() {
        return this.accessKey;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }

    public void setAccessKey(final String accessKey) {
        this.accessKey = accessKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AzureEventGridDestinationImpl that = (AzureEventGridDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(uri, that.uri)
                .append(accessKey, that.accessKey)
                .append(type, that.type)
                .append(uri, that.uri)
                .append(accessKey, that.accessKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(uri).append(accessKey).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("uri", uri)
                .append("accessKey", accessKey)
                .build();
    }

}
