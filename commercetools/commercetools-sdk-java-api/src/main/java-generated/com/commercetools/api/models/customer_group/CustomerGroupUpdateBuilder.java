
package com.commercetools.api.models.customer_group;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerGroupUpdateBuilder implements Builder<CustomerGroupUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> actions;

    public CustomerGroupUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public CustomerGroupUpdateBuilder actions(
            final com.commercetools.api.models.customer_group.CustomerGroupUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public CustomerGroupUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> getActions() {
        return this.actions;
    }

    public CustomerGroupUpdate build() {
        Objects.requireNonNull(version, CustomerGroupUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, CustomerGroupUpdate.class + ": actions is missing");
        return new CustomerGroupUpdateImpl(version, actions);
    }

    /**
     * builds CustomerGroupUpdate without checking for non null required values
     */
    public CustomerGroupUpdate buildUnchecked() {
        return new CustomerGroupUpdateImpl(version, actions);
    }

    public static CustomerGroupUpdateBuilder of() {
        return new CustomerGroupUpdateBuilder();
    }

    public static CustomerGroupUpdateBuilder of(final CustomerGroupUpdate template) {
        CustomerGroupUpdateBuilder builder = new CustomerGroupUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
