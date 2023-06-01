package com.commercetools.ml.models.common;

import com.commercetools.ml.models.common.CategoryReference;
import com.commercetools.ml.models.common.ProductReference;
import com.commercetools.ml.models.common.ProductTypeReference;
import com.commercetools.ml.models.common.ReferenceTypeId;
import com.commercetools.ml.models.common.Reference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReferenceBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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

    /**
     * factory method for an instance of ReferenceBuilder
     * @return builder 
     */
    public static ReferenceBuilder of() {
        return new ReferenceBuilder();
    }

}
