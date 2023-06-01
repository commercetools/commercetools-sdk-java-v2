package com.commercetools.api.models.product;

import com.commercetools.api.models.product.CustomTokenizer;
import com.commercetools.api.models.product.WhitespaceTokenizer;
import com.commercetools.api.models.product.SuggestTokenizer;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SuggestTokenizerBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
