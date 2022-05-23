
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetMiddleNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetMiddleNameAction myCustomerSetMiddleNameAction = MyCustomerSetMiddleNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetMiddleNameActionImpl.class)
public interface MyCustomerSetMiddleNameAction extends MyCustomerUpdateAction {

    String SET_MIDDLE_NAME = "setMiddleName";

    /**
     <>
     */

    @JsonProperty("middleName")
    public String getMiddleName();

    public void setMiddleName(final String middleName);

    public static MyCustomerSetMiddleNameAction of() {
        return new MyCustomerSetMiddleNameActionImpl();
    }

    public static MyCustomerSetMiddleNameAction of(final MyCustomerSetMiddleNameAction template) {
        MyCustomerSetMiddleNameActionImpl instance = new MyCustomerSetMiddleNameActionImpl();
        instance.setMiddleName(template.getMiddleName());
        return instance;
    }

    public static MyCustomerSetMiddleNameActionBuilder builder() {
        return MyCustomerSetMiddleNameActionBuilder.of();
    }

    public static MyCustomerSetMiddleNameActionBuilder builder(final MyCustomerSetMiddleNameAction template) {
        return MyCustomerSetMiddleNameActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetMiddleNameAction(Function<MyCustomerSetMiddleNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetMiddleNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetMiddleNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetMiddleNameAction>";
            }
        };
    }
}
