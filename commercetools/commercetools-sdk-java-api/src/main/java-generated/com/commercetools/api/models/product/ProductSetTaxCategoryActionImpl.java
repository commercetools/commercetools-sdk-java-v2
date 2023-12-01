
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Cannot be staged. Published Products are immediately updated.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetTaxCategoryActionImpl implements ProductSetTaxCategoryAction, ModelBase {

    private String action;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSetTaxCategoryActionImpl(
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        this.action = SET_TAX_CATEGORY;
    }

    /**
     * create empty instance
     */
    public ProductSetTaxCategoryActionImpl() {
        this.action = SET_TAX_CATEGORY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The Tax Category to set. If empty, any existing value will be removed.</p>
     */

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

        ProductSetTaxCategoryActionImpl that = (ProductSetTaxCategoryActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(taxCategory, that.taxCategory)
                .append(action, that.action)
                .append(taxCategory, that.taxCategory)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(taxCategory).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("taxCategory", taxCategory)
                .build();
    }

}
