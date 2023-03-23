
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerUpdateBuilder implements Builder<CustomerUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.customer.CustomerUpdateAction> actions;

    /**
     *  <p>Expected version of the Customer on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version
     * @return Builder
     */

    public CustomerUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @param actions
     * @return Builder
     */

    public CustomerUpdateBuilder actions(final com.commercetools.api.models.customer.CustomerUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @param actions
     * @return Builder
     */

    public CustomerUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.customer.CustomerUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @param actions
     * @return Builder
     */

    public CustomerUpdateBuilder plusActions(
            final com.commercetools.api.models.customer.CustomerUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @return Builder
     */

    public CustomerUpdateBuilder plusActions(
            Function<com.commercetools.api.models.customer.CustomerUpdateActionBuilder, Builder<? extends com.commercetools.api.models.customer.CustomerUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.customer.CustomerUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @return Builder
     */

    public CustomerUpdateBuilder withActions(
            Function<com.commercetools.api.models.customer.CustomerUpdateActionBuilder, Builder<? extends com.commercetools.api.models.customer.CustomerUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.customer.CustomerUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.customer.CustomerUpdateAction> getActions() {
        return this.actions;
    }

    public CustomerUpdate build() {
        Objects.requireNonNull(version, CustomerUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, CustomerUpdate.class + ": actions is missing");
        return new CustomerUpdateImpl(version, actions);
    }

    /**
     * builds CustomerUpdate without checking for non null required values
     */
    public CustomerUpdate buildUnchecked() {
        return new CustomerUpdateImpl(version, actions);
    }

    public static CustomerUpdateBuilder of() {
        return new CustomerUpdateBuilder();
    }

    public static CustomerUpdateBuilder of(final CustomerUpdate template) {
        CustomerUpdateBuilder builder = new CustomerUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
