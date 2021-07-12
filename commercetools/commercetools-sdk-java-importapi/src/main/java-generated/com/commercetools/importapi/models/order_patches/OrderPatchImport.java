
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Representation for an update of an <a href="/../api/projects/orders#order">Order</a>. Use this type to import updates for existing
*  <a href="/../api/projects/orders#order">Orders</a> in a commercetools Project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderPatchImportImpl.class)
public interface OrderPatchImport {

    /**
    *  <p>Maps to <code>Order.orderNumber</code>, String that uniquely identifies an order, unique across a project.</p>
    */
    @NotNull
    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
    *  <p>Each field referenced must be defined in an already existing order in the commercetools project or the import operation state is set to <code>ValidationFailed</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("fields")
    public OrderField getFields();

    public void setOrderNumber(final String orderNumber);

    public void setFields(final OrderField fields);

    public static OrderPatchImport of() {
        return new OrderPatchImportImpl();
    }

    public static OrderPatchImport of(final OrderPatchImport template) {
        OrderPatchImportImpl instance = new OrderPatchImportImpl();
        instance.setOrderNumber(template.getOrderNumber());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderPatchImportBuilder builder() {
        return OrderPatchImportBuilder.of();
    }

    public static OrderPatchImportBuilder builder(final OrderPatchImport template) {
        return OrderPatchImportBuilder.of(template);
    }

    default <T> T withOrderPatchImport(Function<OrderPatchImport, T> helper) {
        return helper.apply(this);
    }
}
