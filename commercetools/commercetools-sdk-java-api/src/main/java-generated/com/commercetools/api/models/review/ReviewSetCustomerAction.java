package com.commercetools.api.models.review;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetCustomerActionImpl;

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
 * ReviewSetCustomerAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetCustomerAction reviewSetCustomerAction = ReviewSetCustomerAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ReviewSetCustomerActionImpl.class)
public interface ReviewSetCustomerAction extends ReviewUpdateAction {

    /**
     * discriminator value for ReviewSetCustomerAction
     */
    String SET_CUSTOMER = "setCustomer";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param customer value to be set
     */
    
    public void setCustomer(final CustomerResourceIdentifier customer);
    

    /**
     * factory method
     * @return instance of ReviewSetCustomerAction
     */
    public static ReviewSetCustomerAction of(){
        return new ReviewSetCustomerActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ReviewSetCustomerAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewSetCustomerAction of(final ReviewSetCustomerAction template) {
        ReviewSetCustomerActionImpl instance = new ReviewSetCustomerActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReviewSetCustomerAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewSetCustomerAction deepCopy(@Nullable final ReviewSetCustomerAction template) {
        if (template == null) {
            return null;
        }
        ReviewSetCustomerActionImpl instance = new ReviewSetCustomerActionImpl();
        instance.setCustomer(com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getCustomer()));
        return instance;
    }

    /**
     * builder factory method for ReviewSetCustomerAction
     * @return builder
     */
    public static ReviewSetCustomerActionBuilder builder() {
        return ReviewSetCustomerActionBuilder.of();
    }
    
    /**
     * create builder for ReviewSetCustomerAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetCustomerActionBuilder builder(final ReviewSetCustomerAction template) {
        return ReviewSetCustomerActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewSetCustomerAction(Function<ReviewSetCustomerAction, T> helper) {
        return helper.apply(this);
    }
    public static ReviewSetCustomerAction ofUnset() {
        return ReviewSetCustomerAction.of();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetCustomerAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetCustomerAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetCustomerAction>";
            }
        };
    }
}
