
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SuggestTokenizerBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SuggestTokenizerBuilder {

    public com.commercetools.api.models.product.CustomTokenizerBuilder customBuilder() {
        return com.commercetools.api.models.product.CustomTokenizerBuilder.of();
    }

    public com.commercetools.api.models.product.WhitespaceTokenizerBuilder whitespaceBuilder() {
        return com.commercetools.api.models.product.WhitespaceTokenizerBuilder.of();
    }

    /**
     * factory method for an instance of SuggestTokenizerBuilder
     * @return builder
     */
    public static SuggestTokenizerBuilder of() {
        return new SuggestTokenizerBuilder();
    }
}
