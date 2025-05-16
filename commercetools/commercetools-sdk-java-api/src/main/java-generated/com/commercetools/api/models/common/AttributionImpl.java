
package com.commercetools.api.models.common;

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
 *  <p>Indicates the source and method that indirectly created or modified the resource. This is present on resources created or updated after 1 April 2024.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributionImpl implements Attribution, ModelBase {

    private String clientId;

    private com.commercetools.api.models.common.AttributionSource source;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributionImpl(@JsonProperty("clientId") final String clientId,
            @JsonProperty("source") final com.commercetools.api.models.common.AttributionSource source) {
        this.clientId = clientId;
        this.source = source;
    }

    /**
     * create empty instance
     */
    public AttributionImpl() {
    }

    /**
     *  <p><code>id</code> of the API Client that created or modified the resource.</p>
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     *  <p>Method used to initiate the creation or modification of the resource.</p>
     */

    public com.commercetools.api.models.common.AttributionSource getSource() {
        return this.source;
    }

    public void setClientId(final String clientId) {
        this.clientId = clientId;
    }

    public void setSource(final com.commercetools.api.models.common.AttributionSource source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributionImpl that = (AttributionImpl) o;

        return new EqualsBuilder().append(clientId, that.clientId)
                .append(source, that.source)
                .append(clientId, that.clientId)
                .append(source, that.source)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(clientId).append(source).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("clientId", clientId)
                .append("source", source)
                .build();
    }

    @Override
    public Attribution copyDeep() {
        return Attribution.deepCopy(this);
    }
}
