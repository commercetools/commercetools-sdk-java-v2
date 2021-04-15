
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchIndexingConfigurationImpl implements SearchIndexingConfiguration {

    private com.commercetools.api.models.project.SearchIndexingConfigurationValues products;

    @JsonCreator
    SearchIndexingConfigurationImpl(
            @JsonProperty("products") final com.commercetools.api.models.project.SearchIndexingConfigurationValues products) {
        this.products = products;
    }

    public SearchIndexingConfigurationImpl() {
    }

    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getProducts() {
        return this.products;
    }

    public void setProducts(final com.commercetools.api.models.project.SearchIndexingConfigurationValues products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchIndexingConfigurationImpl that = (SearchIndexingConfigurationImpl) o;

        return new EqualsBuilder().append(products, that.products).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(products).toHashCode();
    }

}
