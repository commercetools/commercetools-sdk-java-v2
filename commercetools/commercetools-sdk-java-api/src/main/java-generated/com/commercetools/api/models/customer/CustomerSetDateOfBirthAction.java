
package com.commercetools.api.models.customer;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the date of birth of the Customer produces the CustomerDateOfBirthSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetDateOfBirthAction customerSetDateOfBirthAction = CustomerSetDateOfBirthAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetDateOfBirthActionImpl.class)
public interface CustomerSetDateOfBirthAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetDateOfBirthAction
     */
    String SET_DATE_OF_BIRTH = "setDateOfBirth";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return dateOfBirth
     */

    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param dateOfBirth value to be set
     */

    public void setDateOfBirth(final LocalDate dateOfBirth);

    /**
     * factory method
     * @return instance of CustomerSetDateOfBirthAction
     */
    public static CustomerSetDateOfBirthAction of() {
        return new CustomerSetDateOfBirthActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetDateOfBirthAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetDateOfBirthAction of(final CustomerSetDateOfBirthAction template) {
        CustomerSetDateOfBirthActionImpl instance = new CustomerSetDateOfBirthActionImpl();
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerSetDateOfBirthAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetDateOfBirthAction deepCopy(@Nullable final CustomerSetDateOfBirthAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetDateOfBirthActionImpl instance = new CustomerSetDateOfBirthActionImpl();
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    /**
     * builder factory method for CustomerSetDateOfBirthAction
     * @return builder
     */
    public static CustomerSetDateOfBirthActionBuilder builder() {
        return CustomerSetDateOfBirthActionBuilder.of();
    }

    /**
     * create builder for CustomerSetDateOfBirthAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetDateOfBirthActionBuilder builder(final CustomerSetDateOfBirthAction template) {
        return CustomerSetDateOfBirthActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetDateOfBirthAction(Function<CustomerSetDateOfBirthAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetDateOfBirthAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetDateOfBirthAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetDateOfBirthAction>";
            }
        };
    }
}
