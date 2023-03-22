
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the last name of the Customer produces the CustomerLastNameSetMessage.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetLastNameAction myCustomerSetLastNameAction = MyCustomerSetLastNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetLastNameActionImpl.class)
public interface MyCustomerSetLastNameAction extends MyCustomerUpdateAction {

    String SET_LAST_NAME = "setLastName";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return lastName
     */

    @JsonProperty("lastName")
    public String getLastName();

    public void setLastName(final String lastName);

    public static MyCustomerSetLastNameAction of() {
        return new MyCustomerSetLastNameActionImpl();
    }

    public static MyCustomerSetLastNameAction of(final MyCustomerSetLastNameAction template) {
        MyCustomerSetLastNameActionImpl instance = new MyCustomerSetLastNameActionImpl();
        instance.setLastName(template.getLastName());
        return instance;
    }

    public static MyCustomerSetLastNameActionBuilder builder() {
        return MyCustomerSetLastNameActionBuilder.of();
    }

    public static MyCustomerSetLastNameActionBuilder builder(final MyCustomerSetLastNameAction template) {
        return MyCustomerSetLastNameActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetLastNameAction(Function<MyCustomerSetLastNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetLastNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetLastNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetLastNameAction>";
            }
        };
    }
}
