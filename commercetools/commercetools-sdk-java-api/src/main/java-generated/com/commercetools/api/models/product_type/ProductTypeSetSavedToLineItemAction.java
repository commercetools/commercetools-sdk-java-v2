
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the <code>savedToLineItem</code> property of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> on a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. This update action controls whether the Attribute value is copied onto a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> when a Product is added to a Cart.</p>
 *  <p>Changing this value does not immediately affect Line Items already in a Cart. Existing Line Items are updated the next time their Product data is refreshed, such as when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRecalculateAction" rel="nofollow">Recalculate</a> update action is performed with <code>updateProductData</code> set to <code>true</code>, or on a Cart update that triggers an API Extension. Replicating a Cart creates a new Cart that contains the current Product data; it does not update the original Cart.</p>
 *  <p>When <code>savedToLineItem</code> is <code>false</code>, <span>LineItem predicates</span> that reference this Attribute, such as those in Cart Discounts and Shipping Methods, evaluate as if the Attribute is not set.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeSetSavedToLineItemAction productTypeSetSavedToLineItemAction = ProductTypeSetSavedToLineItemAction.builder()
 *             .attributeName("{attributeName}")
 *             .savedToLineItem(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setSavedToLineItem")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeSetSavedToLineItemActionImpl.class)
public interface ProductTypeSetSavedToLineItemAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeSetSavedToLineItemAction
     */
    String SET_SAVED_TO_LINE_ITEM = "setSavedToLineItem";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Whether the Attribute value is copied onto a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> when the Product is added to a Cart. See <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> for details.</p>
     *  <p>It has no effect if the Attribute already has the given value.</p>
     * @return savedToLineItem
     */
    @NotNull
    @JsonProperty("savedToLineItem")
    public Boolean getSavedToLineItem();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>Whether the Attribute value is copied onto a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> when the Product is added to a Cart. See <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> for details.</p>
     *  <p>It has no effect if the Attribute already has the given value.</p>
     * @param savedToLineItem value to be set
     */

    public void setSavedToLineItem(final Boolean savedToLineItem);

    /**
     * factory method
     * @return instance of ProductTypeSetSavedToLineItemAction
     */
    public static ProductTypeSetSavedToLineItemAction of() {
        return new ProductTypeSetSavedToLineItemActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeSetSavedToLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeSetSavedToLineItemAction of(final ProductTypeSetSavedToLineItemAction template) {
        ProductTypeSetSavedToLineItemActionImpl instance = new ProductTypeSetSavedToLineItemActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setSavedToLineItem(template.getSavedToLineItem());
        return instance;
    }

    public ProductTypeSetSavedToLineItemAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeSetSavedToLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeSetSavedToLineItemAction deepCopy(
            @Nullable final ProductTypeSetSavedToLineItemAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeSetSavedToLineItemActionImpl instance = new ProductTypeSetSavedToLineItemActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setSavedToLineItem(template.getSavedToLineItem());
        return instance;
    }

    /**
     * builder factory method for ProductTypeSetSavedToLineItemAction
     * @return builder
     */
    public static ProductTypeSetSavedToLineItemActionBuilder builder() {
        return ProductTypeSetSavedToLineItemActionBuilder.of();
    }

    /**
     * create builder for ProductTypeSetSavedToLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeSetSavedToLineItemActionBuilder builder(
            final ProductTypeSetSavedToLineItemAction template) {
        return ProductTypeSetSavedToLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeSetSavedToLineItemAction(Function<ProductTypeSetSavedToLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ProductTypeSetSavedToLineItemAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<ProductTypeSetSavedToLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeSetSavedToLineItemAction>";
            }
        };
    }
}
