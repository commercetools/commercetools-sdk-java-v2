
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Controls indexing of resources to be provided on high performance read-only search endpoints.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchIndexingConfigurationImpl implements SearchIndexingConfiguration, ModelBase {

    private com.commercetools.api.models.project.SearchIndexingConfigurationValues products;

    private com.commercetools.api.models.project.SearchIndexingConfigurationValues productsSearch;

    private com.commercetools.api.models.project.SearchIndexingConfigurationValues orders;

    private com.commercetools.api.models.project.SearchIndexingConfigurationValues customers;

    private com.commercetools.api.models.project.SearchIndexingConfigurationValues businessUnits;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchIndexingConfigurationImpl(
            @JsonProperty("products") final com.commercetools.api.models.project.SearchIndexingConfigurationValues products,
            @JsonProperty("productsSearch") final com.commercetools.api.models.project.SearchIndexingConfigurationValues productsSearch,
            @JsonProperty("orders") final com.commercetools.api.models.project.SearchIndexingConfigurationValues orders,
            @JsonProperty("customers") final com.commercetools.api.models.project.SearchIndexingConfigurationValues customers,
            @JsonProperty("businessUnits") final com.commercetools.api.models.project.SearchIndexingConfigurationValues businessUnits) {
        this.products = products;
        this.productsSearch = productsSearch;
        this.orders = orders;
        this.customers = customers;
        this.businessUnits = businessUnits;
    }

    /**
     * create empty instance
     */
    public SearchIndexingConfigurationImpl() {
    }

    /**
     *  <p>Configuration for the Product Projection Search and Search Term Suggestions APIs.</p>
     */

    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getProducts() {
        return this.products;
    }

    /**
     *  <p>Configuration for the Product Search feature.</p>
     */

    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getProductsSearch() {
        return this.productsSearch;
    }

    /**
     *  <p>Configuration for the Order Search feature.</p>
     */

    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getOrders() {
        return this.orders;
    }

    /**
     *  <p>Configuration for the Customer Search feature.</p>
     */

    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getCustomers() {
        return this.customers;
    }

    /**
     *  <p>Configuration for the Business Unit Search feature.</p>
     */

    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getBusinessUnits() {
        return this.businessUnits;
    }

    public void setProducts(final com.commercetools.api.models.project.SearchIndexingConfigurationValues products) {
        this.products = products;
    }

    public void setProductsSearch(
            final com.commercetools.api.models.project.SearchIndexingConfigurationValues productsSearch) {
        this.productsSearch = productsSearch;
    }

    public void setOrders(final com.commercetools.api.models.project.SearchIndexingConfigurationValues orders) {
        this.orders = orders;
    }

    public void setCustomers(final com.commercetools.api.models.project.SearchIndexingConfigurationValues customers) {
        this.customers = customers;
    }

    public void setBusinessUnits(
            final com.commercetools.api.models.project.SearchIndexingConfigurationValues businessUnits) {
        this.businessUnits = businessUnits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchIndexingConfigurationImpl that = (SearchIndexingConfigurationImpl) o;

        return new EqualsBuilder().append(products, that.products)
                .append(productsSearch, that.productsSearch)
                .append(orders, that.orders)
                .append(customers, that.customers)
                .append(businessUnits, that.businessUnits)
                .append(products, that.products)
                .append(productsSearch, that.productsSearch)
                .append(orders, that.orders)
                .append(customers, that.customers)
                .append(businessUnits, that.businessUnits)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(products)
                .append(productsSearch)
                .append(orders)
                .append(customers)
                .append(businessUnits)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("products", products)
                .append("productsSearch", productsSearch)
                .append("orders", orders)
                .append("customers", customers)
                .append("businessUnits", businessUnits)
                .build();
    }

    @Override
    public SearchIndexingConfiguration copyDeep() {
        return SearchIndexingConfiguration.deepCopy(this);
    }
}
