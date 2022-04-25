
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomLineItemImpl.class)
public interface CustomLineItem extends com.commercetools.api.models.Customizable<CustomLineItem> {

    /**
    *  <p>The unique ID of this CustomLineItem.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The name of this CustomLineItem.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>The cost to add to the cart.
    *  The amount can be negative.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("money")
    public TypedMoney getMoney();

    /**
    *  <p>Set once the <code>taxRate</code> is set.</p>
    */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
    *  <p>The total price of this custom line item.
    *  If custom line item is discounted, then the <code>totalPrice</code> would be the discounted custom line item price multiplied by <code>quantity</code>.
    *  Otherwise a total price is just a <code>money</code> multiplied by the <code>quantity</code>.
    *  <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();

    /**
    *  <p>A unique String in the cart to identify this CustomLineItem.</p>
    */
    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    /**
    *  <p>The amount of a CustomLineItem in the cart.
    *  Must be a positive integer.</p>
    */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryReference getTaxCategory();

    /**
    *  <p>Will be set automatically in the <code>Platform</code> TaxMode once the shipping address is set is set.
    *  For the <code>External</code> tax mode the tax rate has to be set explicitly with the ExternalTaxRateDraft.</p>
    */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    @NotNull
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();

    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
    *  <p>Container for custom line item specific address(es).
    *  CustomLineItem fields that can be used in query predicates: <code>slug</code>, <code>name</code>, <code>quantity</code>,
    *  <code>money</code>, <code>state</code>, <code>discountedPricePerQuantity</code>.</p>
    */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetails getShippingDetails();

    public void setId(final String id);

    public void setName(final LocalizedString name);

    public void setMoney(final TypedMoney money);

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    public void setTotalPrice(final TypedMoney totalPrice);

    public void setSlug(final String slug);

    public void setQuantity(final Long quantity);

    @JsonIgnore
    public void setState(final ItemState... state);

    public void setState(final List<ItemState> state);

    public void setTaxCategory(final TaxCategoryReference taxCategory);

    public void setTaxRate(final TaxRate taxRate);

    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceForQuantity... discountedPricePerQuantity);

    public void setDiscountedPricePerQuantity(
            final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);

    public void setCustom(final CustomFields custom);

    public void setShippingDetails(final ItemShippingDetails shippingDetails);

    public static CustomLineItem of() {
        return new CustomLineItemImpl();
    }

    public static CustomLineItem of(final CustomLineItem template) {
        CustomLineItemImpl instance = new CustomLineItemImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setMoney(template.getMoney());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setSlug(template.getSlug());
        instance.setQuantity(template.getQuantity());
        instance.setState(template.getState());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setTaxRate(template.getTaxRate());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setCustom(template.getCustom());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public static CustomLineItemBuilder builder() {
        return CustomLineItemBuilder.of();
    }

    public static CustomLineItemBuilder builder(final CustomLineItem template) {
        return CustomLineItemBuilder.of(template);
    }

    default <T> T withCustomLineItem(Function<CustomLineItem, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItem>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItem>";
            }
        };
    }
}
