
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the first name of the Customer produces the CustomerFirstNameSetMessage.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetFirstNameAction myCustomerSetFirstNameAction = MyCustomerSetFirstNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetFirstNameActionImpl.class)
public interface MyCustomerSetFirstNameAction extends MyCustomerUpdateAction {

    String SET_FIRST_NAME = "setFirstName";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    @JsonProperty("firstName")
    public String getFirstName();

    public void setFirstName(final String firstName);

    public static MyCustomerSetFirstNameAction of() {
        return new MyCustomerSetFirstNameActionImpl();
    }

    public static MyCustomerSetFirstNameAction of(final MyCustomerSetFirstNameAction template) {
        MyCustomerSetFirstNameActionImpl instance = new MyCustomerSetFirstNameActionImpl();
        instance.setFirstName(template.getFirstName());
        return instance;
    }

    public static MyCustomerSetFirstNameActionBuilder builder() {
        return MyCustomerSetFirstNameActionBuilder.of();
    }

    public static MyCustomerSetFirstNameActionBuilder builder(final MyCustomerSetFirstNameAction template) {
        return MyCustomerSetFirstNameActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetFirstNameAction(Function<MyCustomerSetFirstNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetFirstNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetFirstNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetFirstNameAction>";
            }
        };
    }
}
