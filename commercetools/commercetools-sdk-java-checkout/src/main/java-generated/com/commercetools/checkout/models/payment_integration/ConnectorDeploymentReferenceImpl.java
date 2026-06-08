
package com.commercetools.checkout.models.payment_integration;

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
 *  <p>Reference to a connector deployment for the payment integration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ConnectorDeploymentReferenceImpl implements ConnectorDeploymentReference, ModelBase {

    private String id;

    private String typeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ConnectorDeploymentReferenceImpl(@JsonProperty("id") final String id, @JsonProperty("typeId") final String typeId) {
        this.id = id;
        this.typeId = typeId;
    }

    /**
     * create empty instance
     */
    public ConnectorDeploymentReferenceImpl() {
    }

    /**
     *  <p>Unique identifier of the referenced Connect Deployment.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Type identifier, always <code>deployment</code> for Connector deployment references.</p>
     */

    public String getTypeId() {
        return this.typeId;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setTypeId(final String typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ConnectorDeploymentReferenceImpl that = (ConnectorDeploymentReferenceImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(typeId, that.typeId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(typeId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("typeId", typeId)
                .build();
    }

    @Override
    public ConnectorDeploymentReference copyDeep() {
        return ConnectorDeploymentReference.deepCopy(this);
    }
}
