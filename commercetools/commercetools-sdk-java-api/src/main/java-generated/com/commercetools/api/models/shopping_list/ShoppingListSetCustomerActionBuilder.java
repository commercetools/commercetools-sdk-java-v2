package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetCustomerAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetCustomerActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetCustomerAction shoppingListSetCustomerAction = ShoppingListSetCustomerAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListSetCustomerActionBuilder implements Builder<ShoppingListSetCustomerAction> {

    
    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    
    /**
     *  <p>The Customer the ShoppingList should be associated to. If empty, any existing value will be removed.</p>
     * @param builder function to build the customer value
     * @return Builder
     */
    
    public ShoppingListSetCustomerActionBuilder customer(Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The Customer the ShoppingList should be associated to. If empty, any existing value will be removed.</p>
     * @param builder function to build the customer value
     * @return Builder
     */
    
    public ShoppingListSetCustomerActionBuilder withCustomer(Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The Customer the ShoppingList should be associated to. If empty, any existing value will be removed.</p>
     * @param customer value to be set
     * @return Builder
     */
    
    public ShoppingListSetCustomerActionBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }
    
    

    /**
     *  <p>The Customer the ShoppingList should be associated to. If empty, any existing value will be removed.</p>
     * @return customer
     */
    
    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
        return this.customer;
    }

    /**
     * builds ShoppingListSetCustomerAction with checking for non-null required values
     * @return ShoppingListSetCustomerAction
     */
    public ShoppingListSetCustomerAction build() {
        return new ShoppingListSetCustomerActionImpl(customer);
    }
    
    /**
     * builds ShoppingListSetCustomerAction without checking for non-null required values
     * @return ShoppingListSetCustomerAction
     */
    public ShoppingListSetCustomerAction buildUnchecked() {
        return new ShoppingListSetCustomerActionImpl(customer);
    }

    /**
     * factory method for an instance of ShoppingListSetCustomerActionBuilder
     * @return builder 
     */
    public static ShoppingListSetCustomerActionBuilder of() {
        return new ShoppingListSetCustomerActionBuilder();
    }

    /**
     * create builder for ShoppingListSetCustomerAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetCustomerActionBuilder of(final ShoppingListSetCustomerAction template) {
        ShoppingListSetCustomerActionBuilder builder = new ShoppingListSetCustomerActionBuilder();
        builder.customer = template.getCustomer();
        return builder;
    }

}
