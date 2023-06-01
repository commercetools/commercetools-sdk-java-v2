package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Azure Event Grid can be used to push messages to Azure Functions, HTTP endpoints (webhooks), and several other Azure tools. Event Grid can only be used with the CloudEventsFormat. To set up a Subscription with Azure Event Grid, first create a topic in the Azure Portal. To allow Composable Commerce to push messages to your topic, provide an access key.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AzureEventGridDestinationImpl implements AzureEventGridDestination, ModelBase {

    
    private String type;
    
    
    private String uri;
    
    
    private String accessKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AzureEventGridDestinationImpl(@JsonProperty("uri") final String uri, @JsonProperty("accessKey") final String accessKey) {
        this.uri = uri;
        this.accessKey = accessKey;
        this.type =  EVENT_GRID;
    }
    /**
     * create empty instance
     */
    public AzureEventGridDestinationImpl() {
        this.type =  EVENT_GRID;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>URI of the topic.</p>
     */
    
    public String getUri(){
        return this.uri;
    }
    
    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     */
    
    public String getAccessKey(){
        return this.accessKey;
    }

    
    public void setUri(final String uri){
        this.uri = uri;
    }
    
    
    public void setAccessKey(final String accessKey){
        this.accessKey = accessKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AzureEventGridDestinationImpl that = (AzureEventGridDestinationImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(uri, that.uri)
                .append(accessKey, that.accessKey)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(uri)
            .append(accessKey)
            .toHashCode();
    }

}
