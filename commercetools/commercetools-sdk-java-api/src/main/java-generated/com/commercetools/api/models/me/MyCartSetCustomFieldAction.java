
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * MyCartSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetCustomFieldAction myCartSetCustomFieldAction = MyCartSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetCustomFieldActionImpl.class)
public interface MyCartSetCustomFieldAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of MyCartSetCustomFieldAction
     */
    public static MyCartSetCustomFieldAction of() {
        return new MyCartSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetCustomFieldAction of(final MyCartSetCustomFieldAction template) {
        MyCartSetCustomFieldActionImpl instance = new MyCartSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public MyCartSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of MyCartSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetCustomFieldAction deepCopy(@Nullable final MyCartSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetCustomFieldActionImpl instance = new MyCartSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for MyCartSetCustomFieldAction
     * @return builder
     */
    public static MyCartSetCustomFieldActionBuilder builder() {
        return MyCartSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for MyCartSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetCustomFieldActionBuilder builder(final MyCartSetCustomFieldAction template) {
        return MyCartSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetCustomFieldAction(Function<MyCartSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetCustomFieldAction>";
            }
        };
    }
}
