
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxCategorySetDescriptionActionImpl.class)
public interface TaxCategorySetDescriptionAction extends TaxCategoryUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    @JsonProperty("description")
    public String getDescription();

    public void setDescription(final String description);

    public static TaxCategorySetDescriptionAction of() {
        return new TaxCategorySetDescriptionActionImpl();
    }

    public static TaxCategorySetDescriptionAction of(final TaxCategorySetDescriptionAction template) {
        TaxCategorySetDescriptionActionImpl instance = new TaxCategorySetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static TaxCategorySetDescriptionActionBuilder builder() {
        return TaxCategorySetDescriptionActionBuilder.of();
    }

    public static TaxCategorySetDescriptionActionBuilder builder(final TaxCategorySetDescriptionAction template) {
        return TaxCategorySetDescriptionActionBuilder.of(template);
    }

    default <T> T withTaxCategorySetDescriptionAction(Function<TaxCategorySetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
