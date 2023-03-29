
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
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
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Money value of the Custom Line Item.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public TypedMoney getMoney();

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
     *  <p>Total price of the Custom Line Item (<code>money</code> multiplied by <code>quantity</code>). If the Custom Line Item is discounted, the total price is <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>.</p>
     *  <p>Includes taxes if the TaxRate <code>includedInPrice</code> is <code>true</code>.</p>
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public CentPrecisionMoney getTotalPrice();

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. It matches the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @return slug
     */
    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    /**
     *  <p>Number of Custom Line Items in the Cart.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>State of the Custom Line Item in the Cart.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryReference getTaxCategory();

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, the <code>taxRate</code> of Custom Line Items is set automatically once a shipping address is set. The rate is based on the TaxCategory that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Custom Line Items can be set using ExternalTaxRateDraft.</li>
     *  </ul>
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @return discountedPricePerQuantity
     */
    @NotNull
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();

    /**
     *  <p>Custom Fields of the Custom Line Item.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetails getShippingDetails();

    /**
     *  <p>Indicates whether Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</p>
     * @return priceMode
     */
    @NotNull
    @JsonProperty("priceMode")
    public CustomLineItemPriceMode getPriceMode();

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Money value of the Custom Line Item.</p>
     * @param money value to be set
     */

    public void setMoney(final TypedMoney money);

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    /**
     *  <p>Total price of the Custom Line Item (<code>money</code> multiplied by <code>quantity</code>). If the Custom Line Item is discounted, the total price is <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>.</p>
     *  <p>Includes taxes if the TaxRate <code>includedInPrice</code> is <code>true</code>.</p>
     * @param totalPrice value to be set
     */

    public void setTotalPrice(final CentPrecisionMoney totalPrice);

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. It matches the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @param slug value to be set
     */

    public void setSlug(final String slug);

    /**
     *  <p>Number of Custom Line Items in the Cart.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>State of the Custom Line Item in the Cart.</p>
     * @param state values to be set
     */

    @JsonIgnore
    public void setState(final ItemState... state);

    /**
     *  <p>State of the Custom Line Item in the Cart.</p>
     * @param state values to be set
     */

    public void setState(final List<ItemState> state);

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryReference taxCategory);

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, the <code>taxRate</code> of Custom Line Items is set automatically once a shipping address is set. The rate is based on the TaxCategory that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Custom Line Items can be set using ExternalTaxRateDraft.</li>
     *  </ul>
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRate taxRate);

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param discountedPricePerQuantity values to be set
     */

    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceForQuantity... discountedPricePerQuantity);

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     * @param discountedPricePerQuantity values to be set
     */

    public void setDiscountedPricePerQuantity(
            final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);

    /**
     *  <p>Custom Fields of the Custom Line Item.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetails shippingDetails);

    /**
     *  <p>Indicates whether Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</p>
     * @param priceMode value to be set
     */

    public void setPriceMode(final CustomLineItemPriceMode priceMode);

    /**
     * factory method
     * @return instance of CustomLineItem
     */
    public static CustomLineItem of() {
        return new CustomLineItemImpl();
    }

    /**
     * factory method to create a shallow copy CustomLineItem
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of CustomLineItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomLineItem deepCopy(@Nullable final CustomLineItem template) {
        if (template == null) {
            return null;
        }
        CustomLineItemImpl instance = new CustomLineItemImpl();
        instance.setId(template.getId());
        instance.setName(Optional.ofNullable(template.getName())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setMoney(Optional.ofNullable(template.getMoney())
                .map(com.commercetools.api.models.common.TypedMoney::deepCopy)
                .orElse(null));
        instance.setTaxedPrice(Optional.ofNullable(template.getTaxedPrice())
                .map(com.commercetools.api.models.cart.TaxedItemPrice::deepCopy)
                .orElse(null));
        instance.setTotalPrice(Optional.ofNullable(template.getTotalPrice())
                .map(com.commercetools.api.models.common.CentPrecisionMoney::deepCopy)
                .orElse(null));
        instance.setSlug(template.getSlug());
        instance.setQuantity(template.getQuantity());
        instance.setState(Optional.ofNullable(template.getState())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ItemState::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTaxCategory(Optional.ofNullable(template.getTaxCategory())
                .map(com.commercetools.api.models.tax_category.TaxCategoryReference::deepCopy)
                .orElse(null));
        instance.setTaxRate(Optional.ofNullable(template.getTaxRate())
                .map(com.commercetools.api.models.tax_category.TaxRate::deepCopy)
                .orElse(null));
        instance.setDiscountedPricePerQuantity(Optional.ofNullable(template.getDiscountedPricePerQuantity())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFields::deepCopy)
                .orElse(null));
        instance.setShippingDetails(Optional.ofNullable(template.getShippingDetails())
                .map(com.commercetools.api.models.cart.ItemShippingDetails::deepCopy)
                .orElse(null));
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    /**
     * builder factory method for CustomLineItem
     * @return builder
     */
    public static CustomLineItemBuilder builder() {
        return CustomLineItemBuilder.of();
    }

    /**
     * create builder for CustomLineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemBuilder builder(final CustomLineItem template) {
        return CustomLineItemBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomLineItem(Function<CustomLineItem, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItem>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItem>";
            }
        };
    }
}
