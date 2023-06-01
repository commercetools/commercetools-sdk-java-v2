package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditSetCommentActionImpl;

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
 * OrderEditSetCommentAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditSetCommentAction orderEditSetCommentAction = OrderEditSetCommentAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderEditSetCommentActionImpl.class)
public interface OrderEditSetCommentAction extends OrderEditUpdateAction {

    /**
     * discriminator value for OrderEditSetCommentAction
     */
    String SET_COMMENT = "setComment";

    /**
     *
     * @return comment
     */
    
    @JsonProperty("comment")
    public String getComment();

    /**
     * set comment
     * @param comment value to be set
     */
    
    public void setComment(final String comment);
    

    /**
     * factory method
     * @return instance of OrderEditSetCommentAction
     */
    public static OrderEditSetCommentAction of(){
        return new OrderEditSetCommentActionImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderEditSetCommentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditSetCommentAction of(final OrderEditSetCommentAction template) {
        OrderEditSetCommentActionImpl instance = new OrderEditSetCommentActionImpl();
        instance.setComment(template.getComment());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderEditSetCommentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditSetCommentAction deepCopy(@Nullable final OrderEditSetCommentAction template) {
        if (template == null) {
            return null;
        }
        OrderEditSetCommentActionImpl instance = new OrderEditSetCommentActionImpl();
        instance.setComment(template.getComment());
        return instance;
    }

    /**
     * builder factory method for OrderEditSetCommentAction
     * @return builder
     */
    public static OrderEditSetCommentActionBuilder builder() {
        return OrderEditSetCommentActionBuilder.of();
    }
    
    /**
     * create builder for OrderEditSetCommentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditSetCommentActionBuilder builder(final OrderEditSetCommentAction template) {
        return OrderEditSetCommentActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditSetCommentAction(Function<OrderEditSetCommentAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditSetCommentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditSetCommentAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditSetCommentAction>";
            }
        };
    }
}
