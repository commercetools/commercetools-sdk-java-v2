
package com.commercetools.history.models.change_history;

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
 *  <p>Information about the user or API Client who performed the change. This is a variant of LastModifiedBy.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ModifiedByImpl implements ModifiedBy, ModelBase {

    private String id;

    private String type;

    private String clientId;

    private String anonymousId;

    private com.commercetools.history.models.common.Reference customer;

    private com.commercetools.history.models.common.Reference associate;

    private Boolean isPlatformClient;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ModifiedByImpl(@JsonProperty("id") final String id, @JsonProperty("type") final String type,
            @JsonProperty("clientId") final String clientId, @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("customer") final com.commercetools.history.models.common.Reference customer,
            @JsonProperty("associate") final com.commercetools.history.models.common.Reference associate,
            @JsonProperty("isPlatformClient") final Boolean isPlatformClient) {
        this.id = id;
        this.type = type;
        this.clientId = clientId;
        this.anonymousId = anonymousId;
        this.customer = customer;
        this.associate = associate;
        this.isPlatformClient = isPlatformClient;
    }

    /**
     * create empty instance
     */
    public ModifiedByImpl() {
    }

    /**
     *  <p>ID of the Merchant Center user who made the change.</p>
     *  <p>Present only if the change was made in the Merchant Center.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Indicates who performed the change.</p>
     *  <ul>
     *   <li>If the change was made by a user, the value is <code>"user"</code>.</li>
     *   <li>If the change was made by an API Client with or without an external user ID, the value is <code>"external-user"</code>.</li>
     *   <li>If the change was made by an Associate, the value is <code>"associate"</code>.</li>
     *  </ul>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>ID of the API Client that made the change.</p>
     *  <p>Present only if the change was made using an API Client.</p>
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     *  <p>Present only if the change was made using a token from an anonymous session.</p>
     */

    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>The Customer who made the change.</p>
     *  <p>Present only if the change was made using a token from the password flow.</p>
     */

    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>The Associate who made the change in the context of a Business Unit. Present only if the Associate acts on behalf of a company using the associate endpoints.</p>
     */

    public com.commercetools.history.models.common.Reference getAssociate() {
        return this.associate;
    }

    /**
     *  <p><code>true</code> if the change was made using the Merchant Center or ImpEx.</p>
     */

    public Boolean getIsPlatformClient() {
        return this.isPlatformClient;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setClientId(final String clientId) {
        this.clientId = clientId;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    public void setCustomer(final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
    }

    public void setAssociate(final com.commercetools.history.models.common.Reference associate) {
        this.associate = associate;
    }

    public void setIsPlatformClient(final Boolean isPlatformClient) {
        this.isPlatformClient = isPlatformClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ModifiedByImpl that = (ModifiedByImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(type, that.type)
                .append(clientId, that.clientId)
                .append(anonymousId, that.anonymousId)
                .append(customer, that.customer)
                .append(associate, that.associate)
                .append(isPlatformClient, that.isPlatformClient)
                .append(id, that.id)
                .append(type, that.type)
                .append(clientId, that.clientId)
                .append(anonymousId, that.anonymousId)
                .append(customer, that.customer)
                .append(associate, that.associate)
                .append(isPlatformClient, that.isPlatformClient)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(type)
                .append(clientId)
                .append(anonymousId)
                .append(customer)
                .append(associate)
                .append(isPlatformClient)
                .toHashCode();
    }

}
