
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Removes the current <span>projection</span> of the Product. The staged projection is unaffected. To retrieve unpublished Products, the <code>staged</code> parameter must be set to <code>false</code> when <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/product-projections:GET" rel="nofollow">querying</a>/<span>searching</span> Product Projections. Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductUnpublishedMessage" rel="nofollow">ProductUnpublished</a> Message.</p>
 *  <p>When a Product is unpublished, any associated Line Items already present in a Cart remain unaffected and can still be ordered. To prevent this, do the following:</p>
 *  <ul>
 *   <li>If the Product uses Embedded Prices, <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRemovePriceAction" rel="nofollow">remove the Embedded Prices</a> from the unpublished Product.</li>
 *   <li>If the Product uses Standalone Prices, <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceChangeActiveAction" rel="nofollow">inactivate</a> or <span>delete</span> the Standalone Prices.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductUnpublishActionImpl implements ProductUnpublishAction, ModelBase {

    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    public ProductUnpublishActionImpl() {
        this.action = UNPUBLISH;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductUnpublishActionImpl that = (ProductUnpublishActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action).build();
    }

    @Override
    public ProductUnpublishAction copyDeep() {
        return ProductUnpublishAction.deepCopy(this);
    }
}
