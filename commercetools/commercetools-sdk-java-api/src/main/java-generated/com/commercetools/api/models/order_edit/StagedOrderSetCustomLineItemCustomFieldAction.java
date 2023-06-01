package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldActionImpl;

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
 * StagedOrderSetCustomLineItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomLineItemCustomFieldAction stagedOrderSetCustomLineItemCustomFieldAction = StagedOrderSetCustomLineItemCustomFieldAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetCustomLineItemCustomFieldActionImpl.class)
public interface StagedOrderSetCustomLineItemCustomFieldAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCustomLineItemCustomFieldAction
     */
    String SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD = "setCustomLineItemCustomField";

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */
    
    @JsonProperty("value")
    public Object getValue();

    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */
    
    public void setCustomLineItemId(final String customLineItemId);
    
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */
    
    public void setName(final String name);
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */
    
    public void setValue(final Object value);
    

    /**
     * factory method
     * @return instance of StagedOrderSetCustomLineItemCustomFieldAction
     */
    public static StagedOrderSetCustomLineItemCustomFieldAction of(){
        return new StagedOrderSetCustomLineItemCustomFieldActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderSetCustomLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetCustomLineItemCustomFieldAction of(final StagedOrderSetCustomLineItemCustomFieldAction template) {
        StagedOrderSetCustomLineItemCustomFieldActionImpl instance = new StagedOrderSetCustomLineItemCustomFieldActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetCustomLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetCustomLineItemCustomFieldAction deepCopy(@Nullable final StagedOrderSetCustomLineItemCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetCustomLineItemCustomFieldActionImpl instance = new StagedOrderSetCustomLineItemCustomFieldActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetCustomLineItemCustomFieldAction
     * @return builder
     */
    public static StagedOrderSetCustomLineItemCustomFieldActionBuilder builder() {
        return StagedOrderSetCustomLineItemCustomFieldActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderSetCustomLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemCustomFieldActionBuilder builder(final StagedOrderSetCustomLineItemCustomFieldAction template) {
        return StagedOrderSetCustomLineItemCustomFieldActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetCustomLineItemCustomFieldAction(Function<StagedOrderSetCustomLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
    public static StagedOrderSetCustomLineItemCustomFieldAction ofUnset(final String name, final String customLineItemId) {
        return StagedOrderSetCustomLineItemCustomFieldActionBuilder.of().name(name).customLineItemId(customLineItemId).build();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomLineItemCustomFieldAction>";
            }
        };
    }
}
