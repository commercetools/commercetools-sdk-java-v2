
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateAction;
import com.commercetools.api.models.tax_category.TaxCategoryChangeNameAction;
import com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateAction;
import com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateAction;
import com.commercetools.api.models.tax_category.TaxCategorySetDescriptionAction;
import com.commercetools.api.models.tax_category.TaxCategorySetKeyAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryUpdateActionImpl implements TaxCategoryUpdateAction {

    private String action;

    @JsonCreator
    TaxCategoryUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }

    public TaxCategoryUpdateActionImpl() {
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxCategoryUpdateActionImpl that = (TaxCategoryUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

}
