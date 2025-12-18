
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
 *  <p>Copies the product data from the Product's staged representation to its current representation and sets the <code>published</code> flag on the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> to <code>true</code>. This makes the current representation retrievable in <span>Product Projection</span> endpoints and indexes it for <span>Product Search</span>.</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPublishedMessage" rel="nofollow">ProductPublished</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPublishActionImpl implements ProductPublishAction, ModelBase {

    private String action;

    private com.commercetools.api.models.cart.ProductPublishScope scope;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPublishActionImpl(@JsonProperty("scope") final com.commercetools.api.models.cart.ProductPublishScope scope) {
        this.scope = scope;
        this.action = PUBLISH;
    }

    /**
     * create empty instance
     */
    public ProductPublishActionImpl() {
        this.action = PUBLISH;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>All</code> or <code>Prices</code></p>
     */

    public com.commercetools.api.models.cart.ProductPublishScope getScope() {
        return this.scope;
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

        ProductPublishActionImpl that = (ProductPublishActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(scope, that.scope)
                .append(action, that.action)
                .append(scope, that.scope)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(scope).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("scope", scope)
                .build();
    }

    @Override
    public ProductPublishAction copyDeep() {
        return ProductPublishAction.deepCopy(this);
    }
}
