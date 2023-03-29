
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action changes the order of the <code>assets</code> array. The new order is defined by listing the <code>id</code>s of the Assets.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeAssetOrderAction categoryChangeAssetOrderAction = CategoryChangeAssetOrderAction.builder()
 *             .plusAssetOrder(assetOrderBuilder -> assetOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryChangeAssetOrderActionImpl.class)
public interface CategoryChangeAssetOrderAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategoryChangeAssetOrderAction
     */
    String CHANGE_ASSET_ORDER = "changeAssetOrder";

    /**
     *  <p>New value to set. Must contain all Asset <code>id</code>s.</p>
     * @return assetOrder
     */
    @NotNull
    @JsonProperty("assetOrder")
    public List<String> getAssetOrder();

    /**
     *  <p>New value to set. Must contain all Asset <code>id</code>s.</p>
     * @param assetOrder values to be set
     */

    @JsonIgnore
    public void setAssetOrder(final String... assetOrder);

    /**
     *  <p>New value to set. Must contain all Asset <code>id</code>s.</p>
     * @param assetOrder values to be set
     */

    public void setAssetOrder(final List<String> assetOrder);

    /**
     * factory method
     * @return instance of CategoryChangeAssetOrderAction
     */
    public static CategoryChangeAssetOrderAction of() {
        return new CategoryChangeAssetOrderActionImpl();
    }

    /**
     * factory method to create a shallow copy CategoryChangeAssetOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryChangeAssetOrderAction of(final CategoryChangeAssetOrderAction template) {
        CategoryChangeAssetOrderActionImpl instance = new CategoryChangeAssetOrderActionImpl();
        instance.setAssetOrder(template.getAssetOrder());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategoryChangeAssetOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryChangeAssetOrderAction deepCopy(@Nullable final CategoryChangeAssetOrderAction template) {
        if (template == null) {
            return null;
        }
        CategoryChangeAssetOrderActionImpl instance = new CategoryChangeAssetOrderActionImpl();
        instance.setAssetOrder(Optional.ofNullable(template.getAssetOrder()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for CategoryChangeAssetOrderAction
     * @return builder
     */
    public static CategoryChangeAssetOrderActionBuilder builder() {
        return CategoryChangeAssetOrderActionBuilder.of();
    }

    /**
     * create builder for CategoryChangeAssetOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryChangeAssetOrderActionBuilder builder(final CategoryChangeAssetOrderAction template) {
        return CategoryChangeAssetOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryChangeAssetOrderAction(Function<CategoryChangeAssetOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryChangeAssetOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryChangeAssetOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryChangeAssetOrderAction>";
            }
        };
    }
}
