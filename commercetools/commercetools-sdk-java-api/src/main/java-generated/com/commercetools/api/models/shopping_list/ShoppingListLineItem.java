
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListLineItemImpl.class)
public interface ShoppingListLineItem {

    @NotNull
    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    @JsonProperty("deactivatedAt")
    public ZonedDateTime getDeactivatedAt();

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    @Valid
    @JsonProperty("productSlug")
    public LocalizedString getProductSlug();

    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeReference getProductType();

    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();

    @JsonProperty("variantId")
    public Long getVariantId();

    public void setAddedAt(final ZonedDateTime addedAt);

    public void setCustom(final CustomFields custom);

    public void setDeactivatedAt(final ZonedDateTime deactivatedAt);

    public void setId(final String id);

    public void setName(final LocalizedString name);

    public void setProductId(final String productId);

    public void setProductSlug(final LocalizedString productSlug);

    public void setProductType(final ProductTypeReference productType);

    public void setQuantity(final Integer quantity);

    public void setVariant(final ProductVariant variant);

    public void setVariantId(final Long variantId);

    public static ShoppingListLineItem of() {
        return new ShoppingListLineItemImpl();
    }

    public static ShoppingListLineItem of(final ShoppingListLineItem template) {
        ShoppingListLineItemImpl instance = new ShoppingListLineItemImpl();
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        instance.setDeactivatedAt(template.getDeactivatedAt());
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setProductId(template.getProductId());
        instance.setProductSlug(template.getProductSlug());
        instance.setProductType(template.getProductType());
        instance.setQuantity(template.getQuantity());
        instance.setVariant(template.getVariant());
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    public static ShoppingListLineItemBuilder builder() {
        return ShoppingListLineItemBuilder.of();
    }

    public static ShoppingListLineItemBuilder builder(final ShoppingListLineItem template) {
        return ShoppingListLineItemBuilder.of(template);
    }

    default <T> T withShoppingListLineItem(Function<ShoppingListLineItem, T> helper) {
        return helper.apply(this);
    }
}
