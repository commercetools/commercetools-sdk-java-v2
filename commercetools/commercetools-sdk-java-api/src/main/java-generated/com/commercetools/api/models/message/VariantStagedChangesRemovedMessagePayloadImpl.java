
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantRemoveStagedChangesAction" rel="nofollow">Staged Changes Removed</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantStagedChangesRemovedMessagePayloadImpl
        implements VariantStagedChangesRemovedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.product.ProductReference product;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantStagedChangesRemovedMessagePayloadImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        this.type = VARIANT_STAGED_CHANGES_REMOVED;
    }

    /**
     * create empty instance
     */
    public VariantStagedChangesRemovedMessagePayloadImpl() {
        this.type = VARIANT_STAGED_CHANGES_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantStagedChangesRemovedMessagePayloadImpl that = (VariantStagedChangesRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(product, that.product)
                .append(type, that.type)
                .append(product, that.product)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(product).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("product", product)
                .build();
    }

    @Override
    public VariantStagedChangesRemovedMessagePayload copyDeep() {
        return VariantStagedChangesRemovedMessagePayload.deepCopy(this);
    }
}
