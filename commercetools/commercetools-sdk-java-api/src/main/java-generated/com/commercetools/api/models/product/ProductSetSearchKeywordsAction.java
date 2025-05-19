
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductSetSearchKeywordsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetSearchKeywordsAction productSetSearchKeywordsAction = ProductSetSearchKeywordsAction.builder()
 *             .searchKeywords(searchKeywordsBuilder -> searchKeywordsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setSearchKeywords")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetSearchKeywordsActionImpl.class)
public interface ProductSetSearchKeywordsAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetSearchKeywordsAction
     */
    String SET_SEARCH_KEYWORDS = "setSearchKeywords";

    /**
     *  <p>Value to set.</p>
     * @return searchKeywords
     */
    @NotNull
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    /**
     *  <p>If <code>true</code>, only the staged <code>searchKeywords</code> is updated. If <code>false</code>, both the current and staged <code>searchKeywords</code> are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Value to set.</p>
     * @param searchKeywords value to be set
     */

    public void setSearchKeywords(final SearchKeywords searchKeywords);

    /**
     *  <p>If <code>true</code>, only the staged <code>searchKeywords</code> is updated. If <code>false</code>, both the current and staged <code>searchKeywords</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductSetSearchKeywordsAction
     */
    public static ProductSetSearchKeywordsAction of() {
        return new ProductSetSearchKeywordsActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetSearchKeywordsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetSearchKeywordsAction of(final ProductSetSearchKeywordsAction template) {
        ProductSetSearchKeywordsActionImpl instance = new ProductSetSearchKeywordsActionImpl();
        instance.setSearchKeywords(template.getSearchKeywords());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductSetSearchKeywordsAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSetSearchKeywordsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetSearchKeywordsAction deepCopy(@Nullable final ProductSetSearchKeywordsAction template) {
        if (template == null) {
            return null;
        }
        ProductSetSearchKeywordsActionImpl instance = new ProductSetSearchKeywordsActionImpl();
        instance.setSearchKeywords(
            com.commercetools.api.models.product.SearchKeywords.deepCopy(template.getSearchKeywords()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductSetSearchKeywordsAction
     * @return builder
     */
    public static ProductSetSearchKeywordsActionBuilder builder() {
        return ProductSetSearchKeywordsActionBuilder.of();
    }

    /**
     * create builder for ProductSetSearchKeywordsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetSearchKeywordsActionBuilder builder(final ProductSetSearchKeywordsAction template) {
        return ProductSetSearchKeywordsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetSearchKeywordsAction(Function<ProductSetSearchKeywordsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetSearchKeywordsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetSearchKeywordsAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetSearchKeywordsAction>";
            }
        };
    }
}
