
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductMoveImageToPositionActionImpl implements ProductMoveImageToPositionAction, ModelBase {

    private String action;

    private Long variantId;

    private String sku;

    private String imageUrl;

    private Long position;

    private Boolean staged;

    @JsonCreator
    ProductMoveImageToPositionActionImpl(@JsonProperty("variantId") final Long variantId,
            @JsonProperty("sku") final String sku, @JsonProperty("imageUrl") final String imageUrl,
            @JsonProperty("position") final Long position, @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.sku = sku;
        this.imageUrl = imageUrl;
        this.position = position;
        this.staged = staged;
        this.action = MOVE_IMAGE_TO_POSITION;
    }

    public ProductMoveImageToPositionActionImpl() {
        this.action = MOVE_IMAGE_TO_POSITION;
    }

    public String getAction() {
        return this.action;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public String getSku() {
        return this.sku;
    }

    /**
    *  <p>The URL of the image</p>
    */
    public String getImageUrl() {
        return this.imageUrl;
    }

    public Long getPosition() {
        return this.position;
    }

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

    public void setPosition(final Long position) {
        this.position = position;
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

        ProductMoveImageToPositionActionImpl that = (ProductMoveImageToPositionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(imageUrl, that.imageUrl)
                .append(position, that.position)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(variantId)
                .append(sku)
                .append(imageUrl)
                .append(position)
                .append(staged)
                .toHashCode();
    }

}
