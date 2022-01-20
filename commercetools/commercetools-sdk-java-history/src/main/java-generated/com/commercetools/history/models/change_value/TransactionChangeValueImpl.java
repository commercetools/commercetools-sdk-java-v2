
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TransactionChangeValueImpl implements TransactionChangeValue, ModelBase {

    private String id;

    private String interactionId;

    private String timestamp;

    @JsonCreator
    TransactionChangeValueImpl(@JsonProperty("id") final String id,
            @JsonProperty("interactionId") final String interactionId,
            @JsonProperty("timestamp") final String timestamp) {
        this.id = id;
        this.interactionId = interactionId;
        this.timestamp = timestamp;
    }

    public TransactionChangeValueImpl() {
    }

    public String getId() {
        return this.id;
    }

    public String getInteractionId() {
        return this.interactionId;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setInteractionId(final String interactionId) {
        this.interactionId = interactionId;
    }

    public void setTimestamp(final String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TransactionChangeValueImpl that = (TransactionChangeValueImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(interactionId, that.interactionId)
                .append(timestamp, that.timestamp)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(interactionId).append(timestamp).toHashCode();
    }

}
