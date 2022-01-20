
package com.commercetools.history.models.common;

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
public class ReturnItemImpl implements ReturnItem, ModelBase {

    private String id;

    private Integer quantity;

    private String type;

    private String comment;

    private com.commercetools.history.models.common.ReturnShipmentState shipmentState;

    private com.commercetools.history.models.common.ReturnPaymentState paymentState;

    private String lastModifiedAt;

    private String createdAt;

    @JsonCreator
    ReturnItemImpl(@JsonProperty("id") final String id, @JsonProperty("quantity") final Integer quantity,
            @JsonProperty("type") final String type, @JsonProperty("comment") final String comment,
            @JsonProperty("shipmentState") final com.commercetools.history.models.common.ReturnShipmentState shipmentState,
            @JsonProperty("paymentState") final com.commercetools.history.models.common.ReturnPaymentState paymentState,
            @JsonProperty("lastModifiedAt") final String lastModifiedAt,
            @JsonProperty("createdAt") final String createdAt) {
        this.id = id;
        this.quantity = quantity;
        this.type = type;
        this.comment = comment;
        this.shipmentState = shipmentState;
        this.paymentState = paymentState;
        this.lastModifiedAt = lastModifiedAt;
        this.createdAt = createdAt;
    }

    public ReturnItemImpl() {
    }

    public String getId() {
        return this.id;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public String getType() {
        return this.type;
    }

    public String getComment() {
        return this.comment;
    }

    public com.commercetools.history.models.common.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public com.commercetools.history.models.common.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public void setShipmentState(final com.commercetools.history.models.common.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setPaymentState(final com.commercetools.history.models.common.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setLastModifiedAt(final String lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReturnItemImpl that = (ReturnItemImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(quantity, that.quantity)
                .append(type, that.type)
                .append(comment, that.comment)
                .append(shipmentState, that.shipmentState)
                .append(paymentState, that.paymentState)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(createdAt, that.createdAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(quantity)
                .append(type)
                .append(comment)
                .append(shipmentState)
                .append(paymentState)
                .append(lastModifiedAt)
                .append(createdAt)
                .toHashCode();
    }

}
