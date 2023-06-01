package com.commercetools.api.models.product;

import com.commercetools.api.models.product.SuggestTokenizer;
import com.commercetools.api.models.product.WhitespaceTokenizer;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * WhitespaceTokenizerBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     WhitespaceTokenizer whitespaceTokenizer = WhitespaceTokenizer.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class WhitespaceTokenizerBuilder implements Builder<WhitespaceTokenizer> {




    /**
     * builds WhitespaceTokenizer with checking for non-null required values
     * @return WhitespaceTokenizer
     */
    public WhitespaceTokenizer build() {
        return new WhitespaceTokenizerImpl();
    }
    
    /**
     * builds WhitespaceTokenizer without checking for non-null required values
     * @return WhitespaceTokenizer
     */
    public WhitespaceTokenizer buildUnchecked() {
        return new WhitespaceTokenizerImpl();
    }

    /**
     * factory method for an instance of WhitespaceTokenizerBuilder
     * @return builder 
     */
    public static WhitespaceTokenizerBuilder of() {
        return new WhitespaceTokenizerBuilder();
    }

    /**
     * create builder for WhitespaceTokenizer instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static WhitespaceTokenizerBuilder of(final WhitespaceTokenizer template) {
        WhitespaceTokenizerBuilder builder = new WhitespaceTokenizerBuilder();
        return builder;
    }

}
