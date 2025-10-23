
package com.commercetools.history.models.common;

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
 *  <p>Polymorphic base type for Product Variant Selections. The actual type is determined by the <code>type</code> field.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantSelectionImpl implements ProductVariantSelection, ModelBase {

    private com.commercetools.history.models.common.ProductVariantSelectionTypeEnum type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantSelectionImpl(
            @JsonProperty("type") final com.commercetools.history.models.common.ProductVariantSelectionTypeEnum type) {
        this.type = type;
    }

    /**
     * create empty instance
     */
    public ProductVariantSelectionImpl() {
    }

    /**
     *  <p>Determines whether the SKUs are to be included in, or excluded from, the Product Selection.</p>
     */

    public com.commercetools.history.models.common.ProductVariantSelectionTypeEnum getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantSelectionImpl that = (ProductVariantSelectionImpl) o;

        return new EqualsBuilder().append(type, that.type).append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type).build();
    }

    @Override
    public ProductVariantSelection copyDeep() {
        return ProductVariantSelection.deepCopy(this);
    }
}
