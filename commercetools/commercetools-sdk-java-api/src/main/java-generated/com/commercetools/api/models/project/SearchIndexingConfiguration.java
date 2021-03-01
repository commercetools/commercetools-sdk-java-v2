
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SearchIndexingConfigurationImpl.class)
public interface SearchIndexingConfiguration {

    @Valid
    @JsonProperty("products")
    public SearchIndexingConfigurationValues getProducts();

    public void setProducts(final SearchIndexingConfigurationValues products);

    public static SearchIndexingConfiguration of() {
        return new SearchIndexingConfigurationImpl();
    }

    public static SearchIndexingConfiguration of(final SearchIndexingConfiguration template) {
        SearchIndexingConfigurationImpl instance = new SearchIndexingConfigurationImpl();
        instance.setProducts(template.getProducts());
        return instance;
    }

    public static SearchIndexingConfigurationBuilder builder() {
        return SearchIndexingConfigurationBuilder.of();
    }

    public static SearchIndexingConfigurationBuilder builder(final SearchIndexingConfiguration template) {
        return SearchIndexingConfigurationBuilder.of(template);
    }

    default <T> T withSearchIndexingConfiguration(Function<SearchIndexingConfiguration, T> helper) {
        return helper.apply(this);
    }
}
