
package com.commercetools.api.models.message;

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
public class UserProvidedIdentifiersImpl implements UserProvidedIdentifiers, ModelBase {

    private String key;

    private String externalId;

    private String orderNumber;

    private String customerNumber;

    private String sku;

    private com.commercetools.api.models.common.LocalizedString slug;

    private com.commercetools.api.models.message.ContainerAndKey containerAndKey;

    @JsonCreator
    UserProvidedIdentifiersImpl(@JsonProperty("key") final String key,
            @JsonProperty("externalId") final String externalId, @JsonProperty("orderNumber") final String orderNumber,
            @JsonProperty("customerNumber") final String customerNumber, @JsonProperty("sku") final String sku,
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("containerAndKey") final com.commercetools.api.models.message.ContainerAndKey containerAndKey) {
        this.key = key;
        this.externalId = externalId;
        this.orderNumber = orderNumber;
        this.customerNumber = customerNumber;
        this.sku = sku;
        this.slug = slug;
        this.containerAndKey = containerAndKey;
    }

    public UserProvidedIdentifiersImpl() {
    }

    /**
    *  <p>User-provided unique identifier of the resource.</p>
    */
    public String getKey() {
        return this.key;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public String getSku() {
        return this.sku;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
    *  <p>Custom Objects are grouped into containers, which can be used like namespaces. Within a given container, a user-defined key can be used to uniquely identify resources.</p>
    */
    public com.commercetools.api.models.message.ContainerAndKey getContainerAndKey() {
        return this.containerAndKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setCustomerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setContainerAndKey(final com.commercetools.api.models.message.ContainerAndKey containerAndKey) {
        this.containerAndKey = containerAndKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        UserProvidedIdentifiersImpl that = (UserProvidedIdentifiersImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(externalId, that.externalId)
                .append(orderNumber, that.orderNumber)
                .append(customerNumber, that.customerNumber)
                .append(sku, that.sku)
                .append(slug, that.slug)
                .append(containerAndKey, that.containerAndKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(externalId)
                .append(orderNumber)
                .append(customerNumber)
                .append(sku)
                .append(slug)
                .append(containerAndKey)
                .toHashCode();
    }

}
