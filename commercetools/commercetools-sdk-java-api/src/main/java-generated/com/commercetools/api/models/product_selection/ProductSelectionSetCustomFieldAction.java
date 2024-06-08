
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProductSelectionSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetCustomFieldAction productSelectionSetCustomFieldAction = ProductSelectionSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionSetCustomFieldActionImpl.class)
public interface ProductSelectionSetCustomFieldAction extends ProductSelectionUpdateAction {

    /**
     * discriminator value for ProductSelectionSetCustomFieldAction
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
     * @return instance of ProductSelectionSetCustomFieldAction
     */
    public static ProductSelectionSetCustomFieldAction of() {
        return new ProductSelectionSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionSetCustomFieldAction of(final ProductSelectionSetCustomFieldAction template) {
        ProductSelectionSetCustomFieldActionImpl instance = new ProductSelectionSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelectionSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionSetCustomFieldAction deepCopy(
            @Nullable final ProductSelectionSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        ProductSelectionSetCustomFieldActionImpl instance = new ProductSelectionSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for ProductSelectionSetCustomFieldAction
     * @return builder
     */
    public static ProductSelectionSetCustomFieldActionBuilder builder() {
        return ProductSelectionSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for ProductSelectionSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionSetCustomFieldActionBuilder builder(
            final ProductSelectionSetCustomFieldAction template) {
        return ProductSelectionSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionSetCustomFieldAction(Function<ProductSelectionSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionSetCustomFieldAction>";
            }
        };
    }
}
