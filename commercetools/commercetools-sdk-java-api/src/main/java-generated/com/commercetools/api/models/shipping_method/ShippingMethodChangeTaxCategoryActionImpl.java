
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodChangeTaxCategoryActionImpl implements ShippingMethodChangeTaxCategoryAction {

    private String action;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @JsonCreator
    ShippingMethodChangeTaxCategoryActionImpl(
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        this.action = CHANGE_TAX_CATEGORY;
    }

    public ShippingMethodChangeTaxCategoryActionImpl() {
        this.action = CHANGE_TAX_CATEGORY;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    public void setTaxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodChangeTaxCategoryActionImpl that = (ShippingMethodChangeTaxCategoryActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(taxCategory, that.taxCategory).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(taxCategory).toHashCode();
    }

}
