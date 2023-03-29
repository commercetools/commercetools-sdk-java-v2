
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemImportDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemImportDraft customLineItemImportDraft = CustomLineItemImportDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .quantity(0.3)
 *             .money(moneyBuilder -> moneyBuilder)
 *             .slug("{slug}")
 *             .priceMode(CustomLineItemPriceMode.STANDARD)
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
     *
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>The amount of a CustomLineItem in the cart. Must be a positive integer.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>The cost to add to the cart. The amount can be negative.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    /**
     *
     * @return slug
     */
    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    /**
     *
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
     *
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>The custom fields.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     * @return priceMode
     */
    @NotNull
    @JsonProperty("priceMode")
    public CustomLineItemPriceMode getPriceMode();

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>The amount of a CustomLineItem in the cart. Must be a positive integer.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>The cost to add to the cart. The amount can be negative.</p>
     * @param money value to be set
     */

    public void setMoney(final Money money);

    /**
     * set slug
     * @param slug value to be set
     */

    public void setSlug(final String slug);

    /**
     * set state
     * @param state values to be set
     */

    @JsonIgnore
    public void setState(final ItemState... state);

    /**
     * set state
     * @param state values to be set
     */

    public void setState(final List<ItemState> state);

    /**
     * set taxRate
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRate taxRate);

    /**
     * set taxCategory
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    /**
     *  <p>The custom fields.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * set shippingDetails
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     * @param priceMode value to be set
     */

    public void setPriceMode(final CustomLineItemPriceMode priceMode);

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
        instance.setQuantity(template.getQuantity());
        instance.setMoney(template.getMoney());
        instance.setSlug(template.getSlug());
        instance.setState(template.getState());
        instance.setTaxRate(template.getTaxRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setCustom(template.getCustom());
        instance.setShippingDetails(template.getShippingDetails());
        instance.setPriceMode(template.getPriceMode());
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
        instance.setQuantity(template.getQuantity());
        instance.setMoney(com.commercetools.api.models.common.Money.deepCopy(template.getMoney()));
        instance.setSlug(template.getSlug());
        instance.setState(Optional.ofNullable(template.getState())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ItemState::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTaxRate(com.commercetools.api.models.tax_category.TaxRate.deepCopy(template.getTaxRate()));
        instance.setTaxCategory(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier
                .deepCopy(template.getTaxCategory()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setShippingDetails(
            com.commercetools.api.models.cart.ItemShippingDetailsDraft.deepCopy(template.getShippingDetails()));
        instance.setPriceMode(template.getPriceMode());
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
