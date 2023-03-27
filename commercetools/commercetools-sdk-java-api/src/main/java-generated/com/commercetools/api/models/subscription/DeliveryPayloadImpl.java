
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

/**
 *  <p>All payloads for the PlatformFormat share these common fields.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryPayloadImpl implements DeliveryPayload, ModelBase {

    private String projectKey;

    private String notificationType;

    private com.commercetools.api.models.common.Reference resource;

    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryPayloadImpl(@JsonProperty("projectKey") final String projectKey,
            @JsonProperty("notificationType") final String notificationType,
            @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource,
            @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.projectKey = projectKey;
        this.notificationType = notificationType;
        this.resource = resource;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }

    /**
     * create empty instance
     */
    public DeliveryPayloadImpl() {
    }

    /**
     *  <p><code>key</code> of the Project. Useful in message processing if the Destination receives events from multiple Projects.</p>
     */

    public String getProjectKey() {
        return this.projectKey;
    }

    /**
     *  <p>Identifies the payload.</p>
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     *  <p>Reference to the resource that triggered the message.</p>
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     */

    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setResource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
    }

    public void setResourceUserProvidedIdentifiers(
            final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DeliveryPayloadImpl that = (DeliveryPayloadImpl) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(notificationType, that.notificationType)
                .append(resource, that.resource)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(notificationType)
                .append(resource)
                .append(resourceUserProvidedIdentifiers)
                .toHashCode();
    }

}
