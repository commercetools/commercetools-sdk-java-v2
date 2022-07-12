
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionRemoveProductActionImpl.class, name = ProductSelectionRemoveProductAction.REMOVE_PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionSetCustomFieldActionImpl.class, name = ProductSelectionSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionSetCustomTypeActionImpl.class, name = ProductSelectionSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionSetKeyActionImpl.class, name = ProductSelectionSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductSelectionSetVariantSelectionActionImpl.class, name = ProductSelectionSetVariantSelectionAction.SET_VARIANT_SELECTION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ProductSelectionUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ProductSelectionUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductSelectionUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<ProductSelectionUpdateAction> {

    /**
     *
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.product_selection.ProductSelectionAddProductActionBuilder addProductBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionAddProductActionBuilder.of();
    }

    public static com.commercetools.api.models.product_selection.ProductSelectionChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionChangeNameActionBuilder.of();
    }

    public static com.commercetools.api.models.product_selection.ProductSelectionRemoveProductActionBuilder removeProductBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionRemoveProductActionBuilder.of();
    }

    public static com.commercetools.api.models.product_selection.ProductSelectionSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.product_selection.ProductSelectionSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.product_selection.ProductSelectionSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetKeyActionBuilder.of();
    }

    public static com.commercetools.api.models.product_selection.ProductSelectionSetVariantSelectionActionBuilder setVariantSelectionBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetVariantSelectionActionBuilder.of();
    }

    default <T> T withProductSelectionUpdateAction(Function<ProductSelectionUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionUpdateAction>";
            }
        };
    }
}
