
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitAssociateDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitAssociateDraft myBusinessUnitAssociateDraft = MyBusinessUnitAssociateDraft.builder()
 *             .version(0.3)
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitAssociateDraftBuilder implements Builder<MyBusinessUnitAssociateDraft> {

    private Long version;

    private com.commercetools.api.models.me.MyCustomerDraft customer;

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Customer to create and assign to the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder customer(
            Function<com.commercetools.api.models.me.MyCustomerDraftBuilder, com.commercetools.api.models.me.MyCustomerDraftBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.me.MyCustomerDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Customer to create and assign to the Business Unit.</p>
     * @param customer value to be set
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder customer(
            final com.commercetools.api.models.me.MyCustomerDraft customer) {
        this.customer = customer;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public com.commercetools.api.models.me.MyCustomerDraft getCustomer() {
        return this.customer;
    }

    /**
     * builds MyBusinessUnitAssociateDraft with checking for non-null required values
     * @return MyBusinessUnitAssociateDraft
     */
    public MyBusinessUnitAssociateDraft build() {
        Objects.requireNonNull(version, MyBusinessUnitAssociateDraft.class + ": version is missing");
        Objects.requireNonNull(customer, MyBusinessUnitAssociateDraft.class + ": customer is missing");
        return new MyBusinessUnitAssociateDraftImpl(version, customer);
    }

    /**
     * builds MyBusinessUnitAssociateDraft without checking for non-null required values
     * @return MyBusinessUnitAssociateDraft
     */
    public MyBusinessUnitAssociateDraft buildUnchecked() {
        return new MyBusinessUnitAssociateDraftImpl(version, customer);
    }

    public static MyBusinessUnitAssociateDraftBuilder of() {
        return new MyBusinessUnitAssociateDraftBuilder();
    }

    public static MyBusinessUnitAssociateDraftBuilder of(final MyBusinessUnitAssociateDraft template) {
        MyBusinessUnitAssociateDraftBuilder builder = new MyBusinessUnitAssociateDraftBuilder();
        builder.version = template.getVersion();
        builder.customer = template.getCustomer();
        return builder;
    }

}
