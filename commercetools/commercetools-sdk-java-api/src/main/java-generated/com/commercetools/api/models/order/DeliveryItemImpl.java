
package com.commercetools.api.models.order;

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
 * DeliveryItem
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryItemImpl implements DeliveryItem, ModelBase {

    private String id;

    private Long quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryItemImpl(@JsonProperty("id") final String id, @JsonProperty("quantity") final Long quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    /**
     * create empty instance
     */
    public DeliveryItemImpl() {
    }

    /**
     *  <p><code>id</code> of the LineItem or CustomLineItem delivered.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Number of Line Items or Custom Line Items delivered.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DeliveryItemImpl that = (DeliveryItemImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(quantity, that.quantity)
                .append(id, that.id)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(quantity).toHashCode();
    }

}
