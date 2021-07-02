
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomLineItemDraftImpl.class)
public interface CustomLineItemDraft {

    /**
    *  <p>A localized string is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values the corresponding strings used for that language.</p>
    *  <pre><code class="language-json">{
    *    &quot;de&quot;: &quot;Hundefutter&quot;,
    *    &quot;en&quot;: &quot;dog food&quot;
    *  }
    *  </code></pre>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>TypedMoney is what is called BaseMoney in the HTTP API.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("money")
    public TypedMoney getMoney();

    @Valid
    @JsonProperty("taxedPrice")
    public CustomLineItemTaxedPrice getTaxedPrice();

    /**
    *  <p>TypedMoney is what is called BaseMoney in the HTTP API.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();

    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();

    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
    *  <p>References a tax category by its key.</p>
    */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryKeyReference getTaxCategory();

    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceDraft> getDiscountedPricePerQuantity();

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
}
