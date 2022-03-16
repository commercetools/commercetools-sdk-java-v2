
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Controls indexing of resources to be provided on high performance read-only search endpoints.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SearchIndexingConfigurationImpl implements SearchIndexingConfiguration, ModelBase {

    private com.commercetools.api.models.project.SearchIndexingConfigurationValues products;

    private com.commercetools.api.models.project.SearchIndexingConfigurationValues orders;

    @JsonCreator
    SearchIndexingConfigurationImpl(
            @JsonProperty("products") final com.commercetools.api.models.project.SearchIndexingConfigurationValues products,
            @JsonProperty("orders") final com.commercetools.api.models.project.SearchIndexingConfigurationValues orders) {
        this.products = products;
        this.orders = orders;
    }

    public SearchIndexingConfigurationImpl() {
    }

    /**
    *  <p>Configuration for the <a href="/../api/projects/products-search">Product Projection Search</a> and <a href="/../api/projects/products-suggestions">Product Suggestions</a> endpoints.</p>
    */
    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getProducts() {
        return this.products;
    }

    /**
    *  <p>Configuration for the <a href="/../api/projects/order-search">Order Search</a> feature.</p>
    */
    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getOrders() {
        return this.orders;
    }

    public void setProducts(final com.commercetools.api.models.project.SearchIndexingConfigurationValues products) {
        this.products = products;
    }

    public void setOrders(final com.commercetools.api.models.project.SearchIndexingConfigurationValues orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchIndexingConfigurationImpl that = (SearchIndexingConfigurationImpl) o;

        return new EqualsBuilder().append(products, that.products).append(orders, that.orders).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(products).append(orders).toHashCode();
    }

}
