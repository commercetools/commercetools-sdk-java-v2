
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetLocaleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetLocaleAction myCustomerSetLocaleAction = MyCustomerSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetLocaleActionImpl.class)
public interface MyCustomerSetLocaleAction extends MyCustomerUpdateAction {

    String SET_LOCALE = "setLocale";

    /**
     *  <p>Value to set. Must be one of the languages supported by the Project.</p>
     */

    @JsonProperty("locale")
    public String getLocale();

    public void setLocale(final String locale);

    public static MyCustomerSetLocaleAction of() {
        return new MyCustomerSetLocaleActionImpl();
    }

    public static MyCustomerSetLocaleAction of(final MyCustomerSetLocaleAction template) {
        MyCustomerSetLocaleActionImpl instance = new MyCustomerSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public static MyCustomerSetLocaleActionBuilder builder() {
        return MyCustomerSetLocaleActionBuilder.of();
    }

    public static MyCustomerSetLocaleActionBuilder builder(final MyCustomerSetLocaleAction template) {
        return MyCustomerSetLocaleActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetLocaleAction(Function<MyCustomerSetLocaleAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetLocaleAction>";
            }
        };
    }
}
