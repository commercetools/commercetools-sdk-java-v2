
package com.commercetools.importapi.models.orders;

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

    private Double quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryItemImpl(@JsonProperty("id") final String id, @JsonProperty("quantity") final Double quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    /**
     * create empty instance
     */
    public DeliveryItemImpl() {
    }

    /**
     *
     */

    public String getId() {
        return this.id;
    }

    /**
     *
     */

    public Double getQuantity() {
        return this.quantity;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setQuantity(final Double quantity) {
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
