
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
 *  <p>Generated after a successful Publish update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPublishedMessagePayloadImpl implements ProductPublishedMessagePayload, ModelBase {

    private String type;

    private java.util.List<String> removedImageUrls;

    private com.commercetools.api.models.product.ProductProjection productProjection;

    private com.commercetools.api.models.cart.ProductPublishScope scope;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPublishedMessagePayloadImpl(@JsonProperty("removedImageUrls") final java.util.List<String> removedImageUrls,
            @JsonProperty("productProjection") final com.commercetools.api.models.product.ProductProjection productProjection,
            @JsonProperty("scope") final com.commercetools.api.models.cart.ProductPublishScope scope) {
        this.removedImageUrls = removedImageUrls;
        this.productProjection = productProjection;
        this.scope = scope;
        this.type = PRODUCT_PUBLISHED;
    }

    /**
     * create empty instance
     */
    public ProductPublishedMessagePayloadImpl() {
        this.type = PRODUCT_PUBLISHED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>List of image URLs which were removed during the Publish update action.</p>
     */

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    /**
     *  <p>Current Product Projection of the Product at the time of creation.</p>
     */

    public com.commercetools.api.models.product.ProductProjection getProductProjection() {
        return this.productProjection;
    }

    /**
     *  <p>Publishing Scope that was used during the Publish update action.</p>
     */

    public com.commercetools.api.models.cart.ProductPublishScope getScope() {
        return this.scope;
    }

    public void setRemovedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
    }

    public void setRemovedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
    }

    public void setProductProjection(final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
    }

    public void setScope(final com.commercetools.api.models.cart.ProductPublishScope scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductPublishedMessagePayloadImpl that = (ProductPublishedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(removedImageUrls, that.removedImageUrls)
                .append(productProjection, that.productProjection)
                .append(scope, that.scope)
                .append(type, that.type)
                .append(removedImageUrls, that.removedImageUrls)
                .append(productProjection, that.productProjection)
                .append(scope, that.scope)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(removedImageUrls)
                .append(productProjection)
                .append(scope)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("removedImageUrls", removedImageUrls)
                .append("productProjection", productProjection)
                .append("scope", scope)
                .build();
    }

    @Override
    public ProductPublishedMessagePayload copyDeep() {
        return ProductPublishedMessagePayload.deepCopy(this);
    }
}
