
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>If the Cart already contains a CustomLineItem with the same <code>slug</code>, <code>name</code>, <code>money</code>, <code>taxCategory</code>, <code>state</code>, and Custom Fields, then only the quantity of the existing Custom Line Item is increased. If CustomLineItem <code>shippingDetails</code> are set, they are merged with the <code>targets</code> that already exist on the ItemShippingDetails of the Custom Line Item. In case of overlapping address keys the ItemShippingTarget <code>quantity</code> is summed up.</p>
 *  <p>If the Cart already contains a Custom Line Item with the same slug that is otherwise not identical, an InvalidOperation error is returned.</p>
 *  <p>If the Tax Rate is not set, a MissingTaxRateForCountry error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddCustomLineItemAction cartAddCustomLineItemAction = CartAddCustomLineItemAction.builder()
 *             .money(moneyBuilder -> moneyBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .slug("{slug}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddCustomLineItemActionImpl.class)
public interface CartAddCustomLineItemAction
        extends CartUpdateAction, com.commercetools.api.models.CustomizableDraft<CartAddCustomLineItemAction> {

    String ADD_CUSTOM_LINE_ITEM = "addCustomLineItem";

    /**
     *  <p>Money value of the Custom Line Item. The value can be negative.</p>
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
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     *  <p>If TaxMode is <code>Platform</code>, this field must not be empty.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>An external Tax Rate can be set if the Cart has <code>External</code> TaxMode.</p>
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
     *  <p>Custom Fields for the Custom Line Item.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     * @return priceMode
     */

    @JsonProperty("priceMode")
    public CustomLineItemPriceMode getPriceMode();

    public void setMoney(final Money money);

    public void setName(final LocalizedString name);

    public void setQuantity(final Long quantity);

    public void setSlug(final String slug);

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public void setCustom(final CustomFieldsDraft custom);

    public void setPriceMode(final CustomLineItemPriceMode priceMode);

    public static CartAddCustomLineItemAction of() {
        return new CartAddCustomLineItemActionImpl();
    }

    public static CartAddCustomLineItemAction of(final CartAddCustomLineItemAction template) {
        CartAddCustomLineItemActionImpl instance = new CartAddCustomLineItemActionImpl();
        instance.setMoney(template.getMoney());
        instance.setName(template.getName());
        instance.setQuantity(template.getQuantity());
        instance.setSlug(template.getSlug());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setShippingDetails(template.getShippingDetails());
        instance.setCustom(template.getCustom());
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    public static CartAddCustomLineItemActionBuilder builder() {
        return CartAddCustomLineItemActionBuilder.of();
    }

    public static CartAddCustomLineItemActionBuilder builder(final CartAddCustomLineItemAction template) {
        return CartAddCustomLineItemActionBuilder.of(template);
    }

    default <T> T withCartAddCustomLineItemAction(Function<CartAddCustomLineItemAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartAddCustomLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddCustomLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddCustomLineItemAction>";
            }
        };
    }
}
