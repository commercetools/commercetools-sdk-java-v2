
package com.commercetools.api.models.me;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetDateOfBirthAction
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

    String SET_DATE_OF_BIRTH = "setDateOfBirth";

    /**
     <>
     */

    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    public void setDateOfBirth(final LocalDate dateOfBirth);

    public static MyCustomerSetDateOfBirthAction of() {
        return new MyCustomerSetDateOfBirthActionImpl();
    }

    public static MyCustomerSetDateOfBirthAction of(final MyCustomerSetDateOfBirthAction template) {
        MyCustomerSetDateOfBirthActionImpl instance = new MyCustomerSetDateOfBirthActionImpl();
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    public static MyCustomerSetDateOfBirthActionBuilder builder() {
        return MyCustomerSetDateOfBirthActionBuilder.of();
    }

    public static MyCustomerSetDateOfBirthActionBuilder builder(final MyCustomerSetDateOfBirthAction template) {
        return MyCustomerSetDateOfBirthActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetDateOfBirthAction(Function<MyCustomerSetDateOfBirthAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetDateOfBirthAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetDateOfBirthAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetDateOfBirthAction>";
            }
        };
    }
}
