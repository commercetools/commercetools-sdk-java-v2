
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to an OrderEdit.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditReference orderEditReference = OrderEditReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditReferenceImpl.class)
public interface OrderEditReference extends Reference, com.commercetools.api.models.Identifiable<OrderEdit> {

    /**
     * discriminator value for OrderEditReference
     */
    String ORDER_EDIT = "order-edit";

    /**
     *  <p>Contains the representation of the expanded OrderEdit. Only present in responses to requests with Reference Expansion for OrderEdits.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public OrderEdit getObj();

    /**
     *  <p>Unique identifier of the referenced OrderEdit.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded OrderEdit. Only present in responses to requests with Reference Expansion for OrderEdits.</p>
     * @param obj value to be set
     */

    public void setObj(final OrderEdit obj);

    /**
     *  <p>Unique identifier of the referenced OrderEdit.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of OrderEditReference
     */
    public static OrderEditReference of() {
        return new OrderEditReferenceImpl();
    }

    /**
     * factory method to create a shallow copy OrderEditReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditReference of(final OrderEditReference template) {
        OrderEditReferenceImpl instance = new OrderEditReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderEditReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditReference deepCopy(@Nullable final OrderEditReference template) {
        if (template == null) {
            return null;
        }
        OrderEditReferenceImpl instance = new OrderEditReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(Optional.ofNullable(template.getObj())
                .map(com.commercetools.api.models.order_edit.OrderEdit::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderEditReference
     * @return builder
     */
    public static OrderEditReferenceBuilder builder() {
        return OrderEditReferenceBuilder.of();
    }

    /**
     * create builder for OrderEditReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditReferenceBuilder builder(final OrderEditReference template) {
        return OrderEditReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditReference(Function<OrderEditReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditReference>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditReference>";
            }
        };
    }
}
