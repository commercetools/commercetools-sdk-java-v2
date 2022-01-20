
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
public class ProductRevertStagedVariantChangesActionImpl implements ProductRevertStagedVariantChangesAction, ModelBase {

    private String action;

    private Long variantId;

    @JsonCreator
    ProductRevertStagedVariantChangesActionImpl(@JsonProperty("variantId") final Long variantId) {
        this.variantId = variantId;
        this.action = REVERT_STAGED_VARIANT_CHANGES;
    }

    public ProductRevertStagedVariantChangesActionImpl() {
        this.action = REVERT_STAGED_VARIANT_CHANGES;
    }

    public String getAction() {
        return this.action;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductRevertStagedVariantChangesActionImpl that = (ProductRevertStagedVariantChangesActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(variantId, that.variantId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(variantId).toHashCode();
    }

}
