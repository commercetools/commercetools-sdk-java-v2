package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.DeliveryFormat;
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
 *  <p>The CloudEventsFormat can be used with any Destination, and the payload is delivered in the <code>JSON Event Format</code>. AzureEventGridDestination offers native support to filter and route CloudEvents.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CloudEventsFormatImpl implements CloudEventsFormat, ModelBase {

    
    private String type;
    
    
    private String cloudEventsVersion;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CloudEventsFormatImpl(@JsonProperty("cloudEventsVersion") final String cloudEventsVersion) {
        this.cloudEventsVersion = cloudEventsVersion;
        this.type =  CLOUD_EVENTS;
    }
    /**
     * create empty instance
     */
    public CloudEventsFormatImpl() {
        this.type =  CLOUD_EVENTS;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public String getCloudEventsVersion(){
        return this.cloudEventsVersion;
    }

    
    public void setCloudEventsVersion(final String cloudEventsVersion){
        this.cloudEventsVersion = cloudEventsVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CloudEventsFormatImpl that = (CloudEventsFormatImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(cloudEventsVersion, that.cloudEventsVersion)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(cloudEventsVersion)
            .toHashCode();
    }

}
