
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Following this update the Products are reindexed asynchronously to reflect this change on the search endpoint. When enabling search on an existing Attribute type definition, the constraint regarding the maximum size of a searchable Attribute will not be enforced. Instead, Product AttributeDefinitions exceeding this limit will be treated as not searchable and will not be available for full-text search.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeIsSearchableAction productTypeChangeIsSearchableAction = ProductTypeChangeIsSearchableAction.builder()
 *             .attributeName("{attributeName}")
 *             .isSearchable(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeIsSearchableActionImpl.class)
public interface ProductTypeChangeIsSearchableAction extends ProductTypeUpdateAction {

    String CHANGE_IS_SEARCHABLE = "changeIsSearchable";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Determines whether the Attribute's values can be used in full-text search queries, filters, and facets. See AttributeDefinition for details.</p>
     */
    @NotNull
    @JsonProperty("isSearchable")
    public Boolean getIsSearchable();

    public void setAttributeName(final String attributeName);

    public void setIsSearchable(final Boolean isSearchable);

    public static ProductTypeChangeIsSearchableAction of() {
        return new ProductTypeChangeIsSearchableActionImpl();
    }

    public static ProductTypeChangeIsSearchableAction of(final ProductTypeChangeIsSearchableAction template) {
        ProductTypeChangeIsSearchableActionImpl instance = new ProductTypeChangeIsSearchableActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setIsSearchable(template.getIsSearchable());
        return instance;
    }

    public static ProductTypeChangeIsSearchableActionBuilder builder() {
        return ProductTypeChangeIsSearchableActionBuilder.of();
    }

    public static ProductTypeChangeIsSearchableActionBuilder builder(
            final ProductTypeChangeIsSearchableAction template) {
        return ProductTypeChangeIsSearchableActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeIsSearchableAction(Function<ProductTypeChangeIsSearchableAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeIsSearchableAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeIsSearchableAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeIsSearchableAction>";
            }
        };
    }
}
