
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetLocaleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLocaleAction myCartSetLocaleAction = MyCartSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLocale")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetLocaleActionImpl.class)
public interface MyCartSetLocaleAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetLocaleAction
     */
    String SET_LOCALE = "setLocale";

    /**
     *  <p>Value to set. Must be one of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>'s <code>languages</code>. If empty, any existing value will be removed.</p>
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Value to set. Must be one of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>'s <code>languages</code>. If empty, any existing value will be removed.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     * factory method
     * @return instance of MyCartSetLocaleAction
     */
    public static MyCartSetLocaleAction of() {
        return new MyCartSetLocaleActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetLocaleAction of(final MyCartSetLocaleAction template) {
        MyCartSetLocaleActionImpl instance = new MyCartSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public MyCartSetLocaleAction copyDeep();

    /**
     * factory method to create a deep copy of MyCartSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetLocaleAction deepCopy(@Nullable final MyCartSetLocaleAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetLocaleActionImpl instance = new MyCartSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    /**
     * builder factory method for MyCartSetLocaleAction
     * @return builder
     */
    public static MyCartSetLocaleActionBuilder builder() {
        return MyCartSetLocaleActionBuilder.of();
    }

    /**
     * create builder for MyCartSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetLocaleActionBuilder builder(final MyCartSetLocaleAction template) {
        return MyCartSetLocaleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetLocaleAction(Function<MyCartSetLocaleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetLocaleAction>";
            }
        };
    }
}
