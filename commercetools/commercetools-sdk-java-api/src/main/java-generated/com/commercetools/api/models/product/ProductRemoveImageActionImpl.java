
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Removes a Product image and deletes it from the Content Delivery Network (CDN) if it had been <span>uploaded to our CDN</span>. External images will not be deleted. The API deletes the removed image from the CDN in an <span>eventual consistent</span> way. Either <code>variantId</code> or <code>sku</code> is required.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRemoveImageActionImpl implements ProductRemoveImageAction, ModelBase {

    private String action;

    private Long variantId;

    private String sku;

    private String imageUrl;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductRemoveImageActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku,
            @JsonProperty("imageUrl") final String imageUrl, @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.sku = sku;
        this.imageUrl = imageUrl;
        this.staged = staged;
        this.action = REMOVE_IMAGE;
    }

    /**
     * create empty instance
     */
    public ProductRemoveImageActionImpl() {
        this.action = REMOVE_IMAGE;
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
     *  <p>The URL of the image to remove.</p>
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     *  <p>If <code>true</code>, only the staged image is removed. If <code>false</code>, both the current and staged image is removed.</p>
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

    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
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

        ProductRemoveImageActionImpl that = (ProductRemoveImageActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(imageUrl, that.imageUrl)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(imageUrl, that.imageUrl)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(variantId)
                .append(sku)
                .append(imageUrl)
                .append(staged)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("variantId", variantId)
                .append("sku", sku)
                .append("imageUrl", imageUrl)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductRemoveImageAction copyDeep() {
        return ProductRemoveImageAction.deepCopy(this);
    }
}
