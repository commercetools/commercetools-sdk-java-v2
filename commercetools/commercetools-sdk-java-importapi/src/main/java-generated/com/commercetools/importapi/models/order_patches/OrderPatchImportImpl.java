
package com.commercetools.importapi.models.order_patches;

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
 *  <p>Representation for an update of an Order. Use this type to import updates for existing Orders in a Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderPatchImportImpl implements OrderPatchImport, ModelBase {

    private String orderNumber;

    private com.commercetools.importapi.models.order_patches.OrderField fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderPatchImportImpl(@JsonProperty("orderNumber") final String orderNumber,
            @JsonProperty("fields") final com.commercetools.importapi.models.order_patches.OrderField fields) {
        this.orderNumber = orderNumber;
        this.fields = fields;
    }

    /**
     * create empty instance
     */
    public OrderPatchImportImpl() {
    }

    /**
     *  <p>Maps to <code>Order.orderNumber</code>, String that uniquely identifies an order, unique across a project.</p>
     */

    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p>Each field referenced must be defined in an already existing order in the project or the import operation state is set to <code>validationFailed</code>.</p>
     */

    public com.commercetools.importapi.models.order_patches.OrderField getFields() {
        return this.fields;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setFields(final com.commercetools.importapi.models.order_patches.OrderField fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderPatchImportImpl that = (OrderPatchImportImpl) o;

        return new EqualsBuilder().append(orderNumber, that.orderNumber)
                .append(fields, that.fields)
                .append(orderNumber, that.orderNumber)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(orderNumber).append(fields).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("orderNumber", orderNumber)
                .append("fields", fields)
                .build();
    }

    @Override
    public OrderPatchImport copyDeep() {
        return OrderPatchImport.deepCopy(this);
    }
}
