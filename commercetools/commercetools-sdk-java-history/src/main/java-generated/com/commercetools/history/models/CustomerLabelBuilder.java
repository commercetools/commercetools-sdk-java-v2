
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerLabelBuilder {

    private String firstName;

    private String lastName;

    private String customerNumber;

    public CustomerLabelBuilder firstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerLabelBuilder lastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerLabelBuilder customerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public CustomerLabel build() {
        return new CustomerLabelImpl(firstName, lastName, customerNumber);
    }

    public static CustomerLabelBuilder of() {
        return new CustomerLabelBuilder();
    }

    public static CustomerLabelBuilder of(final CustomerLabel template) {
        CustomerLabelBuilder builder = new CustomerLabelBuilder();
        builder.firstName = template.getFirstName();
        builder.lastName = template.getLastName();
        builder.customerNumber = template.getCustomerNumber();
        return builder;
    }

}
