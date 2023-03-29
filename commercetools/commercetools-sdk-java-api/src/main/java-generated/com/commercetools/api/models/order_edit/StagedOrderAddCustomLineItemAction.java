
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CustomLineItemPriceMode;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddCustomLineItemAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddCustomLineItemAction stagedOrderAddCustomLineItemAction = StagedOrderAddCustomLineItemAction.builder()
 *             .money(moneyBuilder -> moneyBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .slug("{slug}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddCustomLineItemActionImpl.class)
public interface StagedOrderAddCustomLineItemAction extends StagedOrderUpdateAction,
        com.commercetools.api.models.CustomizableDraft<StagedOrderAddCustomLineItemAction> {

    /**
     * discriminator value for StagedOrderAddCustomLineItemAction
     */
    String ADD_CUSTOM_LINE_ITEM = "addCustomLineItem";

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *
     * @return quantity
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *
     * @return slug
     */
    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

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
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @param money value to be set
     */

    public void setMoney(final Money money);

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * set quantity
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * set slug
     * @param slug value to be set
     */

    public void setSlug(final String slug);

    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    /**
     *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

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
     * @return instance of StagedOrderAddCustomLineItemAction
     */
    public static StagedOrderAddCustomLineItemAction of() {
        return new StagedOrderAddCustomLineItemActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderAddCustomLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderAddCustomLineItemAction of(final StagedOrderAddCustomLineItemAction template) {
        StagedOrderAddCustomLineItemActionImpl instance = new StagedOrderAddCustomLineItemActionImpl();
        instance.setMoney(template.getMoney());
        instance.setName(template.getName());
        instance.setQuantity(template.getQuantity());
        instance.setSlug(template.getSlug());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setCustom(template.getCustom());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderAddCustomLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderAddCustomLineItemAction deepCopy(
            @Nullable final StagedOrderAddCustomLineItemAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderAddCustomLineItemActionImpl instance = new StagedOrderAddCustomLineItemActionImpl();
        instance.setMoney(Optional.ofNullable(template.getMoney())
                .map(com.commercetools.api.models.common.Money::deepCopy)
                .orElse(null));
        instance.setName(Optional.ofNullable(template.getName())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setQuantity(template.getQuantity());
        instance.setSlug(template.getSlug());
        instance.setTaxCategory(Optional.ofNullable(template.getTaxCategory())
                .map(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFieldsDraft::deepCopy)
                .orElse(null));
        instance.setExternalTaxRate(Optional.ofNullable(template.getExternalTaxRate())
                .map(com.commercetools.api.models.cart.ExternalTaxRateDraft::deepCopy)
                .orElse(null));
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    /**
     * builder factory method for StagedOrderAddCustomLineItemAction
     * @return builder
     */
    public static StagedOrderAddCustomLineItemActionBuilder builder() {
        return StagedOrderAddCustomLineItemActionBuilder.of();
    }

    /**
     * create builder for StagedOrderAddCustomLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddCustomLineItemActionBuilder builder(final StagedOrderAddCustomLineItemAction template) {
        return StagedOrderAddCustomLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderAddCustomLineItemAction(Function<StagedOrderAddCustomLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddCustomLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddCustomLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddCustomLineItemAction>";
            }
        };
    }
}
