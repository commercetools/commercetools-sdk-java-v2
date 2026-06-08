
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
 * ProductSelectionUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionUpdateAction productSelectionUpdateAction = ProductSelectionUpdateAction.addProductBuilder()
 *             product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ProductSelectionUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ProductSelectionUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductSelectionUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<ProductSelectionUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public ProductSelectionUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionUpdateAction deepCopy(@Nullable final ProductSelectionUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ProductSelectionUpdateActionImpl)) {
            return template.copyDeep();
        }
        ProductSelectionUpdateActionImpl instance = new ProductSelectionUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addProduct subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_selection.ProductSelectionAddProductActionBuilder addProductBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionAddProductActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_selection.ProductSelectionChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionChangeNameActionBuilder.of();
    }

    /**
     * builder for excludeProduct subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_selection.ProductSelectionExcludeProductActionBuilder excludeProductBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionExcludeProductActionBuilder.of();
    }

    /**
     * builder for removeProduct subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_selection.ProductSelectionRemoveProductActionBuilder removeProductBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionRemoveProductActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_selection.ProductSelectionSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_selection.ProductSelectionSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_selection.ProductSelectionSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetKeyActionBuilder.of();
    }

    /**
     * builder for setVariantExclusion subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_selection.ProductSelectionSetVariantExclusionActionBuilder setVariantExclusionBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetVariantExclusionActionBuilder.of();
    }

    /**
     * builder for setVariantSelection subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_selection.ProductSelectionSetVariantSelectionActionBuilder setVariantSelectionBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetVariantSelectionActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionUpdateAction(Function<ProductSelectionUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionUpdateAction>";
            }
        };
    }
}
