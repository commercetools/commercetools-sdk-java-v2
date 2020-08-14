package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.cart.CartAddCustomLineItemActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartAddCustomLineItemActionImpl.class)
public interface CartAddCustomLineItemAction extends CartUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();
    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    
    @NotNull
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

    public static CartAddCustomLineItemActionImpl of(){
        return new CartAddCustomLineItemActionImpl();
    }
    

    public static CartAddCustomLineItemActionImpl of(final CartAddCustomLineItemAction template) {
        CartAddCustomLineItemActionImpl instance = new CartAddCustomLineItemActionImpl();
        instance.setMoney(template.getMoney());
        instance.setName(template.getName());
        instance.setQuantity(template.getQuantity());
        instance.setSlug(template.getSlug());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setCustom(template.getCustom());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

}
