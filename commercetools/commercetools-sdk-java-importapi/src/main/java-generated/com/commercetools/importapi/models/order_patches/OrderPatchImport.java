
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents the data used to update an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPatchImport orderPatchImport = OrderPatchImport.builder()
 *             .orderNumber("{orderNumber}")
 *             .fields(fieldsBuilder -> fieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderPatchImportImpl.class)
public interface OrderPatchImport {

    /**
     *  <p>User-defined unique identifier. If an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> with this <code>orderNumber</code> exists, it is updated with the imported data.</p>
     * @return orderNumber
     */
    @NotNull
    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
     *  <p>Each field referenced must be defined in an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> or the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperationState" rel="nofollow">ImportOperationState</a> is set to <code>validationFailed</code>.</p>
     * @return fields
     */
    @NotNull
    @Valid
    @JsonProperty("fields")
    public OrderField getFields();

    /**
     *  <p>User-defined unique identifier. If an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> with this <code>orderNumber</code> exists, it is updated with the imported data.</p>
     * @param orderNumber value to be set
     */

    public void setOrderNumber(final String orderNumber);

    /**
     *  <p>Each field referenced must be defined in an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> or the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperationState" rel="nofollow">ImportOperationState</a> is set to <code>validationFailed</code>.</p>
     * @param fields value to be set
     */

    public void setFields(final OrderField fields);

    /**
     * factory method
     * @return instance of OrderPatchImport
     */
    public static OrderPatchImport of() {
        return new OrderPatchImportImpl();
    }

    /**
     * factory method to create a shallow copy OrderPatchImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderPatchImport of(final OrderPatchImport template) {
        OrderPatchImportImpl instance = new OrderPatchImportImpl();
        instance.setOrderNumber(template.getOrderNumber());
        instance.setFields(template.getFields());
        return instance;
    }

    public OrderPatchImport copyDeep();

    /**
     * factory method to create a deep copy of OrderPatchImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderPatchImport deepCopy(@Nullable final OrderPatchImport template) {
        if (template == null) {
            return null;
        }
        OrderPatchImportImpl instance = new OrderPatchImportImpl();
        instance.setOrderNumber(template.getOrderNumber());
        instance.setFields(com.commercetools.importapi.models.order_patches.OrderField.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for OrderPatchImport
     * @return builder
     */
    public static OrderPatchImportBuilder builder() {
        return OrderPatchImportBuilder.of();
    }

    /**
     * create builder for OrderPatchImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPatchImportBuilder builder(final OrderPatchImport template) {
        return OrderPatchImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderPatchImport(Function<OrderPatchImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderPatchImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPatchImport>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPatchImport>";
            }
        };
    }
}
