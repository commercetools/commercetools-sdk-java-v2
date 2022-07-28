
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetSearchKeywordsActionImpl.class)
public interface ProductSetSearchKeywordsAction extends ProductUpdateAction {

    String SET_SEARCH_KEYWORDS = "setSearchKeywords";

    /**
     *  <p>Value to set.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    /**
     *  <p>If <code>true</code>, only the staged <code>searchKeywords</code> is updated. If <code>false</code>, both the current and staged <code>searchKeywords</code> are updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setSearchKeywords(final SearchKeywords searchKeywords);

    public void setStaged(final Boolean staged);

    public static ProductSetSearchKeywordsAction of() {
        return new ProductSetSearchKeywordsActionImpl();
    }

    public static ProductSetSearchKeywordsAction of(final ProductSetSearchKeywordsAction template) {
        ProductSetSearchKeywordsActionImpl instance = new ProductSetSearchKeywordsActionImpl();
        instance.setSearchKeywords(template.getSearchKeywords());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetSearchKeywordsActionBuilder builder() {
        return ProductSetSearchKeywordsActionBuilder.of();
    }

    public static ProductSetSearchKeywordsActionBuilder builder(final ProductSetSearchKeywordsAction template) {
        return ProductSetSearchKeywordsActionBuilder.of(template);
    }

    default <T> T withProductSetSearchKeywordsAction(Function<ProductSetSearchKeywordsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetSearchKeywordsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetSearchKeywordsAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetSearchKeywordsAction>";
            }
        };
    }
}
