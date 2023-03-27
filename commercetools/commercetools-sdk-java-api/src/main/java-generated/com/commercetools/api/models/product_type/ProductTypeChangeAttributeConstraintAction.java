
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updates the <code>attributeConstraint</code> of an AttributeDefinition. For now only following changes are supported: <code>SameForAll</code> to <code>None</code> and <code>Unique</code> to <code>None</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeAttributeConstraintAction productTypeChangeAttributeConstraintAction = ProductTypeChangeAttributeConstraintAction.builder()
 *             .attributeName("{attributeName}")
 *             .newValue(AttributeConstraintEnumDraft.NONE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeAttributeConstraintActionImpl.class)
public interface ProductTypeChangeAttributeConstraintAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeChangeAttributeConstraintAction
     */
    String CHANGE_ATTRIBUTE_CONSTRAINT = "changeAttributeConstraint";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p><code>None</code></p>
     * @return newValue
     */
    @NotNull
    @JsonProperty("newValue")
    public AttributeConstraintEnumDraft getNewValue();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p><code>None</code></p>
     * @param newValue value to be set
     */

    public void setNewValue(final AttributeConstraintEnumDraft newValue);

    /**
     * factory method
     * @return instance of ProductTypeChangeAttributeConstraintAction
     */
    public static ProductTypeChangeAttributeConstraintAction of() {
        return new ProductTypeChangeAttributeConstraintActionImpl();
    }

    /**
     * factory method to copy an instance of ProductTypeChangeAttributeConstraintAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeChangeAttributeConstraintAction of(
            final ProductTypeChangeAttributeConstraintAction template) {
        ProductTypeChangeAttributeConstraintActionImpl instance = new ProductTypeChangeAttributeConstraintActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewValue(template.getNewValue());
        return instance;
    }

    /**
     * builder factory method for ProductTypeChangeAttributeConstraintAction
     * @return builder
     */
    public static ProductTypeChangeAttributeConstraintActionBuilder builder() {
        return ProductTypeChangeAttributeConstraintActionBuilder.of();
    }

    /**
     * create builder for ProductTypeChangeAttributeConstraintAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeAttributeConstraintActionBuilder builder(
            final ProductTypeChangeAttributeConstraintAction template) {
        return ProductTypeChangeAttributeConstraintActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeChangeAttributeConstraintAction(
            Function<ProductTypeChangeAttributeConstraintAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeConstraintAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeConstraintAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeAttributeConstraintAction>";
            }
        };
    }
}
