
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AzureEventGridDestinationImpl implements AzureEventGridDestination {

    private String type;

    private String uri;

    private String accessKey;

    @JsonCreator
    AzureEventGridDestinationImpl(@JsonProperty("uri") final String uri,
            @JsonProperty("accessKey") final String accessKey) {
        this.uri = uri;
        this.accessKey = accessKey;
        this.type = EVENT_GRID;
    }

    public AzureEventGridDestinationImpl() {
        this.type = EVENT_GRID;
    }

    public String getType() {
        return this.type;
    }

    public String getUri() {
        return this.uri;
    }

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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(uri).append(accessKey).toHashCode();
    }

}
