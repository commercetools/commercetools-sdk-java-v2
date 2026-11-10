
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AllocationDraftBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AllocationDraftBuilder {

    public com.commercetools.api.models.cart.AbsoluteAllocationDraftBuilder absoluteBuilder() {
        return com.commercetools.api.models.cart.AbsoluteAllocationDraftBuilder.of();
    }

    public com.commercetools.api.models.cart.RelativeAllocationDraftBuilder relativeBuilder() {
        return com.commercetools.api.models.cart.RelativeAllocationDraftBuilder.of();
    }

    /**
     * factory method for an instance of AllocationDraftBuilder
     * @return builder
     */
    public static AllocationDraftBuilder of() {
        return new AllocationDraftBuilder();
    }

}
