
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomLineItemImportDraftImpl.class)
public interface CustomLineItemImportDraft
        extends com.commercetools.api.models.CustomizableDraft<CustomLineItemImportDraft> {

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>The amount of a CustomLineItem in the cart.
    *  Must be a positive integer.</p>
    */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
    *  <p>The cost to add to the cart. The amount can be negative.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setName(final LocalizedString name);

    public void setQuantity(final Long quantity);

    public void setMoney(final Money money);

    public void setSlug(final String slug);

    @JsonIgnore
    public void setState(final ItemState... state);

    public void setState(final List<ItemState> state);

    public void setTaxRate(final TaxRate taxRate);

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public void setCustom(final CustomFieldsDraft custom);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static CustomLineItemImportDraft of() {
        return new CustomLineItemImportDraftImpl();
    }

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
        return instance;
    }

    public static CustomLineItemImportDraftBuilder builder() {
        return CustomLineItemImportDraftBuilder.of();
    }

    public static CustomLineItemImportDraftBuilder builder(final CustomLineItemImportDraft template) {
        return CustomLineItemImportDraftBuilder.of(template);
    }

    default <T> T withCustomLineItemImportDraft(Function<CustomLineItemImportDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItemImportDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItemImportDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItemImportDraft>";
            }
        };
    }
}
