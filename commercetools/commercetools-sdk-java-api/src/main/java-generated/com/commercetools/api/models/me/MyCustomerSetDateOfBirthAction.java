
package com.commercetools.api.models.me;

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
 *     MyCustomerSetDateOfBirthAction myCustomerSetDateOfBirthAction = MyCustomerSetDateOfBirthAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetDateOfBirthActionImpl.class)
public interface MyCustomerSetDateOfBirthAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerSetDateOfBirthAction
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
     * @return instance of MyCustomerSetDateOfBirthAction
     */
    public static MyCustomerSetDateOfBirthAction of() {
        return new MyCustomerSetDateOfBirthActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerSetDateOfBirthAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSetDateOfBirthAction of(final MyCustomerSetDateOfBirthAction template) {
        MyCustomerSetDateOfBirthActionImpl instance = new MyCustomerSetDateOfBirthActionImpl();
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerSetDateOfBirthAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerSetDateOfBirthAction deepCopy(@Nullable final MyCustomerSetDateOfBirthAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerSetDateOfBirthActionImpl instance = new MyCustomerSetDateOfBirthActionImpl();
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    /**
     * builder factory method for MyCustomerSetDateOfBirthAction
     * @return builder
     */
    public static MyCustomerSetDateOfBirthActionBuilder builder() {
        return MyCustomerSetDateOfBirthActionBuilder.of();
    }

    /**
     * create builder for MyCustomerSetDateOfBirthAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetDateOfBirthActionBuilder builder(final MyCustomerSetDateOfBirthAction template) {
        return MyCustomerSetDateOfBirthActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSetDateOfBirthAction(Function<MyCustomerSetDateOfBirthAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetDateOfBirthAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetDateOfBirthAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetDateOfBirthAction>";
            }
        };
    }
}
