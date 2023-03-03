
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A generic item that can be added to the Cart but is not bound to a Product that can be used for discounts (negative money), vouchers, complex cart rules, additional services, or fees. You control the lifecycle of this item.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItem customLineItem = CustomLineItem.builder()
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .money(moneyBuilder -> moneyBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .slug("{slug}")
 *             .quantity(0.3)
 *             .plusState(stateBuilder -> stateBuilder)
 *             .plusDiscountedPricePerQuantity(discountedPricePerQuantityBuilder -> discountedPricePerQuantityBuilder)
 *             .priceMode(CustomLineItemPriceMode.STANDARD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomLineItemImpl.class)
public interface CustomLineItem extends com.commercetools.api.models.Customizable<CustomLineItem> {

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Name of the Custom Line Item.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Money value of the Custom Line Item.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public TypedMoney getMoney();

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
     *  <p>Total price of the Custom Line Item (<code>money</code> multiplied by <code>quantity</code>). If the Custom Line Item is discounted, the total price is <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>.</p>
     *  <p>Includes taxes if the TaxRate <code>includedInPrice</code> is <code>true</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public CentPrecisionMoney getTotalPrice();

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. It matches the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     */
    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    /**
     *  <p>Number of Custom Line Items in the Cart.</p>
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>State of the Custom Line Item in the Cart.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryReference getTaxCategory();

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, the <code>taxRate</code> of Custom Line Items is set automatically once a shipping address is set. The rate is based on the TaxCategory that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Custom Line Items can be set using ExternalTaxRateDraft.</li>
     *  </ul>
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();

    /**
     *  <p>Custom Fields of the Custom Line Item.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetails getShippingDetails();

    /**
     *  <p>Indicates whether Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</p>
     */
    @NotNull
    @JsonProperty("priceMode")
    public CustomLineItemPriceMode getPriceMode();

    public void setId(final String id);

    public void setName(final LocalizedString name);

    public void setMoney(final TypedMoney money);

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    public void setTotalPrice(final CentPrecisionMoney totalPrice);

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

    public void setPriceMode(final CustomLineItemPriceMode priceMode);

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
        instance.setPriceMode(template.getPriceMode());
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
