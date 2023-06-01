package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.order_edit.OrderEditSetCustomTypeActionImpl;

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
 * OrderEditSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditSetCustomTypeAction orderEditSetCustomTypeAction = OrderEditSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderEditSetCustomTypeActionImpl.class)
public interface OrderEditSetCustomTypeAction extends OrderEditUpdateAction {

    /**
     * discriminator value for OrderEditSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the OrderEdit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the OrderEdit.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    /**
     *  <p>Sets the Custom Fields fields for the OrderEdit.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the OrderEdit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the OrderEdit.</p>
     * @param type value to be set
     */
    
    public void setType(final TypeResourceIdentifier type);
    
    
    /**
     *  <p>Sets the Custom Fields fields for the OrderEdit.</p>
     * @param fields value to be set
     */
    
    public void setFields(final FieldContainer fields);
    

    /**
     * factory method
     * @return instance of OrderEditSetCustomTypeAction
     */
    public static OrderEditSetCustomTypeAction of(){
        return new OrderEditSetCustomTypeActionImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderEditSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditSetCustomTypeAction of(final OrderEditSetCustomTypeAction template) {
        OrderEditSetCustomTypeActionImpl instance = new OrderEditSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderEditSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditSetCustomTypeAction deepCopy(@Nullable final OrderEditSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        OrderEditSetCustomTypeActionImpl instance = new OrderEditSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for OrderEditSetCustomTypeAction
     * @return builder
     */
    public static OrderEditSetCustomTypeActionBuilder builder() {
        return OrderEditSetCustomTypeActionBuilder.of();
    }
    
    /**
     * create builder for OrderEditSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditSetCustomTypeActionBuilder builder(final OrderEditSetCustomTypeAction template) {
        return OrderEditSetCustomTypeActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditSetCustomTypeAction(Function<OrderEditSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditSetCustomTypeAction>";
            }
        };
    }
}
