
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.order_edit.OrderEditApplied;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after successfully applying an OrderEdit.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditAppliedMessagePayload orderEditAppliedMessagePayload = OrderEditAppliedMessagePayload.builder()
 *             .edit(editBuilder -> editBuilder)
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderEditApplied")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditAppliedMessagePayloadImpl.class)
public interface OrderEditAppliedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderEditAppliedMessagePayload
     */
    String ORDER_EDIT_APPLIED = "OrderEditApplied";

    /**
     *  <p>OrderEdit that was applied.</p>
     * @return edit
     */
    @NotNull
    @Valid
    @JsonProperty("edit")
    public OrderEdit getEdit();

    /**
     *  <p>Information about a successfully applied OrderEdit.</p>
     * @return result
     */
    @NotNull
    @Valid
    @JsonProperty("result")
    public OrderEditApplied getResult();

    /**
     *  <p>OrderEdit that was applied.</p>
     * @param edit value to be set
     */

    public void setEdit(final OrderEdit edit);

    /**
     *  <p>Information about a successfully applied OrderEdit.</p>
     * @param result value to be set
     */

    public void setResult(final OrderEditApplied result);

    /**
     * factory method
     * @return instance of OrderEditAppliedMessagePayload
     */
    public static OrderEditAppliedMessagePayload of() {
        return new OrderEditAppliedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderEditAppliedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditAppliedMessagePayload of(final OrderEditAppliedMessagePayload template) {
        OrderEditAppliedMessagePayloadImpl instance = new OrderEditAppliedMessagePayloadImpl();
        instance.setEdit(template.getEdit());
        instance.setResult(template.getResult());
        return instance;
    }

    public OrderEditAppliedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderEditAppliedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditAppliedMessagePayload deepCopy(@Nullable final OrderEditAppliedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderEditAppliedMessagePayloadImpl instance = new OrderEditAppliedMessagePayloadImpl();
        instance.setEdit(com.commercetools.api.models.order_edit.OrderEdit.deepCopy(template.getEdit()));
        instance.setResult(com.commercetools.api.models.order_edit.OrderEditApplied.deepCopy(template.getResult()));
        return instance;
    }

    /**
     * builder factory method for OrderEditAppliedMessagePayload
     * @return builder
     */
    public static OrderEditAppliedMessagePayloadBuilder builder() {
        return OrderEditAppliedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderEditAppliedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditAppliedMessagePayloadBuilder builder(final OrderEditAppliedMessagePayload template) {
        return OrderEditAppliedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditAppliedMessagePayload(Function<OrderEditAppliedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditAppliedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditAppliedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditAppliedMessagePayload>";
            }
        };
    }
}
