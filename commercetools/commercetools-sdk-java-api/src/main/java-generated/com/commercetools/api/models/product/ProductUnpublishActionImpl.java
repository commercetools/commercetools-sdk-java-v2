
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Removes the current projection of the Product. The staged projection is unaffected. To retrieve unpublished Products, the <code>staged</code> parameter must be set to <code>false</code> when querying/searching Product Projections. Produces the ProductUnpublished Message.</p>
 *  <p>Unpublished Products cannot be added to a Cart. However, if a Cart contains Line Items for Products that were added before the Product was unpublished, the Cart is unaffected and can still be used to create an Order. To prevent this, in addition to unpublishing the Product you should remove the Prices from the Product using Remove Price for Embedded Prices or Delete StandalonePrice for Standalone Prices.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductUnpublishActionImpl implements ProductUnpublishAction, ModelBase {

    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductUnpublishActionImpl() {
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

        return new EqualsBuilder().append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

}
