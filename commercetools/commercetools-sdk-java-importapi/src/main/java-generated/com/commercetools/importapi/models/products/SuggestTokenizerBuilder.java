
package com.commercetools.importapi.models.products;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SuggestTokenizerBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SuggestTokenizerBuilder {

    public com.commercetools.importapi.models.products.CustomTokenizerBuilder customBuilder() {
        return com.commercetools.importapi.models.products.CustomTokenizerBuilder.of();
    }

    public com.commercetools.importapi.models.products.WhitespaceTokenizerBuilder whitespaceBuilder() {
        return com.commercetools.importapi.models.products.WhitespaceTokenizerBuilder.of();
    }

    /**
     * factory method for an instance of SuggestTokenizerBuilder
     * @return builder
     */
    public static SuggestTokenizerBuilder of() {
        return new SuggestTokenizerBuilder();
    }

}
