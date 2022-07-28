
package com.commercetools.api.models.product;

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
 *  <p>Either <code>variantId</code> or <code>sku</code> is required. Produces the ProductImageAddedMessage.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductAddExternalImageActionImpl implements ProductAddExternalImageAction, ModelBase {

    private String action;

    private Long variantId;

    private String sku;

    private com.commercetools.api.models.common.Image image;

    private Boolean staged;

    @JsonCreator
    ProductAddExternalImageActionImpl(@JsonProperty("variantId") final Long variantId,
            @JsonProperty("sku") final String sku,
            @JsonProperty("image") final com.commercetools.api.models.common.Image image,
            @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.sku = sku;
        this.image = image;
        this.staged = staged;
        this.action = ADD_EXTERNAL_IMAGE;
    }

    public ProductAddExternalImageActionImpl() {
        this.action = ADD_EXTERNAL_IMAGE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Value to add to <code>images</code>.</p>
     */

    public com.commercetools.api.models.common.Image getImage() {
        return this.image;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setImage(final com.commercetools.api.models.common.Image image) {
        this.image = image;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductAddExternalImageActionImpl that = (ProductAddExternalImageActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(image, that.image)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(variantId)
                .append(sku)
                .append(image)
                .append(staged)
                .toHashCode();
    }

}
