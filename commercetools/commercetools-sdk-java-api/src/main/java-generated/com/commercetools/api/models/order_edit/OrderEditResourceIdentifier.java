package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.order_edit.OrderEditResourceIdentifierImpl;

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
 *  <p>ResourceIdentifier to an OrderEdit.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditResourceIdentifier orderEditResourceIdentifier = OrderEditResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderEditResourceIdentifierImpl.class)
public interface OrderEditResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<OrderEdit> {

    /**
     * discriminator value for OrderEditResourceIdentifier
     */
    String ORDER_EDIT = "order-edit";

    /**
     *  <p>Unique identifier of the referenced OrderEdit. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @JsonProperty("id")
    public String getId();
    /**
     *  <p>User-defined unique identifier of the referenced OrderEdit. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced OrderEdit. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    
    
    /**
     *  <p>User-defined unique identifier of the referenced OrderEdit. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of OrderEditResourceIdentifier
     */
    public static OrderEditResourceIdentifier of(){
        return new OrderEditResourceIdentifierImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderEditResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditResourceIdentifier of(final OrderEditResourceIdentifier template) {
        OrderEditResourceIdentifierImpl instance = new OrderEditResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderEditResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditResourceIdentifier deepCopy(@Nullable final OrderEditResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        OrderEditResourceIdentifierImpl instance = new OrderEditResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for OrderEditResourceIdentifier
     * @return builder
     */
    public static OrderEditResourceIdentifierBuilder builder() {
        return OrderEditResourceIdentifierBuilder.of();
    }
    
    /**
     * create builder for OrderEditResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditResourceIdentifierBuilder builder(final OrderEditResourceIdentifier template) {
        return OrderEditResourceIdentifierBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditResourceIdentifier(Function<OrderEditResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditResourceIdentifier>";
            }
        };
    }
}
