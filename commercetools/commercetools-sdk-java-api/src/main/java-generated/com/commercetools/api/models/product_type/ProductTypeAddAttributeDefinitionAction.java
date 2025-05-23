
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductTypeAddAttributeDefinitionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeAddAttributeDefinitionAction productTypeAddAttributeDefinitionAction = ProductTypeAddAttributeDefinitionAction.builder()
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addAttributeDefinition")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeAddAttributeDefinitionActionImpl.class)
public interface ProductTypeAddAttributeDefinitionAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeAddAttributeDefinitionAction
     */
    String ADD_ATTRIBUTE_DEFINITION = "addAttributeDefinition";

    /**
     *  <p>Value to append to <code>attributes</code>.</p>
     * @return attribute
     */
    @NotNull
    @Valid
    @JsonProperty("attribute")
    public AttributeDefinitionDraft getAttribute();

    /**
     *  <p>Value to append to <code>attributes</code>.</p>
     * @param attribute value to be set
     */

    public void setAttribute(final AttributeDefinitionDraft attribute);

    /**
     * factory method
     * @return instance of ProductTypeAddAttributeDefinitionAction
     */
    public static ProductTypeAddAttributeDefinitionAction of() {
        return new ProductTypeAddAttributeDefinitionActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeAddAttributeDefinitionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeAddAttributeDefinitionAction of(final ProductTypeAddAttributeDefinitionAction template) {
        ProductTypeAddAttributeDefinitionActionImpl instance = new ProductTypeAddAttributeDefinitionActionImpl();
        instance.setAttribute(template.getAttribute());
        return instance;
    }

    public ProductTypeAddAttributeDefinitionAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeAddAttributeDefinitionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeAddAttributeDefinitionAction deepCopy(
            @Nullable final ProductTypeAddAttributeDefinitionAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeAddAttributeDefinitionActionImpl instance = new ProductTypeAddAttributeDefinitionActionImpl();
        instance.setAttribute(
            com.commercetools.api.models.product_type.AttributeDefinitionDraft.deepCopy(template.getAttribute()));
        return instance;
    }

    /**
     * builder factory method for ProductTypeAddAttributeDefinitionAction
     * @return builder
     */
    public static ProductTypeAddAttributeDefinitionActionBuilder builder() {
        return ProductTypeAddAttributeDefinitionActionBuilder.of();
    }

    /**
     * create builder for ProductTypeAddAttributeDefinitionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeAddAttributeDefinitionActionBuilder builder(
            final ProductTypeAddAttributeDefinitionAction template) {
        return ProductTypeAddAttributeDefinitionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeAddAttributeDefinitionAction(
            Function<ProductTypeAddAttributeDefinitionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeAddAttributeDefinitionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeAddAttributeDefinitionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeAddAttributeDefinitionAction>";
            }
        };
    }
}
