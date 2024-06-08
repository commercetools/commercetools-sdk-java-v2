
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CustomerLabel
 *
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
@JsonDeserialize(as = CustomerLabelImpl.class)
public interface CustomerLabel extends Label {

    /**
     * discriminator value for CustomerLabel
     */
    String CUSTOMER_LABEL = "CustomerLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Given name (first name) of the Customer.</p>
     * @return firstName
     */
    @NotNull
    @JsonProperty("firstName")
    public String getFirstName();

    /**
     *  <p>Family name (last name) of the Customer.</p>
     * @return lastName
     */
    @NotNull
    @JsonProperty("lastName")
    public String getLastName();

    /**
     *  <p>User-defined unique identifier of the Customer.</p>
     * @return customerNumber
     */
    @NotNull
    @JsonProperty("customerNumber")
    public String getCustomerNumber();

    /**
     *  <p>Given name (first name) of the Customer.</p>
     * @param firstName value to be set
     */

    public void setFirstName(final String firstName);

    /**
     *  <p>Family name (last name) of the Customer.</p>
     * @param lastName value to be set
     */

    public void setLastName(final String lastName);

    /**
     *  <p>User-defined unique identifier of the Customer.</p>
     * @param customerNumber value to be set
     */

    public void setCustomerNumber(final String customerNumber);

    /**
     * factory method
     * @return instance of CustomerLabel
     */
    public static CustomerLabel of() {
        return new CustomerLabelImpl();
    }

    /**
     * factory method to create a shallow copy CustomerLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerLabel of(final CustomerLabel template) {
        CustomerLabelImpl instance = new CustomerLabelImpl();
        instance.setFirstName(template.getFirstName());
        instance.setLastName(template.getLastName());
        instance.setCustomerNumber(template.getCustomerNumber());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerLabel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerLabel deepCopy(@Nullable final CustomerLabel template) {
        if (template == null) {
            return null;
        }
        CustomerLabelImpl instance = new CustomerLabelImpl();
        instance.setFirstName(template.getFirstName());
        instance.setLastName(template.getLastName());
        instance.setCustomerNumber(template.getCustomerNumber());
        return instance;
    }

    /**
     * builder factory method for CustomerLabel
     * @return builder
     */
    public static CustomerLabelBuilder builder() {
        return CustomerLabelBuilder.of();
    }

    /**
     * create builder for CustomerLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerLabelBuilder builder(final CustomerLabel template) {
        return CustomerLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerLabel(Function<CustomerLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerLabel>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerLabel>";
            }
        };
    }
}
