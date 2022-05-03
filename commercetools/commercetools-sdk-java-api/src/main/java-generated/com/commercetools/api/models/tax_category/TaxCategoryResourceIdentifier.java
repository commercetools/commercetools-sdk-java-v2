
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:TaxCategory">TaxCategory</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxCategoryResourceIdentifierImpl.class)
public interface TaxCategoryResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<TaxCategory> {

    String TAX_CATEGORY = "tax-category";

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:TaxCategory">TaxCategory</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-defined unique identifier of the referenced <a href="ctp:api:type:TaxCategory">TaxCategory</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static TaxCategoryResourceIdentifier of() {
        return new TaxCategoryResourceIdentifierImpl();
    }

    public static TaxCategoryResourceIdentifier of(final TaxCategoryResourceIdentifier template) {
        TaxCategoryResourceIdentifierImpl instance = new TaxCategoryResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static TaxCategoryResourceIdentifierBuilder builder() {
        return TaxCategoryResourceIdentifierBuilder.of();
    }

    public static TaxCategoryResourceIdentifierBuilder builder(final TaxCategoryResourceIdentifier template) {
        return TaxCategoryResourceIdentifierBuilder.of(template);
    }

    default <T> T withTaxCategoryResourceIdentifier(Function<TaxCategoryResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryResourceIdentifier>";
            }
        };
    }
}
