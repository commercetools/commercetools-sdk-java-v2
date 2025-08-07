
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CustomLineItemPriceMode;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>If the Cart already contains a CustomLineItem with the same <code>slug</code>, <code>name</code>, <code>money</code>, <code>taxCategory</code>, <code>state</code>, and Custom Fields, then only the quantity of the existing Custom Line Item is increased. If CustomLineItem <code>shippingDetails</code> are set, they are merged with the <code>targets</code> that already exist on the ItemShippingDetails of the Custom Line Item. In case of overlapping address keys the ItemShippingTarget <code>quantity</code> is summed up.</p>
 *  <p>If the Cart already contains a Custom Line Item with the same slug that is otherwise not identical, an InvalidOperation error is returned.</p>
 *  <p>If the Tax Rate is not set, a MissingTaxRateForCountry error is returned.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("addCustomLineItem")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddCustomLineItemActionImpl.class)
public interface StagedOrderAddCustomLineItemAction extends StagedOrderUpdateAction,
        com.commercetools.api.models.CustomizableDraft<StagedOrderAddCustomLineItemAction> {

    /**
     * discriminator value for StagedOrderAddCustomLineItemAction
     */
    String ADD_CUSTOM_LINE_ITEM = "addCustomLineItem";

    /**
     *  <p>Money value of the Custom Line Item. The value can be negative.</p>
     *  <p>To set the money value in high precision, use HighPrecisionMoneyDraft.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

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
     *  <p>Number of Custom Line Items to add to the Cart.</p>
     * @return quantity
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. It must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @return slug
     */
    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode. If TaxMode is <code>Platform</code>, this field must not be empty.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget, MultiBuyCustomLineItemsTarget, or CartDiscountPatternTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     * @return priceMode
     */

    @JsonProperty("priceMode")
    public CustomLineItemPriceMode getPriceMode();

    /**
     *  <p>Custom Fields for the Custom Line Item.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @return recurrenceInfo
     */
    @Valid
    @JsonProperty("recurrenceInfo")
    public CustomLineItemRecurrenceInfoDraft getRecurrenceInfo();

    /**
     *  <p>Money value of the Custom Line Item. The value can be negative.</p>
     *  <p>To set the money value in high precision, use HighPrecisionMoneyDraft.</p>
     * @param money value to be set
     */

    public void setMoney(final Money money);

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
     *  <p>Number of Custom Line Items to add to the Cart.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. It must match the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     * @param slug value to be set
     */

    public void setSlug(final String slug);

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode. If TaxMode is <code>Platform</code>, this field must not be empty.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget, MultiBuyCustomLineItemsTarget, or CartDiscountPatternTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     * @param priceMode value to be set
     */

    public void setPriceMode(final CustomLineItemPriceMode priceMode);

    /**
     *  <p>Custom Fields for the Custom Line Item.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @param recurrenceInfo value to be set
     */

    public void setRecurrenceInfo(final CustomLineItemRecurrenceInfoDraft recurrenceInfo);

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
        instance.setKey(template.getKey());
        instance.setQuantity(template.getQuantity());
        instance.setSlug(template.getSlug());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setShippingDetails(template.getShippingDetails());
        instance.setPriceMode(template.getPriceMode());
        instance.setCustom(template.getCustom());
        instance.setRecurrenceInfo(template.getRecurrenceInfo());
        return instance;
    }

    public StagedOrderAddCustomLineItemAction copyDeep();

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
        instance.setMoney(com.commercetools.api.models.common.Money.deepCopy(template.getMoney()));
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setKey(template.getKey());
        instance.setQuantity(template.getQuantity());
        instance.setSlug(template.getSlug());
        instance.setTaxCategory(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier
                .deepCopy(template.getTaxCategory()));
        instance.setExternalTaxRate(
            com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        instance.setShippingDetails(
            com.commercetools.api.models.cart.ItemShippingDetailsDraft.deepCopy(template.getShippingDetails()));
        instance.setPriceMode(template.getPriceMode());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setRecurrenceInfo(com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraft
                .deepCopy(template.getRecurrenceInfo()));
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
