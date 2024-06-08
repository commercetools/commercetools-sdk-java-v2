
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CustomLineItemPriceMode;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Custom Line Items contain generic user-defined items that are not linked to Products.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemImportDraft customLineItemImportDraft = CustomLineItemImportDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .slug("{slug}")
 *             .quantity(0.3)
 *             .money(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomLineItemImportDraftImpl.class)
public interface CustomLineItemImportDraft
        extends com.commercetools.api.models.CustomizableDraft<CustomLineItemImportDraft>,
        io.vrap.rmf.base.client.Draft<CustomLineItemImportDraft> {

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. This value should match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @return slug
     */
    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    /**
     *  <p>The number of items in the Custom Line Item. Can be a negative value.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>The cost of individual items in the Custom Line Item. The amount can be negative.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>Include a value to associate a Tax Category with the Custom Line Item.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     * @return priceMode
     */

    @JsonProperty("priceMode")
    public CustomLineItemPriceMode getPriceMode();

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     *  <p>State of the Custom Line Items.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
     *  <p>Custom Fields of the CustomLineItem.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Name of the Custom Line Item.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. This value should match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @param slug value to be set
     */

    public void setSlug(final String slug);

    /**
     *  <p>The number of items in the Custom Line Item. Can be a negative value.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>The cost of individual items in the Custom Line Item. The amount can be negative.</p>
     * @param money value to be set
     */

    public void setMoney(final Money money);

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRate taxRate);

    /**
     *  <p>Include a value to associate a Tax Category with the Custom Line Item.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     * @param priceMode value to be set
     */

    public void setPriceMode(final CustomLineItemPriceMode priceMode);

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    /**
     *  <p>State of the Custom Line Items.</p>
     * @param state values to be set
     */

    @JsonIgnore
    public void setState(final ItemState... state);

    /**
     *  <p>State of the Custom Line Items.</p>
     * @param state values to be set
     */

    public void setState(final List<ItemState> state);

    /**
     *  <p>Custom Fields of the CustomLineItem.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of CustomLineItemImportDraft
     */
    public static CustomLineItemImportDraft of() {
        return new CustomLineItemImportDraftImpl();
    }

    /**
     * factory method to create a shallow copy CustomLineItemImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomLineItemImportDraft of(final CustomLineItemImportDraft template) {
        CustomLineItemImportDraftImpl instance = new CustomLineItemImportDraftImpl();
        instance.setName(template.getName());
        instance.setKey(template.getKey());
        instance.setSlug(template.getSlug());
        instance.setQuantity(template.getQuantity());
        instance.setMoney(template.getMoney());
        instance.setTaxRate(template.getTaxRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setPriceMode(template.getPriceMode());
        instance.setShippingDetails(template.getShippingDetails());
        instance.setState(template.getState());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomLineItemImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomLineItemImportDraft deepCopy(@Nullable final CustomLineItemImportDraft template) {
        if (template == null) {
            return null;
        }
        CustomLineItemImportDraftImpl instance = new CustomLineItemImportDraftImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setKey(template.getKey());
        instance.setSlug(template.getSlug());
        instance.setQuantity(template.getQuantity());
        instance.setMoney(com.commercetools.api.models.common.Money.deepCopy(template.getMoney()));
        instance.setTaxRate(com.commercetools.api.models.tax_category.TaxRate.deepCopy(template.getTaxRate()));
        instance.setTaxCategory(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier
                .deepCopy(template.getTaxCategory()));
        instance.setPriceMode(template.getPriceMode());
        instance.setShippingDetails(
            com.commercetools.api.models.cart.ItemShippingDetailsDraft.deepCopy(template.getShippingDetails()));
        instance.setState(Optional.ofNullable(template.getState())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ItemState::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for CustomLineItemImportDraft
     * @return builder
     */
    public static CustomLineItemImportDraftBuilder builder() {
        return CustomLineItemImportDraftBuilder.of();
    }

    /**
     * create builder for CustomLineItemImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemImportDraftBuilder builder(final CustomLineItemImportDraft template) {
        return CustomLineItemImportDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomLineItemImportDraft(Function<CustomLineItemImportDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItemImportDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItemImportDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItemImportDraft>";
            }
        };
    }
}
