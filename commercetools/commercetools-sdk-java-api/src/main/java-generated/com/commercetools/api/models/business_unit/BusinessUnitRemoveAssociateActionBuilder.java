
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitRemoveAssociateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveAssociateAction businessUnitRemoveAssociateAction = BusinessUnitRemoveAssociateAction.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitRemoveAssociateActionBuilder implements Builder<BusinessUnitRemoveAssociateAction> {

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> to remove.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public BusinessUnitRemoveAssociateActionBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> to remove.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public BusinessUnitRemoveAssociateActionBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> to remove.</p>
     * @param customer value to be set
     * @return Builder
     */

    public BusinessUnitRemoveAssociateActionBuilder customer(
            final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> to remove.</p>
     * @return customer
     */

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    /**
     * builds BusinessUnitRemoveAssociateAction with checking for non-null required values
     * @return BusinessUnitRemoveAssociateAction
     */
    public BusinessUnitRemoveAssociateAction build() {
        Objects.requireNonNull(customer, BusinessUnitRemoveAssociateAction.class + ": customer is missing");
        return new BusinessUnitRemoveAssociateActionImpl(customer);
    }

    /**
     * builds BusinessUnitRemoveAssociateAction without checking for non-null required values
     * @return BusinessUnitRemoveAssociateAction
     */
    public BusinessUnitRemoveAssociateAction buildUnchecked() {
        return new BusinessUnitRemoveAssociateActionImpl(customer);
    }

    /**
     * factory method for an instance of BusinessUnitRemoveAssociateActionBuilder
     * @return builder
     */
    public static BusinessUnitRemoveAssociateActionBuilder of() {
        return new BusinessUnitRemoveAssociateActionBuilder();
    }

    /**
     * create builder for BusinessUnitRemoveAssociateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitRemoveAssociateActionBuilder of(final BusinessUnitRemoveAssociateAction template) {
        BusinessUnitRemoveAssociateActionBuilder builder = new BusinessUnitRemoveAssociateActionBuilder();
        builder.customer = template.getCustomer();
        return builder;
    }

}
