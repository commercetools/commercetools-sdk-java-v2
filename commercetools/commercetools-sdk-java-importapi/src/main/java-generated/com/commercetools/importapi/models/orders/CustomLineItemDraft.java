
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.prices.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemDraft customLineItemDraft = CustomLineItemDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .money(moneyBuilder -> moneyBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .slug("{slug}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomLineItemDraftImpl.class)
public interface CustomLineItemDraft extends io.vrap.rmf.base.client.Draft<CustomLineItemDraft> {

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public TypedMoney getMoney();

    /**
     *
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public CustomLineItemTaxedPrice getTaxedPrice();

    /**
     *
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();

    /**
     *
     * @return slug
     */
    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    /**
     *
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();

    /**
     *
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
     *  <p>References a tax category by key.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryKeyReference getTaxCategory();

    /**
     *
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *
     * @return discountedPricePerQuantity
     */
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceDraft> getDiscountedPricePerQuantity();

    /**
     *
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setName(final LocalizedString name);

    public void setMoney(final TypedMoney money);

    public void setTaxedPrice(final CustomLineItemTaxedPrice taxedPrice);

    public void setTotalPrice(final TypedMoney totalPrice);

    public void setSlug(final String slug);

    public void setQuantity(final Double quantity);

    @JsonIgnore
    public void setState(final ItemState... state);

    public void setState(final List<ItemState> state);

    public void setTaxCategory(final TaxCategoryKeyReference taxCategory);

    public void setTaxRate(final TaxRate taxRate);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceDraft... discountedPricePerQuantity);

    public void setDiscountedPricePerQuantity(final List<DiscountedLineItemPriceDraft> discountedPricePerQuantity);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static CustomLineItemDraft of() {
        return new CustomLineItemDraftImpl();
    }

    public static CustomLineItemDraft of(final CustomLineItemDraft template) {
        CustomLineItemDraftImpl instance = new CustomLineItemDraftImpl();
        instance.setName(template.getName());
        instance.setMoney(template.getMoney());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setSlug(template.getSlug());
        instance.setQuantity(template.getQuantity());
        instance.setState(template.getState());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setTaxRate(template.getTaxRate());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public static CustomLineItemDraftBuilder builder() {
        return CustomLineItemDraftBuilder.of();
    }

    public static CustomLineItemDraftBuilder builder(final CustomLineItemDraft template) {
        return CustomLineItemDraftBuilder.of(template);
    }

    default <T> T withCustomLineItemDraft(Function<CustomLineItemDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItemDraft>";
            }
        };
    }
}
