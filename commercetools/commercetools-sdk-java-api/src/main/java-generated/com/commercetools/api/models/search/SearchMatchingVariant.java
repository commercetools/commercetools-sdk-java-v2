
package com.commercetools.api.models.search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchMatchingVariant
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchMatchingVariant searchMatchingVariant = SearchMatchingVariant.builder()
 *             .id(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchMatchingVariantImpl.class)
public interface SearchMatchingVariant {

    /**
     *  <p>Unique identifier of the variant.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public Integer getId();

    /**
     *  <p>SKU of the matching variant.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Unique identifier of the variant.</p>
     * @param id value to be set
     */

    public void setId(final Integer id);

    /**
     *  <p>SKU of the matching variant.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     * factory method
     * @return instance of SearchMatchingVariant
     */
    public static SearchMatchingVariant of() {
        return new SearchMatchingVariantImpl();
    }

    /**
     * factory method to create a shallow copy SearchMatchingVariant
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchMatchingVariant of(final SearchMatchingVariant template) {
        SearchMatchingVariantImpl instance = new SearchMatchingVariantImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchMatchingVariant
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchMatchingVariant deepCopy(@Nullable final SearchMatchingVariant template) {
        if (template == null) {
            return null;
        }
        SearchMatchingVariantImpl instance = new SearchMatchingVariantImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        return instance;
    }

    /**
     * builder factory method for SearchMatchingVariant
     * @return builder
     */
    public static SearchMatchingVariantBuilder builder() {
        return SearchMatchingVariantBuilder.of();
    }

    /**
     * create builder for SearchMatchingVariant instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchMatchingVariantBuilder builder(final SearchMatchingVariant template) {
        return SearchMatchingVariantBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchMatchingVariant(Function<SearchMatchingVariant, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchMatchingVariant> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchMatchingVariant>() {
            @Override
            public String toString() {
                return "TypeReference<SearchMatchingVariant>";
            }
        };
    }
}
