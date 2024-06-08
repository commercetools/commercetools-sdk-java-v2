
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Produces the ProductRemovedFromCategory Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveFromCategoryAction productRemoveFromCategoryAction = ProductRemoveFromCategoryAction.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRemoveFromCategoryActionImpl.class)
public interface ProductRemoveFromCategoryAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductRemoveFromCategoryAction
     */
    String REMOVE_FROM_CATEGORY = "removeFromCategory";

    /**
     *  <p>The Category to remove.</p>
     * @return category
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryResourceIdentifier getCategory();

    /**
     *  <p>If <code>true</code>, only the staged <code>categories</code> and <code>categoryOrderHints</code> are removed. If <code>false</code>, both the current and staged <code>categories</code> and <code>categoryOrderHints</code> are removed.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The Category to remove.</p>
     * @param category value to be set
     */

    public void setCategory(final CategoryResourceIdentifier category);

    /**
     *  <p>If <code>true</code>, only the staged <code>categories</code> and <code>categoryOrderHints</code> are removed. If <code>false</code>, both the current and staged <code>categories</code> and <code>categoryOrderHints</code> are removed.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductRemoveFromCategoryAction
     */
    public static ProductRemoveFromCategoryAction of() {
        return new ProductRemoveFromCategoryActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductRemoveFromCategoryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductRemoveFromCategoryAction of(final ProductRemoveFromCategoryAction template) {
        ProductRemoveFromCategoryActionImpl instance = new ProductRemoveFromCategoryActionImpl();
        instance.setCategory(template.getCategory());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductRemoveFromCategoryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductRemoveFromCategoryAction deepCopy(@Nullable final ProductRemoveFromCategoryAction template) {
        if (template == null) {
            return null;
        }
        ProductRemoveFromCategoryActionImpl instance = new ProductRemoveFromCategoryActionImpl();
        instance.setCategory(
            com.commercetools.api.models.category.CategoryResourceIdentifier.deepCopy(template.getCategory()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductRemoveFromCategoryAction
     * @return builder
     */
    public static ProductRemoveFromCategoryActionBuilder builder() {
        return ProductRemoveFromCategoryActionBuilder.of();
    }

    /**
     * create builder for ProductRemoveFromCategoryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRemoveFromCategoryActionBuilder builder(final ProductRemoveFromCategoryAction template) {
        return ProductRemoveFromCategoryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductRemoveFromCategoryAction(Function<ProductRemoveFromCategoryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemoveFromCategoryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemoveFromCategoryAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemoveFromCategoryAction>";
            }
        };
    }
}
