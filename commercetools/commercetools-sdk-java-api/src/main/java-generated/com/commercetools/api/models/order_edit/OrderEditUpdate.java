package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditUpdateImpl;

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
 * OrderEditUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditUpdate orderEditUpdate = OrderEditUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderEditUpdateImpl.class)
public interface OrderEditUpdate extends com.commercetools.api.models.ResourceUpdate<OrderEditUpdate, OrderEditUpdateAction, OrderEditUpdateBuilder> {


    /**
     *
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    /**
     *
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<OrderEditUpdateAction> getActions();
    /**
     *
     * @return dryRun
     */
    
    @JsonProperty("dryRun")
    public Boolean getDryRun();

    /**
     * set version
     * @param version value to be set
     */
    
    public void setVersion(final Long version);
    
    
    /**
     * set actions
     * @param actions values to be set
     */
    
    @JsonIgnore
    public void setActions(final OrderEditUpdateAction ...actions);
    /**
     * set actions
     * @param actions values to be set
     */
    
    public void setActions(final List<OrderEditUpdateAction> actions);
    
    /**
     * set dryRun
     * @param dryRun value to be set
     */
    
    public void setDryRun(final Boolean dryRun);
    

    /**
     * factory method
     * @return instance of OrderEditUpdate
     */
    public static OrderEditUpdate of(){
        return new OrderEditUpdateImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderEditUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditUpdate of(final OrderEditUpdate template) {
        OrderEditUpdateImpl instance = new OrderEditUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        instance.setDryRun(template.getDryRun());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderEditUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditUpdate deepCopy(@Nullable final OrderEditUpdate template) {
        if (template == null) {
            return null;
        }
        OrderEditUpdateImpl instance = new OrderEditUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream().map(com.commercetools.api.models.order_edit.OrderEditUpdateAction::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setDryRun(template.getDryRun());
        return instance;
    }

    /**
     * builder factory method for OrderEditUpdate
     * @return builder
     */
    public static OrderEditUpdateBuilder builder() {
        return OrderEditUpdateBuilder.of();
    }
    
    /**
     * create builder for OrderEditUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditUpdateBuilder builder(final OrderEditUpdate template) {
        return OrderEditUpdateBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditUpdate(Function<OrderEditUpdate, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditUpdate>";
            }
        };
    }
}
