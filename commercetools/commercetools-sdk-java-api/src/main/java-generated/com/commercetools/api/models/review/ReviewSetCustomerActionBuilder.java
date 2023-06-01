package com.commercetools.api.models.review;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetCustomerAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetCustomerActionBuilder
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
public class ReviewSetCustomerActionBuilder implements Builder<ReviewSetCustomerAction> {

    
    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the customer value
     * @return Builder
     */
    
    public ReviewSetCustomerActionBuilder customer(Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the customer value
     * @return Builder
     */
    
    public ReviewSetCustomerActionBuilder withCustomer(Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param customer value to be set
     * @return Builder
     */
    
    public ReviewSetCustomerActionBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return customer
     */
    
    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
        return this.customer;
    }

    /**
     * builds ReviewSetCustomerAction with checking for non-null required values
     * @return ReviewSetCustomerAction
     */
    public ReviewSetCustomerAction build() {
        return new ReviewSetCustomerActionImpl(customer);
    }
    
    /**
     * builds ReviewSetCustomerAction without checking for non-null required values
     * @return ReviewSetCustomerAction
     */
    public ReviewSetCustomerAction buildUnchecked() {
        return new ReviewSetCustomerActionImpl(customer);
    }

    /**
     * factory method for an instance of ReviewSetCustomerActionBuilder
     * @return builder 
     */
    public static ReviewSetCustomerActionBuilder of() {
        return new ReviewSetCustomerActionBuilder();
    }

    /**
     * create builder for ReviewSetCustomerAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetCustomerActionBuilder of(final ReviewSetCustomerAction template) {
        ReviewSetCustomerActionBuilder builder = new ReviewSetCustomerActionBuilder();
        builder.customer = template.getCustomer();
        return builder;
    }

}
