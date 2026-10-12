
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AllocationBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AllocationBuilder {

    public com.commercetools.api.models.cart.AbsoluteAllocationBuilder absoluteBuilder() {
        return com.commercetools.api.models.cart.AbsoluteAllocationBuilder.of();
    }

    public com.commercetools.api.models.cart.RelativeAllocationBuilder relativeBuilder() {
        return com.commercetools.api.models.cart.RelativeAllocationBuilder.of();
    }

    /**
     * factory method for an instance of AllocationBuilder
     * @return builder
     */
    public static AllocationBuilder of() {
        return new AllocationBuilder();
    }

}
