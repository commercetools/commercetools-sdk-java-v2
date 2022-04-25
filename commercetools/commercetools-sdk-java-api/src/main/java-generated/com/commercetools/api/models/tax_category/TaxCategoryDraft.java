
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxCategoryDraftImpl.class)
public interface TaxCategoryDraft {

    /**
    *  <p>Name of the TaxCategory.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>Description of the TaxCategory.</p>
    */

    @JsonProperty("description")
    public String getDescription();

    /**
    *  <p>Tax rates and subrates of states and countries.</p>
    */
    @Valid
    @JsonProperty("rates")
    public List<TaxRateDraft> getRates();

    /**
    *  <p>User-defined unique identifier for the TaxCategory.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setName(final String name);

    public void setDescription(final String description);

    @JsonIgnore
    public void setRates(final TaxRateDraft... rates);

    public void setRates(final List<TaxRateDraft> rates);

    public void setKey(final String key);

    public static TaxCategoryDraft of() {
        return new TaxCategoryDraftImpl();
    }

    public static TaxCategoryDraft of(final TaxCategoryDraft template) {
        TaxCategoryDraftImpl instance = new TaxCategoryDraftImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setRates(template.getRates());
        instance.setKey(template.getKey());
        return instance;
    }

    public static TaxCategoryDraftBuilder builder() {
        return TaxCategoryDraftBuilder.of();
    }

    public static TaxCategoryDraftBuilder builder(final TaxCategoryDraft template) {
        return TaxCategoryDraftBuilder.of(template);
    }

    default <T> T withTaxCategoryDraft(Function<TaxCategoryDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryDraft>";
            }
        };
    }
}
