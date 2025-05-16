
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * ProductSelectionSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetCustomTypeAction productSelectionSetCustomTypeAction = ProductSelectionSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionSetCustomTypeActionImpl.class)
public interface ProductSelectionSetCustomTypeAction extends ProductSelectionUpdateAction {

    /**
     * discriminator value for ProductSelectionSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the ProductSelection with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ProductSelection.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the ProductSelection.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the ProductSelection with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ProductSelection.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the ProductSelection.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of ProductSelectionSetCustomTypeAction
     */
    public static ProductSelectionSetCustomTypeAction of() {
        return new ProductSelectionSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionSetCustomTypeAction of(final ProductSelectionSetCustomTypeAction template) {
        ProductSelectionSetCustomTypeActionImpl instance = new ProductSelectionSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public ProductSelectionSetCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionSetCustomTypeAction deepCopy(
            @Nullable final ProductSelectionSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        ProductSelectionSetCustomTypeActionImpl instance = new ProductSelectionSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionSetCustomTypeAction
     * @return builder
     */
    public static ProductSelectionSetCustomTypeActionBuilder builder() {
        return ProductSelectionSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for ProductSelectionSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionSetCustomTypeActionBuilder builder(
            final ProductSelectionSetCustomTypeAction template) {
        return ProductSelectionSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionSetCustomTypeAction(Function<ProductSelectionSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionSetCustomTypeAction>";
            }
        };
    }
}
