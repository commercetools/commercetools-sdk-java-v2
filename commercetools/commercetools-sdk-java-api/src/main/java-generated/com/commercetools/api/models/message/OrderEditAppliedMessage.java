package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessage;
import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.order_edit.OrderEditApplied;
import com.commercetools.api.models.message.OrderEditAppliedMessageImpl;

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
 *  <p>Generated after a successfully applying an OrderEdit.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditAppliedMessage orderEditAppliedMessage = OrderEditAppliedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .edit(editBuilder -> editBuilder)
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderEditAppliedMessageImpl.class)
public interface OrderEditAppliedMessage extends OrderMessage {

    /**
     * discriminator value for OrderEditAppliedMessage
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
     * @return instance of OrderEditAppliedMessage
     */
    public static OrderEditAppliedMessage of(){
        return new OrderEditAppliedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderEditAppliedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditAppliedMessage of(final OrderEditAppliedMessage template) {
        OrderEditAppliedMessageImpl instance = new OrderEditAppliedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setEdit(template.getEdit());
        instance.setResult(template.getResult());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderEditAppliedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditAppliedMessage deepCopy(@Nullable final OrderEditAppliedMessage template) {
        if (template == null) {
            return null;
        }
        OrderEditAppliedMessageImpl instance = new OrderEditAppliedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setEdit(com.commercetools.api.models.order_edit.OrderEdit.deepCopy(template.getEdit()));
        instance.setResult(com.commercetools.api.models.order_edit.OrderEditApplied.deepCopy(template.getResult()));
        return instance;
    }

    /**
     * builder factory method for OrderEditAppliedMessage
     * @return builder
     */
    public static OrderEditAppliedMessageBuilder builder() {
        return OrderEditAppliedMessageBuilder.of();
    }
    
    /**
     * create builder for OrderEditAppliedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditAppliedMessageBuilder builder(final OrderEditAppliedMessage template) {
        return OrderEditAppliedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditAppliedMessage(Function<OrderEditAppliedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditAppliedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditAppliedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditAppliedMessage>";
            }
        };
    }
}
