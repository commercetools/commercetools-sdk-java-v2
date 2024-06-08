
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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionAddProductActionImpl.class, name = ProductSelectionAddProductAction.ADD_PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionChangeNameActionImpl.class, name = ProductSelectionChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionExcludeProductActionImpl.class, name = ProductSelectionExcludeProductAction.EXCLUDE_PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionRemoveProductActionImpl.class, name = ProductSelectionRemoveProductAction.REMOVE_PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionSetCustomFieldActionImpl.class, name = ProductSelectionSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionSetCustomTypeActionImpl.class, name = ProductSelectionSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionSetKeyActionImpl.class, name = ProductSelectionSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionSetVariantExclusionActionImpl.class, name = ProductSelectionSetVariantExclusionAction.SET_VARIANT_EXCLUSION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionSetVariantSelectionActionImpl.class, name = ProductSelectionSetVariantSelectionAction.SET_VARIANT_SELECTION) })
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
        if (template instanceof com.commercetools.api.models.product_selection.ProductSelectionAddProductAction) {
            return com.commercetools.api.models.product_selection.ProductSelectionAddProductAction.deepCopy(
                (com.commercetools.api.models.product_selection.ProductSelectionAddProductAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_selection.ProductSelectionChangeNameAction) {
            return com.commercetools.api.models.product_selection.ProductSelectionChangeNameAction.deepCopy(
                (com.commercetools.api.models.product_selection.ProductSelectionChangeNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_selection.ProductSelectionExcludeProductAction) {
            return com.commercetools.api.models.product_selection.ProductSelectionExcludeProductAction.deepCopy(
                (com.commercetools.api.models.product_selection.ProductSelectionExcludeProductAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_selection.ProductSelectionRemoveProductAction) {
            return com.commercetools.api.models.product_selection.ProductSelectionRemoveProductAction.deepCopy(
                (com.commercetools.api.models.product_selection.ProductSelectionRemoveProductAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_selection.ProductSelectionSetCustomFieldAction) {
            return com.commercetools.api.models.product_selection.ProductSelectionSetCustomFieldAction.deepCopy(
                (com.commercetools.api.models.product_selection.ProductSelectionSetCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_selection.ProductSelectionSetCustomTypeAction) {
            return com.commercetools.api.models.product_selection.ProductSelectionSetCustomTypeAction.deepCopy(
                (com.commercetools.api.models.product_selection.ProductSelectionSetCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_selection.ProductSelectionSetKeyAction) {
            return com.commercetools.api.models.product_selection.ProductSelectionSetKeyAction
                    .deepCopy((com.commercetools.api.models.product_selection.ProductSelectionSetKeyAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_selection.ProductSelectionSetVariantExclusionAction) {
            return com.commercetools.api.models.product_selection.ProductSelectionSetVariantExclusionAction.deepCopy(
                (com.commercetools.api.models.product_selection.ProductSelectionSetVariantExclusionAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_selection.ProductSelectionSetVariantSelectionAction) {
            return com.commercetools.api.models.product_selection.ProductSelectionSetVariantSelectionAction.deepCopy(
                (com.commercetools.api.models.product_selection.ProductSelectionSetVariantSelectionAction) template);
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
