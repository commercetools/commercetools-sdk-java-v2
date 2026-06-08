
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the title of the Customer produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerTitleSetMessage" rel="nofollow">CustomerTitleSetMessage</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetTitleAction myCustomerSetTitleAction = MyCustomerSetTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setTitle")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetTitleActionImpl.class)
public interface MyCustomerSetTitleAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerSetTitleAction
     */
    String SET_TITLE = "setTitle";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return title
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param title value to be set
     */

    public void setTitle(final String title);

    /**
     * factory method
     * @return instance of MyCustomerSetTitleAction
     */
    public static MyCustomerSetTitleAction of() {
        return new MyCustomerSetTitleActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerSetTitleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSetTitleAction of(final MyCustomerSetTitleAction template) {
        MyCustomerSetTitleActionImpl instance = new MyCustomerSetTitleActionImpl();
        instance.setTitle(template.getTitle());
        return instance;
    }

    public MyCustomerSetTitleAction copyDeep();

    /**
     * factory method to create a deep copy of MyCustomerSetTitleAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerSetTitleAction deepCopy(@Nullable final MyCustomerSetTitleAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerSetTitleActionImpl instance = new MyCustomerSetTitleActionImpl();
        instance.setTitle(template.getTitle());
        return instance;
    }

    /**
     * builder factory method for MyCustomerSetTitleAction
     * @return builder
     */
    public static MyCustomerSetTitleActionBuilder builder() {
        return MyCustomerSetTitleActionBuilder.of();
    }

    /**
     * create builder for MyCustomerSetTitleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetTitleActionBuilder builder(final MyCustomerSetTitleAction template) {
        return MyCustomerSetTitleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSetTitleAction(Function<MyCustomerSetTitleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetTitleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetTitleAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetTitleAction>";
            }
        };
    }
}
