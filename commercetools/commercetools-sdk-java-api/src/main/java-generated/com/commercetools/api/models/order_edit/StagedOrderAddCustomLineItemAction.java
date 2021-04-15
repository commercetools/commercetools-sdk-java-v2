
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddCustomLineItemActionImpl.class)
public interface StagedOrderAddCustomLineItemAction extends StagedOrderUpdateAction {

    String ADD_CUSTOM_LINE_ITEM = "addCustomLineItem";

    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @JsonProperty("quantity")
    public Double getQuantity();

    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setMoney(final Money money);

    public void setName(final LocalizedString name);

    public void setQuantity(final Double quantity);

    public void setSlug(final String slug);

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public void setCustom(final CustomFieldsDraft custom);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static StagedOrderAddCustomLineItemAction of() {
        return new StagedOrderAddCustomLineItemActionImpl();
    }

    public static StagedOrderAddCustomLineItemAction of(final StagedOrderAddCustomLineItemAction template) {
        StagedOrderAddCustomLineItemActionImpl instance = new StagedOrderAddCustomLineItemActionImpl();
        instance.setMoney(template.getMoney());
        instance.setName(template.getName());
        instance.setQuantity(template.getQuantity());
        instance.setSlug(template.getSlug());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setCustom(template.getCustom());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static StagedOrderAddCustomLineItemActionBuilder builder() {
        return StagedOrderAddCustomLineItemActionBuilder.of();
    }

    public static StagedOrderAddCustomLineItemActionBuilder builder(final StagedOrderAddCustomLineItemAction template) {
        return StagedOrderAddCustomLineItemActionBuilder.of(template);
    }

    default <T> T withStagedOrderAddCustomLineItemAction(Function<StagedOrderAddCustomLineItemAction, T> helper) {
        return helper.apply(this);
    }
}
