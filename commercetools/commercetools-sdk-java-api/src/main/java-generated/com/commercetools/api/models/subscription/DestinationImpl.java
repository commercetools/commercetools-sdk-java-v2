
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.subscription.AzureEventGridDestination;
import com.commercetools.api.models.subscription.AzureServiceBusDestination;
import com.commercetools.api.models.subscription.GoogleCloudPubSubDestination;
import com.commercetools.api.models.subscription.IronMqDestination;
import com.commercetools.api.models.subscription.SnsDestination;
import com.commercetools.api.models.subscription.SqsDestination;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DestinationImpl implements Destination {

    private String type;

    @JsonCreator
    DestinationImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }

    public DestinationImpl() {
    }

    public String getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DestinationImpl that = (DestinationImpl) o;

        return new EqualsBuilder().append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

}
