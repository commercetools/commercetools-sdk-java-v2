
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * TransactionChangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionChangeValueImpl implements TransactionChangeValue, ModelBase {

    private String id;

    private String interactionId;

    private String timestamp;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionChangeValueImpl(@JsonProperty("id") final String id,
            @JsonProperty("interactionId") final String interactionId,
            @JsonProperty("timestamp") final String timestamp) {
        this.id = id;
        this.interactionId = interactionId;
        this.timestamp = timestamp;
    }

    /**
     * create empty instance
     */
    public TransactionChangeValueImpl() {
    }

    /**
     *  <p><code>id</code> of the Transaction.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Identifier used by the interface that manages the Transaction (usually the PSP).</p>
     */

    public String getInteractionId() {
        return this.interactionId;
    }

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     */

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
                .append(id, that.id)
                .append(interactionId, that.interactionId)
                .append(timestamp, that.timestamp)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(interactionId).append(timestamp).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("interactionId", interactionId)
                .append("timestamp", timestamp)
                .build();
    }

    @Override
    public TransactionChangeValue copyDeep() {
        return TransactionChangeValue.deepCopy(this);
    }
}
