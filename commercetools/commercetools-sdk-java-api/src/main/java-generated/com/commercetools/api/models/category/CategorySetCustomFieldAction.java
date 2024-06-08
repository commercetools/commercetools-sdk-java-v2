
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CategorySetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetCustomFieldAction categorySetCustomFieldAction = CategorySetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetCustomFieldActionImpl.class)
public interface CategorySetCustomFieldAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetCustomFieldAction
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
     * @return instance of CategorySetCustomFieldAction
     */
    public static CategorySetCustomFieldAction of() {
        return new CategorySetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy CategorySetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetCustomFieldAction of(final CategorySetCustomFieldAction template) {
        CategorySetCustomFieldActionImpl instance = new CategorySetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategorySetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetCustomFieldAction deepCopy(@Nullable final CategorySetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CategorySetCustomFieldActionImpl instance = new CategorySetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CategorySetCustomFieldAction
     * @return builder
     */
    public static CategorySetCustomFieldActionBuilder builder() {
        return CategorySetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for CategorySetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetCustomFieldActionBuilder builder(final CategorySetCustomFieldAction template) {
        return CategorySetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetCustomFieldAction(Function<CategorySetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CategorySetCustomFieldAction ofUnset(final String name) {
        return CategorySetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetCustomFieldAction>";
            }
        };
    }
}
