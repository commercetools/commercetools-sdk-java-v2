
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Renames an AttributeDefinition and also renames all corresponding Attributes on all Products with this ProductType. The renaming of the Attributes is eventually consistent.</p>
 *  <p>If the AttributeDefinition name to be changed does not exist, a AttributeNameDoesNotExist error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeAttributeNameAction productTypeChangeAttributeNameAction = ProductTypeChangeAttributeNameAction.builder()
 *             .attributeName("{attributeName}")
 *             .newAttributeName("{newAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeAttributeNameActionImpl.class)
public interface ProductTypeChangeAttributeNameAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeChangeAttributeNameAction
     */
    String CHANGE_ATTRIBUTE_NAME = "changeAttributeName";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>New user-defined name of the Attribute that is unique with the Project.</p>
     *  <p>When using the same <code>name</code> for an Attribute in two or more ProductTypes, all fields of the AttributeDefinition of this Attribute must be the same across the ProductTypes. If not, an AttributeDefinitionAlreadyExists error is returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
     * @return newAttributeName
     */
    @NotNull
    @JsonProperty("newAttributeName")
    public String getNewAttributeName();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>New user-defined name of the Attribute that is unique with the Project.</p>
     *  <p>When using the same <code>name</code> for an Attribute in two or more ProductTypes, all fields of the AttributeDefinition of this Attribute must be the same across the ProductTypes. If not, an AttributeDefinitionAlreadyExists error is returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
     * @param newAttributeName value to be set
     */

    public void setNewAttributeName(final String newAttributeName);

    /**
     * factory method
     * @return instance of ProductTypeChangeAttributeNameAction
     */
    public static ProductTypeChangeAttributeNameAction of() {
        return new ProductTypeChangeAttributeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeChangeAttributeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeChangeAttributeNameAction of(final ProductTypeChangeAttributeNameAction template) {
        ProductTypeChangeAttributeNameActionImpl instance = new ProductTypeChangeAttributeNameActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewAttributeName(template.getNewAttributeName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTypeChangeAttributeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeChangeAttributeNameAction deepCopy(
            @Nullable final ProductTypeChangeAttributeNameAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeChangeAttributeNameActionImpl instance = new ProductTypeChangeAttributeNameActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewAttributeName(template.getNewAttributeName());
        return instance;
    }

    /**
     * builder factory method for ProductTypeChangeAttributeNameAction
     * @return builder
     */
    public static ProductTypeChangeAttributeNameActionBuilder builder() {
        return ProductTypeChangeAttributeNameActionBuilder.of();
    }

    /**
     * create builder for ProductTypeChangeAttributeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeAttributeNameActionBuilder builder(
            final ProductTypeChangeAttributeNameAction template) {
        return ProductTypeChangeAttributeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeChangeAttributeNameAction(Function<ProductTypeChangeAttributeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeAttributeNameAction>";
            }
        };
    }
}
