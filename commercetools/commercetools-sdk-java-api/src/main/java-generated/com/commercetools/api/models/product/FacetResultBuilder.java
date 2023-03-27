
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * FacetResultBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FacetResultBuilder {

    public com.commercetools.api.models.product.FilteredFacetResultBuilder filterBuilder() {
        return com.commercetools.api.models.product.FilteredFacetResultBuilder.of();
    }

    public com.commercetools.api.models.product.RangeFacetResultBuilder rangeBuilder() {
        return com.commercetools.api.models.product.RangeFacetResultBuilder.of();
    }

    public com.commercetools.api.models.product.TermFacetResultBuilder termsBuilder() {
        return com.commercetools.api.models.product.TermFacetResultBuilder.of();
    }

    /**
     * factory method for an instance of FacetResultBuilder
     * @return builder
     */
    public static FacetResultBuilder of() {
        return new FacetResultBuilder();
    }
}
