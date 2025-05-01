
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProductSetCategoryOrderHintAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetCategoryOrderHintAction productSetCategoryOrderHintAction = ProductSetCategoryOrderHintAction.builder()
 *             .categoryId("{categoryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetCategoryOrderHintActionImpl.class)
public interface ProductSetCategoryOrderHintAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetCategoryOrderHintAction
     */
    String SET_CATEGORY_ORDER_HINT = "setCategoryOrderHint";

    /**
     *  <p>The <code>id</code> of the Category to add the <code>orderHint</code>. If this Category is not assigned to the Product, an InvalidOperation error is returned.</p>
     * @return categoryId
     */
    @NotNull
    @JsonProperty("categoryId")
    public String getCategoryId();

    /**
     *  <p>A string representing a number between 0 and 1. Must start with <code>0.</code> and cannot end with <code>0</code>. If empty, any existing value will be removed.</p>
     * @return orderHint
     */

    @JsonProperty("orderHint")
    public String getOrderHint();

    /**
     *  <p>If <code>true</code>, only the staged <code>categoryOrderHints</code> is updated. If <code>false</code>, both the current and staged <code>categoryOrderHints</code> are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the Category to add the <code>orderHint</code>. If this Category is not assigned to the Product, an InvalidOperation error is returned.</p>
     * @param categoryId value to be set
     */

    public void setCategoryId(final String categoryId);

    /**
     *  <p>A string representing a number between 0 and 1. Must start with <code>0.</code> and cannot end with <code>0</code>. If empty, any existing value will be removed.</p>
     * @param orderHint value to be set
     */

    public void setOrderHint(final String orderHint);

    /**
     *  <p>If <code>true</code>, only the staged <code>categoryOrderHints</code> is updated. If <code>false</code>, both the current and staged <code>categoryOrderHints</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductSetCategoryOrderHintAction
     */
    public static ProductSetCategoryOrderHintAction of() {
        return new ProductSetCategoryOrderHintActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetCategoryOrderHintAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetCategoryOrderHintAction of(final ProductSetCategoryOrderHintAction template) {
        ProductSetCategoryOrderHintActionImpl instance = new ProductSetCategoryOrderHintActionImpl();
        instance.setCategoryId(template.getCategoryId());
        instance.setOrderHint(template.getOrderHint());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSetCategoryOrderHintAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetCategoryOrderHintAction deepCopy(
            @Nullable final ProductSetCategoryOrderHintAction template) {
        if (template == null) {
            return null;
        }
        ProductSetCategoryOrderHintActionImpl instance = new ProductSetCategoryOrderHintActionImpl();
        instance.setCategoryId(template.getCategoryId());
        instance.setOrderHint(template.getOrderHint());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductSetCategoryOrderHintAction
     * @return builder
     */
    public static ProductSetCategoryOrderHintActionBuilder builder() {
        return ProductSetCategoryOrderHintActionBuilder.of();
    }

    /**
     * create builder for ProductSetCategoryOrderHintAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetCategoryOrderHintActionBuilder builder(final ProductSetCategoryOrderHintAction template) {
        return ProductSetCategoryOrderHintActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetCategoryOrderHintAction(Function<ProductSetCategoryOrderHintAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetCategoryOrderHintAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetCategoryOrderHintAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetCategoryOrderHintAction>";
            }
        };
    }
}
