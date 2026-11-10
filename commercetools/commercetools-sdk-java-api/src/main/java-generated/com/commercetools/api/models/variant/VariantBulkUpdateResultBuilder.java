
package com.commercetools.api.models.variant;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantBulkUpdateResultBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateResultBuilder {

    public com.commercetools.api.models.variant.VariantBulkUpdateFailResultBuilder failBuilder() {
        return com.commercetools.api.models.variant.VariantBulkUpdateFailResultBuilder.of();
    }

    public com.commercetools.api.models.variant.VariantBulkUpdateSuccessResultBuilder successBuilder() {
        return com.commercetools.api.models.variant.VariantBulkUpdateSuccessResultBuilder.of();
    }

    /**
     * factory method for an instance of VariantBulkUpdateResultBuilder
     * @return builder
     */
    public static VariantBulkUpdateResultBuilder of() {
        return new VariantBulkUpdateResultBuilder();
    }

}
