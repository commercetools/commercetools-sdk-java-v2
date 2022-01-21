
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MissingAttributesMetaImpl implements MissingAttributesMeta, ModelBase {

    private com.commercetools.ml.models.missing_data.MissingAttributesDetails productLevel;

    private com.commercetools.ml.models.missing_data.MissingAttributesDetails variantLevel;

    private java.util.List<String> productTypeIds;

    @JsonCreator
    MissingAttributesMetaImpl(
            @JsonProperty("productLevel") final com.commercetools.ml.models.missing_data.MissingAttributesDetails productLevel,
            @JsonProperty("variantLevel") final com.commercetools.ml.models.missing_data.MissingAttributesDetails variantLevel,
            @JsonProperty("productTypeIds") final java.util.List<String> productTypeIds) {
        this.productLevel = productLevel;
        this.variantLevel = variantLevel;
        this.productTypeIds = productTypeIds;
    }

    public MissingAttributesMetaImpl() {
    }

    public com.commercetools.ml.models.missing_data.MissingAttributesDetails getProductLevel() {
        return this.productLevel;
    }

    public com.commercetools.ml.models.missing_data.MissingAttributesDetails getVariantLevel() {
        return this.variantLevel;
    }

    /**
    *  <p>The IDs of the product types containing the requested <code>attributeName</code>.</p>
    */
    public java.util.List<String> getProductTypeIds() {
        return this.productTypeIds;
    }

    public void setProductLevel(final com.commercetools.ml.models.missing_data.MissingAttributesDetails productLevel) {
        this.productLevel = productLevel;
    }

    public void setVariantLevel(final com.commercetools.ml.models.missing_data.MissingAttributesDetails variantLevel) {
        this.variantLevel = variantLevel;
    }

    public void setProductTypeIds(final String... productTypeIds) {
        this.productTypeIds = new ArrayList<>(Arrays.asList(productTypeIds));
    }

    public void setProductTypeIds(final java.util.List<String> productTypeIds) {
        this.productTypeIds = productTypeIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingAttributesMetaImpl that = (MissingAttributesMetaImpl) o;

        return new EqualsBuilder().append(productLevel, that.productLevel)
                .append(variantLevel, that.variantLevel)
                .append(productTypeIds, that.productTypeIds)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productLevel)
                .append(variantLevel)
                .append(productTypeIds)
                .toHashCode();
    }

}
