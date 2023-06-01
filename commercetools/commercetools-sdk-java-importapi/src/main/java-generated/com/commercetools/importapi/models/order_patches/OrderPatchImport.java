package com.commercetools.importapi.models.order_patches;

import com.commercetools.importapi.models.order_patches.OrderField;
import com.commercetools.importapi.models.order_patches.OrderPatchImportImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Representation for an update of an Order. Use this type to import updates for existing Orders in a Project.</p>
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderPatchImportImpl.class)
public interface OrderPatchImport  {


    /**
     *  <p>Maps to <code>Order.orderNumber</code>, String that uniquely identifies an order, unique across a project.</p>
     * @return orderNumber
     */
    @NotNull
    @JsonProperty("orderNumber")
    public String getOrderNumber();
    /**
     *  <p>Each field referenced must be defined in an already existing order in the project or the import operation state is set to <code>validationFailed</code>.</p>
     * @return fields
     */
    @NotNull
    @Valid
    @JsonProperty("fields")
    public OrderField getFields();

    /**
     *  <p>Maps to <code>Order.orderNumber</code>, String that uniquely identifies an order, unique across a project.</p>
     * @param orderNumber value to be set
     */
    
    public void setOrderNumber(final String orderNumber);
    
    
    /**
     *  <p>Each field referenced must be defined in an already existing order in the project or the import operation state is set to <code>validationFailed</code>.</p>
     * @param fields value to be set
     */
    
    public void setFields(final OrderField fields);
    

    /**
     * factory method
     * @return instance of OrderPatchImport
     */
    public static OrderPatchImport of(){
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
