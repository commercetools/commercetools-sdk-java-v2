package com.commercetools.importapi.models.products;

import com.commercetools.importapi.models.products.CustomTokenizer;
import com.commercetools.importapi.models.products.WhitespaceTokenizer;
import com.commercetools.importapi.models.products.SuggestTokenizer;
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
