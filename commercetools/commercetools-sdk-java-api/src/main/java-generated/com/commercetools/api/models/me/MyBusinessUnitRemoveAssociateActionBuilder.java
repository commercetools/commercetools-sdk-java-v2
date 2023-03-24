
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitRemoveAssociateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitRemoveAssociateAction myBusinessUnitRemoveAssociateAction = MyBusinessUnitRemoveAssociateAction.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitRemoveAssociateActionBuilder implements Builder<MyBusinessUnitRemoveAssociateAction> {

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     *  <p>Associate to remove.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public MyBusinessUnitRemoveAssociateActionBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Associate to remove.</p>
     * @param customer value to be set
     * @return Builder
     */

    public MyBusinessUnitRemoveAssociateActionBuilder customer(
            final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    /**
     * builds MyBusinessUnitRemoveAssociateAction with checking for non-null required values
     * @return MyBusinessUnitRemoveAssociateAction
     */
    public MyBusinessUnitRemoveAssociateAction build() {
        Objects.requireNonNull(customer, MyBusinessUnitRemoveAssociateAction.class + ": customer is missing");
        return new MyBusinessUnitRemoveAssociateActionImpl(customer);
    }

    /**
     * builds MyBusinessUnitRemoveAssociateAction without checking for non-null required values
     * @return MyBusinessUnitRemoveAssociateAction
     */
    public MyBusinessUnitRemoveAssociateAction buildUnchecked() {
        return new MyBusinessUnitRemoveAssociateActionImpl(customer);
    }

    public static MyBusinessUnitRemoveAssociateActionBuilder of() {
        return new MyBusinessUnitRemoveAssociateActionBuilder();
    }

    public static MyBusinessUnitRemoveAssociateActionBuilder of(final MyBusinessUnitRemoveAssociateAction template) {
        MyBusinessUnitRemoveAssociateActionBuilder builder = new MyBusinessUnitRemoveAssociateActionBuilder();
        builder.customer = template.getCustomer();
        return builder;
    }

}
