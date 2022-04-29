
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SuggestTokenizerBuilder {

    public com.commercetools.api.models.product.CustomTokenizerBuilder customBuilder() {
        return com.commercetools.api.models.product.CustomTokenizerBuilder.of();
    }

    public com.commercetools.api.models.product.WhitespaceTokenizerBuilder whitespaceBuilder() {
        return com.commercetools.api.models.product.WhitespaceTokenizerBuilder.of();
    }

    public static SuggestTokenizerBuilder of() {
        return new SuggestTokenizerBuilder();
    }
}
