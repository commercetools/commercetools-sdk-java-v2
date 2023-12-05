
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Create Product request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductCreatedMessagePayloadImpl implements ProductCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.product.ProductProjection productProjection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductCreatedMessagePayloadImpl(
            @JsonProperty("productProjection") final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
        this.type = PRODUCT_CREATED;
    }

    /**
     * create empty instance
     */
    public ProductCreatedMessagePayloadImpl() {
        this.type = PRODUCT_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The staged Product Projection of the Product at the time of creation.</p>
     */

    public com.commercetools.api.models.product.ProductProjection getProductProjection() {
        return this.productProjection;
    }

    public void setProductProjection(final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductCreatedMessagePayloadImpl that = (ProductCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(productProjection, that.productProjection)
                .append(type, that.type)
                .append(productProjection, that.productProjection)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(productProjection).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("productProjection", productProjection)
                .build();
    }

}
