
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
 *  <p>Either <code>id</code> or <code>sku</code> is required. Produces the ProductVariantDeletedMessage.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRemoveVariantActionImpl implements ProductRemoveVariantAction, ModelBase {

    private String action;

    private Long id;

    private String sku;

    private Boolean staged;

    @JsonCreator
    ProductRemoveVariantActionImpl(@JsonProperty("id") final Long id, @JsonProperty("sku") final String sku,
            @JsonProperty("staged") final Boolean staged) {
        this.id = id;
        this.sku = sku;
        this.staged = staged;
        this.action = REMOVE_VARIANT;
    }

    public ProductRemoveVariantActionImpl() {
        this.action = REMOVE_VARIANT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the ProductVariant to remove.</p>
     */

    public Long getId() {
        return this.id;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to remove.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>If <code>true</code>, only the staged ProductVariant is removed. If <code>false</code>, both the current and staged ProductVariant is removed.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setSku(final String sku) {
        this.sku = sku;
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

        ProductRemoveVariantActionImpl that = (ProductRemoveVariantActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(id, that.id)
                .append(sku, that.sku)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(id).append(sku).append(staged).toHashCode();
    }

}
