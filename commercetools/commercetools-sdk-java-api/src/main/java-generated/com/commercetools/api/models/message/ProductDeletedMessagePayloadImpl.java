
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
 *  <p>Generated after a successful <span>Delete Product</span> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDeletedMessagePayloadImpl implements ProductDeletedMessagePayload, ModelBase {

    private String type;

    private java.util.List<String> removedImageUrls;

    private com.commercetools.api.models.product.ProductProjection currentProjection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductDeletedMessagePayloadImpl(@JsonProperty("removedImageUrls") final java.util.List<String> removedImageUrls,
            @JsonProperty("currentProjection") final com.commercetools.api.models.product.ProductProjection currentProjection) {
        this.removedImageUrls = removedImageUrls;
        this.currentProjection = currentProjection;
        this.type = PRODUCT_DELETED;
    }

    /**
     * create empty instance
     */
    public ProductDeletedMessagePayloadImpl() {
        this.type = PRODUCT_DELETED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>List of image URLs that were removed during the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Delete Product</a> request.</p>
     */

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    /**
     *  <p>Current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a> of the deleted <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.api.models.product.ProductProjection getCurrentProjection() {
        return this.currentProjection;
    }

    public void setRemovedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
    }

    public void setRemovedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
    }

    public void setCurrentProjection(final com.commercetools.api.models.product.ProductProjection currentProjection) {
        this.currentProjection = currentProjection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductDeletedMessagePayloadImpl that = (ProductDeletedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(removedImageUrls, that.removedImageUrls)
                .append(currentProjection, that.currentProjection)
                .append(type, that.type)
                .append(removedImageUrls, that.removedImageUrls)
                .append(currentProjection, that.currentProjection)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(removedImageUrls).append(currentProjection).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("removedImageUrls", removedImageUrls)
                .append("currentProjection", currentProjection)
                .build();
    }

    @Override
    public ProductDeletedMessagePayload copyDeep() {
        return ProductDeletedMessagePayload.deepCopy(this);
    }
}
