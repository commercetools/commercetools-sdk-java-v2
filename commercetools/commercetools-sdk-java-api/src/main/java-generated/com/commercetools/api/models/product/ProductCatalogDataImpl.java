
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
 *  <p>Contains the <code>current</code> and <code>staged</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductData" rel="nofollow">ProductData</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductCatalogDataImpl implements ProductCatalogData, ModelBase {

    private Boolean published;

    private com.commercetools.api.models.product.ProductData current;

    private com.commercetools.api.models.product.ProductData staged;

    private Boolean hasStagedChanges;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductCatalogDataImpl(@JsonProperty("published") final Boolean published,
            @JsonProperty("current") final com.commercetools.api.models.product.ProductData current,
            @JsonProperty("staged") final com.commercetools.api.models.product.ProductData staged,
            @JsonProperty("hasStagedChanges") final Boolean hasStagedChanges) {
        this.published = published;
        this.current = current;
        this.staged = staged;
        this.hasStagedChanges = hasStagedChanges;
    }

    /**
     * create empty instance
     */
    public ProductCatalogDataImpl() {
    }

    /**
     *  <p><code>true</code> if the Product is published.</p>
     */

    public Boolean getPublished() {
        return this.published;
    }

    /**
     *  <p>Current (published) data of the Product.</p>
     */

    public com.commercetools.api.models.product.ProductData getCurrent() {
        return this.current;
    }

    /**
     *  <p>Staged (unpublished) data of the Product.</p>
     */

    public com.commercetools.api.models.product.ProductData getStaged() {
        return this.staged;
    }

    /**
     *  <p><code>true</code> if the <code>staged</code> data is different from the <code>current</code> data.</p>
     */

    public Boolean getHasStagedChanges() {
        return this.hasStagedChanges;
    }

    public void setPublished(final Boolean published) {
        this.published = published;
    }

    public void setCurrent(final com.commercetools.api.models.product.ProductData current) {
        this.current = current;
    }

    public void setStaged(final com.commercetools.api.models.product.ProductData staged) {
        this.staged = staged;
    }

    public void setHasStagedChanges(final Boolean hasStagedChanges) {
        this.hasStagedChanges = hasStagedChanges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductCatalogDataImpl that = (ProductCatalogDataImpl) o;

        return new EqualsBuilder().append(published, that.published)
                .append(current, that.current)
                .append(staged, that.staged)
                .append(hasStagedChanges, that.hasStagedChanges)
                .append(published, that.published)
                .append(current, that.current)
                .append(staged, that.staged)
                .append(hasStagedChanges, that.hasStagedChanges)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(published)
                .append(current)
                .append(staged)
                .append(hasStagedChanges)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("published", published)
                .append("current", current)
                .append("staged", staged)
                .append("hasStagedChanges", hasStagedChanges)
                .build();
    }

    @Override
    public ProductCatalogData copyDeep() {
        return ProductCatalogData.deepCopy(this);
    }
}
