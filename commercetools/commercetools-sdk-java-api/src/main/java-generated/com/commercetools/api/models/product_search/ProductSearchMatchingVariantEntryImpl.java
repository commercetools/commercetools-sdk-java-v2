
package com.commercetools.api.models.product_search;

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
 * ProductSearchMatchingVariantEntry
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchMatchingVariantEntryImpl implements ProductSearchMatchingVariantEntry, ModelBase {

    private Integer id;

    private String sku;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchMatchingVariantEntryImpl(@JsonProperty("id") final Integer id, @JsonProperty("sku") final String sku) {
        this.id = id;
        this.sku = sku;
    }

    /**
     * create empty instance
     */
    public ProductSearchMatchingVariantEntryImpl() {
    }

    /**
     *  <p><code>id</code> of the ProductVariant that matches the search query.</p>
     */

    public Integer getId() {
        return this.id;
    }

    /**
     *  <p><code>sku</code> of the ProductVariant that matches the search query.</p>
     */

    public String getSku() {
        return this.sku;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchMatchingVariantEntryImpl that = (ProductSearchMatchingVariantEntryImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(sku, that.sku)
                .append(id, that.id)
                .append(sku, that.sku)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(sku).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id).append("sku", sku).build();
    }

    @Override
    public ProductSearchMatchingVariantEntry copyDeep() {
        return ProductSearchMatchingVariantEntry.deepCopy(this);
    }
}
