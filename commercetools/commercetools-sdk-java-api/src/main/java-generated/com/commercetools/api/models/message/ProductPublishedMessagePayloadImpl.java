
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductPublishedMessagePayloadImpl implements ProductPublishedMessagePayload {

    private String type;

    private java.util.List<String> removedImageUrls;

    private com.commercetools.api.models.product.ProductProjection productProjection;

    private com.commercetools.api.models.cart.ProductPublishScope scope;

    @JsonCreator
    ProductPublishedMessagePayloadImpl(@JsonProperty("removedImageUrls") final java.util.List<String> removedImageUrls,
            @JsonProperty("productProjection") final com.commercetools.api.models.product.ProductProjection productProjection,
            @JsonProperty("scope") final com.commercetools.api.models.cart.ProductPublishScope scope) {
        this.removedImageUrls = removedImageUrls;
        this.productProjection = productProjection;
        this.scope = scope;
        this.type = PRODUCT_PUBLISHED;
    }

    public ProductPublishedMessagePayloadImpl() {
        this.type = PRODUCT_PUBLISHED;
    }

    public String getType() {
        return this.type;
    }

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    public com.commercetools.api.models.product.ProductProjection getProductProjection() {
        return this.productProjection;
    }

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

}
