
package com.commercetools.importapi.models.products;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SuggestTokenizerBuilder {

    public com.commercetools.importapi.models.products.CustomTokenizerBuilder customBuilder() {
        return com.commercetools.importapi.models.products.CustomTokenizerBuilder.of();
    }

    public com.commercetools.importapi.models.products.WhitespaceTokenizerBuilder whitespaceBuilder() {
        return com.commercetools.importapi.models.products.WhitespaceTokenizerBuilder.of();
    }

    public static SuggestTokenizerBuilder of() {
        return new SuggestTokenizerBuilder();
    }
}
