
package com.commercetools.ml.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ReferenceBuilder {

    public com.commercetools.ml.models.common.CategoryReferenceBuilder categoryBuilder() {
        return com.commercetools.ml.models.common.CategoryReferenceBuilder.of();
    }

    public com.commercetools.ml.models.common.ProductReferenceBuilder productBuilder() {
        return com.commercetools.ml.models.common.ProductReferenceBuilder.of();
    }

    public com.commercetools.ml.models.common.ProductTypeReferenceBuilder productTypeBuilder() {
        return com.commercetools.ml.models.common.ProductTypeReferenceBuilder.of();
    }

    public static ReferenceBuilder of() {
        return new ReferenceBuilder();
    }
}
