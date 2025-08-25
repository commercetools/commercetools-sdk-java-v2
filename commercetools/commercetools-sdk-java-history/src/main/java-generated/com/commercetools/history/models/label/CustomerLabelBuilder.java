
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerLabel customerLabel = CustomerLabel.builder()
 *             .firstName("{firstName}")
 *             .lastName("{lastName}")
 *             .customerNumber("{customerNumber}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerLabelBuilder implements Builder<CustomerLabel> {

    private String firstName;

    private String lastName;

    private String customerNumber;

    /**
     *  <p>Given name (first name) of the Customer.</p>
     * @param firstName value to be set
     * @return Builder
     */

    public CustomerLabelBuilder firstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *  <p>Family name (last name) of the Customer.</p>
     * @param lastName value to be set
     * @return Builder
     */

    public CustomerLabelBuilder lastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a>.</p>
     * @param customerNumber value to be set
     * @return Builder
     */

    public CustomerLabelBuilder customerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     *  <p>Given name (first name) of the Customer.</p>
     * @return firstName
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     *  <p>Family name (last name) of the Customer.</p>
     * @return lastName
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a>.</p>
     * @return customerNumber
     */

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    /**
     * builds CustomerLabel with checking for non-null required values
     * @return CustomerLabel
     */
    public CustomerLabel build() {
        Objects.requireNonNull(firstName, CustomerLabel.class + ": firstName is missing");
        Objects.requireNonNull(lastName, CustomerLabel.class + ": lastName is missing");
        Objects.requireNonNull(customerNumber, CustomerLabel.class + ": customerNumber is missing");
        return new CustomerLabelImpl(firstName, lastName, customerNumber);
    }

    /**
     * builds CustomerLabel without checking for non-null required values
     * @return CustomerLabel
     */
    public CustomerLabel buildUnchecked() {
        return new CustomerLabelImpl(firstName, lastName, customerNumber);
    }

    /**
     * factory method for an instance of CustomerLabelBuilder
     * @return builder
     */
    public static CustomerLabelBuilder of() {
        return new CustomerLabelBuilder();
    }

    /**
     * create builder for CustomerLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerLabelBuilder of(final CustomerLabel template) {
        CustomerLabelBuilder builder = new CustomerLabelBuilder();
        builder.firstName = template.getFirstName();
        builder.lastName = template.getLastName();
        builder.customerNumber = template.getCustomerNumber();
        return builder;
    }

}
