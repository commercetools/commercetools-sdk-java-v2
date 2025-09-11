
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
 *  <p>Reverts the staged version of a Product to the current version. Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRevertedStagedChangesMessage" rel="nofollow">ProductRevertedStagedChanges</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRevertStagedChangesActionImpl implements ProductRevertStagedChangesAction, ModelBase {

    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    public ProductRevertStagedChangesActionImpl() {
        this.action = REVERT_STAGED_CHANGES;
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

        ProductRevertStagedChangesActionImpl that = (ProductRevertStagedChangesActionImpl) o;

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
    public ProductRevertStagedChangesAction copyDeep() {
        return ProductRevertStagedChangesAction.deepCopy(this);
    }
}
