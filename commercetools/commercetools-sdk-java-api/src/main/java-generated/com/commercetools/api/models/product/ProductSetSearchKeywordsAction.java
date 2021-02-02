
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetSearchKeywordsActionImpl.class)
public interface ProductSetSearchKeywordsAction extends ProductUpdateAction {

    String SET_SEARCH_KEYWORDS = "setSearchKeywords";

    @NotNull
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

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
}
