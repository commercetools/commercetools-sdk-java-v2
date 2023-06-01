package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerUpdate;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerUpdate customerUpdate = CustomerUpdate.builder()
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
public class CustomerUpdateBuilder implements Builder<CustomerUpdate> {

    
    
    private Long version;
    
    
    
    private java.util.List<com.commercetools.api.models.customer.CustomerUpdateAction> actions;

    
    /**
     *  <p>Expected version of the Customer on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public CustomerUpdateBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public CustomerUpdateBuilder actions( final com.commercetools.api.models.customer.CustomerUpdateAction ...actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public CustomerUpdateBuilder actions( final java.util.List<com.commercetools.api.models.customer.CustomerUpdateAction> actions) {
        this.actions = actions;
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public CustomerUpdateBuilder plusActions( final com.commercetools.api.models.customer.CustomerUpdateAction ...actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }
    
    
    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public CustomerUpdateBuilder plusActions(Function<com.commercetools.api.models.customer.CustomerUpdateActionBuilder, Builder<? extends com.commercetools.api.models.customer.CustomerUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.customer.CustomerUpdateActionBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public CustomerUpdateBuilder withActions(Function<com.commercetools.api.models.customer.CustomerUpdateActionBuilder, Builder<? extends com.commercetools.api.models.customer.CustomerUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.customer.CustomerUpdateActionBuilder.of()).build());
        return this;
    }
                    
    

    /**
     *  <p>Expected version of the Customer on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @return actions
     */
    
    
    public java.util.List<com.commercetools.api.models.customer.CustomerUpdateAction> getActions(){
        return this.actions;
    }

    /**
     * builds CustomerUpdate with checking for non-null required values
     * @return CustomerUpdate
     */
    public CustomerUpdate build() {
        Objects.requireNonNull(version, CustomerUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, CustomerUpdate.class + ": actions is missing");
        return new CustomerUpdateImpl(version, actions);
    }
    
    /**
     * builds CustomerUpdate without checking for non-null required values
     * @return CustomerUpdate
     */
    public CustomerUpdate buildUnchecked() {
        return new CustomerUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of CustomerUpdateBuilder
     * @return builder 
     */
    public static CustomerUpdateBuilder of() {
        return new CustomerUpdateBuilder();
    }

    /**
     * create builder for CustomerUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerUpdateBuilder of(final CustomerUpdate template) {
        CustomerUpdateBuilder builder = new CustomerUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
