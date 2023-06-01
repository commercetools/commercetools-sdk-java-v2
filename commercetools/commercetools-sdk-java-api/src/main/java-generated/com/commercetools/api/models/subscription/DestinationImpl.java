package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.AzureEventGridDestination;
import com.commercetools.api.models.subscription.AzureServiceBusDestination;
import com.commercetools.api.models.subscription.EventBridgeDestination;
import com.commercetools.api.models.subscription.GoogleCloudPubSubDestination;
import com.commercetools.api.models.subscription.SnsDestination;
import com.commercetools.api.models.subscription.SqsDestination;
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
 * Destination
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DestinationImpl implements Destination, ModelBase {

    
    private String type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DestinationImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    /**
     * create empty instance
     */
    public DestinationImpl() {
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DestinationImpl that = (DestinationImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .toHashCode();
    }

}
